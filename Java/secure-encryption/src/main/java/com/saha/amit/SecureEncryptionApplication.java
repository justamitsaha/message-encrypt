package com.saha.amit;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.util.FileCopyUtils;

import com.saha.amit.config.ApplicationYamlConfiguration;

 

@SpringBootApplication
public class SecureEncryptionApplication implements CommandLineRunner {
	
	@Autowired
	ResourceLoader resourceLoader;
	@Autowired
	ApplicationYamlConfiguration applicationYamlConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(SecureEncryptionApplication.class, args);
	}
	
	public void run(String... args) throws InvalidKeySpecException {
		
		Resource resource;
		InputStream inputStream;
		byte[] keyBytes;
		KeyFactory kf;
		try {
			resource = resourceLoader.getResource(applicationYamlConfiguration.getPrivateKeyPath());
			inputStream = resource.getInputStream();
			keyBytes = FileCopyUtils.copyToByteArray(inputStream);
			PKCS8EncodedKeySpec pvtSpec = new PKCS8EncodedKeySpec(keyBytes);
			kf = KeyFactory.getInstance("RSA");
			PrivateKey privateKey = kf.generatePrivate(pvtSpec);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		System.out.println("yoa");
	}

}
