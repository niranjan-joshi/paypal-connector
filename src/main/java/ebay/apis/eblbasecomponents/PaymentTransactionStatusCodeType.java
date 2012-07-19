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
 * <p>Java class for PaymentTransactionStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentTransactionStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Pending"/>
 *     &lt;enumeration value="Processing"/>
 *     &lt;enumeration value="Success"/>
 *     &lt;enumeration value="Denied"/>
 *     &lt;enumeration value="Reversed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentTransactionStatusCodeType")
@XmlEnum
public enum PaymentTransactionStatusCodeType {

    @XmlEnumValue("Pending")
    PENDING("Pending"),
    @XmlEnumValue("Processing")
    PROCESSING("Processing"),
    @XmlEnumValue("Success")
    SUCCESS("Success"),
    @XmlEnumValue("Denied")
    DENIED("Denied"),
    @XmlEnumValue("Reversed")
    REVERSED("Reversed");
    private final String value;

    PaymentTransactionStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentTransactionStatusCodeType fromValue(String v) {
        for (PaymentTransactionStatusCodeType c: PaymentTransactionStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
