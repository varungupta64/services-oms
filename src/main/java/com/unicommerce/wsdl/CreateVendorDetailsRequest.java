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
 *         &lt;element name="Vendor" type="{http://uniware.unicommerce.com/services/}Vendor"/&gt;
 *         &lt;element name="ShippingAddress" type="{http://uniware.unicommerce.com/services/}PartyAddress"/&gt;
 *         &lt;element name="BillingAddress" type="{http://uniware.unicommerce.com/services/}PartyAddress"/&gt;
 *         &lt;element name="Contacts" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Contact" type="{http://uniware.unicommerce.com/services/}PartyContact" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Agreement" type="{http://uniware.unicommerce.com/services/}VendorAgreement"/&gt;
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
    "vendor",
    "shippingAddress",
    "billingAddress",
    "contacts",
    "agreement"
})
@XmlRootElement(name = "CreateVendorDetailsRequest")
public class CreateVendorDetailsRequest {

    @XmlElement(name = "Vendor", required = true)
    protected Vendor vendor;
    @XmlElement(name = "ShippingAddress", required = true)
    protected PartyAddress shippingAddress;
    @XmlElement(name = "BillingAddress", required = true)
    protected PartyAddress billingAddress;
    @XmlElement(name = "Contacts")
    protected CreateVendorDetailsRequest.Contacts contacts;
    @XmlElement(name = "Agreement", required = true)
    protected VendorAgreement agreement;

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link Vendor }
     *     
     */
    public Vendor getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vendor }
     *     
     */
    public void setVendor(Vendor value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the shippingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link PartyAddress }
     *     
     */
    public PartyAddress getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Sets the value of the shippingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAddress }
     *     
     */
    public void setShippingAddress(PartyAddress value) {
        this.shippingAddress = value;
    }

    /**
     * Gets the value of the billingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link PartyAddress }
     *     
     */
    public PartyAddress getBillingAddress() {
        return billingAddress;
    }

    /**
     * Sets the value of the billingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAddress }
     *     
     */
    public void setBillingAddress(PartyAddress value) {
        this.billingAddress = value;
    }

    /**
     * Gets the value of the contacts property.
     * 
     * @return
     *     possible object is
     *     {@link CreateVendorDetailsRequest.Contacts }
     *     
     */
    public CreateVendorDetailsRequest.Contacts getContacts() {
        return contacts;
    }

    /**
     * Sets the value of the contacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateVendorDetailsRequest.Contacts }
     *     
     */
    public void setContacts(CreateVendorDetailsRequest.Contacts value) {
        this.contacts = value;
    }

    /**
     * Gets the value of the agreement property.
     * 
     * @return
     *     possible object is
     *     {@link VendorAgreement }
     *     
     */
    public VendorAgreement getAgreement() {
        return agreement;
    }

    /**
     * Sets the value of the agreement property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorAgreement }
     *     
     */
    public void setAgreement(VendorAgreement value) {
        this.agreement = value;
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
     *         &lt;element name="Contact" type="{http://uniware.unicommerce.com/services/}PartyContact" maxOccurs="unbounded"/&gt;
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
        "contact"
    })
    public static class Contacts {

        @XmlElement(name = "Contact", required = true)
        protected List<PartyContact> contact;

        /**
         * Gets the value of the contact property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contact property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContact().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PartyContact }
         * 
         * 
         */
        public List<PartyContact> getContact() {
            if (contact == null) {
                contact = new ArrayList<PartyContact>();
            }
            return this.contact;
        }

    }

}
