package com.tyss.springtest;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student implements Serializable{
	private int id;
	private String name;
	private Branch branch;

	public Student() {

	}

}
