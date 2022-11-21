package com.arabsoft.ajir.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;



@Entity
public class BulletinH {
	@Id
    private String cod_typ_bul;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dt_bul;
    @Transient
    @JsonProperty(access = Access.WRITE_ONLY)
    private String dateBul;
    @JsonProperty(access = Access.WRITE_ONLY)
    private String cod_soc;
    private String mat_pers;
    private String nom_pers;
    private String cod_serv;
    private String lib_serv;
    private String adm_tech;
    private String lib_adm_tech;
    private String cod_sit;
    private String cod_cat;
    private String cod_grad;
    private String charg_all;
    private String charg_enf;
    private Integer cod_ech;
    private Integer nbr_enf;
    @Transient
    private List<PossedeVh> possVH;
	public String getCod_typ_bul() {
		return cod_typ_bul;
	}
	public void setCod_typ_bul(String cod_typ_bul) {
		this.cod_typ_bul = cod_typ_bul;
	}
	public Date getDt_bul() {
		return dt_bul;
	}
	public void setDt_bul(Date dt_bul) {
		this.dt_bul = dt_bul;
	}
	
	public String getDateBul() {
		return dateBul;
	}
	public void setDateBul(String dateBul) {
		this.dateBul = dateBul;
	}
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
	public String getNom_pers() {
		return nom_pers;
	}
	public void setNom_pers(String nom_pers) {
		this.nom_pers = nom_pers;
	}
	public String getCod_serv() {
		return cod_serv;
	}
	public void setCod_serv(String cod_serv) {
		this.cod_serv = cod_serv;
	}
	public String getLib_serv() {
		return lib_serv;
	}
	public void setLib_serv(String lib_serv) {
		this.lib_serv = lib_serv;
	}
	public String getAdm_tech() {
		return adm_tech;
	}
	public void setAdm_tech(String adm_tech) {
		this.adm_tech = adm_tech;
	}
	public String getLib_adm_tech() {
		return lib_adm_tech;
	}
	public void setLib_adm_tech(String lib_adm_tech) {
		this.lib_adm_tech = lib_adm_tech;
	}
	public String getCod_sit() {
		return cod_sit;
	}
	public void setCod_sit(String cod_sit) {
		this.cod_sit = cod_sit;
	}
	public String getCod_cat() {
		return cod_cat;
	}
	public void setCod_cat(String cod_cat) {
		this.cod_cat = cod_cat;
	}
	public String getCod_grad() {
		return cod_grad;
	}
	public void setCod_grad(String cod_grad) {
		this.cod_grad = cod_grad;
	}
	public String getCharg_all() {
		return charg_all;
	}
	public void setCharg_all(String charg_all) {
		this.charg_all = charg_all;
	}
	public String getCharg_enf() {
		return charg_enf;
	}
	public void setCharg_enf(String charg_enf) {
		this.charg_enf = charg_enf;
	}
	public Integer getCod_ech() {
		return cod_ech;
	}
	public void setCod_ech(Integer cod_ech) {
		this.cod_ech = cod_ech;
	}
	public Integer getNbr_enf() {
		return nbr_enf;
	}
	public void setNbr_enf(Integer nbr_enf) {
		this.nbr_enf = nbr_enf;
	}
	public List<PossedeVh> getPossVH() {
		return possVH;
	}
	public void setPossVH(List<PossedeVh> possVH) {
		this.possVH = possVH;
	}
	public BulletinH(String cod_typ_bul, Date dt_bul, String cod_soc, String mat_pers, String nom_pers, String cod_serv,
			String lib_serv, String adm_tech, String lib_adm_tech, String cod_sit, String cod_cat, String cod_grad,
			String charg_all, String charg_enf, Integer cod_ech, Integer nbr_enf, List<PossedeVh> possVH) {
		super();
		this.cod_typ_bul = cod_typ_bul;
		this.dt_bul = dt_bul;
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.nom_pers = nom_pers;
		this.cod_serv = cod_serv;
		this.lib_serv = lib_serv;
		this.adm_tech = adm_tech;
		this.lib_adm_tech = lib_adm_tech;
		this.cod_sit = cod_sit;
		this.cod_cat = cod_cat;
		this.cod_grad = cod_grad;
		this.charg_all = charg_all;
		this.charg_enf = charg_enf;
		this.cod_ech = cod_ech;
		this.nbr_enf = nbr_enf;
		this.possVH = possVH;
	}
	public BulletinH() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BulletinH {cod_typ_bul=" + cod_typ_bul + ", dateBul=" + dateBul + ", cod_soc=" + cod_soc + ", mat_pers="
				+ mat_pers + "}";
	}
	
    
}
