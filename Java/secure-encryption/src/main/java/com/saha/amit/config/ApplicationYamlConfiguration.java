package com.saha.amit.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties("key")
public class ApplicationYamlConfiguration {
	
	private String privateKeyPath;
	private String publicKeyPath;
	
	public String getPrivateKeyPath() {
		return privateKeyPath;
	}
	public void setPrivateKeyPath(String privateKeyPath) {
		this.privateKeyPath = privateKeyPath;
	}
	public String getPublicKeyPath() {
		return publicKeyPath;
	}
	public void setPublicKeyPath(String publicKeyPath) {
		this.publicKeyPath = publicKeyPath;
	}
}
