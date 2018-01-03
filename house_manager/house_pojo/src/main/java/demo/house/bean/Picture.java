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
@Table(name="picture")
public class Picture {//新房图库
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer pictureID;
	private String picture;
	private String status;
	@DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
	@JsonFormat(pattern="yyyy-MM-dd hh:mm:ss",locale="GTM+8")
	private Date pic_time;
	public Integer getPictureID() {
		return pictureID;
	}
	public void setPictureID(Integer pictureID) {
		this.pictureID = pictureID;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getPic_time() {
		return pic_time;
	}
	public void setPic_time(Date pic_time) {
		this.pic_time = pic_time;
	}
	@Override
	public String toString() {
		return "Picture [pictureID=" + pictureID + ", picture=" + picture + ", status=" + status + ", pic_time="
				+ pic_time + "]";
	}
	

}
