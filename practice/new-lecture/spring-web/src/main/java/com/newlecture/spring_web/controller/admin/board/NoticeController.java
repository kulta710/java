package com.newlecture.spring_web.controller.admin.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("adminNoticeController")
@RequestMapping("/admin/board/notice/")
public class NoticeController {

    @RequestMapping("list")
    public String list () {

        return "admin/board/notice/list";
    }

    @RequestMapping("detail")
    public String detail () {
        
        return "admin/board/notice/detail";
    }

    @RequestMapping("edit")
    public String edit () {
        
        return "admin/board/notice/edit";
    }

    @RequestMapping("reg")
    public String reg () {
        
        return "admin/board/notice/reg";
    }

    @RequestMapping("del")
    public String del () {
        
        return "admin/board/notice/del";
    }
}