package house.back.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.house.bean.House_information;

public interface House_api extends JpaRepository<House_information, Integer>{

}
