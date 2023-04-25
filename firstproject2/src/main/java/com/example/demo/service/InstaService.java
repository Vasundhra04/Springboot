package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.InstaRepository;
import com.example.demo.model.Insta;

@Service
public class InstaService {
	
	@Autowired
	InstaRepository tutRepo;
	
	public List<Insta>getAllTutors()
	{
		List<Insta>tutList=(List<Insta>) tutRepo.findAll();
		return tutList;
	}
	public Insta saveTutors(Insta u)
	{
		return tutRepo.save(u);
	}
	public Insta updateTutors(Insta u)
	{
		return tutRepo.save(u);
	}
	public void deleteTutors(int phno)
	{
		tutRepo.deleteById(phno);
}
	public Insta getTutors(int phno)
	{
		return tutRepo.findById(phno).get();
	}
}