package house.back.dao;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import demo.house.bean.Picture;

public interface Picture_api extends JpaRepository<Picture, Integer>{
	@Modifying@Transactional
	@Query("update Picture s set picture=:picture,status=:status,pic_time=:pic_time where pictureID=:pictureID")
   public void update(@Param("picture") String picture,@Param("status") String status,@Param("pic_time") Date pic_time,@Param("pictureID") Integer pictureID);
}
