package com.exclusively.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "SALE_ORDER")
@Data
public class Order {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ORDER_NO")
	protected Long id;

	@Column(name="NAME")
	protected String name;

	@Column(name = "PRICE")
	protected BigDecimal price;


}
