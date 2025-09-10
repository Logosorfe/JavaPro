package com.telran.prof.lessonsbeforespring.lesson29;

import java.util.concurrent.*;

public class CallableApp {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newSingleThreadExecutor();

        CallableExample callableExample = new CallableExample();
        //submit - Callable, Runnable
        Future<String> submit = es.submit(callableExample);

        System.out.println("Try to get result : ");
        try {
            System.out.println(submit.get(5, TimeUnit.SECONDS));
        } catch (TimeoutException e) {
            System.out.println("No result");
        }
        System.out.println("End get result. ");
        es.shutdown();
    }
}

