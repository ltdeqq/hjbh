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
@Table(name="status_manager")
public class Status_manager {//状态
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer statusID;
	private String sta_name;
	private String status;
	@DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
	@JsonFormat(pattern="yyyy-MM-dd hh:mm:ss",locale="GTM+8")
	private Date sta_time;
	public Integer getStatusID() {
		return statusID;
	}
	public void setStatusID(Integer statusID) {
		this.statusID = statusID;
	}
	public String getSta_name() {
		return sta_name;
	}
	public void setSta_name(String sta_name) {
		this.sta_name = sta_name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getSta_time() {
		return sta_time;
	}
	public void setSta_time(Date sta_time) {
		this.sta_time = sta_time;
	}
	@Override
	public String toString() {
		return "Status_manager [statusID=" + statusID + ", sta_name=" + sta_name + ", status=" + status + ", sta_time="
				+ sta_time + "]";
	}
	

}
