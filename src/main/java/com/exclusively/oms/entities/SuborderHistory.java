package com.exclusively.oms.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SUBORDER_HISTORY")
public class SuborderHistory {
	
	@Id 
	@GeneratedValue
	@Column(name="ID")
	private long id;
	
	@Column(name="SUBORDER_ID")
	private String suborderId;
	
	@Column(name="ORDER_ID")
	private Long orderId;
	
	@Column(name="SOURCE")
	private String source;
	
	@Column(name="ACTION_TYPE")
	private String actionType;
	
	@Column(name="VALUE_TYPE")
	private String valueType;
	
	@Column(name="STATUS")
	private String status;
	
	@Column(name="STORE_ID")
	private String storeId;
	
	@Column(name="CREATED_AT")
	private Date createdAt;
	
	@Column(name="UPDATED_AT")
	private Date updatedAt;
	
	@Column(name="LATITUDE")
	private Double latitude;
	
	@Column(name="LONGITUDE")
	private Double longitude;
	
	@Column(name="X_FORWARDED_FOR")
	private String xForwardedFor;
	
	@Column(name="CUSTOMER_NAME")
	private String customerName;
	
	@Column(name="CUSTOMER_ID")
	private Long customerId;
	
	@Column(name="CUSTOMER_IS_GUEST")
	private String customerIsGuest;
	
	@Column(name="CUSTOMER_EMAIL")
	private String customerEmail;
	
	@Column(name="MOBILENUMBER")
	private Long mobileNumber;
	
	@Column(name="TOTAL_ITEM_COUNT")
	private Long totalItemCount;
	
	@Column(name="ORDER_CURRENCY")
	private String orderCurrency;		
	
	@Column(name="SUBTOTAL")
	private Double subtotal;
	
	@Column(name="COUPON_CODE")
	private String couponCode;
	
	@Column(name="GRAND_TOTAL")
	private Double grandTotal;
	
	@Column(name="GIFT_CARD_AMOUNT_USED")
	private Double giftCardAmountUsed;
	
	@Column(name="STORE_CREDITS_USED")
	private Double storeCreditsUsed;
	
	@Column(name="TOTAL_PAID")
	private Double totalPaid;

	@Column(name="PREPAID_AMOUNT")
	private Double prepaidAmount;
	
	@Column(name="COD_AMOUNT")
	private Double codAmount;
	
	@Column(name="PART_PAYMENT")
	private Double partPayment;
	
	@Column(name="EMI_CHARGES")
	private Double emiCharges;
	
	@Column(name="SHIPPING_ADDRESS_ID")
	private Integer shippingAddressId;
	
	@Column(name="BILLING_ADDRESS_ID")
	private Integer billingAddressId;
	
	@Column(name="SHIPPING_METHOD")
	private String shippingMethod;
	
	@Column(name="SHIPPING_CHARGES")
	private Double shippingCharges;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSuborderId() {
		return suborderId;
	}

	public void setSuborderId(String suborderId) {
		this.suborderId = suborderId;
	}
	
	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getValueType() {
		return valueType;
	}

	public void setValueType(String valueType) {
		this.valueType = valueType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStoreId() {
		return storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public String getxForwardedFor() {
		return xForwardedFor;
	}

	public void setxForwardedFor(String xForwardedFor) {
		this.xForwardedFor = xForwardedFor;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerIsGuest() {
		return customerIsGuest;
	}

	public void setCustomerIsGuest(String customerIsGuest) {
		this.customerIsGuest = customerIsGuest;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Long getTotalItemCount() {
		return totalItemCount;
	}

	public void setTotalItemCount(Long totalItemCount) {
		this.totalItemCount = totalItemCount;
	}

	public String getOrderCurrency() {
		return orderCurrency;
	}

	public void setOrderCurrency(String orderCurrency) {
		this.orderCurrency = orderCurrency;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public Double getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(Double grandTotal) {
		this.grandTotal = grandTotal;
	}

	public Double getGiftCardAmountUsed() {
		return giftCardAmountUsed;
	}

	public void setGiftCardAmountUsed(Double giftCardAmountUsed) {
		this.giftCardAmountUsed = giftCardAmountUsed;
	}

	public Double getStoreCreditsUsed() {
		return storeCreditsUsed;
	}

	public void setStoreCreditsUsed(Double storeCreditsUsed) {
		this.storeCreditsUsed = storeCreditsUsed;
	}

	public Double getTotalPaid() {
		return totalPaid;
	}

	public void setTotalPaid(Double totalPaid) {
		this.totalPaid = totalPaid;
	}

	public Double getPrepaidAmount() {
		return prepaidAmount;
	}

	public void setPrepaidAmount(Double prepaidAmount) {
		this.prepaidAmount = prepaidAmount;
	}

	public Double getCodAmount() {
		return codAmount;
	}

	public void setCodAmount(Double codAmount) {
		this.codAmount = codAmount;
	}

	public Double getPartPayment() {
		return partPayment;
	}

	public void setPartPayment(Double partPayment) {
		this.partPayment = partPayment;
	}

	public Double getEmiCharges() {
		return emiCharges;
	}

	public void setEmiCharges(Double emiCharges) {
		this.emiCharges = emiCharges;
	}

	public Integer getShippingAddressId() {
		return shippingAddressId;
	}

	public void setShippingAddressId(Integer shippingAddressId) {
		this.shippingAddressId = shippingAddressId;
	}

	public Integer getBillingAddressId() {
		return billingAddressId;
	}

	public void setBillingAddressId(Integer billingAddressId) {
		this.billingAddressId = billingAddressId;
	}

	public String getShippingMethod() {
		return shippingMethod;
	}

	public void setShippingMethod(String shippingMethod) {
		this.shippingMethod = shippingMethod;
	}

	public Double getShippingCharges() {
		return shippingCharges;
	}

	public void setShippingCharges(Double shippingCharges) {
		this.shippingCharges = shippingCharges;
	}
}
