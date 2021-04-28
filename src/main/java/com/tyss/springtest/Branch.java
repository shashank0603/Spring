package com.tyss.springtest;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Branch implements Serializable {
	private int branch_id;
	private String branch_name;

	public Branch() {

	}

}
