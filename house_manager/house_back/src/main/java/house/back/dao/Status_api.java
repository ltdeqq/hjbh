package house.back.dao;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import demo.house.bean.Status_manager;

public interface Status_api extends JpaRepository<Status_manager, Integer>{
	@Modifying@Transactional
	@Query("update Status_manager s set sta_name=:sta_name,status=:status,sta_time=:sta_time where statusID=:statusID")
   public void update(@Param("sta_name") String sta_name,@Param("status") String status,@Param("sta_time") Date sta_time,@Param("statusID") Integer statusID);
}

