package com.arabsoft.ajir.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TYP_BULLETIN")
public class TypeBulletin {

	@Id
	private String cod_typ_bul;
	private String lib_bull;
	private String typ_bul;
	private String solde;
	private Long jour;
	private String dat_deb;
	private String dat_fin;
	private String coef_bul;
	private String lib_bull_a;
	private String cloture;
	private String reserve;
	private String cod_typ_bul_ref;
	private String nat_cycle;
	private String regime_trav;
	private String cod_oper;
	private String chap_debit;
	private String chap_liais;
	private String chap_cred;
	private Long ord;

	public String getCod_typ_bul() {
		return cod_typ_bul;
	}

	public void setCod_typ_bul(String cod_typ_bul) {
		this.cod_typ_bul = cod_typ_bul;
	}

	public String getLib_bull() {
		return lib_bull;
	}

	public void setLib_bull(String lib_bull) {
		this.lib_bull = lib_bull;
	}

	public String getTyp_bul() {
		return typ_bul;
	}

	public void setTyp_bul(String typ_bul) {
		this.typ_bul = typ_bul;
	}

	public String getSolde() {
		return solde;
	}

	public void setSolde(String solde) {
		this.solde = solde;
	}

	public Long getJour() {
		return jour;
	}

	public void setJour(Long jour) {
		this.jour = jour;
	}

	public String getDat_deb() {
		return dat_deb;
	}

	public void setDat_deb(String dat_deb) {
		this.dat_deb = dat_deb;
	}

	public String getDat_fin() {
		return dat_fin;
	}

	public void setDat_fin(String dat_fin) {
		this.dat_fin = dat_fin;
	}

	public String getCoef_bul() {
		return coef_bul;
	}

	public void setCoef_bul(String coef_bul) {
		this.coef_bul = coef_bul;
	}

	public String getLib_bull_a() {
		return lib_bull_a;
	}

	public void setLib_bull_a(String lib_bull_a) {
		this.lib_bull_a = lib_bull_a;
	}

	public String getCloture() {
		return cloture;
	}

	public void setCloture(String cloture) {
		this.cloture = cloture;
	}

	public String getReserve() {
		return reserve;
	}

	public void setReserve(String reserve) {
		this.reserve = reserve;
	}

	public String getCod_typ_bul_ref() {
		return cod_typ_bul_ref;
	}

	public void setCod_typ_bul_ref(String cod_typ_bul_ref) {
		this.cod_typ_bul_ref = cod_typ_bul_ref;
	}

	public String getNat_cycle() {
		return nat_cycle;
	}

	public void setNat_cycle(String nat_cycle) {
		this.nat_cycle = nat_cycle;
	}

	public String getRegime_trav() {
		return regime_trav;
	}

	public void setRegime_trav(String regime_trav) {
		this.regime_trav = regime_trav;
	}

	public String getCod_oper() {
		return cod_oper;
	}

	public void setCod_oper(String cod_oper) {
		this.cod_oper = cod_oper;
	}

	public String getChap_debit() {
		return chap_debit;
	}

	public void setChap_debit(String chap_debit) {
		this.chap_debit = chap_debit;
	}

	public String getChap_liais() {
		return chap_liais;
	}

	public void setChap_liais(String chap_liais) {
		this.chap_liais = chap_liais;
	}

	public String getChap_cred() {
		return chap_cred;
	}

	public void setChap_cred(String chap_cred) {
		this.chap_cred = chap_cred;
	}

	public Long getOrd() {
		return ord;
	}

	public void setOrd(Long ord) {
		this.ord = ord;
	}

}
