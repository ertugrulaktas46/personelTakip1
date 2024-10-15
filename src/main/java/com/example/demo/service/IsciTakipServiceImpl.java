package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.IsciTakip;
import com.example.demo.repository.IsciTakipRepo;

@Service
public class IsciTakipServiceImpl implements IsciTakipService {
	@Autowired
	private IsciTakipRepo isciTakipRepo;

	public List<IsciTakip> abc() {
		return isciTakipRepo.findAll();
	}

	@Override
	public IsciTakip createIsciTakip(IsciTakip isciTakip) {
		return isciTakipRepo.save(isciTakip);
	}
}



