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
 * <p>Java class for UserSelectedFundingSourceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserSelectedFundingSourceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ELV"/>
 *     &lt;enumeration value="CreditCard"/>
 *     &lt;enumeration value="ChinaUnionPay"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UserSelectedFundingSourceType")
@XmlEnum
public enum UserSelectedFundingSourceType {

    ELV("ELV"),
    @XmlEnumValue("CreditCard")
    CREDIT_CARD("CreditCard"),
    @XmlEnumValue("ChinaUnionPay")
    CHINA_UNION_PAY("ChinaUnionPay");
    private final String value;

    UserSelectedFundingSourceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserSelectedFundingSourceType fromValue(String v) {
        for (UserSelectedFundingSourceType c: UserSelectedFundingSourceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
