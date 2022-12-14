package com.arabsoft.ajir.controller;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.arabsoft.ajir.dao.DemandeDao;
import com.arabsoft.ajir.entities.Libre_demande;
import com.arabsoft.ajir.exception.ProductNotFoundException;
import com.arabsoft.ajir.sevices.LibreDemandeService;
import com.fasterxml.jackson.databind.ObjectMapper;


@RestController
@RequestMapping(value="demande")
public class LibreDemandeController {
	
	@Autowired
	DemandeDao demandeDAO;
	@Autowired
	LibreDemandeService LibreService;
	  
	  @CrossOrigin
	  @PostMapping("/createDemande")
	  public ResponseEntity<ResponseMessage> createDemande(@RequestParam("file") MultipartFile file,@RequestParam("demande") String dem) throws IOException {	        
	    ResponseMessage responseMessage;
	    responseMessage = this.LibreService.createDem(file,dem);
	    if(responseMessage.getCode()=="0") {
	    	return ResponseEntity.ok(responseMessage);
	    } else {
	    	return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(responseMessage);
	    }
	  }
	  
	 /* @CrossOrigin
	  @PostMapping("/getListDemande")
	  public Libre_demande getListDemande(@RequestBody Libre_demande dem) throws IOException {	        
		  String codSoc = dem.getCodSoc();
			
			Libre_demande d = this.demandeDAO.getListDemande();
			System.out.println(codSoc);
			return d;
	    }*/
	
	@CrossOrigin
	@GetMapping("/getDemande")
	public ResponseEntity<List<Libre_demande>> getAllDemande() {

		return ResponseEntity.ok(demandeDAO.findAll());
	}
	
/*	@CrossOrigin
	@GetMapping("/getListDemande/{CodSoc}")
	public ResponseEntity<List<Libre_demande>> getDemande(@PathVariable String CodSoc) {
List<Libre_demande> d = demandeDAO.getListDemande(CodSoc);
System.out.println(d);
		return ResponseEntity.ok(d);
	}*/
	@CrossOrigin
	@GetMapping("/getListDemandee/{codSoc}")
	public List<Libre_demande> getDemandee(@PathVariable String codSoc) {

		return demandeDAO.get(codSoc);
	}
	
	@CrossOrigin
	@GetMapping("/getbyid/{id}")

	public ResponseEntity<Libre_demande> findDemandeById(@PathVariable Long id) {
		return ResponseEntity.ok(
				demandeDAO.findById(id).orElseThrow(() -> new ProductNotFoundException("Contrat agence Not found")));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteDemande(@PathVariable Long id) {
		demandeDAO.deleteById(id);
		return ResponseEntity.ok("Deleted");
	}
	/*@CrossOrigin
	@GetMapping("/get")
	public ResponseEntity<List<Libre_demande>> getDemandeList() {

		return ResponseEntity.ok(demandeService.getDemande());
	}
	
	@DeleteMapping("/deleteClient/{id}")
	public ResponseEntity<Boolean> deleteClient(@PathVariable Long id) throws Exception{
		return ResponseEntity.ok(demandeService.deleteDemande(id));
	}*/
}
