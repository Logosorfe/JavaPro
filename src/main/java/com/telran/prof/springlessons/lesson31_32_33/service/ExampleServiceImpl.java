package com.telran.prof.springlessons.lesson31_32_33.service;

import com.telran.prof.springlessons.lesson31_32_33.repository.WordRepository;
import org.springframework.stereotype.Service;

@Service("beanOne")
public class ExampleServiceImpl implements ExampleService {

    private WordRepository repository;

//    //@Autowired // Spring 4.3 -> no need
    public ExampleServiceImpl(WordRepository repository) {
        this.repository = repository;
    }

//    @Autowired // 3. Setters injection
//    public void setRepository(WordRepository repository) {
//        this.repository = repository;
//    }

    @Override
    public String getResult() {
        return repository.getWord();
    }
}
