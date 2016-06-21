package io.khasang.helpdesk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;

@Service
public class BackupService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public String getBackup() {
        String backupOutput = "";
        try {
            ProcessBuilder processBuilder = new ProcessBuilder(
                    "pg_dump",
                    "--host", "localhost",
                    "--port", "5432",
                    "--username", "postgres",
                    "--dbname", "helpdesk",
                    "--no-password",
                    "--clean",
                    "--blobs",
                    "--format=plain",
                    "--inserts");
            processBuilder.redirectErrorStream(true);
            Process process = processBuilder.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                backupOutput += line + "\n";
            }
            return backupOutput;
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public void restoreFromBackup(String backup) {
        jdbcTemplate.execute(backup);
    }

}
