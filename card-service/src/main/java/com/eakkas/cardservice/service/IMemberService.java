package com.eakkas.cardservice.service;

import java.util.List;

import com.eakkas.cardservice.model.entity.MemberEntity;

public interface IMemberService {

	MemberEntity addMember(MemberEntity member);

	MemberEntity getMember(Long id);

	MemberEntity updateMember(MemberEntity member);

	MemberEntity deleteMember(Long id);

	List<MemberEntity> getAll();
}
