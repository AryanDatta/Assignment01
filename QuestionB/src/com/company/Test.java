package com.company;

import static org.junit.jupiter.api.Assertions.*;

class Test {

    @org.junit.jupiter.api.Test
    void firstTest() {
        var t1=new Main();
        assertEquals(3,t1.first(new int[]{1, 2, 3, 2, 1},5));
    }
    @org.junit.jupiter.api.Test
    void secondTest() {
        var t2=new Main();
        assertEquals(8,t2.first(new int[]{1, 2, 3,5,3,5,8,2,1,1},10));
    }

    @org.junit.jupiter.api.Test
    void thirdTest() {
        var t3=new Main();
        assertEquals(14,t3.first(new int[]{13,13,13,15,14,18,19,19,18,15,15,19,20,20,21},15));
    }


}