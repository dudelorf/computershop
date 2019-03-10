package com.ericrkinzel.computershop.data;

import java.util.List;

import com.ericrkinzel.computershop.models.Part;

public interface PartRepository {

	List<Part> findAll();
	
	Part findById(String id);
}
