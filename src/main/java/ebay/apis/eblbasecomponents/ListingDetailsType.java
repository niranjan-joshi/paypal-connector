/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */


package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import ebay.apis.corecomponenttypes.AmountType;


/**
 *  
 * 			Contains the listed item details which consists of following information: .         
 *                 
 * 
 * <p>Java class for ListingDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListingDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Adult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BindingAuction" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CheckoutEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ConvertedBuyItNowPrice" type="{urn:ebay:apis:CoreComponentTypes}AmountType" minOccurs="0"/>
 *         &lt;element name="ConvertedStartPrice" type="{urn:ebay:apis:CoreComponentTypes}AmountType" minOccurs="0"/>
 *         &lt;element name="ConvertedReservePrice" type="{urn:ebay:apis:CoreComponentTypes}AmountType" minOccurs="0"/>
 *         &lt;element name="HasReservePrice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RegionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RelistedItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *         &lt;element name="SecondChanceOriginalItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ViewItemURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListingDetailsType", propOrder = {
    "adult",
    "bindingAuction",
    "checkoutEnabled",
    "convertedBuyItNowPrice",
    "convertedStartPrice",
    "convertedReservePrice",
    "hasReservePrice",
    "regionName",
    "relistedItemID",
    "secondChanceOriginalItemID",
    "startTime",
    "endTime",
    "viewItemURL"
})
public class ListingDetailsType {

    @XmlElement(name = "Adult")
    protected Boolean adult;
    @XmlElement(name = "BindingAuction")
    protected Boolean bindingAuction;
    @XmlElement(name = "CheckoutEnabled")
    protected Boolean checkoutEnabled;
    @XmlElement(name = "ConvertedBuyItNowPrice")
    protected AmountType convertedBuyItNowPrice;
    @XmlElement(name = "ConvertedStartPrice")
    protected AmountType convertedStartPrice;
    @XmlElement(name = "ConvertedReservePrice")
    protected AmountType convertedReservePrice;
    @XmlElement(name = "HasReservePrice")
    protected Boolean hasReservePrice;
    @XmlElement(name = "RegionName")
    protected String regionName;
    @XmlElement(name = "RelistedItemID")
    protected String relistedItemID;
    @XmlElement(name = "SecondChanceOriginalItemID")
    protected String secondChanceOriginalItemID;
    @XmlElement(name = "StartTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "EndTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    @XmlElement(name = "ViewItemURL")
    @XmlSchemaType(name = "anyURI")
    protected String viewItemURL;

    /**
     * Gets the value of the adult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdult() {
        return adult;
    }

    /**
     * Sets the value of the adult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdult(Boolean value) {
        this.adult = value;
    }

    /**
     * Gets the value of the bindingAuction property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBindingAuction() {
        return bindingAuction;
    }

    /**
     * Sets the value of the bindingAuction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBindingAuction(Boolean value) {
        this.bindingAuction = value;
    }

    /**
     * Gets the value of the checkoutEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckoutEnabled() {
        return checkoutEnabled;
    }

    /**
     * Sets the value of the checkoutEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckoutEnabled(Boolean value) {
        this.checkoutEnabled = value;
    }

    /**
     * Gets the value of the convertedBuyItNowPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getConvertedBuyItNowPrice() {
        return convertedBuyItNowPrice;
    }

    /**
     * Sets the value of the convertedBuyItNowPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setConvertedBuyItNowPrice(AmountType value) {
        this.convertedBuyItNowPrice = value;
    }

    /**
     * Gets the value of the convertedStartPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getConvertedStartPrice() {
        return convertedStartPrice;
    }

    /**
     * Sets the value of the convertedStartPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setConvertedStartPrice(AmountType value) {
        this.convertedStartPrice = value;
    }

    /**
     * Gets the value of the convertedReservePrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getConvertedReservePrice() {
        return convertedReservePrice;
    }

    /**
     * Sets the value of the convertedReservePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setConvertedReservePrice(AmountType value) {
        this.convertedReservePrice = value;
    }

    /**
     * Gets the value of the hasReservePrice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasReservePrice() {
        return hasReservePrice;
    }

    /**
     * Sets the value of the hasReservePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasReservePrice(Boolean value) {
        this.hasReservePrice = value;
    }

    /**
     * Gets the value of the regionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * Sets the value of the regionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionName(String value) {
        this.regionName = value;
    }

    /**
     * Gets the value of the relistedItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelistedItemID() {
        return relistedItemID;
    }

    /**
     * Sets the value of the relistedItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelistedItemID(String value) {
        this.relistedItemID = value;
    }

    /**
     * Gets the value of the secondChanceOriginalItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondChanceOriginalItemID() {
        return secondChanceOriginalItemID;
    }

    /**
     * Sets the value of the secondChanceOriginalItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondChanceOriginalItemID(String value) {
        this.secondChanceOriginalItemID = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the viewItemURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewItemURL() {
        return viewItemURL;
    }

    /**
     * Sets the value of the viewItemURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewItemURL(String value) {
        this.viewItemURL = value;
    }

}
