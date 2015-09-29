package com.exclusively.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exclusively.Application;
import com.exclusively.repositories.OrderRepository;

/**
 * Service for Order data implemented using Spring Data JPA.
 * 
 * @author Anshul Chauhan
 */
public class  OmsService{

    @Autowired
    OrderRepository accountRepository;


}