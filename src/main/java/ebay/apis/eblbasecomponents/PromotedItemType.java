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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ebay.apis.corecomponenttypes.AmountType;


/**
 * 
 * 				Merchandizing info for an Item. This contains a list of crosssell
 * 				or upsell items.
 * 			
 * 
 * <p>Java class for PromotedItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromotedItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType"/>
 *         &lt;element name="PictureURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PromotionPrice" type="{urn:ebay:apis:CoreComponentTypes}AmountType" minOccurs="0"/>
 *         &lt;element name="PromotionPriceType" type="{urn:ebay:apis:eBLBaseComponents}PromotionItemPriceTypeCodeType" minOccurs="0"/>
 *         &lt;element name="SelectionType" type="{urn:ebay:apis:eBLBaseComponents}PromotionItemSelectionCodeType" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListingType" type="{urn:ebay:apis:eBLBaseComponents}ListingTypeCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotedItemType", propOrder = {
    "itemID",
    "pictureURL",
    "position",
    "promotionPrice",
    "promotionPriceType",
    "selectionType",
    "title",
    "listingType"
})
public class PromotedItemType {

    @XmlElement(name = "ItemID", required = true)
    protected String itemID;
    @XmlElement(name = "PictureURL")
    protected String pictureURL;
    protected Integer position;
    @XmlElement(name = "PromotionPrice")
    protected AmountType promotionPrice;
    @XmlElement(name = "PromotionPriceType")
    protected PromotionItemPriceTypeCodeType promotionPriceType;
    @XmlElement(name = "SelectionType")
    protected PromotionItemSelectionCodeType selectionType;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "ListingType")
    protected ListingTypeCodeType listingType;

    /**
     * Gets the value of the itemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemID() {
        return itemID;
    }

    /**
     * Sets the value of the itemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemID(String value) {
        this.itemID = value;
    }

    /**
     * Gets the value of the pictureURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPictureURL() {
        return pictureURL;
    }

    /**
     * Sets the value of the pictureURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPictureURL(String value) {
        this.pictureURL = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPosition(Integer value) {
        this.position = value;
    }

    /**
     * Gets the value of the promotionPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPromotionPrice() {
        return promotionPrice;
    }

    /**
     * Sets the value of the promotionPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPromotionPrice(AmountType value) {
        this.promotionPrice = value;
    }

    /**
     * Gets the value of the promotionPriceType property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionItemPriceTypeCodeType }
     *     
     */
    public PromotionItemPriceTypeCodeType getPromotionPriceType() {
        return promotionPriceType;
    }

    /**
     * Sets the value of the promotionPriceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionItemPriceTypeCodeType }
     *     
     */
    public void setPromotionPriceType(PromotionItemPriceTypeCodeType value) {
        this.promotionPriceType = value;
    }

    /**
     * Gets the value of the selectionType property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionItemSelectionCodeType }
     *     
     */
    public PromotionItemSelectionCodeType getSelectionType() {
        return selectionType;
    }

    /**
     * Sets the value of the selectionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionItemSelectionCodeType }
     *     
     */
    public void setSelectionType(PromotionItemSelectionCodeType value) {
        this.selectionType = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the listingType property.
     * 
     * @return
     *     possible object is
     *     {@link ListingTypeCodeType }
     *     
     */
    public ListingTypeCodeType getListingType() {
        return listingType;
    }

    /**
     * Sets the value of the listingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListingTypeCodeType }
     *     
     */
    public void setListingType(ListingTypeCodeType value) {
        this.listingType = value;
    }

}