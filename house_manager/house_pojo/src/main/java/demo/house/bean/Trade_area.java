package demo.house.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="trade_area")
public class Trade_area {//商圈
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer tradeID;
	private String trade;//商圈名称
	private String status;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	private Date tra_time;
	
	private Integer districtID;//外键
	
	@ManyToOne
	@JoinColumn(name="districtID",insertable=false,updatable=false)
	private District_manager district_manager;

	public Integer getTradeID() {
		return tradeID;
	}

	public void setTradeID(Integer tradeID) {
		this.tradeID = tradeID;
	}

	public String getTrade() {
		return trade;
	}

	public void setTrade(String trade) {
		this.trade = trade;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getTra_time() {
		return tra_time;
	}

	public void setTra_time(Date tra_time) {
		this.tra_time = tra_time;
	}

	public Integer getDistrictID() {
		return districtID;
	}

	public void setDistrictID(Integer districtID) {
		this.districtID = districtID;
	}

	public District_manager getDistrict_manager() {
		return district_manager;
	}

	public void setDistrict_manager(District_manager district_manager) {
		this.district_manager = district_manager;
	}

	@Override
	public String toString() {
		return "Trade_area [tradeID=" + tradeID + ", trade=" + trade + ", status=" + status + ", tra_time=" + tra_time
				+ ", districtID=" + districtID + ", district_manager=" + district_manager + "]";
	}
	

}
