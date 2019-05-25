package com.salary.controller;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.salary.bean.DepartInfo;
import com.salary.service.impl.DepartInfoServiceImpl;
import com.salary.utils.Msg;

@Controller
@RequestMapping("/depart")
public class DepartInfoController {
	@Autowired
	private DepartInfoServiceImpl departInfoServiceImpl;
	
	@ResponseBody
	@RequestMapping("/test")
	public Msg Test(@RequestParam(name = "id")Integer id) {
		EntityWrapper<DepartInfo> ew = new EntityWrapper<>();
	
		ew.eq("depart_id", id);
		
		List<DepartInfo> list = departInfoServiceImpl.selectList(ew);
		System.out.println(list);
		return Msg.success().add("depart", list);
	}
}
