package com.journaldev.spring.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.samples.petclinic.Factura.Factura;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/*
import com.journaldev.spring.model.User;*/

@Controller
public class FacturaController {

	/**
	 * Simply selects the home view  to render by returning its name.
	 */
	/*@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		System.out.println("Home Page Requested, locale = " + locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}*/

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String user(@Validated Factura factura, Model model) {
		System.out.println("User Page Requested");
		model.addAttribute("userName", factura.getIdFactura());
		return "user";
	}
}
