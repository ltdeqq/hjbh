package house.back.dao;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import demo.house.bean.Storey_manager;

public interface Storey_api extends JpaRepository<Storey_manager,Integer>{
	@Modifying@Transactional
	@Query("update Storey_manager s set storey=:storey,status=:status,sto_time=:sto_time where storeyID=:storeyID")
   public void update(@Param("storey") String storey,@Param("status") String status,@Param("sto_time") Date sto_time,@Param("storeyID") Integer storeyID);
}

