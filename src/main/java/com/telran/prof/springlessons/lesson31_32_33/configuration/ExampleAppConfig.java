package com.telran.prof.springlessons.lesson31_32_33.configuration;

import com.telran.prof.springlessons.lesson31_32_33.controller.ExampleController;
import com.telran.prof.springlessons.lesson31_32_33.repository.SimpleWordRepository;
import com.telran.prof.springlessons.lesson31_32_33.repository.WordRepository;
import com.telran.prof.springlessons.lesson31_32_33.service.ExampleServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.telran.prof.springlessons.lesson31_32_33")
public class ExampleAppConfig {

    @Bean
    public ExampleController exampleController() {
        return new ExampleController();
    }

    @Bean
    public SimpleWordRepository simpleWordRepository() {
        return new SimpleWordRepository();
    }

    @Bean
    public ExampleServiceImpl exampleService(WordRepository wordRepository) {
        return new ExampleServiceImpl(wordRepository);
    }
}
