package com.arabsoft.ajir.sevices;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;


import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRSaver;

@Service
public class DbReport {
	@Value("${spring.datasource.url}")
	private String ConnDatasource;
	@Value("${spring.datasource.driver-class-name}")
	private String DiverBD;
	@Value("${spring.datasource.username}")
	private String UserName;
	@Value("${spring.datasource.password}")
	private String Password;
	

	@Autowired  ServletContext context;

	@Autowired
	DataSource datasource;
	public Connection BdReport() {
		Connection conn = null;

		try {
			Class.forName(DiverBD);

			// conn =
			// DriverManager.getConnection("jdbc:oracle:thin:@//127.0.0.1:1521/local",
			// "fid", "arab");
			// conn =
			// DriverManager.getConnection("jdbc:oracle:thin:@//192.168.2.234:1521/local",
			// "fid", "arab");
			conn = DriverManager.getConnection(ConnDatasource, UserName, Password);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return conn;
	}
	/*Methode Generate PDF File*/
	/*public byte[] GeneratePDF(String param1)
	
			throws JRException, IOException {
			 
			//String path = "D:\\pdf\\report";
			String path ="c:/pdf";
			//String path =".//PDF";
			try {
			File file = ResourceUtils.getFile("C:\\Users\\VOSTRO\\JaspersoftWorkspace\\MyReports\\"+ "Blank_A4" + ".jrxml");
			//File file2 = ResourceUtils.getFile("C:\\Users\\VOSTRO\\JaspersoftWorkspace\\MyReports\\"+ "XliaSubreport"+ ".jrxml");

			System.out.println(file);
			//System.out.println(file2);
			
			//JasperReport jasperSubReport = JasperCompileManager.compileReport(file2.getAbsolutePath());
			//System.out.println("File 2 : "+jasperSubReport);
		
			JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
			System.out.println(jasperReport);
			
			
			
			//JRSaver.saveObject(jasperSubReport, "XliaSubreport.jasper");
			//System.out.println(jasperReport);
            //System.out.println(file2.getAbsolutePath());
			System.out.println("ok");
			Map<String, Object> parameters = new HashMap<String, Object>();
			parameters.put("mat",param1);
			
			System.out.println(parameters);
			//parameters.put("Logo",context.getRealPath("/")+"/images/articles/angular.png");
			// get Connection
			Connection conn = BdReport();
			//System.out.println(conn);
			try {
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, conn);
			
			// create file jasper
			System.out.println(jasperPrint);
			JasperExportManager.exportReportToPdfFile(jasperPrint, path + "\\" + +System.currentTimeMillis()+ ".pdf");
			// return Files.readAllBytes(Paths.get(path + "\\" + ReportName + ".pdf"));
			
			} catch(Exception e) {
				e.printStackTrace();
			}

			return Files.readAllBytes(Paths.get(path + "\\" +param1+ ".pdf"));
			
		} catch (Exception ex) {
			return null;
		}
	}
	
	*/
	public byte[] GeneratePDF(String param2)
	
			throws JRException, IOException {
			 
			//String path = "D:\\pdf\\report";
			String path ="c:/pdf";
			//String path =".//PDF";
			try {
			File file = ResourceUtils.getFile("classpath:"+ "Blank_A4" + ".jrxml");
			//File file2 = ResourceUtils.getFile("classpath:"+ "sub" + ".jrxml");

			System.out.println(file);
			//JasperReport SubReport = JasperCompileManager.compileReport(file2.getAbsolutePath());

			JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());

			System.out.println("ok");
			Map parameters = new HashMap();
			parameters.put("mat",param2);
			//parameters.put("Logo",context.getRealPath("/")+"/images/articles/angular.png");
			// get Connection
			Connection conn = BdReport();
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, conn);
			// create file jasper
			System.out.println("ok : "+jasperPrint);
			JasperExportManager.exportReportToPdfFile(jasperPrint, path + "\\" +"aaa"+ ".pdf");
			// return Files.readAllBytes(Paths.get(path + "\\" + ReportName + ".pdf"));
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
			return Files.readAllBytes(Paths.get(path + "\\" +"aaa"+ ".pdf"));
	}
		
	    
	    
}