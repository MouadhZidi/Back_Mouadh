package com.arabsoft.ajir.entities;

import java.sql.Date;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ReportEntity {


	
	@Column(name="COD_SOC")
	private String COD_SOC;
	
	
	@Column(name="annee")
	private String annee;
	

	public String getCOD_SOC() {
		return COD_SOC;
	}

	public void setCOD_SOC(String cOD_SOC) {
		COD_SOC = cOD_SOC;
	}

	public String getAnnee() {
		return annee;
	}

	public void setAnnee(String annee) {
		this.annee = annee;
	}

	public ReportEntity(String cOD_SOC, String annee) {
		super();
		COD_SOC = cOD_SOC;
		this.annee = annee;
	}

	public ReportEntity() {
		super();
	}

	@Override
	public String toString() {
		return "ReportEntity [COD_SOC=" + COD_SOC + ", annee=" + annee + "]";
	}


	
	
	
}
