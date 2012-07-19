/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */


package ebay.apis.eblbasecomponents;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import ebay.apis.corecomponenttypes.BasicAmountType;


/**
 * <p>Java class for CreateMobilePaymentRequestDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateMobilePaymentRequestDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentType" type="{urn:ebay:apis:eBLBaseComponents}MobilePaymentCodeType"/>
 *         &lt;element name="PaymentAction" type="{urn:ebay:apis:eBLBaseComponents}PaymentActionCodeType"/>
 *         &lt;element name="SenderPhone" type="{urn:ebay:apis:eBLBaseComponents}PhoneNumberType"/>
 *         &lt;element name="RecipientType" type="{urn:ebay:apis:eBLBaseComponents}MobileRecipientCodeType"/>
 *         &lt;element name="RecipientEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecipientPhone" type="{urn:ebay:apis:eBLBaseComponents}PhoneNumberType" minOccurs="0"/>
 *         &lt;element name="ItemAmount" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType"/>
 *         &lt;element name="Tax" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType" minOccurs="0"/>
 *         &lt;element name="Shipping" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType" minOccurs="0"/>
 *         &lt;element name="ItemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SharePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ShareHomeAddress" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateMobilePaymentRequestDetailsType", propOrder = {
    "paymentType",
    "paymentAction",
    "senderPhone",
    "recipientType",
    "recipientEmail",
    "recipientPhone",
    "itemAmount",
    "tax",
    "shipping",
    "itemName",
    "itemNumber",
    "note",
    "customID",
    "sharePhoneNumber",
    "shareHomeAddress"
})
public class CreateMobilePaymentRequestDetailsType {

    @XmlElement(name = "PaymentType", required = true)
    protected MobilePaymentCodeType paymentType;
    @XmlElement(name = "PaymentAction", required = true)
    protected PaymentActionCodeType paymentAction;
    @XmlElement(name = "SenderPhone", required = true)
    protected PhoneNumberType senderPhone;
    @XmlElement(name = "RecipientType", required = true)
    protected MobileRecipientCodeType recipientType;
    @XmlElement(name = "RecipientEmail")
    protected String recipientEmail;
    @XmlElement(name = "RecipientPhone")
    protected PhoneNumberType recipientPhone;
    @XmlElement(name = "ItemAmount", required = true)
    protected BasicAmountType itemAmount;
    @XmlElement(name = "Tax")
    protected BasicAmountType tax;
    @XmlElement(name = "Shipping")
    protected BasicAmountType shipping;
    @XmlElement(name = "ItemName")
    protected String itemName;
    @XmlElement(name = "ItemNumber")
    protected String itemNumber;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "CustomID")
    protected String customID;
    @XmlElement(name = "SharePhoneNumber")
    protected BigInteger sharePhoneNumber;
    @XmlElement(name = "ShareHomeAddress")
    protected BigInteger shareHomeAddress;

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link MobilePaymentCodeType }
     *     
     */
    public MobilePaymentCodeType getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilePaymentCodeType }
     *     
     */
    public void setPaymentType(MobilePaymentCodeType value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the paymentAction property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentActionCodeType }
     *     
     */
    public PaymentActionCodeType getPaymentAction() {
        return paymentAction;
    }

    /**
     * Sets the value of the paymentAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentActionCodeType }
     *     
     */
    public void setPaymentAction(PaymentActionCodeType value) {
        this.paymentAction = value;
    }

    /**
     * Gets the value of the senderPhone property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneNumberType }
     *     
     */
    public PhoneNumberType getSenderPhone() {
        return senderPhone;
    }

    /**
     * Sets the value of the senderPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneNumberType }
     *     
     */
    public void setSenderPhone(PhoneNumberType value) {
        this.senderPhone = value;
    }

    /**
     * Gets the value of the recipientType property.
     * 
     * @return
     *     possible object is
     *     {@link MobileRecipientCodeType }
     *     
     */
    public MobileRecipientCodeType getRecipientType() {
        return recipientType;
    }

    /**
     * Sets the value of the recipientType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileRecipientCodeType }
     *     
     */
    public void setRecipientType(MobileRecipientCodeType value) {
        this.recipientType = value;
    }

    /**
     * Gets the value of the recipientEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientEmail() {
        return recipientEmail;
    }

    /**
     * Sets the value of the recipientEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientEmail(String value) {
        this.recipientEmail = value;
    }

    /**
     * Gets the value of the recipientPhone property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneNumberType }
     *     
     */
    public PhoneNumberType getRecipientPhone() {
        return recipientPhone;
    }

    /**
     * Sets the value of the recipientPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneNumberType }
     *     
     */
    public void setRecipientPhone(PhoneNumberType value) {
        this.recipientPhone = value;
    }

    /**
     * Gets the value of the itemAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BasicAmountType }
     *     
     */
    public BasicAmountType getItemAmount() {
        return itemAmount;
    }

    /**
     * Sets the value of the itemAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicAmountType }
     *     
     */
    public void setItemAmount(BasicAmountType value) {
        this.itemAmount = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link BasicAmountType }
     *     
     */
    public BasicAmountType getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicAmountType }
     *     
     */
    public void setTax(BasicAmountType value) {
        this.tax = value;
    }

    /**
     * Gets the value of the shipping property.
     * 
     * @return
     *     possible object is
     *     {@link BasicAmountType }
     *     
     */
    public BasicAmountType getShipping() {
        return shipping;
    }

    /**
     * Sets the value of the shipping property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicAmountType }
     *     
     */
    public void setShipping(BasicAmountType value) {
        this.shipping = value;
    }

    /**
     * Gets the value of the itemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Sets the value of the itemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemName(String value) {
        this.itemName = value;
    }

    /**
     * Gets the value of the itemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemNumber() {
        return itemNumber;
    }

    /**
     * Sets the value of the itemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemNumber(String value) {
        this.itemNumber = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the customID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomID() {
        return customID;
    }

    /**
     * Sets the value of the customID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomID(String value) {
        this.customID = value;
    }

    /**
     * Gets the value of the sharePhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSharePhoneNumber() {
        return sharePhoneNumber;
    }

    /**
     * Sets the value of the sharePhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSharePhoneNumber(BigInteger value) {
        this.sharePhoneNumber = value;
    }

    /**
     * Gets the value of the shareHomeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getShareHomeAddress() {
        return shareHomeAddress;
    }

    /**
     * Sets the value of the shareHomeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setShareHomeAddress(BigInteger value) {
        this.shareHomeAddress = value;
    }

}
