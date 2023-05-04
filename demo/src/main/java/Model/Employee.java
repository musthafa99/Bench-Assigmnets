package Model;

public class Employee {
	
	private long id;
	
	private String firstname;
	
	private String lastname;
	
	private String emailID;

	public Employee(long id, String firstname, String lastname, String emailID) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailID = emailID;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	
	
	

}
