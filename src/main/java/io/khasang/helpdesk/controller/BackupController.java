package io.khasang.helpdesk.controller;

import io.khasang.helpdesk.service.BackupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class BackupController {
    @Autowired
    BackupService backupService;

    @RequestMapping("/admin/backup")
    public String backup(Model model) {
        return "admin/backup";
    }

    @RequestMapping("/admin/doBackup")
    public void doBackup(HttpServletRequest request,
                         HttpServletResponse response) throws IOException {

        String buckupSql = backupService.getBackup();

        response.setContentType("text/plain");
        response.setContentLength(buckupSql.length());
        response.setHeader("Content-Disposition", "attachment; filename=helpdesk.sql");

        final PrintWriter writer = response.getWriter();
        writer.print(buckupSql);
        writer.close();
    }


    @RequestMapping(value = "/admin/restore", method = RequestMethod.POST)
    public String handleFileUpload(@RequestParam("file") MultipartFile file,
                                   RedirectAttributes redirectAttributes) {
        if (!file.isEmpty()) {
            try {
                String buckup = new String(file.getBytes());
                backupService.restoreFromBackup(buckup);
                redirectAttributes.addFlashAttribute("message",
                        "You successfully restored from DB!");
            } catch (Exception e) {
                redirectAttributes.addFlashAttribute("message",
                        "Backup restore failed " + e.getMessage());
            }
        } else {
            redirectAttributes.addFlashAttribute("message",
                    "File was empty");
        }
        return "redirect:/admin/backup";
    }
}
