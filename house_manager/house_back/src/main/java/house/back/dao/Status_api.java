package house.back.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.house.bean.Status_manager;

public interface Status_api extends JpaRepository<Status_manager, Integer>{

}
