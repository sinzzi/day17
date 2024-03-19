package com.ezen.batis;

import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




@Controller
public class HomeController {
	@Autowired  //������ ����ɶ����� ����̹� ����ȯ���� �ڵ����� ���������
	SqlSession sqlsSession;
	
	@RequestMapping(value = "/")
	public String home() {
		
		return "main";
	}
	@RequestMapping(value = "/main")
	public String home11() {
		
		return "main";
	}
	
	@RequestMapping(value = "/in")
	public String home1() {
		return "input";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String home2(HttpServletRequest request) {
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String address = request.getParameter("address");
		Service ss = sqlsSession.getMapper(Service.class); //��� �޼ҵ尡 ����ɶ����� ��ģ���� �����
		ss.insert_a(name,age,address); //Service�ȿ� �޼ҵ� ����� idao�� ������
		return "redirect:/"; //����Ϸ� ���� �������� ����(�ٽ� ���� �ö�)
	}
	
	@RequestMapping(value = "/out")
	public String home3(Model mo) {
		Service ss = sqlsSession.getMapper(Service.class);
		ArrayList<Myinfo_DTO> list = ss.print();
		mo.addAttribute("list", list);
		return "outa";
	}
	
	@RequestMapping(value = "/delete")
	public String home4(HttpServletRequest request) throws UnsupportedEncodingException {
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		Service ss = sqlsSession.getMapper(Service.class);
		ss.deletea(name);
		return "redirect:/";
	}
	
	@RequestMapping(value = "/outh")
	public String home12(Model mo) {
		Service ss = sqlsSession.getMapper(Service.class);
		ArrayList<MyinfoDTO> list = ss.select_db();
		System.out.println();
		mo.addAttribute("list", list);
		return "outb";
	}
}

