package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.domain.SocialMetaTag;
import com.demo.service.SocialMetaTagService;

@SpringBootApplication
public class DemoAjaxApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DemoAjaxApplication.class, args);
	}

	@Autowired
	SocialMetaTagService service;
	
	@Override
	public void run(String... args) throws Exception {
		SocialMetaTag og = service.getOpenGraphByUrl("https://www.pichau.com.br/placa-de-video-galax-geforce-gtx-1060-6gb-exoc-60nrh7dvm6ec");
		System.out.println(og.toString());
	}

}

