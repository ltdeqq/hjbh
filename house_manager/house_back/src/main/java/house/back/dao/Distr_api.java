package house.back.dao;




import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import demo.house.bean.District_manager;

public interface Distr_api extends JpaRepository<District_manager, Integer>{
	@Modifying@Transactional
	@Query("update District_manager d set district=:district,status=:status,dis_time=:dis_time where districtID=:districtID")
   public void update(@Param("district") String district,@Param("status") String status,@Param("dis_time") Date dis_time,@Param("districtID") Integer districtID);
	
}

