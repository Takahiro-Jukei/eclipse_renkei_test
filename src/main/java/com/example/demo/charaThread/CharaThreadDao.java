package com.example.demo.charaThread;

import java.util.List;

public interface CharaThreadDao {

	//指定キャラのスレッドを昇順で全て取得
	List<CharaThread> getThreadAsc(Long charaId);

	//指定キャラスレッドを作成　オーバーロード
	void createThread(Long charaId);
	void createThread(String charaName);


}
