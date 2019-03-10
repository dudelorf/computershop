package com.ericrkinzel.computershop.models;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class Computer {

    private Integer id;

    @Size(min=5, message="a name is required")
    private String name = "";

    @Size(min=1, message="a part is required")
    private List<Part> parts = new ArrayList<>();
}