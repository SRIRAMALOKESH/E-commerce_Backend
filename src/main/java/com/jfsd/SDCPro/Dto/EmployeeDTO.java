package com.jfsd.SDCPro.Dto;
public class EmployeeDTO {

    private int employeeid;
    private String employeename;
    private String email;
    private String phone;
    private String password;

    public EmployeeDTO() {
    }

    public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	
	public EmployeeDTO(int employeeid, String employeename, String email, String phone, String password) {
		super();
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}

} //create getters and setters
