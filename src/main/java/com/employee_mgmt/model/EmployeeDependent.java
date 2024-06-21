package com.employee_mgmt.model;

import javax.persistence.*;

@Entity
@Table(name = "dependent")
public class EmployeeDependent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false)
    private EmployeeInformation employee;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "relation", nullable = false)
    private String relation;

    @Column(name = "aadhaar", nullable = false)
    private String aadhaar;
    
    // Add constructors, getters, and setters
    
    public EmployeeDependent() {
    	
    }
    
    
    public EmployeeDependent(Long id, EmployeeInformation employee, String name, String relation, String aadhaar) {
		super();
		this.id = id;
		this.employee = employee;
		this.name = name;
		this.relation = relation;
		this.aadhaar = aadhaar;
	}
    
    
    

	public EmployeeDependent(EmployeeInformation employee, String name, String relation, String aadhaar) {
		super();
		this.employee = employee;
		this.name = name;
		this.relation = relation;
		this.aadhaar = aadhaar;
	}




	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public EmployeeInformation getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeInformation employee) {
		this.employee = employee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public String getAadhaar() {
		return aadhaar;
	}

	public void setAadhaar(String aadhaar) {
		this.aadhaar = aadhaar;
	}
    
    

  
}
