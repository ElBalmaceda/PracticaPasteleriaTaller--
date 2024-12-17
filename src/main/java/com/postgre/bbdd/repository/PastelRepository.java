package com.postgre.bbdd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.postgre.bbdd.entity.Pastel;


@Repository
public interface PastelRepository extends JpaRepository<Pastel, Long>
{

}
