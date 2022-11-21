package com.arabsoft.ajir.sevices;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.arabsoft.ajir.entities.AdmUser;
import com.fasterxml.jackson.annotation.JsonIgnore;




public class UserDetailsImpl implements UserDetails {
	private static final long serialVersionUID = 1L;

	private Long use_id;

	private String use_matricule;

	private String uselogin;	

	private String use_psw;

	private String use_lname;
	private String use_fname;
	private Long use_nbessai;
	private String use_cptestatus;
	private Date use_crtdt;
	private Date use_lastcnx;
	private String use_nivadm;
	private String use_type;
	private String use_status;
	private Date use_credt;
	private Date use_updtdt;
	private String use_updtby;
	private String cod_soc;
	private String mat_pers;
	private String cod_site;
	
	
	

	public UserDetailsImpl(String uselogin, String use_psw) {
		super();
		this.uselogin = uselogin;
		this.use_psw = use_psw;
	}

	public Long getUse_id() {
		return use_id;
	}

	public void setUse_id(Long use_id) {
		this.use_id = use_id;
	}

	public String getUse_matricule() {
		return use_matricule;
	}

	public void setUse_matricule(String use_matricule) {
		this.use_matricule = use_matricule;
	}

	public String getUselogin() {
		return uselogin;
	}

	public void setUselogin(String uselogin) {
		this.uselogin = uselogin;
	}

	public String getUse_psw() {
		return use_psw;
	}

	public void setUse_psw(String use_psw) {
		this.use_psw = use_psw;
	}

	public String getUse_lname() {
		return use_lname;
	}

	public void setUse_lname(String use_lname) {
		this.use_lname = use_lname;
	}

	public String getUse_fname() {
		return use_fname;
	}

	public void setUse_fname(String use_fname) {
		this.use_fname = use_fname;
	}

	public Long getUse_nbessai() {
		return use_nbessai;
	}

	public void setUse_nbessai(Long use_nbessai) {
		this.use_nbessai = use_nbessai;
	}

	public String getUse_cptestatus() {
		return use_cptestatus;
	}

	public void setUse_cptestatus(String use_cptestatus) {
		this.use_cptestatus = use_cptestatus;
	}

	public Date getUse_crtdt() {
		return use_crtdt;
	}

	public void setUse_crtdt(Date use_crtdt) {
		this.use_crtdt = use_crtdt;
	}

	public Date getUse_lastcnx() {
		return use_lastcnx;
	}

	public void setUse_lastcnx(Date use_lastcnx) {
		this.use_lastcnx = use_lastcnx;
	}

	public String getUse_nivadm() {
		return use_nivadm;
	}

	public void setUse_nivadm(String use_nivadm) {
		this.use_nivadm = use_nivadm;
	}

	public String getUse_type() {
		return use_type;
	}

	public void setUse_type(String use_type) {
		this.use_type = use_type;
	}

	public String getUse_status() {
		return use_status;
	}

	public void setUse_status(String use_status) {
		this.use_status = use_status;
	}

	public Date getUse_credt() {
		return use_credt;
	}

	public void setUse_credt(Date use_credt) {
		this.use_credt = use_credt;
	}

	public Date getUse_updtdt() {
		return use_updtdt;
	}

	public void setUse_updtdt(Date use_updtdt) {
		this.use_updtdt = use_updtdt;
	}

	public String getUse_updtby() {
		return use_updtby;
	}

	public void setUse_updtby(String use_updtby) {
		this.use_updtby = use_updtby;
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

	public String getCod_site() {
		return cod_site;
	}

	public void setCod_site(String cod_site) {
		this.cod_site = cod_site;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

	



	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
	public static UserDetailsImpl build(AdmUser user) {
		
		return new UserDetailsImpl( user.getUse_login(), user.getUse_psw());
	}
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		UserDetailsImpl user = (UserDetailsImpl) o;
		return Objects.equals(use_id, user.use_id);
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}
}
