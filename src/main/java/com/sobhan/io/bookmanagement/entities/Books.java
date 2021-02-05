package com.sobhan.io.bookmanagement.entities;

public class Books {
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
	// TODO Auto-generated constructor stub
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