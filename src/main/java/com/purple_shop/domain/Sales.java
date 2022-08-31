package com.purple_shop.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "sales")
public class Sales {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_sales")
	private Long idSales;
	
	@Column(name = "amount_sales", nullable = false)
	private int amountSales;
	
	@Column(name = "sale_date", nullable = false)
	private Date saleDate;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "clothes_id", nullable = false)
	private Clothing ClothingId;
	
	@Column(name = "total_sale", nullable = false)
	private int totalSale;

	public Long getIdSales() {
		return idSales;
	}

	public void setIdSales(Long idSales) {
		this.idSales = idSales;
	}

	public int getAmountSales() {
		return amountSales;
	}

	public void setAmountSales(int amountSales) {
		this.amountSales = amountSales;
	}

	public Date getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}

	public Clothing getClothingId() {
		return ClothingId;
	}

	public void setClothingId(Clothing clothingId) {
		ClothingId = clothingId;
	}

	public int getTotalSale() {
		return totalSale;
	}

	public void setTotalSale(int totalSale) {
		this.totalSale = totalSale;
	}

	public Sales(Long idSales, int amountSales, Date saleDate, Clothing clothingId, int totalSale) {
		super();
		this.idSales = idSales;
		this.amountSales = amountSales;
		this.saleDate = saleDate;
		ClothingId = clothingId;
		this.totalSale = totalSale;
	}

	public Sales() {
		super();
	}
	
}
