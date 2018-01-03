package demo.house.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="comment")
public class Comment_manager {//评论
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer commentID;
	private String status;
	private String comment; 
	
	private Integer informationID;//房源
	
	@ManyToOne
	@JoinColumn(name="informationID",insertable=false,updatable=false)
	private House_information house_information;

	public Integer getCommentID() {
		return commentID;
	}

	public void setCommentID(Integer commentID) {
		this.commentID = commentID;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Integer getInformationID() {
		return informationID;
	}

	public void setInformationID(Integer informationID) {
		this.informationID = informationID;
	}

	public House_information getHouse_information() {
		return house_information;
	}

	public void setHouse_information(House_information house_information) {
		this.house_information = house_information;
	}

	@Override
	public String toString() {
		return "Comment_manager [commentID=" + commentID + ", status=" + status + ", comment=" + comment
				+ ", informationID=" + informationID + ", house_information=" + house_information + "]";
	}
	
}
