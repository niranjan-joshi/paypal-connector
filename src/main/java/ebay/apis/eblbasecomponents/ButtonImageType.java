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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ButtonImageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ButtonImageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="REG"/>
 *     &lt;enumeration value="SML"/>
 *     &lt;enumeration value="CC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ButtonImageType")
@XmlEnum
public enum ButtonImageType {


    /**
     *   button image type is REG
     * 
     */
    REG,

    /**
     *   button image type is SML
     * 
     */
    SML,

    /**
     *  button image type is CC
     * 
     */
    CC;

    public String value() {
        return name();
    }

    public static ButtonImageType fromValue(String v) {
        return valueOf(v);
    }

}
