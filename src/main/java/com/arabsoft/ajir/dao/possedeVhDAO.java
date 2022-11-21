package com.arabsoft.ajir.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.arabsoft.ajir.entities.PossedeVh;

@Repository
public interface possedeVhDAO extends JpaRepository<PossedeVh, Integer>{
	
	@Query(value="select dt_bul,\r\n"
			+ "  cod_typ_bul,\r\n"
			+ "  pk_get_lib.GET_TYP_BULLET$LIB_BULL(cod_typ_bul) lib_bul,\r\n"
			+ "  cod_soc,\r\n"
			+ "  mat_pers,\r\n"
			+ "  pk_get_lib.Get_personnel$NomPrenom(cod_soc,mat_pers) nom_pers,\r\n"
			+ "  datev,\r\n"
			+ "  bul_cod_typ_bul,\r\n"
			+ "  p.abrv_fixe,\r\n"
			+ "  f.lib_fixe,\r\n"
			+ "  decode(f.sens_imput,'P',p.montv,0) mnt_gain,\r\n"
			+ "  decode(f.sens_imput,'R',p.montv,0) mnt_charge,\r\n"
			+ "  montant,\r\n"
			+ "  cod_serv,\r\n"
			+ "  pk_get_lib.GET_SERVICE$LIB_SERV(cod_soc, cod_serv) lib_serv,\r\n"
			+ "  p.type_par type_par,\r\n"
			+ "  p.cod_niv cod_niv,\r\n"
			+ "  p.num_niv num_niv,\r\n"
			+ "  nombre,\r\n"
			+ "  seq,\r\n"
			+ "  taux\r\n"
			+ "  from possedevh p,par_fixe f\r\n"
			+ "  where p.abrv_fixe = f.abrv_fixe \r\n"
			+ "  and (p.COD_NIV <=200 OR p.COD_NIV = 810) \r\n"
			+ "  and MONTV <>0\r\n"
			+ "  and p.cod_soc = :codSoc \r\n"
			+ "  and p.mat_pers = :matPers \r\n"
			+ "	 and p.cod_typ_bul = :codTypBul\r\n"
			+ "	 and p.dt_bul = to_char(last_day(to_date(:dtBull,'MM/yyyy')),'dd/MM/yyyy')\r\n" ,nativeQuery = true)
	public List<PossedeVh> getPossede(@Param("codSoc") String codSoc,
			@Param("matPers") String matPers,@Param("codTypBul") String codTypBul,@Param("dtBull") String dtBull);

}
