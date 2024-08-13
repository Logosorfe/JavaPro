package com.telran.prof.lesson11;

import com.telran.prof.lessonsbeforespring.lesson11.TestStackTask;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestStackTaskTest {

    @Test
    void testDeleteDuplicateFromString() {
        TestStackTask task = new TestStackTask();
        String test = "addabchffh";
        String result = task.deleteDuplicate(test);
        assertEquals("bc", result);
    }
}