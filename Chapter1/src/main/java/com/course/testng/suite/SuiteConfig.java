package com.course.testng.suite;
// 套件配置类


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite运行了");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("after suite运行了");
    }

}
