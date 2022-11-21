package com.arabsoft.ajir.entities;

import java.io.Serializable;

import javax.persistence.Column;

public class CleDemCng implements Serializable {
	private static final long serialVersionUID = 1L;
	@Column(insertable = false,updatable = false)
	private String cod_soc;
	@Column(insertable = false,updatable = false)
	private String mat_pers;
	@Column(insertable = false,updatable = false)
	private Long num_dcng;
	public CleDemCng() {
		super();
	}
	public CleDemCng(String cod_soc, String mat_pers, Long num_dcng) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.num_dcng = num_dcng;
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
	public Long getNum_dcng() {
		return num_dcng;
	}
	public void setNum_dcng(Long num_dcng) {
		this.num_dcng = num_dcng;
	}
}
