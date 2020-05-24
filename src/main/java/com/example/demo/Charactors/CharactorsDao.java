package com.example.demo.Charactors;

import java.util.List;

public interface CharactorsDao {

	//指定レコードの取得
	Charactors getOne(Long charaId);

	//名前からidの逆引き
	Long nameToId(String charaName);

	//全レコードの取得
	List<Charactors> getAll();
}
