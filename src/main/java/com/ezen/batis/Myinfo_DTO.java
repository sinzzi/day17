package com.ezen.batis;

public class Myinfo_DTO {
	int bun;
	String name;
	int age;
	String address;
	MyScore_DTO myScore_DTO;
	public Myinfo_DTO() {}
	
	public int getBun() {
		return bun;
	}
	public void setBun(int bun) {
		this.bun = bun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public MyScore_DTO getMyScore_DTO() {
		return myScore_DTO;
	}
	public void setMyScore_DTO(MyScore_DTO myScore_DTO) {
		this.myScore_DTO = myScore_DTO;
	}
	
	
}