package com.testjvm.controller;

import com.testjvm.domain.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class HeapController {

    List<Person> list=new ArrayList<Person>();

    /**
     *  -Xmx32M -Xms32M
     * @return
     */
    @GetMapping("/heap")
    public String heap(){
        int i = 0;
        while(true){
            list.add(new Person(i++, UUID.randomUUID().toString()));
        }
    }
}
