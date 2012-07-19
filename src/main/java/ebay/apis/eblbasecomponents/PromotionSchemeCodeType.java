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

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PromotionSchemeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PromotionSchemeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ItemToItem"/>
 *     &lt;enumeration value="ItemToStoreCat"/>
 *     &lt;enumeration value="StoreToStoreCat"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PromotionSchemeCodeType")
@XmlEnum
public enum PromotionSchemeCodeType {


    /**
     * 
     * 						    Item to Item Promotional Scheme
     * 					
     * 
     */
    @XmlEnumValue("ItemToItem")
    ITEM_TO_ITEM("ItemToItem"),

    /**
     * 
     * 						  Item to Item Store Scheme
     * 					
     * 
     */
    @XmlEnumValue("ItemToStoreCat")
    ITEM_TO_STORE_CAT("ItemToStoreCat"),

    /**
     * 
     * 						  Store to Store Scheme
     * 					
     * 
     */
    @XmlEnumValue("StoreToStoreCat")
    STORE_TO_STORE_CAT("StoreToStoreCat"),

    /**
     * 
     * 						  Reserved. Do not use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    PromotionSchemeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PromotionSchemeCodeType fromValue(String v) {
        for (PromotionSchemeCodeType c: PromotionSchemeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}