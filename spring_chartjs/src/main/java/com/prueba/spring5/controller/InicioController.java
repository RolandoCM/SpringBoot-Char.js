package com.prueba.spring5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.prueba.spring5.beans.Computador;

@Controller
public class InicioController {
	
	@GetMapping("/index")
	public String getInicio(@RequestParam (name="name", required=false, defaultValue="World Rolando") String name, Model model) {
		model.addAttribute("name", name);
		Computador compu = new Computador("msi", "50", "300");
		model.addAttribute("computador", compu);
		return "index";
	}

}