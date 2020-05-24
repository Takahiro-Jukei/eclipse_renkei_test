package com.example.demo.Charactors;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CharactorsServiceImpl implements CharactorsService{

	private final CharactorsDao charaDao;

	@Autowired
	public CharactorsServiceImpl(CharactorsDao charaDao) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.charaDao = charaDao;
	}

	@Override
	public Charactors getOne(Long charaId) {
		// TODO 自動生成されたメソッド・スタブ
		return charaDao.getOne(charaId);
	}


	@Override
	public Long nameToId(String charaName) {
		// TODO 自動生成されたメソッド・スタブ
		return charaDao.nameToId(charaName);
	}

	@Override
	public List<Charactors> getAll() {
		// TODO 自動生成されたメソッド・スタブ
		return charaDao.getAll();
	}



}
