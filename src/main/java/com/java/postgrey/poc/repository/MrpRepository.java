package com.java.postgrey.poc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.java.postgrey.poc.model.MrpWeeklyData;

public interface MrpRepository extends JpaRepository<MrpWeeklyData, String> {

	@Query(value = "select mod_number from ws_dsc_goit.mrp_weekly_data where mod_number =:modNumber  limit 1",nativeQuery = true)
	String findMe(String modNumber);

}
