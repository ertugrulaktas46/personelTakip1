package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class IsciTakip {
	@Id
	Long id;
	String isciler;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIsciler() {
		return isciler;
	}

	public void setIsciler(String isciler) {
		this.isciler = isciler;
	}
}
