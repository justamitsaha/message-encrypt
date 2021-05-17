package com.saha.amit.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.saha.amit.dto.InputMessageDTO;

@RestController
public class EncryptionController {
	
	@PostMapping("/encrpts")
	public String encryptMessage(@RequestBody InputMessageDTO inputMessageDto) {
		return "baccha";
	}
	
}
