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
 *         &lt;element name="Successful" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Errors" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Error" type="{http://uniware.unicommerce.com/services/}Error" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Warnings" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Warning" type="{http://uniware.unicommerce.com/services/}Warning" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SplittedShippingPackages"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ShippingPackage" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ShipmentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="ShippingPackageType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="InvoiceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ShippingProvider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
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
    "successful",
    "errors",
    "warnings",
    "splittedShippingPackages"
})
@XmlRootElement(name = "SplitShippingPackageResponse")
public class SplitShippingPackageResponse {

    @XmlElement(name = "Successful")
    protected boolean successful;
    @XmlElement(name = "Errors")
    protected SplitShippingPackageResponse.Errors errors;
    @XmlElement(name = "Warnings")
    protected SplitShippingPackageResponse.Warnings warnings;
    @XmlElement(name = "SplittedShippingPackages", required = true)
    protected SplitShippingPackageResponse.SplittedShippingPackages splittedShippingPackages;

    /**
     * Gets the value of the successful property.
     * 
     */
    public boolean isSuccessful() {
        return successful;
    }

    /**
     * Sets the value of the successful property.
     * 
     */
    public void setSuccessful(boolean value) {
        this.successful = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link SplitShippingPackageResponse.Errors }
     *     
     */
    public SplitShippingPackageResponse.Errors getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link SplitShippingPackageResponse.Errors }
     *     
     */
    public void setErrors(SplitShippingPackageResponse.Errors value) {
        this.errors = value;
    }

    /**
     * Gets the value of the warnings property.
     * 
     * @return
     *     possible object is
     *     {@link SplitShippingPackageResponse.Warnings }
     *     
     */
    public SplitShippingPackageResponse.Warnings getWarnings() {
        return warnings;
    }

    /**
     * Sets the value of the warnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link SplitShippingPackageResponse.Warnings }
     *     
     */
    public void setWarnings(SplitShippingPackageResponse.Warnings value) {
        this.warnings = value;
    }

    /**
     * Gets the value of the splittedShippingPackages property.
     * 
     * @return
     *     possible object is
     *     {@link SplitShippingPackageResponse.SplittedShippingPackages }
     *     
     */
    public SplitShippingPackageResponse.SplittedShippingPackages getSplittedShippingPackages() {
        return splittedShippingPackages;
    }

    /**
     * Sets the value of the splittedShippingPackages property.
     * 
     * @param value
     *     allowed object is
     *     {@link SplitShippingPackageResponse.SplittedShippingPackages }
     *     
     */
    public void setSplittedShippingPackages(SplitShippingPackageResponse.SplittedShippingPackages value) {
        this.splittedShippingPackages = value;
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
     *         &lt;element name="Error" type="{http://uniware.unicommerce.com/services/}Error" maxOccurs="unbounded"/&gt;
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
        "error"
    })
    public static class Errors {

        @XmlElement(name = "Error", required = true)
        protected List<Error> error;

        /**
         * Gets the value of the error property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the error property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getError().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Error }
         * 
         * 
         */
        public List<Error> getError() {
            if (error == null) {
                error = new ArrayList<Error>();
            }
            return this.error;
        }

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
     *         &lt;element name="ShippingPackage" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ShipmentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="ShippingPackageType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="InvoiceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ShippingProvider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "shippingPackage"
    })
    public static class SplittedShippingPackages {

        @XmlElement(name = "ShippingPackage", required = true)
        protected List<SplitShippingPackageResponse.SplittedShippingPackages.ShippingPackage> shippingPackage;

        /**
         * Gets the value of the shippingPackage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the shippingPackage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getShippingPackage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SplitShippingPackageResponse.SplittedShippingPackages.ShippingPackage }
         * 
         * 
         */
        public List<SplitShippingPackageResponse.SplittedShippingPackages.ShippingPackage> getShippingPackage() {
            if (shippingPackage == null) {
                shippingPackage = new ArrayList<SplitShippingPackageResponse.SplittedShippingPackages.ShippingPackage>();
            }
            return this.shippingPackage;
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
         *         &lt;element name="ShipmentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="ShippingPackageType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="InvoiceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ShippingProvider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "shipmentCode",
            "statusCode",
            "shippingPackageType",
            "invoiceCode",
            "shippingProvider",
            "trackingNumber"
        })
        public static class ShippingPackage {

            @XmlElement(name = "ShipmentCode", required = true)
            protected String shipmentCode;
            @XmlElement(name = "StatusCode", required = true)
            protected String statusCode;
            @XmlElement(name = "ShippingPackageType", required = true)
            protected String shippingPackageType;
            @XmlElement(name = "InvoiceCode")
            protected String invoiceCode;
            @XmlElement(name = "ShippingProvider")
            protected String shippingProvider;
            @XmlElement(name = "TrackingNumber")
            protected String trackingNumber;

            /**
             * Gets the value of the shipmentCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getShipmentCode() {
                return shipmentCode;
            }

            /**
             * Sets the value of the shipmentCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setShipmentCode(String value) {
                this.shipmentCode = value;
            }

            /**
             * Gets the value of the statusCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStatusCode() {
                return statusCode;
            }

            /**
             * Sets the value of the statusCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStatusCode(String value) {
                this.statusCode = value;
            }

            /**
             * Gets the value of the shippingPackageType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getShippingPackageType() {
                return shippingPackageType;
            }

            /**
             * Sets the value of the shippingPackageType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setShippingPackageType(String value) {
                this.shippingPackageType = value;
            }

            /**
             * Gets the value of the invoiceCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvoiceCode() {
                return invoiceCode;
            }

            /**
             * Sets the value of the invoiceCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvoiceCode(String value) {
                this.invoiceCode = value;
            }

            /**
             * Gets the value of the shippingProvider property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getShippingProvider() {
                return shippingProvider;
            }

            /**
             * Sets the value of the shippingProvider property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setShippingProvider(String value) {
                this.shippingProvider = value;
            }

            /**
             * Gets the value of the trackingNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTrackingNumber() {
                return trackingNumber;
            }

            /**
             * Sets the value of the trackingNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTrackingNumber(String value) {
                this.trackingNumber = value;
            }

        }

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
     *         &lt;element name="Warning" type="{http://uniware.unicommerce.com/services/}Warning" maxOccurs="unbounded"/&gt;
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
        "warning"
    })
    public static class Warnings {

        @XmlElement(name = "Warning", required = true)
        protected List<Warning> warning;

        /**
         * Gets the value of the warning property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the warning property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWarning().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Warning }
         * 
         * 
         */
        public List<Warning> getWarning() {
            if (warning == null) {
                warning = new ArrayList<Warning>();
            }
            return this.warning;
        }

    }

}
