package com.arabsoft.ajir.controller;

import java.io.IOException;
import java.sql.Date;
import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.CongeRep;
import com.arabsoft.ajir.dao.GetConge;
import com.arabsoft.ajir.dao.TypeBulletinDao;
import com.arabsoft.ajir.entities.DemCng;
import com.arabsoft.ajir.entities.SoldConge;
import com.arabsoft.ajir.entities.TypeBulletin;
import com.arabsoft.ajir.sevices.DbReport;

import net.sf.jasperreports.engine.JRException;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/conge")

public class CongeController {

	@Autowired CongeRep con;
	@Autowired GetConge con2;
	@Autowired
	private DbReport connectionBdReport;
	@Autowired 
	TypeBulletinDao bulletinDao;
	
	
	@GetMapping("/getbycodesocandmatpers/{codesoc}/{matpers}")
	public List<DemCng>	getbycodesocandmatpers(@PathVariable("codesoc") String code,@PathVariable("matpers")String mat){
		return con.getbycodesocandmatpers(code, mat);}
	
	@GetMapping("/getcongebyeid/{codesoc}/{matpers}")
	public List<SoldConge>	getcongebyid(@PathVariable("codesoc") String code,@PathVariable("matpers")String mat){
		return con2.getcongebyid(code, mat);}
	
	
	

	@CrossOrigin
	@PostMapping(value = "/report")
	public byte[] getReportfile(@RequestParam  String mat)
			throws JRException, IOException {
		byte[] getReportFile = null;

		try {
			/*Call Method Generate PDF */
			getReportFile = connectionBdReport.GeneratePDF(mat);
			
			//System.out.println(getReportFile.toString());


		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return getReportFile;
	}

	@GetMapping("/getnom/{codesoc}/{matpers}")
	 public Optional<String>   getnom(@PathVariable("codesoc") String code,@PathVariable("matpers")String mat){
		return( Optional<String>)con.getnom(code, mat) ;}
	
	
	@GetMapping("/getprenom/{codesoc}/{matpers}")
	 public Optional<String>   getprenom(@PathVariable("codesoc") String code,@PathVariable("matpers")String mat){
		return( Optional<String>)con.getprenom(code, mat) ;}

	
	
	@GetMapping("/gettypebul")
	 public List<TypeBulletin>   getTypeBul(){
		return( List<TypeBulletin>)bulletinDao.getTypeBul() ;}
}



