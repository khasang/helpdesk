package io.khasang.helpdesk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;

@Service
@PropertySource("classpath:db.properties")
public class BackupService {
    @Autowired
    Environment environment;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public String getBackup() {
        String backupOutput = "";
        try {
            ProcessBuilder processBuilder = new ProcessBuilder(
                    environment.getProperty("backup.pg_dump.path"),
                    "--host", environment.getProperty("jdbc.postgresql.host"),
                    "--port", environment.getProperty("jdbc.postgresql.port"),
                    "--username", environment.getProperty("jdbc.postgresql.backup.username"),
                    "--dbname", environment.getProperty("jdbc.postgresql.dbname"),
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
