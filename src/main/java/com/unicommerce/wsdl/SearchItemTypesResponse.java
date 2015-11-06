//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.06 at 02:05:50 PM IST 
//


package com.unicommerce.wsdl;

import java.math.BigDecimal;
import java.math.BigInteger;
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
 *         &lt;element name="TotalRecords" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="ItemTypes"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ItemType" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="SKUCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Length" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="Color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Brand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                             &lt;element name="TaxTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="CategoryName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="CategoryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="CustomFields" type="{http://uniware.unicommerce.com/services/}CustomFields" minOccurs="0"/&gt;
 *                             &lt;element name="InventorySnapshots" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="InventorySnapshot" type="{http://uniware.unicommerce.com/services/}InventorySnapshot" maxOccurs="unbounded"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
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
    "totalRecords",
    "itemTypes"
})
@XmlRootElement(name = "SearchItemTypesResponse")
public class SearchItemTypesResponse {

    @XmlElement(name = "Successful")
    protected boolean successful;
    @XmlElement(name = "Errors")
    protected SearchItemTypesResponse.Errors errors;
    @XmlElement(name = "Warnings")
    protected SearchItemTypesResponse.Warnings warnings;
    @XmlElement(name = "TotalRecords")
    protected long totalRecords;
    @XmlElement(name = "ItemTypes", required = true)
    protected SearchItemTypesResponse.ItemTypes itemTypes;

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
     *     {@link SearchItemTypesResponse.Errors }
     *     
     */
    public SearchItemTypesResponse.Errors getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchItemTypesResponse.Errors }
     *     
     */
    public void setErrors(SearchItemTypesResponse.Errors value) {
        this.errors = value;
    }

    /**
     * Gets the value of the warnings property.
     * 
     * @return
     *     possible object is
     *     {@link SearchItemTypesResponse.Warnings }
     *     
     */
    public SearchItemTypesResponse.Warnings getWarnings() {
        return warnings;
    }

    /**
     * Sets the value of the warnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchItemTypesResponse.Warnings }
     *     
     */
    public void setWarnings(SearchItemTypesResponse.Warnings value) {
        this.warnings = value;
    }

    /**
     * Gets the value of the totalRecords property.
     * 
     */
    public long getTotalRecords() {
        return totalRecords;
    }

    /**
     * Sets the value of the totalRecords property.
     * 
     */
    public void setTotalRecords(long value) {
        this.totalRecords = value;
    }

    /**
     * Gets the value of the itemTypes property.
     * 
     * @return
     *     possible object is
     *     {@link SearchItemTypesResponse.ItemTypes }
     *     
     */
    public SearchItemTypesResponse.ItemTypes getItemTypes() {
        return itemTypes;
    }

    /**
     * Sets the value of the itemTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchItemTypesResponse.ItemTypes }
     *     
     */
    public void setItemTypes(SearchItemTypesResponse.ItemTypes value) {
        this.itemTypes = value;
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
     *         &lt;element name="ItemType" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="SKUCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Length" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="Color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Brand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                   &lt;element name="TaxTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="CategoryName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="CategoryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="CustomFields" type="{http://uniware.unicommerce.com/services/}CustomFields" minOccurs="0"/&gt;
     *                   &lt;element name="InventorySnapshots" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="InventorySnapshot" type="{http://uniware.unicommerce.com/services/}InventorySnapshot" maxOccurs="unbounded"/&gt;
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
        "itemType"
    })
    public static class ItemTypes {

        @XmlElement(name = "ItemType")
        protected List<SearchItemTypesResponse.ItemTypes.ItemType> itemType;

        /**
         * Gets the value of the itemType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itemType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItemType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SearchItemTypesResponse.ItemTypes.ItemType }
         * 
         * 
         */
        public List<SearchItemTypesResponse.ItemTypes.ItemType> getItemType() {
            if (itemType == null) {
                itemType = new ArrayList<SearchItemTypesResponse.ItemTypes.ItemType>();
            }
            return this.itemType;
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
         *         &lt;element name="SKUCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Length" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="Color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="Brand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *         &lt;element name="TaxTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="CategoryName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="CategoryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="CustomFields" type="{http://uniware.unicommerce.com/services/}CustomFields" minOccurs="0"/&gt;
         *         &lt;element name="InventorySnapshots" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="InventorySnapshot" type="{http://uniware.unicommerce.com/services/}InventorySnapshot" maxOccurs="unbounded"/&gt;
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
            "skuCode",
            "name",
            "description",
            "length",
            "width",
            "height",
            "weight",
            "color",
            "brand",
            "size",
            "price",
            "taxTypeCode",
            "categoryName",
            "categoryCode",
            "customFields",
            "inventorySnapshots"
        })
        public static class ItemType {

            @XmlElement(name = "SKUCode", required = true)
            protected String skuCode;
            @XmlElement(name = "Name", required = true)
            protected String name;
            @XmlElement(name = "Description", required = true)
            protected String description;
            @XmlElement(name = "Length", required = true)
            protected BigInteger length;
            @XmlElement(name = "Width", required = true)
            protected BigInteger width;
            @XmlElement(name = "Height", required = true)
            protected BigInteger height;
            @XmlElement(name = "Weight", required = true)
            protected BigInteger weight;
            @XmlElement(name = "Color")
            protected String color;
            @XmlElement(name = "Brand")
            protected String brand;
            @XmlElement(name = "Size")
            protected String size;
            @XmlElement(name = "Price", required = true)
            protected BigDecimal price;
            @XmlElement(name = "TaxTypeCode", required = true)
            protected String taxTypeCode;
            @XmlElement(name = "CategoryName", required = true)
            protected String categoryName;
            @XmlElement(name = "CategoryCode", required = true)
            protected String categoryCode;
            @XmlElement(name = "CustomFields")
            protected CustomFields customFields;
            @XmlElement(name = "InventorySnapshots")
            protected SearchItemTypesResponse.ItemTypes.ItemType.InventorySnapshots inventorySnapshots;

            /**
             * Gets the value of the skuCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSKUCode() {
                return skuCode;
            }

            /**
             * Sets the value of the skuCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSKUCode(String value) {
                this.skuCode = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the description property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescription() {
                return description;
            }

            /**
             * Sets the value of the description property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescription(String value) {
                this.description = value;
            }

            /**
             * Gets the value of the length property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getLength() {
                return length;
            }

            /**
             * Sets the value of the length property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setLength(BigInteger value) {
                this.length = value;
            }

            /**
             * Gets the value of the width property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getWidth() {
                return width;
            }

            /**
             * Sets the value of the width property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setWidth(BigInteger value) {
                this.width = value;
            }

            /**
             * Gets the value of the height property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getHeight() {
                return height;
            }

            /**
             * Sets the value of the height property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setHeight(BigInteger value) {
                this.height = value;
            }

            /**
             * Gets the value of the weight property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getWeight() {
                return weight;
            }

            /**
             * Sets the value of the weight property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setWeight(BigInteger value) {
                this.weight = value;
            }

            /**
             * Gets the value of the color property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getColor() {
                return color;
            }

            /**
             * Sets the value of the color property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setColor(String value) {
                this.color = value;
            }

            /**
             * Gets the value of the brand property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBrand() {
                return brand;
            }

            /**
             * Sets the value of the brand property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBrand(String value) {
                this.brand = value;
            }

            /**
             * Gets the value of the size property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSize() {
                return size;
            }

            /**
             * Sets the value of the size property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSize(String value) {
                this.size = value;
            }

            /**
             * Gets the value of the price property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPrice() {
                return price;
            }

            /**
             * Sets the value of the price property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPrice(BigDecimal value) {
                this.price = value;
            }

            /**
             * Gets the value of the taxTypeCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTaxTypeCode() {
                return taxTypeCode;
            }

            /**
             * Sets the value of the taxTypeCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTaxTypeCode(String value) {
                this.taxTypeCode = value;
            }

            /**
             * Gets the value of the categoryName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCategoryName() {
                return categoryName;
            }

            /**
             * Sets the value of the categoryName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCategoryName(String value) {
                this.categoryName = value;
            }

            /**
             * Gets the value of the categoryCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCategoryCode() {
                return categoryCode;
            }

            /**
             * Sets the value of the categoryCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCategoryCode(String value) {
                this.categoryCode = value;
            }

            /**
             * Gets the value of the customFields property.
             * 
             * @return
             *     possible object is
             *     {@link CustomFields }
             *     
             */
            public CustomFields getCustomFields() {
                return customFields;
            }

            /**
             * Sets the value of the customFields property.
             * 
             * @param value
             *     allowed object is
             *     {@link CustomFields }
             *     
             */
            public void setCustomFields(CustomFields value) {
                this.customFields = value;
            }

            /**
             * Gets the value of the inventorySnapshots property.
             * 
             * @return
             *     possible object is
             *     {@link SearchItemTypesResponse.ItemTypes.ItemType.InventorySnapshots }
             *     
             */
            public SearchItemTypesResponse.ItemTypes.ItemType.InventorySnapshots getInventorySnapshots() {
                return inventorySnapshots;
            }

            /**
             * Sets the value of the inventorySnapshots property.
             * 
             * @param value
             *     allowed object is
             *     {@link SearchItemTypesResponse.ItemTypes.ItemType.InventorySnapshots }
             *     
             */
            public void setInventorySnapshots(SearchItemTypesResponse.ItemTypes.ItemType.InventorySnapshots value) {
                this.inventorySnapshots = value;
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
             *         &lt;element name="InventorySnapshot" type="{http://uniware.unicommerce.com/services/}InventorySnapshot" maxOccurs="unbounded"/&gt;
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
                "inventorySnapshot"
            })
            public static class InventorySnapshots {

                @XmlElement(name = "InventorySnapshot", required = true)
                protected List<InventorySnapshot> inventorySnapshot;

                /**
                 * Gets the value of the inventorySnapshot property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the inventorySnapshot property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getInventorySnapshot().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link InventorySnapshot }
                 * 
                 * 
                 */
                public List<InventorySnapshot> getInventorySnapshot() {
                    if (inventorySnapshot == null) {
                        inventorySnapshot = new ArrayList<InventorySnapshot>();
                    }
                    return this.inventorySnapshot;
                }

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
