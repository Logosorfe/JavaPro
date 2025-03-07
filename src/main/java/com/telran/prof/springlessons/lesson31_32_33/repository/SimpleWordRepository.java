package com.telran.prof.springlessons.lesson31_32_33.repository;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class SimpleWordRepository implements WordRepository {

    private String uniqueUuid = UUID.randomUUID().toString();

    @PostConstruct
    private void init(){
        System.out.println("Bean simple word repository created");
    }

    @Override
    public String getWord() {
        return "Hello from repo";
    }

    @Override
    public String getUuid() {
        return uniqueUuid;
    }

    @PreDestroy
    private void destroy(){
        System.out.println("Bean simple word repository removed");
    }
}
