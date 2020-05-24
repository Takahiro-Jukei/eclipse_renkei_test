package com.example.demo.charaThread;

//エンティティクラス
//フォームからの情報受け取りクラス
public class CharaThread {

	private int threadId;
	private int charaId;

	public CharaThread() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	//setter getter
	public int getCharaId() {
		return charaId;
	}
	public void setCharaId(int charaId) {
		this.charaId = charaId;
	}

	public int getThreadId() {
		return threadId;
	}
	public void setThreadId(int threadId) {
		this.threadId = threadId;
	}
}
