package com.arabsoft.ajir.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.arabsoft.ajir.entities.CleDemCng;
import com.arabsoft.ajir.entities.DemCng;


@Repository
public interface CongeRep extends JpaRepository<DemCng,CleDemCng> {

	@Query("select c from DemCng c where c.id.cod_soc=:x and c.id.mat_pers=:y ")
	public List<DemCng> getbycodesocandmatpers(@Param("x")String codSoc,@Param("y")String mat);
	
	
	
	
	
	
	 @Query(value = "select \r\n"
				
				+" p.nom_pers        \r\n"
				+ "from PERSONNEL p\r\n"
				+"where p.cod_soc=:x \r\n"
				+"and p.mat_pers=:y \r\n", nativeQuery = true)
	  public Optional<String>   getnom(@Param("x") String x,@Param("y")String y);

@Query(value = "select \r\n"

				+" p.pren_pers        \r\n"
				+ "from PERSONNEL p\r\n"
				+"where p.cod_soc=:x \r\n"
				+"and p.mat_pers=:y \r\n", nativeQuery = true)
	  public Optional<String>   getprenom(@Param("x") String x,@Param("y")String y);}







