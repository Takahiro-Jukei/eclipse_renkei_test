package com.example.demo.Charactors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CharactorsDaoImpl implements CharactorsDao{

	private final JdbcTemplate jdbcTemp;

	@Autowired
	public CharactorsDaoImpl(JdbcTemplate jdbcTemp) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.jdbcTemp = jdbcTemp;
	}

	@Override
	public Charactors getOne(Long charaId) {
		// TODO 自動生成されたメソッド・スタブ

		//SQL文でレコード取得
		String sql = "select * from charactors where charaId = ?";
		List<Map<String,Object>> dbRecords = jdbcTemp.queryForList(sql,charaId);
		Charactors entChara = new Charactors();

		//各データはObject型なので適宜キャスト
		entChara.setCharaId((int)dbRecords.get(0).get("charaId"));
		entChara.setCharaName((String)dbRecords.get(0).get("charaName"));

		return entChara;
	}

	@Override
	public Long nameToId(String charaName){
		//SQL文でレコード取得
		String sql = "select charaId from charactors where charaName = ?";
		Integer id = (Integer)jdbcTemp.queryForList(sql,charaName).get(0).get("charaId");
		Long longId = id.longValue();

		return longId;
	}

	public Charactors getOne(String charaName) {
		// TODO 自動生成されたメソッド・スタブ

		//SQL文でレコード取得
		String sql = "select charaId from charactors where charaName = ?";
		Long charaId = (Long)jdbcTemp.queryForList(sql,charaName).get(0).get("charaId");

		Charactors entChara = getOne(charaId);

		return entChara;
		}

	@Override
	public List<Charactors> getAll() {
		//SQL文から全レコード取得
		String sql = "select * from charactors";
		List<Map<String,Object>> dbRecords = jdbcTemp.queryForList(sql);

		List<Charactors> charaList = new ArrayList<>(); //戻り値用
		//とってきたMapリストの各要素ずつ処理
		for(Map<String, Object> record: dbRecords) {
			Charactors charaTmp = new Charactors(); //新規オブジェクト作成
			charaTmp.setCharaId((int)record.get("charaid")); //代入時はそれぞれにキャスト
			charaTmp.setCharaName((String)record.get("charaName"));
			charaList.add(charaTmp);//リストに追加
		}

		return charaList;
	}

}
