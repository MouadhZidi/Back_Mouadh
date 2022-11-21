package com.arabsoft.ajir.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;




@Entity
public class PossedeVh {
	  @JsonFormat(pattern = "dd/MM/yyyy")
	  private Date dt_bul;
	  @Transient
	  @JsonProperty(access = Access.WRITE_ONLY)
	  private String dateBul;
	  private String cod_typ_bul;
	  private String lib_bul;
	  @Id
	  @JsonProperty(access = Access.WRITE_ONLY)
	  private String cod_soc;
	  private String mat_pers;
	  private String nom_pers;
	  @JsonFormat(pattern = "dd/MM/yyyy")
	  private Date datev;
	  private String bul_cod_typ_bul;
	  private String abrv_fixe;
	  private String lib_fixe;
	  private String mnt_gain;
	  private String mnt_charge;
	  private Float montant;
	  private String cod_serv;
	  private String lib_serv;
	  private String type_par;
	  private Integer cod_niv;
	  private Integer num_niv;
	  private Float nombre;
	  private Integer seq;
	  private Float taux;
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
	public String getCod_typ_bul() {
		return cod_typ_bul;
	}
	public void setCod_typ_bul(String cod_typ_bul) {
		this.cod_typ_bul = cod_typ_bul;
	}
	public String getLib_bul() {
		return lib_bul;
	}
	public void setLib_bul(String lib_bul) {
		this.lib_bul = lib_bul;
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
	public Date getDatev() {
		return datev;
	}
	public void setDatev(Date datev) {
		this.datev = datev;
	}
	public String getBul_cod_typ_bul() {
		return bul_cod_typ_bul;
	}
	public void setBul_cod_typ_bul(String bul_cod_typ_bul) {
		this.bul_cod_typ_bul = bul_cod_typ_bul;
	}
	public String getAbrv_fixe() {
		return abrv_fixe;
	}
	public void setAbrv_fixe(String abrv_fixe) {
		this.abrv_fixe = abrv_fixe;
	}
	public String getLib_fixe() {
		return lib_fixe;
	}
	public void setLib_fixe(String lib_fixe) {
		this.lib_fixe = lib_fixe;
	}
	public String getMnt_gain() {
		return mnt_gain;
	}
	public void setMnt_gain(String mnt_gain) {
		this.mnt_gain = mnt_gain;
	}
	public String getMnt_charge() {
		return mnt_charge;
	}
	public void setMnt_charge(String mnt_charge) {
		this.mnt_charge = mnt_charge;
	}
	public Float getMontant() {
		return montant;
	}
	public void setMontant(Float montant) {
		this.montant = montant;
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
	public String getType_par() {
		return type_par;
	}
	public void setType_par(String type_par) {
		this.type_par = type_par;
	}
	public Integer getCod_niv() {
		return cod_niv;
	}
	public void setCod_niv(Integer cod_niv) {
		this.cod_niv = cod_niv;
	}
	public Integer getNum_niv() {
		return num_niv;
	}
	public void setNum_niv(Integer num_niv) {
		this.num_niv = num_niv;
	}
	public Float getNombre() {
		return nombre;
	}
	public void setNombre(Float nombre) {
		this.nombre = nombre;
	}
	public Integer getSeq() {
		return seq;
	}
	public void setSeq(Integer seq) {
		this.seq = seq;
	}
	public Float getTaux() {
		return taux;
	}
	public void setTaux(Float taux) {
		this.taux = taux;
	}
	public PossedeVh(Date dt_bul, String dateBul, String cod_typ_bul, String lib_bul, String cod_soc, String mat_pers,
			String nom_pers, Date datev, String bul_cod_typ_bul, String abrv_fixe, String lib_fixe, String mnt_gain,
			String mnt_charge, Float montant, String cod_serv, String lib_serv, String type_par, Integer cod_niv,
			Integer num_niv, Float nombre, Integer seq, Float taux) {
		super();
		this.dt_bul = dt_bul;
		this.dateBul = dateBul;
		this.cod_typ_bul = cod_typ_bul;
		this.lib_bul = lib_bul;
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.nom_pers = nom_pers;
		this.datev = datev;
		this.bul_cod_typ_bul = bul_cod_typ_bul;
		this.abrv_fixe = abrv_fixe;
		this.lib_fixe = lib_fixe;
		this.mnt_gain = mnt_gain;
		this.mnt_charge = mnt_charge;
		this.montant = montant;
		this.cod_serv = cod_serv;
		this.lib_serv = lib_serv;
		this.type_par = type_par;
		this.cod_niv = cod_niv;
		this.num_niv = num_niv;
		this.nombre = nombre;
		this.seq = seq;
		this.taux = taux;
	}
	public PossedeVh() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PossedeVh {dateBul=" + dateBul + ", cod_typ_bul=" + cod_typ_bul + ", cod_soc=" + cod_soc + ", mat_pers="
				+ mat_pers + "}";
	}
	
	
	  
	  
}
