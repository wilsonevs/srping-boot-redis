package com.wilsonevs.domain;

import java.io.Serializable;

/**
 * @author wilsonvalencia
 *
 */
public class Student implements Serializable {
	
    private String id;
	private String firstname;
	private String lastname;
	private String email;
	private String status;
	
	
  public String getId() {
    return id;
  }
  public void setId(String id) {
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
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }
	

}
