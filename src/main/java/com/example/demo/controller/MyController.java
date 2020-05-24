package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Charactors.Charactors;
import com.example.demo.Charactors.CharactorsService;
import com.example.demo.charaThread.CharaThread;
import com.example.demo.charaThread.CharaThreadService;

@Controller
public class MyController {

	private final CharactorsService charaService;
	private final CharaThreadService charaThreadService;

	@Autowired
	public MyController(CharactorsService charaService,CharaThreadService charaThreadService) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.charaService = charaService;
		this.charaThreadService = charaThreadService;

	}

	//サイトアクセス時
	@RequestMapping("/")
	public String drawIndex(Model model) {


		return "redirect:/index";
	}

	//サイトトップ
	@RequestMapping("/index")
	public String pageIndex(Charactors charas, Model model) {

		//Charactorsテーブルから全レコード取得する
		List<Charactors> charaList = charaService.getAll();
		model.addAttribute("charaList",charaList);
		return "/index";
	}

	//キャラページ
	@RequestMapping("/{charaName}")
	public String drawCharaPage(@PathVariable String charaName,Model model) {

		//各キャラのスレッド一覧を取得
		List<CharaThread> threadList = charaThreadService.getThreadAsc(charaService.nameToId(charaName));


		model.addAttribute("threadList",threadList);
		model.addAttribute("charaName",charaName);

		System.out.println("★★★");
		System.out.println(threadList.size());
		System.out.println("★★★");

		System.out.println("★★★");
		System.out.println(charaName);
		System.out.println("★★★");

		return "/charaPage";
	}
}
