package com.exclusively.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;

import com.exclusively.Application;
import com.exclusively.repositories.OrderRepository;

@EnableAutoConfiguration
@EnableDiscoveryClient
@Import(Application.class)
public class  OmsService{

    @Autowired
    OrderRepository accountRepository;

    public static void main(String[] args) {
        SpringApplication.run(OmsService.class, args);
    }
}