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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DoDirectPaymentRequestDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DoDirectPaymentRequestDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentAction" type="{urn:ebay:apis:eBLBaseComponents}PaymentActionCodeType"/>
 *         &lt;element name="PaymentDetails" type="{urn:ebay:apis:eBLBaseComponents}PaymentDetailsType"/>
 *         &lt;element name="CreditCard" type="{urn:ebay:apis:eBLBaseComponents}CreditCardDetailsType"/>
 *         &lt;element name="IPAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MerchantSessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReturnFMFDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DoDirectPaymentRequestDetailsType", propOrder = {
    "paymentAction",
    "paymentDetails",
    "creditCard",
    "ipAddress",
    "merchantSessionId",
    "returnFMFDetails"
})
public class DoDirectPaymentRequestDetailsType {

    @XmlElement(name = "PaymentAction", required = true)
    protected PaymentActionCodeType paymentAction;
    @XmlElement(name = "PaymentDetails", required = true)
    protected PaymentDetailsType paymentDetails;
    @XmlElement(name = "CreditCard", required = true)
    protected CreditCardDetailsType creditCard;
    @XmlElement(name = "IPAddress", required = true)
    protected String ipAddress;
    @XmlElement(name = "MerchantSessionId")
    protected String merchantSessionId;
    @XmlElement(name = "ReturnFMFDetails")
    protected Boolean returnFMFDetails;

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
     * Gets the value of the paymentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDetailsType }
     *     
     */
    public PaymentDetailsType getPaymentDetails() {
        return paymentDetails;
    }

    /**
     * Sets the value of the paymentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDetailsType }
     *     
     */
    public void setPaymentDetails(PaymentDetailsType value) {
        this.paymentDetails = value;
    }

    /**
     * Gets the value of the creditCard property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardDetailsType }
     *     
     */
    public CreditCardDetailsType getCreditCard() {
        return creditCard;
    }

    /**
     * Sets the value of the creditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardDetailsType }
     *     
     */
    public void setCreditCard(CreditCardDetailsType value) {
        this.creditCard = value;
    }

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the merchantSessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantSessionId() {
        return merchantSessionId;
    }

    /**
     * Sets the value of the merchantSessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantSessionId(String value) {
        this.merchantSessionId = value;
    }

    /**
     * Gets the value of the returnFMFDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnFMFDetails() {
        return returnFMFDetails;
    }

    /**
     * Sets the value of the returnFMFDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnFMFDetails(Boolean value) {
        this.returnFMFDetails = value;
    }

}
