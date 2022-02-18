package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void Test1() {
        var t1=new Main();
        assertEquals("[[2, 1, 1, 1]]",t1.CouFre("aryan"));
    }
    @Test
    void Test2() {
        var t2=new Main();
        assertEquals("[[2, 1, 1, 1, 1]]" ,t2.CouFre("plasma"));
    }
    @Test
    void Test3() {
        var t3=new Main();
        assertEquals("[[1, 1, 1, 1, 3, 2, 1, 1]]" ,t3.CouFre("hello world"));
    }
    @Test
    void Test4() {
        var t4 = new Main();
        assertEquals("[[3, 4, 5, 3, 1, 4, 4]]", t4.CouFre("aaabbbbcccccdddeffffrrrr"));

    }
}