package com.bw.bean;


public class Mtv implements java.io.Serializable {

	//columns START
	private Integer mid;
	private String mname;
	private String studoe;
	private String name;
	private String fromtime;
	//columns END
	public Mtv(){


		this.mid=mid;

	public void setMid(Integer mid){
		this.mid=mid;
	}
	public Integer getMid(){
		return mid;
	}

	public void setMname(String mname){
		this.mname=mname;
	}
	public String getMname(){
		return mname;
	}

	public void setStudoe(String studoe){
		this.studoe=studoe;
	}
	public String getStudoe(){
		return studoe;
	}

	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}

	public void setFromtime(String fromtime){
		this.fromtime=fromtime;
	}
	public String getFromtime(){
		return fromtime;
	}
}
