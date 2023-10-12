package com.to.entity;

public class user {
	private int id;
	private String Sub;
	private String chap;
	private String date;
	private String status;
	public user() {
		super();
		
	}
	public user(String sub, String chap, String date, String status) {
		super();
		Sub = sub;
		this.chap = chap;
		this.date = date;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSub() {
		return Sub;
	}
	public void setSub(String sub) {
		Sub = sub;
	}
	public String getChap() {
		return chap;
	}
	public void setChap(String chap) {
		this.chap = chap;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "user [id=" + id + ", Sub=" + Sub + ", chap=" + chap + ", date=" + date + ", status=" + status + "]";
	}

	

}
