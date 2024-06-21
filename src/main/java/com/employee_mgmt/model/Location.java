package com.employee_mgmt.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "location")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "location_area")
    private String locationArea;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dept_id")
    private Department department;

    @OneToMany(mappedBy = "location")
    private Set<EmployeeMaster> employees;
    
  // Default  
    public Location() {
    	
    }
    
 // Constructor without id  
 public Location(String locationArea, Department department, Set<EmployeeMaster> employees) {
		super();
		this.locationArea = locationArea;
		this.department = department;
		this.employees = employees;
	}

// Constructor with id   
  public Location(Long id, String locationArea, Department department, Set<EmployeeMaster> employees) {
		super();
		this.id = id;
		this.locationArea = locationArea;
		this.department = department;
		this.employees = employees;
	}

// Getters and Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLocationArea() {
		return locationArea;
	}

	public void setLocationArea(String locationArea) {
		this.locationArea = locationArea;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Set<EmployeeMaster> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<EmployeeMaster> employees) {
		this.employees = employees;
	}

   
    
}
