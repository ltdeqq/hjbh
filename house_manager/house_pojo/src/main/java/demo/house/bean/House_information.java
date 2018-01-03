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
@Table(name="house_information")
public class House_information {//房源信息展示
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer informationID;
	private String house_name;
	private Double money;
	private Integer  space;//面积
	private Date open_time;//开盘时间
	private String open_picture;
	private String address;
	@DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
	@JsonFormat(pattern="yyyy-MM-dd hh:mm:ss",locale="GTM+8")
	private Date launch_time;//交房时间
	private String status;
	@DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
	@JsonFormat(pattern="yyyy-MM-dd hh:mm:ss",locale="GTM+8")
	private Date time;//发布时间
	private String name;//姓名
	private String tel;//联系电话
	private String house_area;//房区所属
	private String developer;//开发商
	private String licence;//许可证号
	private Double covered_area;//建筑面积
	private Double floor_space;//占地面积
	private Double plot_ratio;//容积率
	private Double green_rate;//绿化率
	private String property_company;//物业公司
	private Double property_rate;//物业率
	private Integer carport;//车库车位
	private String special_Offers;//优惠信息
	private String peripheral_support;//周边配套
	
	private Integer districtID;//区域
	private Integer tradeID;//商圈
	private Integer statusID;//状态
	private Integer storeyID;//楼型
	private Integer typeID;//类型
	private Integer decorateID;//装修
	private Integer pictureID;//新房图库
	private Integer propelID;//推送
	
	@ManyToOne
	@JoinColumn(name="districtID",insertable=false,updatable=false)
	private District_manager district_manager;
	
	@ManyToOne
	@JoinColumn(name="tradeID",insertable=false,updatable=false)
	private Trade_area trade_area;
	
	@ManyToOne
	@JoinColumn(name="statusID",insertable=false,updatable=false)
	private Status_manager status_manager;
	
	@ManyToOne
	@JoinColumn(name="storeyID",insertable=false,updatable=false)
	private Storey_manager storey_manager;
	
	@ManyToOne
	@JoinColumn(name="typeID",insertable=false,updatable=false)
	private Type_manager type_manager;
	
	@ManyToOne
	@JoinColumn(name="decorateID",insertable=false,updatable=false)
	private Decorate_manager decorate_manager;
	
	@ManyToOne
	@JoinColumn(name="pictureID",insertable=false,updatable=false)
	private Picture picture;
	
	@ManyToOne
	@JoinColumn(name="propelID",insertable=false,updatable=false)
	private Propel_movement propel_movement;
	public Integer getInformationID() {
		return informationID;
	}
	public void setInformationID(Integer informationID) {
		this.informationID = informationID;
	}
	public String getHouse_name() {
		return house_name;
	}
	public void setHouse_name(String house_name) {
		this.house_name = house_name;
	}
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	public Integer getSpace() {
		return space;
	}
	public void setSpace(Integer space) {
		this.space = space;
	}
	public Date getOpen_time() {
		return open_time;
	}
	public void setOpen_time(Date open_time) {
		this.open_time = open_time;
	}
	public String getOpen_picture() {
		return open_picture;
	}
	public void setOpen_picture(String open_picture) {
		this.open_picture = open_picture;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getLaunch_time() {
		return launch_time;
	}
	public void setLaunch_time(Date launch_time) {
		this.launch_time = launch_time;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getHouse_area() {
		return house_area;
	}
	public void setHouse_area(String house_area) {
		this.house_area = house_area;
	}
	public String getDeveloper() {
		return developer;
	}
	public void setDeveloper(String developer) {
		this.developer = developer;
	}
	public String getLicence() {
		return licence;
	}
	public void setLicence(String licence) {
		this.licence = licence;
	}
	public Double getCovered_area() {
		return covered_area;
	}
	public void setCovered_area(Double covered_area) {
		this.covered_area = covered_area;
	}
	public Double getFloor_space() {
		return floor_space;
	}
	public void setFloor_space(Double floor_space) {
		this.floor_space = floor_space;
	}
	public Double getPlot_ratio() {
		return plot_ratio;
	}
	public void setPlot_ratio(Double plot_ratio) {
		this.plot_ratio = plot_ratio;
	}
	public Double getGreen_rate() {
		return green_rate;
	}
	public void setGreen_rate(Double green_rate) {
		this.green_rate = green_rate;
	}
	public String getProperty_company() {
		return property_company;
	}
	public void setProperty_company(String property_company) {
		this.property_company = property_company;
	}
	public Double getProperty_rate() {
		return property_rate;
	}
	public void setProperty_rate(Double property_rate) {
		this.property_rate = property_rate;
	}
	public Integer getCarport() {
		return carport;
	}
	public void setCarport(Integer carport) {
		this.carport = carport;
	}
	public String getSpecial_Offers() {
		return special_Offers;
	}
	public void setSpecial_Offers(String special_Offers) {
		this.special_Offers = special_Offers;
	}
	public String getPeripheral_support() {
		return peripheral_support;
	}
	public void setPeripheral_support(String peripheral_support) {
		this.peripheral_support = peripheral_support;
	}
	public Integer getPropelID() {
		return propelID;
	}
	public void setPropelID(Integer propelID) {
		this.propelID = propelID;
	}
	public Propel_movement getPropel_movement() {
		return propel_movement;
	}
	public void setPropel_movement(Propel_movement propel_movement) {
		this.propel_movement = propel_movement;
	}
	@Override
	public String toString() {
		return "House_information [informationID=" + informationID + ", house_name=" + house_name + ", money=" + money
				+ ", space=" + space + ", open_time=" + open_time + ", open_picture=" + open_picture + ", address="
				+ address + ", launch_time=" + launch_time + ", status=" + status + ", time=" + time + ", name=" + name
				+ ", tel=" + tel + ", house_area=" + house_area + ", developer=" + developer + ", licence=" + licence
				+ ", covered_area=" + covered_area + ", floor_space=" + floor_space + ", plot_ratio=" + plot_ratio
				+ ", green_rate=" + green_rate + ", property_company=" + property_company + ", property_rate="
				+ property_rate + ", carport=" + carport + ", special_Offers=" + special_Offers
				+ ", peripheral_support=" + peripheral_support + ", propelID=" + propelID + ", propel_movement="
				+ propel_movement + "]";
	}
	
}
