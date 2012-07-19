/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */


package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuctionTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AuctionTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Chinese"/>
 *     &lt;enumeration value="Dutch"/>
 *     &lt;enumeration value="Live"/>
 *     &lt;enumeration value="Ad type"/>
 *     &lt;enumeration value="Stores Fixed-price"/>
 *     &lt;enumeration value="Personal Offer"/>
 *     &lt;enumeration value="Fixed Price Item"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AuctionTypeCodeType")
@XmlEnum
public enum AuctionTypeCodeType {


    /**
     * 
     * 						    Unknown auction type
     * 					
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * 
     * 						   Chinese auction
     * 					
     * 
     */
    @XmlEnumValue("Chinese")
    CHINESE("Chinese"),

    /**
     * 
     * 						   Dutch auction
     * 					
     * 
     */
    @XmlEnumValue("Dutch")
    DUTCH("Dutch"),

    /**
     * 
     * 						   Live Auctions-type auction						
     * 					
     * 
     */
    @XmlEnumValue("Live")
    LIVE("Live"),

    /**
     * 
     * 						   Ad type auction
     * 					
     * 
     */
    @XmlEnumValue("Ad type")
    AD_TYPE("Ad type"),

    /**
     * 
     * 						   Stores Fixed-price auction (US only)
     * 					
     * 
     */
    @XmlEnumValue("Stores Fixed-price")
    STORES_FIXED_PRICE("Stores Fixed-price"),

    /**
     * 
     * 						   Personal Offer auction 
     * 					
     * 
     */
    @XmlEnumValue("Personal Offer")
    PERSONAL_OFFER("Personal Offer"),

    /**
     * 
     * 						   Fixed Price item ("BIN only").
     * 					
     * 
     */
    @XmlEnumValue("Fixed Price Item")
    FIXED_PRICE_ITEM("Fixed Price Item"),

    /**
     * 
     * 						  Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    AuctionTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AuctionTypeCodeType fromValue(String v) {
        for (AuctionTypeCodeType c: AuctionTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
