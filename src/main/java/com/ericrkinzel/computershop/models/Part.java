package com.ericrkinzel.computershop.models;

import lombok.Data;

@Data
public class Part {

    private String id = "";

    private String name = "";

    private String type = "";

    public static enum Type {
        STORAGE, RAM, PROCESSOR
    }
}