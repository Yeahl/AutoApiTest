package com.course.testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethodsDemo {

    @Test
    public void test1(){
        Assert.assertEquals(1,2);
        System.out.println("第一条测试用例");
    }

    @Test
    public void test2(){
        Assert.assertEquals(1,1);
    }

    public void test3(){
        Assert.assertEquals("aaa","aaa");
    }

    @Test
    public void logDemo(){
        Reporter.log("这个是自己写的日志");
        throw new RuntimeException("这是我自己的运行异常");
    }
}
