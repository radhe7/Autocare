package com.Technosignia.Autocare.Controller;

import java.util.Optional;

import org.hibernate.secure.spi.JaccService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Technosignia.Autocare.Service.JobCardService;
import com.Technosignia.Autocare.entity.JobCard;



	@RestController
	public class JobCardController { 
		
		@Autowired
		JobCardService jobcardservice;
		
		@PostMapping("/JobCard")
		public JobCard createJobCard(@RequestBody JobCard jobcard) {
			System.out.println("Inside Controller"); 
			return jobcardservice.createJobCard(jobcard);
		}
		
		@GetMapping("/JobCard/{Id}")
		public Optional<JobCard> findJobCardById(@PathVariable Long Id){
			
			return jobcardservice.findJobCardById(Id);
		}
		@PutMapping("/JobCard")
		public JobCard updateCustomer(@RequestBody JobCard customer,@RequestParam Long id) {
			return jobcardservice.updateJobCard(jobcardservice,id);
		}
		@DeleteMapping("/customer")
		public void deleteCustomer(Long id) {
			
		
		
	}
	}

