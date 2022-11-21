package com.arabsoft.ajir.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name="DEM_CNG")
public class DemCng implements Serializable{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CleDemCng id;
	
	@Column(name="ANNEE_CNG")
	private Long anne_cng;
	
	@Column(name="CODE_M")
	private String code_m ;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Column(name="DAT_DCNG")
	private Date dat_dcng ;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Column(name="DAT_DEBUT")
	private Date dat_debut ;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Column(name="DAT_FIN")
	private Date dat_fin;
	 
	@Column(name="NBR_JOURS")
	private Long nbr_jours;
	
	@Column(name="NBR_JOURS_CAL")
	private Long nbr_jours_cal;
	
	@Column(name="BONUS_CNG")
	private Long bonus_cng;
	
	@Column(name="MOTIF_CNG")
	private String motif_cng;
	
	@Column(name="RESIDENCE")
	private String residence; 
	
	@Column(name="TEL")
	private String tel;
	
	@Column(name="VALID")
	private String valid;
	
	@Column(name="ETAT_CNG")
	private String etat_cng;
	
	@Column(name="EDIT_TITRE")
	private String edit_titre;
	  
	@Column(name="NBO")
	private String nbo;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Column(name="DAT_NBO")
	private Date dat_nbo;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Column(name="DAT_PREV_RET")
	private Date dat_prev_ret;

	@JsonFormat(pattern = "dd/MM/yyyy")
	@Column(name="DAT_RETOUR")
	private Date dat_retour;

	@Column(name="NBO_RET")
	private String nbo_ret;

	@JsonFormat(pattern = "dd/MM/yyyy")
	@Column(name="DAT_NBO_RET")
	private Date dat_nbo_ret;

	@Column(name="CNG_PROL")
	private String cng_prol;

	@Column(name="NUM_DCNG_PROL")
	private Long num_dcng_prol;
	
	@Column(name="NBR_JOUR_PROL")
	private Long nbr_jour_prol;

	@Column(name="PLANIFIER")
	private String planifier;
	 
	@Column(name="NAT_CNG")
	private String nat_cng;
	
	@Column(name="CNG_TEMPS")
	private String cng_temps;
	 
	@Column(name="CNG_TEMPS_DEBUT")
	private String cng_temps_debut;
	
	@Column(name="CNG_TEMPS_FIN")
	private String cng_temps_fin;
	
	@Column(name="NBR_JOURS_DEMI")
	private Long nbr_jours_demi;
	
	@Column(name="NBR_JOURS_SOLD")
	private Long nbr_jours_sold;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Column(name="DAT_JOURS_DEMI")
	private Date dat_jours_demi;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Column(name="DAT_JOURS_SOLD")
	private Date dat_jours_sold;
	 
	@Column(name="COD_UR")
	private String cod_ur;
	
	@Column(name="COD_SERV")
	private String cod_serv;
	
	@Column(name="COD_MOTIF")
	private String cod_motif;
	
	@Column(name="COD_AFFECT")
	private String cod_affect;
	
	@Column(name="COD_CLASS")
	private String cod_class;
	
	@Column(name="REGIME_TRAV")
	private String regime_trav;
	
	@Column(name="REG_CNG")
	private String reg_cng;
	
	@Column(name="COD_CYCL")
	private String cod_cycl;
	
	@Column(name="RESIDENCE_A")
	private String residence_a;

	@Column(name="MOTIF_A")
	private String motif_a;
	
	@Column(name="NUM_SANC")
	private Long num_sanc;

	@Column(name="NUM_ACC")
	private String num_acc;
	
	@Column(name="NUM_MAL")
	private String num_mal;
	
	@Column(name="NUM_SAIS")
	private Long num_sais;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Column(name="DAT_SAIS_SYS")
	private Date dat_sais_sys;
	
	@Column(name="COD_USER")
	private String cod_user;
	
	@Column(name="COD_ALERT")
	private String cod_alert;
	  
	@Column(name="SEQ_ALERT")
	private Long seq_alert;  
	
	@Column(name="SOLD_CNG")
	private Long sold_cng; 
	 
	@Column(name="CNG_VISIT")
	private String cng_visit;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Column(name="DAT_CONTRE_VISIT")
	private Date dat_contre_visit;
	
	@Column(name="CNG_INIT")
	private String cng_init;
	
	@Column(name="AVANCE_CNG")
	private Long avance_cng;
	 
	@Column(name="NBR_HEURE")
	private Long nbr_heure; 
	
	@Column(name="NOM_MEDCIN")
	private String nom_medcin; 
	 
	@Column(name="CUM_RETENUE")
	private Long cum_retenue;
	
	@Column(name="RETENUE_MOIS")
	private Long retenue_mois;
	
	@Column(name="CUM_RAPPEL")
	private Long cum_rappel;
	
	@Column(name="COD_CATEG")
	private String cod_categ;
	 
	@Column(name="COD_CAT")
	private String cod_cat;
	
	@Column(name="COD_GRAD")
	private String cod_grad;  
	
	@Column(name="SIGN_CNG")
	private String sign_cng;    
	  
	@Column(name="SPECIALITE")  
	private String specialite; 
	
	@Column(name="CNG_SAL")  
	private String cng_sal; 
	
	@Column(name="CNG_DOC") 
	private String cng_doc;
	
	@Column(name="ORD_CAND")
	private Long ord_cand;
	  
	@Column(name="CLOTURE")
	private String cloture; 
	
	@Column(name="INJECT")
	private String inject;
	
	@Column(name="COD_USER_CONF")
	private String cod_user_conf;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Column(name="DAT_USER_CONF")
	private Date dat_user_conf;
	
	@Column(name="ID_DEM_CNG")
	private Long id_dem_cng;

	public CleDemCng getId() {
		return id;
	}

	public void setId(CleDemCng id) {
		this.id = id;
	}

	public Long getAnne_cng() {
		return anne_cng;
	}

	public void setAnne_cng(Long anne_cng) {
		this.anne_cng = anne_cng;
	}

	public String getCode_m() {
		return code_m;
	}

	public void setCode_m(String code_m) {
		this.code_m = code_m;
	}

	public Date getDat_dcng() {
		return dat_dcng;
	}

	public void setDat_dcng(Date dat_dcng) {
		this.dat_dcng = dat_dcng;
	}

	public Date getDat_debut() {
		return dat_debut;
	}

	public void setDat_debut(Date dat_debut) {
		this.dat_debut = dat_debut;
	}

	public Date getDat_fin() {
		return dat_fin;
	}

	public void setDat_fin(Date dat_fin) {
		this.dat_fin = dat_fin;
	}

	public Long getNbr_jours() {
		return nbr_jours;
	}

	public void setNbr_jours(Long nbr_jours) {
		this.nbr_jours = nbr_jours;
	}

	public Long getNbr_jours_cal() {
		return nbr_jours_cal;
	}

	public void setNbr_jours_cal(Long nbr_jours_cal) {
		this.nbr_jours_cal = nbr_jours_cal;
	}

	public Long getBonus_cng() {
		return bonus_cng;
	}

	public void setBonus_cng(Long bonus_cng) {
		this.bonus_cng = bonus_cng;
	}

	public String getMotif_cng() {
		return motif_cng;
	}

	public void setMotif_cng(String motif_cng) {
		this.motif_cng = motif_cng;
	}

	public String getResidence() {
		return residence;
	}

	public void setResidence(String residence) {
		this.residence = residence;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getValid() {
		return valid;
	}

	public void setValid(String valid) {
		this.valid = valid;
	}

	public String getEtat_cng() {
		return etat_cng;
	}

	public void setEtat_cng(String etat_cng) {
		this.etat_cng = etat_cng;
	}

	public String getEdit_titre() {
		return edit_titre;
	}

	public void setEdit_titre(String edit_titre) {
		this.edit_titre = edit_titre;
	}

	public String getNbo() {
		return nbo;
	}

	public void setNbo(String nbo) {
		this.nbo = nbo;
	}

	public Date getDat_nbo() {
		return dat_nbo;
	}

	public void setDat_nbo(Date dat_nbo) {
		this.dat_nbo = dat_nbo;
	}

	public Date getDat_prev_ret() {
		return dat_prev_ret;
	}

	public void setDat_prev_ret(Date dat_prev_ret) {
		this.dat_prev_ret = dat_prev_ret;
	}

	public Date getDat_retour() {
		return dat_retour;
	}

	public void setDat_retour(Date dat_retour) {
		this.dat_retour = dat_retour;
	}

	public String getNbo_ret() {
		return nbo_ret;
	}

	public void setNbo_ret(String nbo_ret) {
		this.nbo_ret = nbo_ret;
	}

	public Date getDat_nbo_ret() {
		return dat_nbo_ret;
	}

	public void setDat_nbo_ret(Date dat_nbo_ret) {
		this.dat_nbo_ret = dat_nbo_ret;
	}

	public String getCng_prol() {
		return cng_prol;
	}

	public void setCng_prol(String cng_prol) {
		this.cng_prol = cng_prol;
	}

	public Long getNum_dcng_prol() {
		return num_dcng_prol;
	}

	public void setNum_dcng_prol(Long num_dcng_prol) {
		this.num_dcng_prol = num_dcng_prol;
	}

	public Long getNbr_jour_prol() {
		return nbr_jour_prol;
	}

	public void setNbr_jour_prol(Long nbr_jour_prol) {
		this.nbr_jour_prol = nbr_jour_prol;
	}

	public String getPlanifier() {
		return planifier;
	}

	public void setPlanifier(String planifier) {
		this.planifier = planifier;
	}

	public String getNat_cng() {
		return nat_cng;
	}

	public void setNat_cng(String nat_cng) {
		this.nat_cng = nat_cng;
	}

	public String getCng_temps() {
		return cng_temps;
	}

	public void setCng_temps(String cng_temps) {
		this.cng_temps = cng_temps;
	}

	public String getCng_temps_debut() {
		return cng_temps_debut;
	}

	public void setCng_temps_debut(String cng_temps_debut) {
		this.cng_temps_debut = cng_temps_debut;
	}

	public String getCng_temps_fin() {
		return cng_temps_fin;
	}

	public void setCng_temps_fin(String cng_temps_fin) {
		this.cng_temps_fin = cng_temps_fin;
	}

	public Long getNbr_jours_demi() {
		return nbr_jours_demi;
	}

	public void setNbr_jours_demi(Long nbr_jours_demi) {
		this.nbr_jours_demi = nbr_jours_demi;
	}

	public Long getNbr_jours_sold() {
		return nbr_jours_sold;
	}

	public void setNbr_jours_sold(Long nbr_jours_sold) {
		this.nbr_jours_sold = nbr_jours_sold;
	}

	public Date getDat_jours_demi() {
		return dat_jours_demi;
	}

	public void setDat_jours_demi(Date dat_jours_demi) {
		this.dat_jours_demi = dat_jours_demi;
	}

	public Date getDat_jours_sold() {
		return dat_jours_sold;
	}

	public void setDat_jours_sold(Date dat_jours_sold) {
		this.dat_jours_sold = dat_jours_sold;
	}

	public String getCod_ur() {
		return cod_ur;
	}

	public void setCod_ur(String cod_ur) {
		this.cod_ur = cod_ur;
	}

	public String getCod_serv() {
		return cod_serv;
	}

	public void setCod_serv(String cod_serv) {
		this.cod_serv = cod_serv;
	}

	public String getCod_motif() {
		return cod_motif;
	}

	public void setCod_motif(String cod_motif) {
		this.cod_motif = cod_motif;
	}

	public String getCod_affect() {
		return cod_affect;
	}

	public void setCod_affect(String cod_affect) {
		this.cod_affect = cod_affect;
	}

	public String getCod_class() {
		return cod_class;
	}

	public void setCod_class(String cod_class) {
		this.cod_class = cod_class;
	}

	public String getRegime_trav() {
		return regime_trav;
	}

	public void setRegime_trav(String regime_trav) {
		this.regime_trav = regime_trav;
	}

	public String getReg_cng() {
		return reg_cng;
	}

	public void setReg_cng(String reg_cng) {
		this.reg_cng = reg_cng;
	}

	public String getCod_cycl() {
		return cod_cycl;
	}

	public void setCod_cycl(String cod_cycl) {
		this.cod_cycl = cod_cycl;
	}

	public String getResidence_a() {
		return residence_a;
	}

	public void setResidence_a(String residence_a) {
		this.residence_a = residence_a;
	}

	public String getMotif_a() {
		return motif_a;
	}

	public void setMotif_a(String motif_a) {
		this.motif_a = motif_a;
	}

	public Long getNum_sanc() {
		return num_sanc;
	}

	public void setNum_sanc(Long num_sanc) {
		this.num_sanc = num_sanc;
	}

	public String getNum_acc() {
		return num_acc;
	}

	public void setNum_acc(String num_acc) {
		this.num_acc = num_acc;
	}

	public String getNum_mal() {
		return num_mal;
	}

	public void setNum_mal(String num_mal) {
		this.num_mal = num_mal;
	}

	public Long getNum_sais() {
		return num_sais;
	}

	public void setNum_sais(Long num_sais) {
		this.num_sais = num_sais;
	}

	public Date getDat_sais_sys() {
		return dat_sais_sys;
	}

	public void setDat_sais_sys(Date dat_sais_sys) {
		this.dat_sais_sys = dat_sais_sys;
	}

	public String getCod_user() {
		return cod_user;
	}

	public void setCod_user(String cod_user) {
		this.cod_user = cod_user;
	}

	public String getCod_alert() {
		return cod_alert;
	}

	public void setCod_alert(String cod_alert) {
		this.cod_alert = cod_alert;
	}

	public Long getSeq_alert() {
		return seq_alert;
	}

	public void setSeq_alert(Long seq_alert) {
		this.seq_alert = seq_alert;
	}

	public Long getSold_cng() {
		return sold_cng;
	}

	public void setSold_cng(Long sold_cng) {
		this.sold_cng = sold_cng;
	}

	public String getCng_visit() {
		return cng_visit;
	}

	public void setCng_visit(String cng_visit) {
		this.cng_visit = cng_visit;
	}

	public Date getDat_contre_visit() {
		return dat_contre_visit;
	}

	public void setDat_contre_visit(Date dat_contre_visit) {
		this.dat_contre_visit = dat_contre_visit;
	}

	public String getCng_init() {
		return cng_init;
	}

	public void setCng_init(String cng_init) {
		this.cng_init = cng_init;
	}

	public Long getAvance_cng() {
		return avance_cng;
	}

	public void setAvance_cng(Long avance_cng) {
		this.avance_cng = avance_cng;
	}

	public Long getNbr_heure() {
		return nbr_heure;
	}

	public void setNbr_heure(Long nbr_heure) {
		this.nbr_heure = nbr_heure;
	}

	public String getNom_medcin() {
		return nom_medcin;
	}

	public void setNom_medcin(String nom_medcin) {
		this.nom_medcin = nom_medcin;
	}

	public Long getCum_retenue() {
		return cum_retenue;
	}

	public void setCum_retenue(Long cum_retenue) {
		this.cum_retenue = cum_retenue;
	}

	public Long getRetenue_mois() {
		return retenue_mois;
	}

	public void setRetenue_mois(Long retenue_mois) {
		this.retenue_mois = retenue_mois;
	}

	public Long getCum_rappel() {
		return cum_rappel;
	}

	public void setCum_rappel(Long cum_rappel) {
		this.cum_rappel = cum_rappel;
	}

	public String getCod_categ() {
		return cod_categ;
	}

	public void setCod_categ(String cod_categ) {
		this.cod_categ = cod_categ;
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

	public String getSign_cng() {
		return sign_cng;
	}

	public void setSign_cng(String sign_cng) {
		this.sign_cng = sign_cng;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public String getCng_sal() {
		return cng_sal;
	}

	public void setCng_sal(String cng_sal) {
		this.cng_sal = cng_sal;
	}

	public String getCng_doc() {
		return cng_doc;
	}

	public void setCng_doc(String cng_doc) {
		this.cng_doc = cng_doc;
	}

	public Long getOrd_cand() {
		return ord_cand;
	}

	public void setOrd_cand(Long ord_cand) {
		this.ord_cand = ord_cand;
	}

	public String getCloture() {
		return cloture;
	}

	public void setCloture(String cloture) {
		this.cloture = cloture;
	}

	public String getInject() {
		return inject;
	}

	public void setInject(String inject) {
		this.inject = inject;
	}

	public String getCod_user_conf() {
		return cod_user_conf;
	}

	public void setCod_user_conf(String cod_user_conf) {
		this.cod_user_conf = cod_user_conf;
	}

	public Date getDat_user_conf() {
		return dat_user_conf;
	}

	public void setDat_user_conf(Date dat_user_conf) {
		this.dat_user_conf = dat_user_conf;
	}

	public Long getId_dem_cng() {
		return id_dem_cng;
	}

	public void setId_dem_cng(Long id_dem_cng) {
		this.id_dem_cng = id_dem_cng;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public DemCng(CleDemCng id, Long anne_cng, String code_m, Date dat_dcng, Date dat_debut, Date dat_fin,
			Long nbr_jours, Long nbr_jours_cal, Long bonus_cng, String motif_cng, String residence, String tel,
			String valid, String etat_cng, String edit_titre, String nbo, Date dat_nbo, Date dat_prev_ret,
			Date dat_retour, Date dat_ret, Date dat_nbo_ret, String cng_prol, Long num_dcng_prol, Long nbr_jour_prol,
			String planifier, String nat_cng, String cng_temps, String cng_temps_debut, String cng_temps_fin,
			Long nbr_jours_demi, Long nbr_jours_sold, Date dat_jours_demi, Date dat_jours_sold, String cod_ur,
			String cod_serv, String cod_motif, String cod_affect, String cod_class, String regime_trav, String reg_cng,
			String cod_cycl, String residence_a, String motif_a, Long num_sanc, String num_acc, String num_mal,
			Long num_sais, Date dat_sais_sys, String cod_user, String cod_alert, Long seq_alert, Long sold_cng,
			String cng_visit, Date dat_contre_visit, String cng_init, Long avance_cng, Long nbr_heure,
			String nom_medcin, Long cum_retenue, Long retenue_mois, Long cum_rappel, String cod_categ, String cod_cat,
			String cod_grad, String sign_cng, String specialite, String cng_sal, String cng_doc, Long ord_cand,
			String cloture, String inject, String cod_user_conf, Date dat_user_conf, Long id_dem_cng) {
		super();
		this.id = id;
		this.anne_cng = anne_cng;
		this.code_m = code_m;
		this.dat_dcng = dat_dcng;
		this.dat_debut = dat_debut;
		this.dat_fin = dat_fin;
		this.nbr_jours = nbr_jours;
		this.nbr_jours_cal = nbr_jours_cal;
		this.bonus_cng = bonus_cng;
		this.motif_cng = motif_cng;
		this.residence = residence;
		this.tel = tel;
		this.valid = valid;
		this.etat_cng = etat_cng;
		this.edit_titre = edit_titre;
		this.nbo = nbo;
		this.dat_nbo = dat_nbo;
		this.dat_prev_ret = dat_prev_ret;
		this.dat_retour = dat_retour;
		this.nbo_ret = nbo_ret;
		this.dat_nbo_ret = dat_nbo_ret;
		this.cng_prol = cng_prol;
		this.num_dcng_prol = num_dcng_prol;
		this.nbr_jour_prol = nbr_jour_prol;
		this.planifier = planifier;
		this.nat_cng = nat_cng;
		this.cng_temps = cng_temps;
		this.cng_temps_debut = cng_temps_debut;
		this.cng_temps_fin = cng_temps_fin;
		this.nbr_jours_demi = nbr_jours_demi;
		this.nbr_jours_sold = nbr_jours_sold;
		this.dat_jours_demi = dat_jours_demi;
		this.dat_jours_sold = dat_jours_sold;
		this.cod_ur = cod_ur;
		this.cod_serv = cod_serv;
		this.cod_motif = cod_motif;
		this.cod_affect = cod_affect;
		this.cod_class = cod_class;
		this.regime_trav = regime_trav;
		this.reg_cng = reg_cng;
		this.cod_cycl = cod_cycl;
		this.residence_a = residence_a;
		this.motif_a = motif_a;
		this.num_sanc = num_sanc;
		this.num_acc = num_acc;
		this.num_mal = num_mal;
		this.num_sais = num_sais;
		this.dat_sais_sys = dat_sais_sys;
		this.cod_user = cod_user;
		this.cod_alert = cod_alert;
		this.seq_alert = seq_alert;
		this.sold_cng = sold_cng;
		this.cng_visit = cng_visit;
		this.dat_contre_visit = dat_contre_visit;
		this.cng_init = cng_init;
		this.avance_cng = avance_cng;
		this.nbr_heure = nbr_heure;
		this.nom_medcin = nom_medcin;
		this.cum_retenue = cum_retenue;
		this.retenue_mois = retenue_mois;
		this.cum_rappel = cum_rappel;
		this.cod_categ = cod_categ;
		this.cod_cat = cod_cat;
		this.cod_grad = cod_grad;
		this.sign_cng = sign_cng;
		this.specialite = specialite;
		this.cng_sal = cng_sal;
		this.cng_doc = cng_doc;
		this.ord_cand = ord_cand;
		this.cloture = cloture;
		this.inject = inject;
		this.cod_user_conf = cod_user_conf;
		this.dat_user_conf = dat_user_conf;
		this.id_dem_cng = id_dem_cng;
	}

	public DemCng() {
		super();
	}

	@Override
	public String toString() {
		return "DemCng [id=" + id + ", anne_cng=" + anne_cng + ", code_m=" + code_m + ", dat_dcng=" + dat_dcng
				+ ", dat_debut=" + dat_debut + ", dat_fin=" + dat_fin + ", nbr_jours=" + nbr_jours + ", nbr_jours_cal="
				+ nbr_jours_cal + ", bonus_cng=" + bonus_cng + ", motif_cng=" + motif_cng + ", residence=" + residence
				+ ", tel=" + tel + ", valid=" + valid + ", etat_cng=" + etat_cng + ", edit_titre=" + edit_titre
				+ ", nbo=" + nbo + ", dat_nbo=" + dat_nbo + ", dat_prev_ret=" + dat_prev_ret + ", dat_retour="
				+ dat_retour + ", dat_ret=" + nbo_ret + ", dat_nbo_ret=" + dat_nbo_ret + ", cng_prol=" + cng_prol
				+ ", num_dcng_prol=" + num_dcng_prol + ", nbr_jour_prol=" + nbr_jour_prol + ", planifier=" + planifier
				+ ", nat_cng=" + nat_cng + ", cng_temps=" + cng_temps + ", cng_temps_debut=" + cng_temps_debut
				+ ", cng_temps_fin=" + cng_temps_fin + ", nbr_jours_demi=" + nbr_jours_demi + ", nbr_jours_sold="
				+ nbr_jours_sold + ", dat_jours_demi=" + dat_jours_demi + ", dat_jours_sold=" + dat_jours_sold
				+ ", cod_ur=" + cod_ur + ", cod_serv=" + cod_serv + ", cod_motif=" + cod_motif + ", cod_affect="
				+ cod_affect + ", cod_class=" + cod_class + ", regime_trav=" + regime_trav + ", reg_cng=" + reg_cng
				+ ", cod_cycl=" + cod_cycl + ", residence_a=" + residence_a + ", motif_a=" + motif_a + ", num_sanc="
				+ num_sanc + ", num_acc=" + num_acc + ", num_mal=" + num_mal + ", num_sais=" + num_sais
				+ ", dat_sais_sys=" + dat_sais_sys + ", cod_user=" + cod_user + ", cod_alert=" + cod_alert
				+ ", seq_alert=" + seq_alert + ", sold_cng=" + sold_cng + ", cng_visit=" + cng_visit
				+ ", dat_contre_visit=" + dat_contre_visit + ", cng_init=" + cng_init + ", avance_cng=" + avance_cng
				+ ", nbr_heure=" + nbr_heure + ", nom_medcin=" + nom_medcin + ", cum_retenue=" + cum_retenue
				+ ", retenue_mois=" + retenue_mois + ", cum_rappel=" + cum_rappel + ", cod_categ=" + cod_categ
				+ ", cod_cat=" + cod_cat + ", cod_grad=" + cod_grad + ", sign_cng=" + sign_cng + ", specialite="
				+ specialite + ", cng_sal=" + cng_sal + ", cng_doc=" + cng_doc + ", ord_cand=" + ord_cand + ", cloture="
				+ cloture + ", inject=" + inject + ", cod_user_conf=" + cod_user_conf + ", dat_user_conf="
				+ dat_user_conf + ", id_dem_cng=" + id_dem_cng + "]";
	}

	
}
