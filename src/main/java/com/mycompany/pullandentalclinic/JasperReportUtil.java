package com.mycompany.pullandentalclinic;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;

public class JasperReportUtil {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/pullandentalclinic";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static void generateReport(String jrxmlFilePath, String outputPdfPath, Map<String, Object> parameters) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            // Load the JRXML file
            JasperDesign jasperDesign = JRXmlLoader.load(jrxmlFilePath);

            // Compile the report
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);

            // Fill the report
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, connection);

            // Export the report to PDF
            JasperExportManager.exportReportToPdfFile(jasperPrint, outputPdfPath);

            System.out.println("Report generated successfully!");

        } catch (JRException | SQLException e) {
            e.printStackTrace();
        }
    }
}
