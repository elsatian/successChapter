package com.course;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstExtentReport {

    @Test
        public void test1(){
        Assert.assertEquals(1,1);
    }

    @Test
    public void test2(){
        Assert.assertEquals(1,5);
    }

    @Test
    public void test3(){
        Assert.assertEquals("aaa","aaa");
    }
    @Test
    public void logDemo(){
        Reporter.log("这是自己的日志：");
        throw new RuntimeException("自己运行的异常");
    }

}
