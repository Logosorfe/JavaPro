package com.telran.prof.lessonsbeforespring.lesson15;

public class ExampleStreamOperator {
        //Intermediate
        //filter - intermediate, use filter(use FI Predicate) , true -> go further , false - rejected
        //sorted - intermediate, sort stream
        //limit, skip - intermediate , limit count of elements in stream, skip - skip elements
        //distinct , intermediate, only unique elements in stream
        //peek - intermediate, analog foreach - make action for each element , but return stream
        //peek - use FI Consumer
        //map - intermediate , convert object
        //flatMap - intermediate, convert elements to plural streams


        //Terminal
        //foreach - terminal, make action for each element of stream (use FI Consumer)
        //count - terminal,  count of elements in stream
        //collect - terminal, collect element of stream to new collection
}
