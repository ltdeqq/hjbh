package house.back.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import demo.house.bean.Trade_area;

public interface Trade_api extends JpaRepository<Trade_area, Integer>{
	@Query("select t from Trade_area t where t.districtID=:districtID")
   public List<Trade_area> findByDistrictID(@Param("districtID") Integer districtID);
}
