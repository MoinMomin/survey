package com.survey.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
@Data
@Document(collection="survey")
public class survey{
private int sid;
private int id;
private String title;
private List options;
private int minage;
private int maxage;
private String gendercriteria;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public List getOptions() {
	return options;
}
public void setOptions(List options) {
	this.options = options;
}
public int getMinage() {
	return minage;
}
public void setMinage(int minage) {
	this.minage = minage;
}
public int getMaxage() {
	return maxage;
}
public void setMaxage(int maxage) {
	this.maxage = maxage;
}
public String getGendercriteria() {
	return gendercriteria;
}
public void setGendercriteria(String gendercriteria) {
	this.gendercriteria = gendercriteria;
}
public survey(int sid, int id, String title, List options, int minage, int maxage, String gendercriteria) {
	super();
	this.sid = sid;
	this.id = id;
	this.title = title;
	this.options = options;
	this.minage = minage;
	this.maxage = maxage;
	this.gendercriteria = gendercriteria;
}
public survey() {
	super();
}


}
