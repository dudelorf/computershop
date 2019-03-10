package com.ericrkinzel.computershop.data;

import java.util.List;


import org.springframework.stereotype.Repository;

import com.ericrkinzel.computershop.models.Computer;

@Repository
public interface ComputerRepository {

    public Computer findOne(Integer id);

    public List<Computer> findAll();

    public Integer save(Computer computer);
}