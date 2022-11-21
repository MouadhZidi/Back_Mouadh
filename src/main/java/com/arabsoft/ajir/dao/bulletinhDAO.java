package com.arabsoft.ajir.dao;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.arabsoft.ajir.entities.BulletinH;

@Repository
public interface bulletinhDAO extends JpaRepository<BulletinH, String>{
	
	@Query(value="select cod_typ_bul,\r\n"
			+ "       dt_bul,\r\n"
			+ "       cod_soc,\r\n"
			+ "       mat_pers,\r\n"
			+ "       pk_get_lib.Get_personnel$NomPrenom(cod_soc,mat_pers) nom_pers,\r\n"
			+ "       cod_serv,\r\n"
			+ "       pk_get_lib.GET_SERVICE$LIB_SERV(cod_soc, cod_serv) lib_serv,\r\n"
			+ "       adm_tech,\r\n"
			+ "       pk_get_lib.GET_TYP_ADM_TE$LIB_ADM_TECH(adm_tech) lib_adm_tech,\r\n"
			+ "       cod_sit,\r\n"
			+ "       cod_cat,\r\n"
			+ "       cod_grad,\r\n"
			+ "       charg_all,\r\n"
			+ "       charg_enf,\r\n"
			+ "       cod_ech,\r\n"
			+ "       nbr_enf\r\n"
			+ "  from bulletinh\r\n"
			+ "  where cod_soc = :codSoc\r\n"
			+ "  and   mat_pers = :matPers\r\n"
			+ "  and   cod_typ_bul = :codTypBul\r\n"
			+ "  and   dt_bul = to_char(last_day(to_date(:dtBull,'MM/yyyy')),'dd/MM/yyyy')",nativeQuery = true)
	public BulletinH getBulletin(@Param("codSoc") String codSoc,
			@Param("matPers") String matPers,@Param("codTypBul") String codTypBul,@Param("dtBull") String dtBull);

}
