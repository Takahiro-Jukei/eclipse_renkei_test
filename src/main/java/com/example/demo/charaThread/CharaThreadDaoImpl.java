package com.example.demo.charaThread;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CharaThreadDaoImpl implements CharaThreadDao {

	private final JdbcTemplate jdbcTemp;

	@Autowired
	public CharaThreadDaoImpl(JdbcTemplate jdbcTemp) {
		this.jdbcTemp = jdbcTemp;
	}

	@Override
	public List<CharaThread> getThreadAsc(Long charaId) {

		String sql = "select * from charaThread where charaId = ?";
		List<Map<String , Object>> dbRecords = jdbcTemp.queryForList(sql,charaId);

		List<CharaThread> threadList = new ArrayList<CharaThread>();
		for(Map<String,Object> record : dbRecords) {
			CharaThread entThread = new CharaThread();
			entThread.setCharaId((int)record.get("CharaId"));
			entThread.setThreadId((int)record.get("threadId"));
			threadList.add(entThread);
		}

		return threadList;
	}

	@Override
	public void createThread(Long charaId) {
		// TODO 自動生成されたメソッド・スタブ

		String sql = "insert into charaThread(charaId) values(?)";
		jdbcTemp.update(sql);
	}

	@Override
	public void createThread(String charaName) {
		// TODO 自動生成されたメソッド・スタブ

		String sql = "select charaId from charactors where charaName=?";
		Map<String,Object> record = jdbcTemp.queryForList(sql,charaName).get(0); //返ってくるレコードは必ず1つ

		createThread((Long)(record.get("charaId")));
	}


}
