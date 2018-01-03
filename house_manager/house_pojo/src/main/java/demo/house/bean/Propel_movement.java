package demo.house.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="propel_movement")
public class Propel_movement {//推送信息
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer PropelID;
	private String title;
	private String substance;//内容
	public Integer getPropelID() {
		return PropelID;
	}
	public void setPropelID(Integer propelID) {
		PropelID = propelID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubstance() {
		return substance;
	}
	public void setSubstance(String substance) {
		this.substance = substance;
	}
	@Override
	public String toString() {
		return "Propel_movement [PropelID=" + PropelID + ", title=" + title + ", substance=" + substance + "]";
	}
	
}
