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
@Table(name="consult")
public class Consult {//咨询
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer consultID;
	private String consult;
	private String status;
	@DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
	@JsonFormat(pattern="yyyy-MM-dd hh:mm:ss",locale="GTM+8")
	private Date con_time;
	private String substance;//内容
	public Integer getConsultID() {
		return consultID;
	}
	public void setConsultID(Integer consultID) {
		this.consultID = consultID;
	}
	public String getConsult() {
		return consult;
	}
	public void setConsult(String consult) {
		this.consult = consult;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCon_time() {
		return con_time;
	}
	public void setCon_time(Date con_time) {
		this.con_time = con_time;
	}
	public String getSubstance() {
		return substance;
	}
	public void setSubstance(String substance) {
		this.substance = substance;
	}
	@Override
	public String toString() {
		return "Consult [consultID=" + consultID + ", consult=" + consult + ", status=" + status + ", con_time="
				+ con_time + ", substance=" + substance + "]";
	}
	
}
