package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.IsciTakip;
import com.example.demo.service.IsciTakipService;


@RestController
@RequestMapping
public class IsciTakipController {

	@Autowired
	private IsciTakipService isciTakipService;

	@GetMapping("/isci")
	public List<IsciTakip> tuba3() {
		return isciTakipService.abc();
	}
	
	
	@PostMapping("/isciKayit")
	public IsciTakip createIsciTakip(@RequestBody IsciTakip isciTakip) {	
		
		return isciTakipService.createIsciTakip(isciTakip);
	}
	

}
