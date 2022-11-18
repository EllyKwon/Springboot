package com.newlecture.web.controller.admin.board;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//admin/board/notice/list,detail,reg

@Controller("adminNoticeController")
@RequestMapping("admin/board/notice/")
public class NoticeController {
	@RequestMapping("list")
	public String list(Model model) {
		
		model.addAttribute("", "");
		
		return "admin.board.notice.list";
	}
	@RequestMapping("detail")
	public String detail(Model model) {
		
		model.addAttribute("", "");
		
		return "admin.board.notice.detail";
	}
	@RequestMapping("reg")
	public String reg(Model model) {
		
		model.addAttribute("", "");
		
		return "admin.board.notice.reg";
	}
}
