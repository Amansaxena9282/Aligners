package com.practice.Aligners.servicesimpl;

import com.practice.Aligners.model.System;
import com.practice.Aligners.services.TestService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;
@Service
public class TestServiceImpl implements TestService {

    @Override
    public List<System>getAll() {
        List<System> allSystem=new ArrayList<>();
        System system1=new System("aman",23,1);
        System system2=new System("aarav",25,2);
        System system3=new System("divya",22,3);
        allSystem.add(system1);
        allSystem.add(system2);
        allSystem.add(system3);
        return allSystem;


    }

    @Override
    public String delete(int id) {
        return "Your Id:"+id+" Deleted Sucessfull";
    }

//    @Override
//    public System getSystem(System system) {
//        return getSystem(System);
//    }

    @Override
    public System getSystem(System system) {
        return system;
    }

    @Override
    public System update(System system) {
        return system;
    }

//    @Override
//    public System getSystem(System system) {
//        return null;
//    }
//
//    @Override
//    public System update(System system) {
//        return null;
//    }
}
