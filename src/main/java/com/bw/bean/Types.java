package com.bw.bean;;


public class Types implements java.io.Serializable {

	//columns START
	private Integer tid;
	private String tname;
	//columns END
	public Types(){


		this.tid=tid;

	public void setTid(Integer tid){
		this.tid=tid;
	}
	public Integer getTid(){
		return tid;
	}

	public void setTname(String tname){
		this.tname=tname;
	}
	public String getTname(){
		return tname;
	}
}
