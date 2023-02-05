package net.hemant.springboot.services;

import java.util.List;

import net.hemant.springboot.entities.Jobs;

public interface JobService {

	public List<Jobs> getJobs();

	public Jobs findJob(Long jobId);
	public Jobs addJobs(Jobs job);

	public Jobs updateJobs(Jobs job);
	public Jobs deleteJobs(Long jobId);
}
