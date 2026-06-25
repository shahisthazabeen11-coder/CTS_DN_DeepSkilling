package com.sample.aaa;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class CalculatorTest{

    private Calculator calculator;

    // Setup Method
    @Before
    public void setUp(){
        calculator=new Calculator();
        System.out.println("Setup executed");
    }
    
    // Teardown Method
    @After
    public void tearDown(){
        calculator=null;
        System.out.println("Teardown executed");
    }

    @Test
    public void testAdd(){

        int a=10;
        int b=20;
        //Add function is called from Calculator class
        int result=calculator.add(a, b);
        // Assert function applies here
        assertEquals(30, result);
    }
}