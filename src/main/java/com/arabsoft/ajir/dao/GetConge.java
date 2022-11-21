package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.CleDemCng;
import com.arabsoft.ajir.entities.SoldConge;
import com.arabsoft.ajir.entities.SoldCongePK;

public interface GetConge extends JpaRepository<SoldConge, SoldCongePK>{

	@Query("select c from SoldConge c where c.id.cod_soc=:x and c.id.mat_pers=:y ")
	public List<SoldConge> getcongebyid(@Param("x")String codSoc,@Param("y")String mat);
}
