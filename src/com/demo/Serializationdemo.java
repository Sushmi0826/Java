package com.demo;

import java.io.Serializable;


public class Serializationdemo implements Serializable {
    int id;
    String name;
    public Serializationdemo(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
