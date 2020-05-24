package com.example.demo.entity;

import java.util.Date;

public class Chats {
	private int chatId;
	private int charaId;
	private String name;
	private String content;
	private Date postTime;

	public int getChatId() {
		return chatId;
	}
	public void setChatId(int chatId) {
		this.chatId = chatId;
	}
	public int getCharaId() {
		return charaId;
	}
	public void setCharaId(int charaId) {
		this.charaId = charaId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getPostTime() {
		return postTime;
	}
	public void setPostTime(Date postTime) {
		this.postTime = postTime;
	}
}
