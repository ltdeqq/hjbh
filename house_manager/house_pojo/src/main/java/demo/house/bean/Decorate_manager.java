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
@Table(name="decorate_manager")
public class Decorate_manager {//装修
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer decorateID;
	private String decorate;
	private String status;
	@DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
	@JsonFormat(pattern="yyyy-MM-dd hh:mm:ss",locale="GTM+8")
	private Date dec_time;
	public Integer getDecorateID() {
		return decorateID;
	}
	public void setDecorateID(Integer decorateID) {
		this.decorateID = decorateID;
	}
	public String getDecorate() {
		return decorate;
	}
	public void setDecorate(String decorate) {
		this.decorate = decorate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getDec_time() {
		return dec_time;
	}
	public void setDec_time(Date dec_time) {
		this.dec_time = dec_time;
	}
	@Override
	public String toString() {
		return "Decorate_manager [decorateID=" + decorateID + ", decorate=" + decorate + ", status=" + status
				+ ", dec_time=" + dec_time + "]";
	}
	
	
}
