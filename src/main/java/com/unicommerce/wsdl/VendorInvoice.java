//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.06 at 02:05:50 PM IST 
//


package com.unicommerce.wsdl;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for VendorInvoice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VendorInvoice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VendorInvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VendorInvoiceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="PurchaseOrderCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CurrencyConversionRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VendorInvoice", propOrder = {
    "vendorInvoiceNumber",
    "vendorInvoiceDate",
    "purchaseOrderCode",
    "currencyCode",
    "currencyConversionRate"
})
public class VendorInvoice {

    @XmlElement(name = "VendorInvoiceNumber", required = true)
    protected String vendorInvoiceNumber;
    @XmlElement(name = "VendorInvoiceDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar vendorInvoiceDate;
    @XmlElement(name = "PurchaseOrderCode", required = true)
    protected String purchaseOrderCode;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElement(name = "CurrencyConversionRate")
    protected BigDecimal currencyConversionRate;

    /**
     * Gets the value of the vendorInvoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorInvoiceNumber() {
        return vendorInvoiceNumber;
    }

    /**
     * Sets the value of the vendorInvoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorInvoiceNumber(String value) {
        this.vendorInvoiceNumber = value;
    }

    /**
     * Gets the value of the vendorInvoiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVendorInvoiceDate() {
        return vendorInvoiceDate;
    }

    /**
     * Sets the value of the vendorInvoiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVendorInvoiceDate(XMLGregorianCalendar value) {
        this.vendorInvoiceDate = value;
    }

    /**
     * Gets the value of the purchaseOrderCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseOrderCode() {
        return purchaseOrderCode;
    }

    /**
     * Sets the value of the purchaseOrderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseOrderCode(String value) {
        this.purchaseOrderCode = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the currencyConversionRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrencyConversionRate() {
        return currencyConversionRate;
    }

    /**
     * Sets the value of the currencyConversionRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrencyConversionRate(BigDecimal value) {
        this.currencyConversionRate = value;
    }

}
