package com.purple_shop.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clothing")
public class Clothing {
	
	@Id
	@Column(name = "clothes_id")
	private Long clothesId;
	
	@Column(name = "clothes_name")
	private String clotesName;
	
	@Column(name = "clothes_price")
	private String clotesPrice;

	@Column(name = "clothes_type")
	private String clotesType;
	
	@Column(name = "clothes_color")
	private String clotesColor;
	
	@Column(name = "clothes_size")
	private String clotesSize;
	
	@Column(name = "clothes_amount")
	private String clotesAmount;
	
	@Column(name = "clothes_score")
	private String clotesScore;
	
	@Column(name = "clothes_status")
	private String clotesStatus;

	public Long getClothesId() {
		return clothesId;
	}

	public void setClothesId(Long clothesId) {
		this.clothesId = clothesId;
	}

	public String getClotesName() {
		return clotesName;
	}

	public void setClotesName(String clotesName) {
		this.clotesName = clotesName;
	}

	public String getClotesPrice() {
		return clotesPrice;
	}

	public void setClotesPrice(String clotesPrice) {
		this.clotesPrice = clotesPrice;
	}

	public String getClotesType() {
		return clotesType;
	}

	public void setClotesType(String clotesType) {
		this.clotesType = clotesType;
	}

	public String getClotesColor() {
		return clotesColor;
	}

	public void setClotesColor(String clotesColor) {
		this.clotesColor = clotesColor;
	}

	public String getClotesSize() {
		return clotesSize;
	}

	public void setClotesSize(String clotesSize) {
		this.clotesSize = clotesSize;
	}

	public String getClotesAmount() {
		return clotesAmount;
	}

	public void setClotesAmount(String clotesAmount) {
		this.clotesAmount = clotesAmount;
	}

	public String getClotesScore() {
		return clotesScore;
	}

	public void setClotesScore(String clotesScore) {
		this.clotesScore = clotesScore;
	}

	public String getClotesStatus() {
		return clotesStatus;
	}

	public void setClotesStatus(String clotesStatus) {
		this.clotesStatus = clotesStatus;
	}

	public Clothing(Long clothesId, String clotesName, String clotesPrice, String clotesType, String clotesColor,
			String clotesSize, String clotesAmount, String clotesScore, String clotesStatus) {
		super();
		this.clothesId = clothesId;
		this.clotesName = clotesName;
		this.clotesPrice = clotesPrice;
		this.clotesType = clotesType;
		this.clotesColor = clotesColor;
		this.clotesSize = clotesSize;
		this.clotesAmount = clotesAmount;
		this.clotesScore = clotesScore;
		this.clotesStatus = clotesStatus;
	}

	public Clothing() {
		super();
	}
	
}
