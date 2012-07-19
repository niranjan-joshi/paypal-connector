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

import ebay.apis.corecomponenttypes.AmountType;


/**
 * 
 * 	          The AdditionalAccount component represents historical data related to 
 * 	          accounts that the user held with a country of residency other than 
 * 	          the current one. eBay users can have one active account at a time. 
 * 	          For users who change their country of residency and modify their 
 * 	          eBay registration to reflect this change, the new country of residence 
 * 	          becomes the currently active account. Any account associated with 
 * 	          a previous country is treated as an additional account. Because the 
 * 	          currency for these additional accounts are different than the active 
 * 	          account, each additional account includes an indicator of the currency 
 * 	          for that account. Users who never change their country of residence 
 * 	          will not have any additional accounts.
 * 	        
 * 
 * <p>Java class for AdditionalAccountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalAccountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}Balance"/>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}Currency"/>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}AccountCode"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalAccountType", propOrder = {
    "balance",
    "currency",
    "accountCode"
})
public class AdditionalAccountType {

    @XmlElement(name = "Balance", required = true)
    protected AmountType balance;
    @XmlElement(name = "Currency", required = true)
    protected CurrencyCodeType currency;
    @XmlElement(name = "AccountCode", required = true)
    protected String accountCode;

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBalance(AmountType value) {
        this.balance = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType }
     *     
     */
    public CurrencyCodeType getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType }
     *     
     */
    public void setCurrency(CurrencyCodeType value) {
        this.currency = value;
    }

    /**
     * Gets the value of the accountCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountCode() {
        return accountCode;
    }

    /**
     * Sets the value of the accountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountCode(String value) {
        this.accountCode = value;
    }

}
