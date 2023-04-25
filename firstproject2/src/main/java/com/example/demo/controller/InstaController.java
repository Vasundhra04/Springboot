package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Insta;
import com.example.demo.service.InstaService;
@RestController
public class InstaController {

	@Autowired
	InstaService tutService;
	
	@GetMapping(value="/getTutor")
	public List<Insta>getAllTutors()
	{
		List<Insta>tutList=tutService.getAllTutors();
		return tutList;
	}
	@PostMapping(value="/saveTutor")
	public Insta saveTutors(@RequestBody Insta u)
	{
		return tutService.saveTutors(u);
	}
	@PutMapping(value="/updateTutor")
	public Insta updateTutors(@RequestBody Insta u)
	{
		return tutService.saveTutors(u);
	}
	@DeleteMapping(value="deleteTutor/{phno}")
public void deleteTutors(@PathVariable("phno")int phno)
	
	{
	    tutService.deleteTutors(phno);
	}
	@GetMapping(value="/getTutor/{phno}")
	public Insta getTutors(@PathVariable("phno") int phno)
	{
		return tutService.getTutors(phno);
	}
}
