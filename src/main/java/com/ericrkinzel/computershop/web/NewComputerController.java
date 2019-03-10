package com.ericrkinzel.computershop.web;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ericrkinzel.computershop.data.PartRepository;
import com.ericrkinzel.computershop.models.Computer;
import com.ericrkinzel.computershop.models.Part;

@Controller
@RequestMapping("/computers/new")
public class NewComputerController{

	private PartRepository partRepository;
		
	public NewComputerController(
		PartRepository partRepository
	) {
		this.partRepository = partRepository;
	}

	@ModelAttribute(name="computer")
	public Computer computer() {
		return new Computer();
	}
	
	@ModelAttribute(name="parts")
	public List<Part> parts() {
		return partRepository.findAll();
	}
	
    @GetMapping()
    public String computerForm() {
        return "computer-form";
    }
    
    @PostMapping()
    public String processComputerForm(
    		@Valid Computer computer, 
    		Errors err) {
    	
    	if(err.hasErrors()) {
    		return "computer-form";
    	}
    	
    	return "redirect:/computers";
    }
}