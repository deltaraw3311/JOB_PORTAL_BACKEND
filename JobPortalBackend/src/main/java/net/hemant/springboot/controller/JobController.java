package net.hemant.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.hemant.springboot.entities.Jobs;
import net.hemant.springboot.services.JobService;

@RestController
public class JobController {

	//	GET THE JOBS AVAILABLE;
	@Autowired
	private JobService jobservice;
	
	@GetMapping("/jobs")
	public List<Jobs> getJobs()
	{
		return this.jobservice.getJobs();
	}
	@GetMapping("/jobs/{jobId}")
	public Jobs getJobById(@PathVariable Long jobId)
	{
		return this.jobservice.findJob((jobId));
	}
	
	@PostMapping("/jobs")
	public Jobs addJobs(@RequestBody Jobs job)
	{
		return this.jobservice.addJobs(job);
	}
	@PutMapping("/jobs")
	public Jobs updateJobs(@RequestBody Jobs job)
	{
		return this.jobservice.updateJobs(job);
	}
	@DeleteMapping("/jobs/{jobId}")
	public Jobs deleteJobs(@PathVariable Long jobId)
	{
		return this.jobservice.deleteJobs(jobId);
	}
}
