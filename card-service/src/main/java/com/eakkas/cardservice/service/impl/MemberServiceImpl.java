package com.eakkas.cardservice.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eakkas.cardservice.model.entity.MemberEntity;
import com.eakkas.cardservice.repository.IMemberRepository;
import com.eakkas.cardservice.service.IMemberService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class MemberServiceImpl implements IMemberService {
	
	/*
	@Autowired
	private IMemberRepository memberRepository;
    */
	
	private final IMemberRepository memberRepository;
	
	

	@Override
	public MemberEntity addMember(MemberEntity member) {
		return null;
	}

	@Override
	public MemberEntity getMember(Long id) {
		return null;
	}

	@Override
	public MemberEntity updateMember(MemberEntity member) {
		return null;
	}

	@Override
	public MemberEntity deleteMember(Long id) {
		return null;
	}

	@Override
	public List<MemberEntity> getAll() {
		return null;
	}

}
