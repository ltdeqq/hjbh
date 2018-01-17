package house.back.dao;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import demo.house.bean.Interest_rate;

public interface Interest_rate_api extends JpaRepository<Interest_rate, Integer>{
	@Modifying@Transactional
	@Query("update Interest_rate s set rate_name=:rate_name,status=:status,rate_five=:rate_five,rate_many=:rate_many,rate_time=:rate_time,rate_type=:rate_type where rateID=:rateID")
   public void update(@Param("rate_type") String rate_type,@Param("rate_name") String rate_name,@Param("status") String status,@Param("rate_five") Double rate_five,@Param("rate_many") Double rate_many,@Param("rate_time") Date rate_time,@Param("rateID") Integer rateID);
}
