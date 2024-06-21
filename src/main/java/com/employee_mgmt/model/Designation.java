package com.employee_mgmt.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "designation")
public class Designation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "designation_name")
    private String designationName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dept_id")
    private Department department;

    @OneToMany(mappedBy = "designation")
    private Set<EmployeeMaster> employees;
    
    
    public Designation() {
    	
    }
    
  // Constructor without id  
  public Designation(String designationName, Department department, Set<EmployeeMaster> employees) {
		super();
		this.designationName = designationName;
		this.department = department;
		this.employees = employees;
	}

// Constructor with id  
 public Designation(Long id, String designationName, Department department, Set<EmployeeMaster> employees) {
		super();
		this.id = id;
		this.designationName = designationName;
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

	public String getDesignationName() {
		return designationName;
	}

	public void setDesignationName(String designationName) {
		this.designationName = designationName;
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
