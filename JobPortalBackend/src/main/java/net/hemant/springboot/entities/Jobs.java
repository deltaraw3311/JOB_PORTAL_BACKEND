package net.hemant.springboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "JOB_AVAILABLE")
public class Jobs {
	
	public Jobs(Long id, String title, String location, String company, String employmentType, String postingDate) {
		super();
		this.id = id;
		this.title = title;
		this.location = location;
		this.company = company;
		this.employmentType = employmentType;
		this.postingDate = postingDate;
	}
	public Jobs() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	private Long id;
	private String title;
    private String location;
    private String company;
    private String employmentType;
    private String postingDate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getEmploymentType() {
		return employmentType;
	}
	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}
	public String getPostingDate() {
		return postingDate;
	}
	public void setPostingDate(String postingDate) {
		this.postingDate = postingDate;
	}
	@Override
	public String toString() {
		return "Jobs [id=" + id + ", title=" + title + ", location=" + location + ", company=" + company
				+ ", employmentType=" + employmentType + ", postingDate=" + postingDate + "]";
	}
    
    //Generate Constructor using field
    
    
    
    
    

}
