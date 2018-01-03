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
@Table(name="interest_rate")
public class Interest_rate {//利率
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer rateID;
	private String rate_type;
	private String rate_name;
	private Double rate_five;
	private Double rate_many;
	private String status;
	@DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
	@JsonFormat(pattern="yyyy-MM-dd hh:mm:ss",locale="GTM+8")
	private Date rate_time;
	public Integer getRateID() {
		return rateID;
	}
	public void setRateID(Integer rateID) {
		this.rateID = rateID;
	}
	public String getRate_type() {
		return rate_type;
	}
	public void setRate_type(String rate_type) {
		this.rate_type = rate_type;
	}
	public String getRate_name() {
		return rate_name;
	}
	public void setRate_name(String rate_name) {
		this.rate_name = rate_name;
	}
	public Double getRate_five() {
		return rate_five;
	}
	public void setRate_five(Double rate_five) {
		this.rate_five = rate_five;
	}
	public Double getRate_many() {
		return rate_many;
	}
	public void setRate_many(Double rate_many) {
		this.rate_many = rate_many;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getRate_time() {
		return rate_time;
	}
	public void setRate_time(Date rate_time) {
		this.rate_time = rate_time;
	}
	@Override
	public String toString() {
		return "Interest_rate [rateID=" + rateID + ", rate_type=" + rate_type + ", rate_name=" + rate_name
				+ ", rate_five=" + rate_five + ", rate_many=" + rate_many + ", status=" + status + ", rate_time="
				+ rate_time + "]";
	}

}
