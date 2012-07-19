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
 *  
 * 			Contains the revise status information details (e.g., item properties 
 * 			information). ths node contains system set data only - always output and always all data. no minccurs needed,
 * 			except for motors specific data, since it wil lnot be retruned for non motors items
 *                 
 * 
 * <p>Java class for ReviseStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReviseStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemRevised" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="BuyItNowAdded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BuyItNowLowered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ReserveLowered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ReserveRemoved" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReviseStatusType", propOrder = {
    "itemRevised",
    "buyItNowAdded",
    "buyItNowLowered",
    "reserveLowered",
    "reserveRemoved"
})
public class ReviseStatusType {

    @XmlElement(name = "ItemRevised")
    protected boolean itemRevised;
    @XmlElement(name = "BuyItNowAdded")
    protected Boolean buyItNowAdded;
    @XmlElement(name = "BuyItNowLowered")
    protected Boolean buyItNowLowered;
    @XmlElement(name = "ReserveLowered")
    protected Boolean reserveLowered;
    @XmlElement(name = "ReserveRemoved")
    protected Boolean reserveRemoved;

    /**
     * Gets the value of the itemRevised property.
     * 
     */
    public boolean isItemRevised() {
        return itemRevised;
    }

    /**
     * Sets the value of the itemRevised property.
     * 
     */
    public void setItemRevised(boolean value) {
        this.itemRevised = value;
    }

    /**
     * Gets the value of the buyItNowAdded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBuyItNowAdded() {
        return buyItNowAdded;
    }

    /**
     * Sets the value of the buyItNowAdded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBuyItNowAdded(Boolean value) {
        this.buyItNowAdded = value;
    }

    /**
     * Gets the value of the buyItNowLowered property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBuyItNowLowered() {
        return buyItNowLowered;
    }

    /**
     * Sets the value of the buyItNowLowered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBuyItNowLowered(Boolean value) {
        this.buyItNowLowered = value;
    }

    /**
     * Gets the value of the reserveLowered property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReserveLowered() {
        return reserveLowered;
    }

    /**
     * Sets the value of the reserveLowered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReserveLowered(Boolean value) {
        this.reserveLowered = value;
    }

    /**
     * Gets the value of the reserveRemoved property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReserveRemoved() {
        return reserveRemoved;
    }

    /**
     * Sets the value of the reserveRemoved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReserveRemoved(Boolean value) {
        this.reserveRemoved = value;
    }

}
