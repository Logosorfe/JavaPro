package com.telran.prof.springlessons.lesson31_32_33;

import com.telran.prof.springlessons.lesson31_32_33.configuration.ExampleAppConfig;
import com.telran.prof.springlessons.lesson31_32_33.controller.ExampleController;
import com.telran.prof.springlessons.lesson31_32_33.repository.SimpleWordRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//Аннотация для поиска кандидатов в бины

public class ExampleApp {

    public static void main(String[] args) {
        //For use XML config
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //For use with annotation config
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ExampleAppConfig.class);

        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        System.out.println("Bean in project : ");
        for (String beanName : beanDefinitionNames) {
            System.out.println(beanName);
        }

        System.out.println();

        //Example get bean by name
        SimpleWordRepository wordRepositoryOne = (SimpleWordRepository) context.getBean("simpleWordRepository");
        System.out.println("uuid for swr = " + wordRepositoryOne.getUuid());
        //Example get bean by class
        SimpleWordRepository wordRepositoryTwo = context.getBean(SimpleWordRepository.class);
        System.out.println("uuid for swr = " + wordRepositoryTwo.getUuid());
        //Example get bean by class
        SimpleWordRepository wordRepositoryThree = context.getBean(SimpleWordRepository.class);
        System.out.println("uuid for swr = " + wordRepositoryThree.getUuid());

        //SimpleWordRepository simpleWordRepository = new SimpleWordRepository();
        //ExampleServiceImpl exampleService = new ExampleServiceImpl(simpleWordRepository);
        //ExampleServiceImplV2 exampleServiceImplV2 = new ExampleServiceImplV2() ;
        //ExampleServiceImplV3 exampleServiceImplV3 = new ExampleServiceImplV3() ;

        // ExampleServiceImpl exampleService = context.getBean(ExampleServiceImpl.class);
        // ExampleController exampleController = new ExampleController(exampleService);

        //Vot tut dla raboty!!!!!
        ExampleController exampleController = context.getBean(ExampleController.class);
        String example = exampleController.example();
        System.out.println(example);

        //USER - CONTROLLER -> SERVICE - >(DB) -> SERVICE -> CONTROLLER -> USER
        context.close();

        //@Component - base
        //@Controller
        //@Service
        //@Repository
        //@RestController

        //IoC(Inversion of Control) - IoC Container
        //DI (Dependency Injection) - внедрение зависимостей

        //@Autowired- указываем где нужно внедрять зависимости
        //@Qualifier - уточняет имя бина который нужно внедрить

        //XML - configuration (когда бины определяются внутри файла)
        //XML - configuration with Java Annotations
        //Java - configuration (@Configuration)
    }
}
