/**
 * Mule Paypal Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package ebay.apis.eblbasecomponents;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				PaymentItemInfoType 
 * 				Information about a PayPal item.
 * 			
 * 
 * <p>Java class for PaymentItemInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentItemInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InvoiceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Custom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesTax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentItem" type="{urn:ebay:apis:eBLBaseComponents}PaymentItemType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Subscription" type="{urn:ebay:apis:eBLBaseComponents}SubscriptionInfoType" minOccurs="0"/>
 *         &lt;element name="Auction" type="{urn:ebay:apis:eBLBaseComponents}AuctionInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentItemInfoType", propOrder = {
    "invoiceID",
    "custom",
    "memo",
    "salesTax",
    "paymentItem",
    "subscription",
    "auction"
})
public class PaymentItemInfoType {

    @XmlElement(name = "InvoiceID")
    protected String invoiceID;
    @XmlElement(name = "Custom")
    protected String custom;
    @XmlElement(name = "Memo")
    protected String memo;
    @XmlElement(name = "SalesTax")
    protected String salesTax;
    @XmlElement(name = "PaymentItem")
    protected List<PaymentItemType> paymentItem;
    @XmlElement(name = "Subscription")
    protected SubscriptionInfoType subscription;
    @XmlElement(name = "Auction")
    protected AuctionInfoType auction;

    /**
     * Gets the value of the invoiceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceID() {
        return invoiceID;
    }

    /**
     * Sets the value of the invoiceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceID(String value) {
        this.invoiceID = value;
    }

    /**
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustom(String value) {
        this.custom = value;
    }

    /**
     * Gets the value of the memo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
    }

    /**
     * Gets the value of the salesTax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesTax() {
        return salesTax;
    }

    /**
     * Sets the value of the salesTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesTax(String value) {
        this.salesTax = value;
    }

    /**
     * Gets the value of the paymentItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentItemType }
     * 
     * 
     */
    public List<PaymentItemType> getPaymentItem() {
        if (paymentItem == null) {
            paymentItem = new ArrayList<PaymentItemType>();
        }
        return this.paymentItem;
    }

    /**
     * Gets the value of the subscription property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionInfoType }
     *     
     */
    public SubscriptionInfoType getSubscription() {
        return subscription;
    }

    /**
     * Sets the value of the subscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionInfoType }
     *     
     */
    public void setSubscription(SubscriptionInfoType value) {
        this.subscription = value;
    }

    /**
     * Gets the value of the auction property.
     * 
     * @return
     *     possible object is
     *     {@link AuctionInfoType }
     *     
     */
    public AuctionInfoType getAuction() {
        return auction;
    }

    /**
     * Sets the value of the auction property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuctionInfoType }
     *     
     */
    public void setAuction(AuctionInfoType value) {
        this.auction = value;
    }

}