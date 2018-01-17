package house.back.dao;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import demo.house.bean.Trade_area;

public interface Trade_api extends JpaRepository<Trade_area, Integer>{
	@Query("select t from Trade_area t where t.districtID=:districtID")
   public List<Trade_area> findByDistrictID(@Param("districtID") Integer districtID);
   @Modifying@Transactional
   @Query("delete from Trade_area t where t.districtID=:districtID")
   public void deleteByDistrictID(@Param("districtID") Integer districtID);
   @Modifying@Transactional
	@Query("update Trade_area t set t.trade=:trade,t.status=:status,t.tra_time=:tra_time where t.tradeID=:tradeID")
  public void update(@Param("trade") String trade,@Param("status") String status,@Param("tra_time") Date tra_time,@Param("tradeID") Integer tradeID);
}
