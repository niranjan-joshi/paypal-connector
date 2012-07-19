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
 * <p>Java class for FMFPendingTransactionActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FMFPendingTransactionActionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Accept"/>
 *     &lt;enumeration value="Deny"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FMFPendingTransactionActionType")
@XmlEnum
public enum FMFPendingTransactionActionType {

    @XmlEnumValue("Accept")
    ACCEPT("Accept"),
    @XmlEnumValue("Deny")
    DENY("Deny");
    private final String value;

    FMFPendingTransactionActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FMFPendingTransactionActionType fromValue(String v) {
        for (FMFPendingTransactionActionType c: FMFPendingTransactionActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
