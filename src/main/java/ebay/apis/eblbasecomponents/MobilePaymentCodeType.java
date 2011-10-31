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
 * <p>Java class for MobilePaymentCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MobilePaymentCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="P2P"/>
 *     &lt;enumeration value="HardGoods"/>
 *     &lt;enumeration value="Donation"/>
 *     &lt;enumeration value="TopUp"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MobilePaymentCodeType")
@XmlEnum
public enum MobilePaymentCodeType {

    @XmlEnumValue("P2P")
    P_2_P("P2P"),
    @XmlEnumValue("HardGoods")
    HARD_GOODS("HardGoods"),
    @XmlEnumValue("Donation")
    DONATION("Donation"),
    @XmlEnumValue("TopUp")
    TOP_UP("TopUp");
    private final String value;

    MobilePaymentCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MobilePaymentCodeType fromValue(String v) {
        for (MobilePaymentCodeType c: MobilePaymentCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
