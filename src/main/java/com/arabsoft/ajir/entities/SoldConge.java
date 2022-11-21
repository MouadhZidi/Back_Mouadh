package com.arabsoft.ajir.entities;

import java.io.Serializable;

import javax.persistence.Column;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import javax.persistence.Table;

@Entity
@Table(name="SOLD_CNG")
public class SoldConge implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private SoldCongePK id;

	@Column(name="INIT_CNG")
	private Long init_cng;
	
	@Column(name="CUM_CNG")
	private Long cum_cng;
	
	
	@Column(name="PRIS_CNG")
	private Long pris_cng;
	
	@Column(name="FREQUENCE")
	private Long frequence;
	  

	@Column(name="OBS_CNG")
	private String obs_cng;
	
	
	@Column(name="SEM_CNG")
	private String sem_cng;
	
	 
	@Column(name="SOLD_CNG")
	private Long sold_cng;
	
	
	@Column(name="CUM_CNG_ANN_1")
	private Long cum_cng_ann_1;
	 
	  
	@Column(name="CNG_NJUSTIF")
	private Long cng_njustif;
	  
	@Column(name="CNG_JUSTIF")
	private Long cng_justif;
	
	
	@Column(name="NOT_1_PRIS")
	private String not_1_pris;
	
	@Column(name="NOT_2_PRIS")
	private String not_2_pris;
	 
	@Column(name="BONUS_CNG")
	private Long bonus_cng; 
	  
	@Column(name="OBS_CNG_A")
	private String obs_cng_a; 
	
	 
	@Column(name="SOLD_3112")
	private String sold_3112; 
	
	
	@Column(name="BRUT_3112")
	private String brut_3112;
	
	@Column(name="SERV_3112")
	private String serv_3112;
	  
	@Column(name="RECUP_CNG")
	private Long recup_cng;
	  
	 
	@Column(name="CHARG_3112")
	private Long charg_3112;
	
	@Column(name="NBR_HEURS_PRIS")
	private Long nbr_heurs_pris;
	
	@Column(name="NBR_HEURS_INIT")
	private Long nbr_heurs_init;
	
	@Column(name="NBR_HEURS_SOLD")
	private Long nbr_heurs_sold;
	
	 
	@Column(name="VALID_DROIT")
	private String valid_droit;
	
	@Column(name="CNG_PAYE")
	private Long cng_paye;
	
	
	@Column(name="ID_SOLD_CNG")
	private Long id_sold_cng;


	public SoldConge(SoldCongePK id, Long init_cng, Long cum_cng, Long pris_cng, Long frequence, String obs_cng,
			String sem_cng, Long sold_cng, Long cum_cng_ann_1, Long cng_njustif, Long cng_justif, String not_1_pris,
			String not_2_pris, Long bonus_cng, String obs_cng_a, String sold_3112, String brut_3112, String serv_3112,
			Long recup_cng, Long charg_3112, Long nbr_heurs_pris, Long nbr_heurs_init, Long nbr_heurs_sold,
			String valid_droit, Long cng_paye, Long id_sold_cng) {
		super();
		this.id = id;
		this.init_cng = init_cng;
		this.cum_cng = cum_cng;
		this.pris_cng = pris_cng;
		this.frequence = frequence;
		this.obs_cng = obs_cng;
		this.sem_cng = sem_cng;
		this.sold_cng = sold_cng;
		this.cum_cng_ann_1 = cum_cng_ann_1;
		this.cng_njustif = cng_njustif;
		this.cng_justif = cng_justif;
		this.not_1_pris = not_1_pris;
		this.not_2_pris = not_2_pris;
		this.bonus_cng = bonus_cng;
		this.obs_cng_a = obs_cng_a;
		this.sold_3112 = sold_3112;
		this.brut_3112 = brut_3112;
		this.serv_3112 = serv_3112;
		this.recup_cng = recup_cng;
		this.charg_3112 = charg_3112;
		this.nbr_heurs_pris = nbr_heurs_pris;
		this.nbr_heurs_init = nbr_heurs_init;
		this.nbr_heurs_sold = nbr_heurs_sold;
		this.valid_droit = valid_droit;
		this.cng_paye = cng_paye;
		this.id_sold_cng = id_sold_cng;
	}


	public SoldCongePK getId() {
		return id;
	}


	public void setId(SoldCongePK id) {
		this.id = id;
	}


	public Long getInit_cng() {
		return init_cng;
	}


	public void setInit_cng(Long init_cng) {
		this.init_cng = init_cng;
	}


	public Long getCum_cng() {
		return cum_cng;
	}


	public void setCum_cng(Long cum_cng) {
		this.cum_cng = cum_cng;
	}


	public Long getPris_cng() {
		return pris_cng;
	}


	public void setPris_cng(Long pris_cng) {
		this.pris_cng = pris_cng;
	}


	public Long getFrequence() {
		return frequence;
	}


	public void setFrequence(Long frequence) {
		this.frequence = frequence;
	}


	public String getObs_cng() {
		return obs_cng;
	}


	public void setObs_cng(String obs_cng) {
		this.obs_cng = obs_cng;
	}


	public String getSem_cng() {
		return sem_cng;
	}


	public void setSem_cng(String sem_cng) {
		this.sem_cng = sem_cng;
	}


	public Long getSold_cng() {
		return sold_cng;
	}


	public void setSold_cng(Long sold_cng) {
		this.sold_cng = sold_cng;
	}


	public Long getCum_cng_ann_1() {
		return cum_cng_ann_1;
	}


	public void setCum_cng_ann_1(Long cum_cng_ann_1) {
		this.cum_cng_ann_1 = cum_cng_ann_1;
	}


	public Long getCng_njustif() {
		return cng_njustif;
	}


	public void setCng_njustif(Long cng_njustif) {
		this.cng_njustif = cng_njustif;
	}


	public Long getCng_justif() {
		return cng_justif;
	}


	public void setCng_justif(Long cng_justif) {
		this.cng_justif = cng_justif;
	}


	public String getNot_1_pris() {
		return not_1_pris;
	}


	public void setNot_1_pris(String not_1_pris) {
		this.not_1_pris = not_1_pris;
	}


	public String getNot_2_pris() {
		return not_2_pris;
	}


	public void setNot_2_pris(String not_2_pris) {
		this.not_2_pris = not_2_pris;
	}


	public Long getBonus_cng() {
		return bonus_cng;
	}


	public void setBonus_cng(Long bonus_cng) {
		this.bonus_cng = bonus_cng;
	}


	public String getObs_cng_a() {
		return obs_cng_a;
	}


	public void setObs_cng_a(String obs_cng_a) {
		this.obs_cng_a = obs_cng_a;
	}


	public String getSold_3112() {
		return sold_3112;
	}


	public void setSold_3112(String sold_3112) {
		this.sold_3112 = sold_3112;
	}


	public String getBrut_3112() {
		return brut_3112;
	}


	public void setBrut_3112(String brut_3112) {
		this.brut_3112 = brut_3112;
	}


	public String getServ_3112() {
		return serv_3112;
	}


	public void setServ_3112(String serv_3112) {
		this.serv_3112 = serv_3112;
	}


	public Long getRecup_cng() {
		return recup_cng;
	}


	public void setRecup_cng(Long recup_cng) {
		this.recup_cng = recup_cng;
	}


	public Long getCharg_3112() {
		return charg_3112;
	}


	public void setCharg_3112(Long charg_3112) {
		this.charg_3112 = charg_3112;
	}


	public Long getNbr_heurs_pris() {
		return nbr_heurs_pris;
	}


	public void setNbr_heurs_pris(Long nbr_heurs_pris) {
		this.nbr_heurs_pris = nbr_heurs_pris;
	}


	public Long getNbr_heurs_init() {
		return nbr_heurs_init;
	}


	public void setNbr_heurs_init(Long nbr_heurs_init) {
		this.nbr_heurs_init = nbr_heurs_init;
	}


	public Long getNbr_heurs_sold() {
		return nbr_heurs_sold;
	}


	public void setNbr_heurs_sold(Long nbr_heurs_sold) {
		this.nbr_heurs_sold = nbr_heurs_sold;
	}


	public String getValid_droit() {
		return valid_droit;
	}


	public void setValid_droit(String valid_droit) {
		this.valid_droit = valid_droit;
	}


	public Long getCng_paye() {
		return cng_paye;
	}


	public void setCng_paye(Long cng_paye) {
		this.cng_paye = cng_paye;
	}


	public Long getId_sold_cng() {
		return id_sold_cng;
	}


	public void setId_sold_cng(Long id_sold_cng) {
		this.id_sold_cng = id_sold_cng;
	}


	public SoldConge() {
		super();
	}


	@Override
	public String toString() {
		return "SoldConge [id=" + id + ", init_cng=" + init_cng + ", cum_cng=" + cum_cng + ", pris_cng=" + pris_cng
				+ ", frequence=" + frequence + ", obs_cng=" + obs_cng + ", sem_cng=" + sem_cng + ", sold_cng="
				+ sold_cng + ", cum_cng_ann_1=" + cum_cng_ann_1 + ", cng_njustif=" + cng_njustif + ", cng_justif="
				+ cng_justif + ", not_1_pris=" + not_1_pris + ", not_2_pris=" + not_2_pris + ", bonus_cng=" + bonus_cng
				+ ", obs_cng_a=" + obs_cng_a + ", sold_3112=" + sold_3112 + ", brut_3112=" + brut_3112 + ", serv_3112="
				+ serv_3112 + ", recup_cng=" + recup_cng + ", charg_3112=" + charg_3112 + ", nbr_heurs_pris="
				+ nbr_heurs_pris + ", nbr_heurs_init=" + nbr_heurs_init + ", nbr_heurs_sold=" + nbr_heurs_sold
				+ ", valid_droit=" + valid_droit + ", cng_paye=" + cng_paye + ", id_sold_cng=" + id_sold_cng + "]";
	}
	
	
	
	 
}
