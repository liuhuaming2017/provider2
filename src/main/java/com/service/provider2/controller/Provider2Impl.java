package com.service.provider2.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-11-30T08:57:06.010Z")

@RestSchema(schemaId = "provider2")
@RequestMapping(path = "/provider2", produces = MediaType.APPLICATION_JSON)
public class Provider2Impl {

    @Autowired
    private Provider2Delegate userProvider2Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProvider2Delegate.helloworld(name);
    }

}
