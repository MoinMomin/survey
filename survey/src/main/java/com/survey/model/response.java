package com.survey.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
@Data
@Document(collection="response")
public class response {
private int rid;
private int uid;
private int sid;
private List selectedoptions;
public int getRid() {
	return rid;
}
public void setRid(int rid) {
	this.rid = rid;
}
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public List getSelectedoptions() {
	return selectedoptions;
}
public void setSelectedoptions(List selectedoptions) {
	this.selectedoptions = selectedoptions;
}
public response(int rid, int uid, int sid, List selectedoptions) {
	super();
	this.rid = rid;
	this.uid = uid;
	this.sid = sid;
	this.selectedoptions = selectedoptions;
}
public response() {
	super();
}

}
