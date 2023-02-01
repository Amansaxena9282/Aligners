package com.practice.Aligners.services;
import com.practice.Aligners.model.System;

import java.util.List;
public interface TestService {
    public List<System> getAll();
    public String delete( int id);
    public System getSystem (System system);

    public System update(System system);

//    public System update(System system);
}
