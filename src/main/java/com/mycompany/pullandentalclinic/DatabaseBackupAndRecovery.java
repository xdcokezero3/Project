package com.mycompany.pullandentalclinic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FilenameFilter;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class DatabaseBackupAndRecovery {
    private static final String BACKUP_DIR = "C:\\Users\\Rebecca\\Documents\\NetBeansProjects\\PullanDentalClinic\\";
    private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/pullandentalclinic?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "root";
    private static final String BACKUP_SCRIPT = "\"C:\\Program Files\\MySQL\\MySQL Server 8.0\\bin\\mysqldump.exe\" -u %s -p%s %s -r %s";

    public static void backupDatabase() {
        try {
            // Load the MySQL JDBC driver
            Class.forName(DB_DRIVER);

            // Establish database connection
            Connection con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            con.close();

            // Check if the backup directory exists
            File backupDir = new File(BACKUP_DIR);
            if (!backupDir.exists()) {
                if (!backupDir.mkdirs()) {
                    System.out.println("Failed to create backup directory.");
                    return;
                }
            }

            // Get current date and format it
            LocalDate date = LocalDate.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
            String dateString = date.format(formatter);

            // Create a SQL script to dump the entire database
            String backupFileName = BACKUP_DIR + "backup_database_" + dateString + ".sql";
            String backupScript = String.format(BACKUP_SCRIPT, DB_USERNAME, DB_PASSWORD, "pullandentalclinic", backupFileName);
            Process process = Runtime.getRuntime().exec(backupScript);

            // Capture the output and error streams
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream()));
            BufferedReader stdError = new BufferedReader(new InputStreamReader(process.getErrorStream()));

            String s;
            System.out.println("Standard output of the command:");
            while ((s = stdInput.readLine()) != null) {
                System.out.println(s);
            }

            System.out.println("Standard error of the command (if any):");
            while ((s = stdError.readLine()) != null) {
                System.out.println(s);
            }

            int exitCode = process.waitFor();
            if (exitCode == 0) {
                System.out.println("Database backup completed successfully.");
            } else {
                System.out.println("Error occurred during database backup. Exit code: " + exitCode);
            }
        } catch (Exception e) {
            System.out.println("Error occurred during database backup: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void recoverDatabase() {
        try {
            // Load the MySQL JDBC driver
            Class.forName(DB_DRIVER);

            // Establish database connection to ensure the credentials are correct
            Connection con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            con.close();

            // List files in backup directory
            File backupDir = new File(BACKUP_DIR);
            File[] backupFiles = backupDir.listFiles((dir, name) -> name.matches("backup_database_\\d{8}\\.sql"));
            
            // Log the files found
            System.out.println("Files found in backup directory:");
            if (backupFiles != null) {
                Arrays.stream(backupFiles).forEach(file -> System.out.println(file.getName()));
            } else {
                System.out.println("No files found.");
            }

            if (backupFiles == null || backupFiles.length == 0) {
                System.out.println("No backup files found.");
                return;
            }

            // Get the latest backup file
            File latestBackupFile = backupFiles[backupFiles.length - 1];
            for (File file : backupFiles) {
                if (file.lastModified() > latestBackupFile.lastModified()) {
                    latestBackupFile = file;
                }
            }

            // Create a ProcessBuilder to run the MySQL command
            ProcessBuilder pb = new ProcessBuilder(
                "C:\\Program Files\\MySQL\\MySQL Server 8.0\\bin\\mysql.exe",
                "-u", DB_USERNAME,
                "-p" + DB_PASSWORD,
                "pullandentalclinic"
            );

            // Redirect the input file to the process
            pb.redirectInput(latestBackupFile);

            // Start the process
            Process process = pb.start();

            // Capture the output and error streams
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream()));
            BufferedReader stdError = new BufferedReader(new InputStreamReader(process.getErrorStream()));

            String s;
            System.out.println("Standard output of the command:");
            while ((s = stdInput.readLine()) != null) {
                System.out.println(s);
            }

            System.out.println("Standard error of the command (if any):");
            while ((s = stdError.readLine()) != null) {
                System.out.println(s);
            }

            int exitCode = process.waitFor();
            if (exitCode == 0) {
                System.out.println("Database recovery completed successfully.");
            } else {
                System.out.println("Error occurred during database recovery. Exit code: " + exitCode);
            }
        } catch (Exception e) {
            System.out.println("Error occurred during database recovery: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Call the backup and recovery methods as needed
        backupDatabase();
        //recoverDatabase();
    }
}
