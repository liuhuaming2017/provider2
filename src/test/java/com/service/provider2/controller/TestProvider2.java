package com.service.provider2.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProvider2 {

        Provider2Delegate provider2Delegate = new Provider2Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = provider2Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}