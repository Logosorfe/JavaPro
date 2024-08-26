package com.telran.prof.lessonsbeforespring.lesson23;

import com.telran.prof.lessonsbeforespring.lesson23.ArrayService;
import com.telran.prof.lessonsbeforespring.lesson23.IncorrectInputArrayException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayServiceTest {

    private ArrayService service = new ArrayService();

    @Test
    public void testMax() {
        int[] arr = {1, 2, 4, 6, 0};
        assertEquals(6, service.findMax(arr));
    }

    @Test
    public void testMin() {
        int[] arr = {1, 2, 4, 6, 0};
        assertEquals(0, service.findMin(arr));
    }

    @Test
    public void testMinWhenArrayIsEmpty() {
        assertThrows(IncorrectInputArrayException.class,
                () -> service.findMin(new int[0]));
    }

    @Test
    public void testMaxWhenArrayIsEmpty() {
        assertThrows(IncorrectInputArrayException.class,
                () -> service.findMax(new int[0]));
    }

    @Test
    public void testMaxWhenArrayIsNull() {
        assertThrows(IncorrectInputArrayException.class,
                () -> service.findMax(null));
    }

    @Test
    public void testMinWhenArrayIsNull() {
        assertThrows(IncorrectInputArrayException.class,
                () -> service.findMin(null));
    }
}