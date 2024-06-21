package com.employee_mgmt.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "department_name")
    private String departmentName;

    @OneToMany(mappedBy = "department")
    private Set<EmployeeMaster> employees;
    
  // Default
    public Department() {
    	
    }
    
 // Constructor with id
 public Department(String departmentName, Set<EmployeeMaster> employees) {
		super();
		this.departmentName = departmentName;
		this.employees = employees;
	}

// Constructor with id
 public Department(Long id, String departmentName, Set<EmployeeMaster> employees) {
		super();
		this.id = id;
		this.departmentName = departmentName;
		this.employees = employees;
	}

// Getters and Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Set<EmployeeMaster> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<EmployeeMaster> employees) {
		this.employees = employees;
	}

    
    
}

