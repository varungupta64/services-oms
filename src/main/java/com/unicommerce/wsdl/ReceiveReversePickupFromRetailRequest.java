//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.06 at 02:05:50 PM IST 
//


package com.unicommerce.wsdl;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="ReversePickupItems" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ReversePickupItem" type="{http://uniware.unicommerce.com/services/}RetailReversePickupItem" maxOccurs="unbounded"/&gt;
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
    "reversePickupItems"
})
@XmlRootElement(name = "ReceiveReversePickupFromRetailRequest")
public class ReceiveReversePickupFromRetailRequest {

    @XmlElement(name = "ReversePickupItems")
    protected ReceiveReversePickupFromRetailRequest.ReversePickupItems reversePickupItems;

    /**
     * Gets the value of the reversePickupItems property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiveReversePickupFromRetailRequest.ReversePickupItems }
     *     
     */
    public ReceiveReversePickupFromRetailRequest.ReversePickupItems getReversePickupItems() {
        return reversePickupItems;
    }

    /**
     * Sets the value of the reversePickupItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiveReversePickupFromRetailRequest.ReversePickupItems }
     *     
     */
    public void setReversePickupItems(ReceiveReversePickupFromRetailRequest.ReversePickupItems value) {
        this.reversePickupItems = value;
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
     *         &lt;element name="ReversePickupItem" type="{http://uniware.unicommerce.com/services/}RetailReversePickupItem" maxOccurs="unbounded"/&gt;
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
        "reversePickupItem"
    })
    public static class ReversePickupItems {

        @XmlElement(name = "ReversePickupItem", required = true)
        protected List<RetailReversePickupItem> reversePickupItem;

        /**
         * Gets the value of the reversePickupItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reversePickupItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReversePickupItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RetailReversePickupItem }
         * 
         * 
         */
        public List<RetailReversePickupItem> getReversePickupItem() {
            if (reversePickupItem == null) {
                reversePickupItem = new ArrayList<RetailReversePickupItem>();
            }
            return this.reversePickupItem;
        }

    }

}
