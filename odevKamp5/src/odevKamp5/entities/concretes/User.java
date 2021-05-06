package odevKamp5.entities.concretes;

import odevKamp5.entities.abstracts.Entity;

public class User implements Entity {

	private int id;
	private String firstName;
	private String lastName;
	private long nationalityId;
	private String password;
	private String eMail;

	public User() {
		super();
	}

	public User(int id, String firstName, String lastName, long nationalityId, String password, String eMail) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.password = password;
		this.eMail = eMail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(long nationalityId) {
		this.nationalityId = nationalityId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

}