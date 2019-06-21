package ksmart31.team01.account.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart31.team01.account.mapper.MemberAccountMapper;
import ksmart31.team01.member.domain.MemberAccount;



@Service
@Transactional
public class MemberAccountService {
	@Autowired
	private MemberAccountMapper memberAccountMapper;
	//MemberAccount 리스트
	public List<MemberAccount> getMemberAccountList(){
		List<MemberAccount> list = memberAccountMapper.selectMemberAccountList();
		System.out.println(list + "MemberAccountService getMemberAccountList list");
		return list;
	}	
}
