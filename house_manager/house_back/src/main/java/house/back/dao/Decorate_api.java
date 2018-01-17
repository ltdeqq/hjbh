package house.back.dao;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import demo.house.bean.Decorate_manager;

public interface Decorate_api extends JpaRepository<Decorate_manager, Integer>{
	@Modifying@Transactional
	@Query("update Decorate_manager s set decorate=:decorate,status=:status,dec_time=:dec_time where decorateID=:decorateID")
   public void update(@Param("decorate") String decorate,@Param("status") String status,@Param("dec_time") Date dec_time,@Param("decorateID") Integer decorateID);
}
