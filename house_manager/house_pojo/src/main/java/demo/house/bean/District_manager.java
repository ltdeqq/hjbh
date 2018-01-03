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
@Table(name="district_manager")
public class District_manager {//区域
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer districtID;
	private String district;//区域名称
	private String status;//状态
	@DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
	@JsonFormat(pattern="yyyy-MM-dd hh:mm:ss",locale="GTM+8")
	private Date dis_time;
	public Integer getDistrictID() {
		return districtID;
	}
	public void setDistrictID(Integer districtID) {
		this.districtID = districtID;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getDis_time() {
		return dis_time;
	}
	public void setDis_time(Date dis_time) {
		this.dis_time = dis_time;
	}
	@Override
	public String toString() {
		return "District_manager [districtID=" + districtID + ", district=" + district + ", status=" + status
				+ ", dis_time=" + dis_time + "]";
	}

}
