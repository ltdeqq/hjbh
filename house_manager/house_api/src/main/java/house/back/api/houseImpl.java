package house.back.api;

import java.util.List;

import demo.house.bean.House_information;

public interface houseImpl {
	public List<House_information> find();
	
	public void add(Object obj);
}
