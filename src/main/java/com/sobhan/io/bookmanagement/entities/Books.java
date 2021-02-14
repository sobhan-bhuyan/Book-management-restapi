package com.sobhan.io.bookmanagement.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Books {
	
	@Id
private long id;
private String title;
private String description;
public Books(long id, String title, String description) {
	super();
	this.id = id;
	this.title = title;
	this.description = description;
}
public Books() {
	super();
	
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}



}