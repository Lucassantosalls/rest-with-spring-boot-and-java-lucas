package br.com.lucas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.lucas.service.MathService;

@RestController
public class MathController {
	
	@Autowired
	MathService mathService;

	@GetMapping(value =  "/sum/{n1}/{n2}")
	public Double sun (@PathVariable(value = "n1") String n1, @PathVariable(value = "n2") String n2 ) throws Exception {
		
		return mathService.sun(n1, n2);
	}
	
	
	@GetMapping(value =  "/sub/{n1}/{n2}")
	public Double sub (@PathVariable(value = "n1") String n1, @PathVariable(value = "n2") String n2 ) throws Exception {
		
		return mathService.sub(n1, n2);

	}
	
	@GetMapping(value =  "/divi/{n1}/{n2}")
	public Double divi (@PathVariable(value = "n1") String n1, @PathVariable(value = "n2") String n2 ) throws Exception {
		
		return mathService.divi(n1, n2);

	}
	
	@GetMapping(value =  "/mult/{n1}/{n2}")
	public Double mult (@PathVariable(value = "n1") String n1, @PathVariable(value = "n2") String n2 ) throws Exception {
		
		return mathService.mult(n1, n2);

	}
	
	@GetMapping(value =  "/mean/{n1}/{n2}")
	public Double mean (@PathVariable(value = "n1") String n1, @PathVariable(value = "n2") String n2 ) throws Exception {
		
		return mathService.mean(n1, n2);

	}
	
	@GetMapping(value =  "/sqr/{n1}")
	public Double sqr (@PathVariable(value = "n1") String n1) throws Exception {
		
		return mathService.sqr(n1);

	}
	
}
