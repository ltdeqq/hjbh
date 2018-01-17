package house.back.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import demo.house.bean.House_information;

public interface House_api extends JpaRepository<House_information, Integer>{
	
	@Query("select h from House_information h where h.informationID=:informationID")
	public House_information findByID(@Param("informationID") int informationID);
}
