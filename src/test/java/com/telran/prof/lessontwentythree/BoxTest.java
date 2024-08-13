package com.telran.prof.lessontwentythree;

import com.telran.prof.lessonsbeforespring.lesson23.Box;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class BoxTest {

    private Box box;

    //@BeforeAll - J5, @BeforeClass - J4
    //@BeforeEach -J5, @Before - J4

    @BeforeAll
    public static void initBefore() {
        System.out.println("Before all");
    }

    @BeforeEach
    public void init() {
        System.out.println("Create box before test");
        box = new Box();
    }

    @Test
    public void testBoxInit() {
        assertEquals(0, box.getStringList().size());
    }

    @Test
    //@Disabled - J5,   // @Ignore - J4
    public void testAddStringToBoxList() {
        box.addStringToList("Hello");
        box.addStringToList("Java");
        assertEquals(2, box.getStringList().size());
    }

    @AfterAll   // @AfterClass - J4
    public static void downAfterAllTest() {
        System.out.println("After all class");
    }

    @AfterEach  // @After - J4
    public void downAfterEach() {
        System.out.println("After each test");
    }
}