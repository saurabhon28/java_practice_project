package com.employee_mgmt.model;

import javax.persistence.*;

@Entity
@Table(name = "employee_details")
public class EmployeeInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "full_name", nullable = false)
    private String fullName;

    @Column(name = "father_name", nullable = false)
    private String fatherName;

    @Column(name = "mother_name", nullable = false)
    private String motherName;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "gender", nullable = false)
    private String gender;

    @Column(name = "department", nullable = false)
    private String department;

    @Column(name = "designation", nullable = false)
    private String designation;

    @Column(name = "permanent_address", nullable = false)
    private String permanentAddress;

    @Column(name = "communication_address", nullable = false)
    private String communicationAddress;

    // Add constructors, getters, and setters
    public EmployeeInformation() {}
    
    

    public EmployeeInformation(Long id, String fullName, String fatherName, String motherName, String email,
			String phone, String gender, String department, String designation, String permanentAddress,
			String communicationAddress) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
		this.department = department;
		this.designation = designation;
		this.permanentAddress = permanentAddress;
		this.communicationAddress = communicationAddress;
	}
    
    



	public EmployeeInformation(String fullName, String fatherName, String motherName, String email, String phone,
			String gender, String department, String designation, String permanentAddress,
			String communicationAddress) {
		super();
		this.fullName = fullName;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
		this.department = department;
		this.designation = designation;
		this.permanentAddress = permanentAddress;
		this.communicationAddress = communicationAddress;
	}



	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public String getCommunicationAddress() {
        return communicationAddress;
    }

    public void setCommunicationAddress(String communicationAddress) {
        this.communicationAddress = communicationAddress;
    }
}
