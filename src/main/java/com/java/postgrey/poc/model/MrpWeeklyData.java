package com.java.postgrey.poc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mrp_weekly_data", schema = "ws_dsc_goit")
public class MrpWeeklyData {

	@Id
	@Column(name = "mod_number")
	private String modNumber;

	public String getModNumber() {
		return modNumber;
	}

	public void setModNumber(String modNumber) {
		this.modNumber = modNumber;
	}
	
	

}
