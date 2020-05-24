package com.example.demo.charaThread;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CharaThreadServiceImpl implements CharaThreadService{

	private final CharaThreadDao dao;

	@Autowired
	public CharaThreadServiceImpl(CharaThreadDao dao) {
		this.dao = dao;
	}

	@Override
	public List<CharaThread> getThreadAsc(Long charaId) {
		// TODO 自動生成されたメソッド・スタブ
		return dao.getThreadAsc(charaId);
	}

	@Override
	public void createThread(Long charaId) {

		dao.createThread(charaId);
	}

	@Override
	public void createThread(String charaName) {
		// TODO 自動生成されたメソッド・スタブ
		dao.createThread(charaName);
	}

}
