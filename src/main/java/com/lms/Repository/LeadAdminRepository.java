package com.lms.Repository;




import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Tuple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LeadAdminRepository {
	
	@PersistenceContext
	private EntityManager em;
	
	@Autowired
	private JdbcTemplate jdbc;
	
	
	public HashMap<String, String> findAll() {
		//jdbc.
		String sql = "SELECT value from sourcetype_master";

        //List<Customer> customers = new ArrayList<>();
		System.out.println("inside getting values");
        List<Map<String, Object>> rows = jdbc.queryForList(sql);
        
        System.out.println("inside getting values.......");
        HashMap<String, String> smap=new HashMap<String, String>();
        System.out.println("inside getting::"+rows.size());
        for (Map row : rows) {
        	smap.put(row.get("value").toString(), row.get("value").toString());
        }

        System.out.println("inside smap size::"+smap.size());
		return smap;
	}
	
	public Map<String, String> findbysourcemap(){ 
	Map<String, String> source_map=em.createQuery("select value from sourcetype_master", Tuple.class)
			.getResultList().stream()
			.collect(Collectors.toMap(tuple->tuple.get("value").toString(), tuple->tuple.get("value").toString()));
	return source_map;
	}
}
