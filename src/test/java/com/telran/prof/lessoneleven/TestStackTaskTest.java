package com.telran.prof.lessoneleven;

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