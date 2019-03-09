package com.ericrkinzel.computershop.data;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.ericrkinzel.computershop.models.Part;

@Component
public class PartByIdConverter implements Converter<String, Part>{

	private PartRepository partRepository;
	
	public PartByIdConverter(
			PartRepository partRepository) {
		this.partRepository = partRepository;
	}
	@Override
	public Part convert(String id) {
		return partRepository.findById(id);
	}

}
