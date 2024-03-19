package com.ezen.batis;

import java.util.ArrayList;

public interface Service {

	public void insert_a(String name, int age, String address);

	public ArrayList<Myinfo_DTO> print();

	public void deletea(String name);

	public ArrayList<MyinfoDTO> select_db();
	
}
