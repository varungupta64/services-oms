//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.06 at 02:05:50 PM IST 
//


package com.unicommerce.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SaleOrderAddress" type="{http://uniware.unicommerce.com/services/}SaleOrderAddress"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "saleOrderAddress"
})
@XmlRootElement(name = "EditSaleOrderAddressRequest")
public class EditSaleOrderAddressRequest {

    @XmlElement(name = "SaleOrderAddress", required = true)
    protected SaleOrderAddress saleOrderAddress;

    /**
     * Gets the value of the saleOrderAddress property.
     * 
     * @return
     *     possible object is
     *     {@link SaleOrderAddress }
     *     
     */
    public SaleOrderAddress getSaleOrderAddress() {
        return saleOrderAddress;
    }

    /**
     * Sets the value of the saleOrderAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleOrderAddress }
     *     
     */
    public void setSaleOrderAddress(SaleOrderAddress value) {
        this.saleOrderAddress = value;
    }

}