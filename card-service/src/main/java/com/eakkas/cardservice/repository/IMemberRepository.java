package com.eakkas.cardservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eakkas.cardservice.model.entity.MemberEntity;


@Repository
public interface IMemberRepository extends JpaRepository<MemberEntity, Long> {

}
