package demo.house.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="house_type")
public class House_type {//户型
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer typeID;
	private String type;
	private String house_type;
	private Double acreage;//面积
	public Integer getTypeID() {
		return typeID;
	}
	public void setTypeID(Integer typeID) {
		this.typeID = typeID;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getHouse_type() {
		return house_type;
	}
	public void setHouse_type(String house_type) {
		this.house_type = house_type;
	}
	public Double getAcreage() {
		return acreage;
	}
	public void setAcreage(Double acreage) {
		this.acreage = acreage;
	}
	@Override
	public String toString() {
		return "House_type [typeID=" + typeID + ", type=" + type + ", house_type=" + house_type + ", acreage=" + acreage
				+ "]";
	}
	
}
