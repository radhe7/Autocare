package com.Technosignia.Autocare.Service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Technosignia.Autocare.dao.JobCardRepository;
import com.Technosignia.Autocare.entity.Customer;
import com.Technosignia.Autocare.entity.JobCard;

@Service
public class JobCardService {
	
	@Autowired
	JobCardRepository jobcardRepository;
	public JobCard createJobCard(JobCard job) {
		
		return jobcardRepository.save(job);
	}
	public Optional<JobCard> findJobCardById(Long id){
		return jobcardRepository.findById(id);
	}
	
	public JobCard updateCustomer(JobCard jobcard,Long id) {
		
		
		Optional<JobCard>opjobcard=jobcardRepository.findById(id);
		JobCard jobcard1=opjobcard.get();
		
		
		jobcard1.setContact(jobcard.getContact());
		
		return jobcardRepository.save(jobcard1);


	}
		public void deleteJobcard(Long id) {
			jobcardRepository.deleteById(id);
		}
		
	}

		
		




