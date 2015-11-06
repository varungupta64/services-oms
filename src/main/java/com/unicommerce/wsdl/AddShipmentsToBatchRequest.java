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
 *         &lt;element name="ShipmentBatchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShippingPackageCodes"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PackageCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "shipmentBatchCode",
    "shippingPackageCodes"
})
@XmlRootElement(name = "AddShipmentsToBatchRequest")
public class AddShipmentsToBatchRequest {

    @XmlElement(name = "ShipmentBatchCode")
    protected String shipmentBatchCode;
    @XmlElement(name = "ShippingPackageCodes", required = true)
    protected AddShipmentsToBatchRequest.ShippingPackageCodes shippingPackageCodes;

    /**
     * Gets the value of the shipmentBatchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentBatchCode() {
        return shipmentBatchCode;
    }

    /**
     * Sets the value of the shipmentBatchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentBatchCode(String value) {
        this.shipmentBatchCode = value;
    }

    /**
     * Gets the value of the shippingPackageCodes property.
     * 
     * @return
     *     possible object is
     *     {@link AddShipmentsToBatchRequest.ShippingPackageCodes }
     *     
     */
    public AddShipmentsToBatchRequest.ShippingPackageCodes getShippingPackageCodes() {
        return shippingPackageCodes;
    }

    /**
     * Sets the value of the shippingPackageCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddShipmentsToBatchRequest.ShippingPackageCodes }
     *     
     */
    public void setShippingPackageCodes(AddShipmentsToBatchRequest.ShippingPackageCodes value) {
        this.shippingPackageCodes = value;
    }


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
     *         &lt;element name="PackageCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "packageCode"
    })
    public static class ShippingPackageCodes {

        @XmlElement(name = "PackageCode", required = true)
        protected String packageCode;

        /**
         * Gets the value of the packageCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPackageCode() {
            return packageCode;
        }

        /**
         * Sets the value of the packageCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPackageCode(String value) {
            this.packageCode = value;
        }

    }

}