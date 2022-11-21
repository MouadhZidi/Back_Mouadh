package com.arabsoft.ajir.entities;

import java.io.Serializable;

import javax.persistence.Column;
 
public class SoldCongePK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(insertable = false,updatable = false)
	private String cod_soc;
	@Column(insertable = false,updatable = false)
	private String  mat_pers;
	@Column(insertable = false,updatable = false)
	private String annee_cng;
	@Column(insertable = false,updatable = false)
	private String  typ_cng;
	public String getCod_soc() {
		return cod_soc;
	}
	public void setCod_soc(String cod_soc) {
		this.cod_soc = cod_soc;
	}
	public String getMat_pers() {
		return mat_pers;
	}
	public void setMat_pers(String mat_pers) {
		this.mat_pers = mat_pers;
	}
	public String getAnnee_cng() {
		return annee_cng;
	}
	public void setAnnee_cng(String annee_cng) {
		this.annee_cng = annee_cng;
	}
	public String getTyp_cng() {
		return typ_cng;
	}
	public void setTyp_cng(String typ_cng) {
		this.typ_cng = typ_cng;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public SoldCongePK(String cod_soc, String mat_pers, String annee_cng, String typ_cng) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.annee_cng = annee_cng;
		this.typ_cng = typ_cng;
	}
	public SoldCongePK() {
		super();
	}
	@Override
	public String toString() {
		return "SoldCongePK [cod_soc=" + cod_soc + ", mat_pers=" + mat_pers + ", annee_cng=" + annee_cng + ", typ_cng="
				+ typ_cng + "]";
	}
	
	
	
	
}
