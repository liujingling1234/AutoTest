package com.course.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicAnnotation {

    @Test
    public void testCase1(){
        System.out.println("Test 这是测试用例1");

    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod 在每个方法之前运行");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod 在每个方法之后运行");
    }
    @Test
    public void testCase2(){
        System.out.println("Test 这是测试用例2");

    }
}
