package com.sc.sample.app.domain.repository;

import org.springframework.stereotype.Repository;

import com.sc.sample.app.domain.entity.Pfp;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PfpRepository extends JpaRepository<Pfp, Long>{

}
