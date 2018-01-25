package com.consumeJob.restTemplate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.consumeJob.model.Job;

@RestController
@RequestMapping(value="/jobs")
public class JobsController {

	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping(value="",method=RequestMethod.GET)
	Job[] getOneJobTest()
	{
	System.out.println("I am here ");
		Job[] jobs= restTemplate.getForObject("https://jobkeeper.herokuapp.com/jobs", Job[].class);
		return jobs;
	}
}
