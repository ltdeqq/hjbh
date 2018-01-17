package demo.house.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="type_manager")
public class Type_manager {//类型
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer typeID;
	private String type;
	private String status;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	private Date type_time;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getType_time() {
		return type_time;
	}
	public void setType_time(Date type_time) {
		this.type_time = type_time;
	}
	@Override
	public String toString() {
		return "Type_manager [typeID=" + typeID + ", type=" + type + ", status=" + status + ", type_time=" + type_time
				+ "]";
	}
	
}
