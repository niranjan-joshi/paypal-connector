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
 * <p>Java class for PaymentTransactionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentTransactionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="web-accept"/>
 *     &lt;enumeration value="cart"/>
 *     &lt;enumeration value="send-money"/>
 *     &lt;enumeration value="subscr-failed"/>
 *     &lt;enumeration value="subscr-cancel"/>
 *     &lt;enumeration value="subscr-payment"/>
 *     &lt;enumeration value="subscr-signup"/>
 *     &lt;enumeration value="subscr-eot"/>
 *     &lt;enumeration value="subscr-modify"/>
 *     &lt;enumeration value="mercht-pmt"/>
 *     &lt;enumeration value="mass-pay"/>
 *     &lt;enumeration value="virtual-terminal"/>
 *     &lt;enumeration value="integral-evolution"/>
 *     &lt;enumeration value="express-checkout"/>
 *     &lt;enumeration value="pro-hosted"/>
 *     &lt;enumeration value="pro-api"/>
 *     &lt;enumeration value="credit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentTransactionCodeType")
@XmlEnum
public enum PaymentTransactionCodeType {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("web-accept")
    WEB_ACCEPT("web-accept"),
    @XmlEnumValue("cart")
    CART("cart"),
    @XmlEnumValue("send-money")
    SEND_MONEY("send-money"),
    @XmlEnumValue("subscr-failed")
    SUBSCR_FAILED("subscr-failed"),
    @XmlEnumValue("subscr-cancel")
    SUBSCR_CANCEL("subscr-cancel"),
    @XmlEnumValue("subscr-payment")
    SUBSCR_PAYMENT("subscr-payment"),
    @XmlEnumValue("subscr-signup")
    SUBSCR_SIGNUP("subscr-signup"),
    @XmlEnumValue("subscr-eot")
    SUBSCR_EOT("subscr-eot"),
    @XmlEnumValue("subscr-modify")
    SUBSCR_MODIFY("subscr-modify"),
    @XmlEnumValue("mercht-pmt")
    MERCHT_PMT("mercht-pmt"),
    @XmlEnumValue("mass-pay")
    MASS_PAY("mass-pay"),
    @XmlEnumValue("virtual-terminal")
    VIRTUAL_TERMINAL("virtual-terminal"),
    @XmlEnumValue("integral-evolution")
    INTEGRAL_EVOLUTION("integral-evolution"),
    @XmlEnumValue("express-checkout")
    EXPRESS_CHECKOUT("express-checkout"),
    @XmlEnumValue("pro-hosted")
    PRO_HOSTED("pro-hosted"),
    @XmlEnumValue("pro-api")
    PRO_API("pro-api"),
    @XmlEnumValue("credit")
    CREDIT("credit");
    private final String value;

    PaymentTransactionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentTransactionCodeType fromValue(String v) {
        for (PaymentTransactionCodeType c: PaymentTransactionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
