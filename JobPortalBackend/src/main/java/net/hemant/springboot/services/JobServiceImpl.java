package net.hemant.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.hemant.springboot.Dao.JobDao;
import net.hemant.springboot.entities.Jobs;

@Service
public class JobServiceImpl implements JobService{

	@Autowired
	private JobDao jobsDao;
	
	public  JobServiceImpl()
	{ 
		
	}
	@Override
	public List<Jobs> getJobs() {
		return jobsDao.findAll();
	}
	public Jobs findJob(Long jobId) {
		
		return jobsDao.findById(jobId).get();
	}
	@Override
	public Jobs addJobs(Jobs job) {
		jobsDao.save(job);
		return job;
	}
	@Override
	public Jobs updateJobs(Jobs job) {
		jobsDao.save(job);
		return job;
	}
	@Override
	public Jobs deleteJobs(Long jobId) {
		
		Jobs entity = jobsDao.findById(jobId).get();
		jobsDao.delete(entity);
		return entity;
	}
		
	
	

}
