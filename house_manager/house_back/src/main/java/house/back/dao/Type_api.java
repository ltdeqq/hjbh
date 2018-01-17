package house.back.dao;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import demo.house.bean.Type_manager;

public interface Type_api extends JpaRepository<Type_manager, Integer>{
	@Modifying@Transactional
	@Query("update Type_manager s set type=:type,status=:status,type_time=:type_time where typeID=:typeID")
   public void update(@Param("type") String type,@Param("status") String status,@Param("type_time") Date type_time,@Param("typeID") Integer typeID);
}
