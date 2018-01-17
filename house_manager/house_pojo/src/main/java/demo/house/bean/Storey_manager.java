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
@Table(name="storey_manager")
public class Storey_manager {//楼型
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer storeyID;
	private String storey;
	private String status;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	private Date sto_time;
	public Integer getStoreyID() {
		return storeyID;
	}
	public void setStoreyID(Integer storeyID) {
		this.storeyID = storeyID;
	}
	public String getStorey() {
		return storey;
	}
	public void setStorey(String storey) {
		this.storey = storey;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getSto_time() {
		return sto_time;
	}
	public void setSto_time(Date sto_time) {
		this.sto_time = sto_time;
	}
	@Override
	public String toString() {
		return "Storey_manager [storeyID=" + storeyID + ", storey=" + storey + ", status=" + status + ", sto_time="
				+ sto_time + "]";
	}
	
}
