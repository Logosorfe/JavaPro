package com.telran.prof.lessonfifteen;

public class ExampleStreamOperator {

    public static void main(String[] args) {
        //Intermediate
        //filter - intermediate, use filter(use FI Predicate) , true -> go further , false - rejected
        //sorted - intermediate, sort stream
        //limit, skip - intermediate , limit count of elements in stream, skip - skip elements
        //distinct , intermediate, only unique elements in stream
        //peek - intermediate, analog foreach - make action for each element , but return stream


        //Terminal
        //foreach - terminal, make action for each element of stream
        // count - terminal,  count of elements in stream
        //collect - terminal, collect element of stream to new collection

    }
}
