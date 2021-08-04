package com.crud.pagination.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.crud.pagination.dao.Bookdaoimple;
import com.crud.pagination.model.Books;
import com.crud.pagination.service.Bookservice;

import net.bytebuddy.matcher.ModifierMatcher.Mode;

@Controller
public class Maincontroller {
	@Autowired
	private Bookservice bookservice;

	@RequestMapping("/home1")
	public String home(Model model, HttpSession session) {
		System.out.println("home handler is running");

		// List<Books> bookobj = this.bookservice.showall();
		session.setAttribute("pageno", 1);

		List<Books> limitbokk = this.bookservice.getbooklimit(1);
		model.addAttribute("bookobj", limitbokk);
		return "home";
	}

	// using pagination show next page controllere
	@RequestMapping("/getnextbook")
	public String getnextbook(HttpSession session, Model model) {

		System.out.println("this is page no 2 handler runing");

		Integer pageno = (Integer) session.getAttribute("pageno");
		pageno = pageno + 1;

		session.setAttribute("pageno", pageno);
		List<Books> limitbook = this.bookservice.getbooklimit(pageno);
		if (limitbook.size() == 0) {
			System.out.println("this is book is empty");
			session.setAttribute("pageno", 1);
			List<Books> booklimit = this.bookservice.getbooklimit(1);
			model.addAttribute("bookobj", booklimit);
			return "home";
		}

		model.addAttribute("bookobj", limitbook);

		return "home";
	}

	// getprivious page handler
	@RequestMapping("/getpreviousbook")
	public String getpreviousbook(HttpSession session, Model model) {

		System.out.println("this is Previous handler ");

		Integer pageno = (Integer) session.getAttribute("pageno");
		 pageno = pageno-1;
		 if(pageno<=0)
		 {
			pageno=1; 
			
		 }

		session.setAttribute("pageno", pageno);
		List<Books> limitbook = this.bookservice.getbooklimit(pageno);
		if (limitbook.size() == 0) {
			System.out.println("this is book is empty");
			session.setAttribute("pageno", 1);
			List<Books> booklimit = this.bookservice.getbooklimit(1);
			model.addAttribute("bookobj", booklimit);
			return "home";
		}

		model.addAttribute("bookobj", limitbook);

		return "home";

	}

	@RequestMapping("/bookform")
	public String bookform() {

		System.out.println("books form handdler is running");
		return "bookform";

	}

	@RequestMapping(value = "/formhandler", method = RequestMethod.POST)
	public RedirectView formhandler(@ModelAttribute Books obj, Model model, HttpServletRequest r) {

		System.out.println("form handler is running ");

		this.bookservice.insert(obj);

		RedirectView rv = new RedirectView();
		rv.setUrl(r.getContextPath() + "/home1");
		return rv;

	}

	@RequestMapping("/deletehandler/{id}")
	public RedirectView deletehandler1(@PathVariable("id") int id, HttpServletRequest req)

	{
		System.out.println("this is delete handler running");
		this.bookservice.delete(id);
		RedirectView rv = new RedirectView();
		rv.setUrl(req.getContextPath() + "/home1");
		return rv;

	}

	@RequestMapping("/updatehanler/{id}")
	public String edit(@PathVariable("id") int id, Model model) {
		Books book = this.bookservice.showbyid(id);
		model.addAttribute("book", book);

		return "editform";
	}

}
