package com.purple_shop.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "shoppingcart")
public class ShoppingCart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "clothes_id", nullable = false)
	private Clothing clothings;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_document", nullable = false)
	private User user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Clothing getClothings() {
		return clothings;
	}

	public void setClothings(Clothing clothings) {
		this.clothings = clothings;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public ShoppingCart(Long id, Clothing clothings, User user) {
		super();
		this.id = id;
		this.clothings = clothings;
		this.user = user;
	}

	public ShoppingCart() {
		super();
	}
		
}
