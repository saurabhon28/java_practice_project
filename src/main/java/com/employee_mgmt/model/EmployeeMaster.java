package com.employee_mgmt.model;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name = "employee_master")
public class EmployeeMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "employee_code")
	private String employeeCode;

	@Column(name = "employee_name")
	private String employeeName;

	@Column(name = "father_name")
	private String fatherName;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dept_id")
	private Department department;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "designation_id")
	private Designation designation;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "location_id")
	private Location location;

	@Column(name = "suspended_status")
	private boolean suspendedStatus;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "created_date")
	private LocalDateTime createdDate;

	@Column(name = "updated_by")
	private String updatedBy;

	@Column(name = "updated_date")
	private LocalDateTime updatedDate;
	
	//Default
	public EmployeeMaster() {
		
	}

	// Constructor without id

	public EmployeeMaster(String employeeCode, String employeeName, String fatherName, Department department,
			Designation designation, Location location, boolean suspendedStatus, String createdBy,
			LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate) {
		super();
		this.employeeCode = employeeCode;
		this.employeeName = employeeName;
		this.fatherName = fatherName;
		this.department = department;
		this.designation = designation;
		this.location = location;
		this.suspendedStatus = suspendedStatus;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
	}
	
	// Constructor with id

	public EmployeeMaster(Long id, String employeeCode, String employeeName, String fatherName, Department department,
			Designation designation, Location location, boolean suspendedStatus, String createdBy,
			LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate) {
		super();
		this.id = id;
		this.employeeCode = employeeCode;
		this.employeeName = employeeName;
		this.fatherName = fatherName;
		this.department = department;
		this.designation = designation;
		this.location = location;
		this.suspendedStatus = suspendedStatus;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
	}



	// Getters and Setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Designation getDesignation() {
		return designation;
	}

	public void setDesignation(Designation designation) {
		this.designation = designation;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public boolean isSuspendedStatus() {
		return suspendedStatus;
	}

	public void setSuspendedStatus(boolean suspendedStatus) {
		this.suspendedStatus = suspendedStatus;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

}
