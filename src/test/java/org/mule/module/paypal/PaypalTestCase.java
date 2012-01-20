/**
 * Mule Paypal Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

/**
 * This file was automatically generated by the Mule Cloud Connector Development Kit
 */
package org.mule.module.paypal;

import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import java.util.HashMap;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import ebay.api.paypalapi.AddressVerifyResponseType;
import ebay.api.paypalapi.DoAuthorizationResponseType;
import ebay.api.paypalapi.DoCaptureResponseType;
import ebay.api.paypalapi.DoReauthorizationResponseType;
import ebay.api.paypalapi.DoVoidResponseType;
import ebay.api.paypalapi.GetBalanceResponseType;
import ebay.apis.corecomponenttypes.BasicAmountType;
import ebay.apis.eblbasecomponents.CompleteCodeType;
import ebay.apis.eblbasecomponents.CountryCodeType;
import ebay.apis.eblbasecomponents.CreditCardDetailsType;
import ebay.apis.eblbasecomponents.CreditCardTypeType;
import ebay.apis.eblbasecomponents.MatchStatusCodeType;
import ebay.apis.eblbasecomponents.PaymentActionCodeType;
import ebay.apis.eblbasecomponents.PaymentDetailsType;
import ebay.apis.eblbasecomponents.TransactionEntityType;

public class PaypalTestCase
{
    private PaypalCloudConnector connector;
    private PaypalFacade facade;

    @Before
    public void before()
    {
        facade = Mockito.mock(PaypalFacade.class);
        connector = new PaypalCloudConnector();
        connector.setDefaultCurrency(CurrencyCode.USD);
        connector.setFacade(facade);
    }

    @Test
    public void getBalanceTest()
    {
        final GetBalanceResponseType ret = new GetBalanceResponseType();
        boolean returnAllCurrencies = Boolean.TRUE;
        Mockito.when(facade.getBalance(returnAllCurrencies)).thenReturn(ret);
        Assert.assertEquals(ret, connector.getBalance(returnAllCurrencies));
    }

    @Test
    public void addressVerifyTest()
    {
        final AddressVerifyResponseType ret = new AddressVerifyResponseType();
        final String email = "xxx@xxxxx.com";
        final String street = "Street";
        final String zip = "562";
        ret.setStreetMatch(MatchStatusCodeType.MATCHED);
        ret.setCountryCode(CountryCodeType.US);
        Mockito.when(facade.addressVerify(email, street, zip)).thenReturn(ret);
        Assert.assertEquals(ret, connector.addressVerify(email, street, zip));
    }

    @Test
    public void captureTest()
    {
        final String authorizationId = "111111";
        final Boolean complete = Boolean.TRUE;
        final String value = "150.25";
        final CurrencyCode currency = CurrencyCode.USN;
        final CompleteCodeType completeCode = CompleteCodeType.COMPLETE;
        final BasicAmountType amount = getAmount(value, currency);

        final DoCaptureResponseType ret = new DoCaptureResponseType();

        when(
            facade.capture(eq(authorizationId), eq(completeCode), refEq(amount), (String) isNull(),
                (String) isNull(), (String) isNull())).thenReturn(ret);

        Assert.assertEquals(ret,
            connector.capture(authorizationId, complete, value, currency, null, null, null));

    }

    @Test
    public void authorizeTest()
    {
        final String transactionId = "11111";
        final String value = "150.00";
        final BasicAmountType amount = getAmount(value, CurrencyCode.USD);

        final DoAuthorizationResponseType ret = new DoAuthorizationResponseType();
        ret.setAmount(amount);

        when(facade.authorize(eq(transactionId), refEq(amount), (TransactionEntityType) isNull())).thenReturn(
            ret);

        Assert.assertEquals(ret, connector.authorize(transactionId, value, null, null));
    }

    @Test
    public void reAuthorizeTest()
    {
        final String authorizationId = "11111";
        final String value = "150.00";
        final BasicAmountType amount = getAmount(value, CurrencyCode.USD);

        final DoReauthorizationResponseType ret = new DoReauthorizationResponseType();
        ret.setAuthorizationID(authorizationId);

        when(facade.reAuthorize(eq(authorizationId), refEq(amount))).thenReturn(ret);
        Assert.assertEquals(ret, connector.reAuthorize(authorizationId, value, null));
    }

    @Test
    public void doVoidTest()
    {
        final String authorizationId = "1111";
        final String note = "a note";

        final DoVoidResponseType ret = new DoVoidResponseType();
        ret.setAuthorizationID(authorizationId);

        when(facade.doVoid(eq(authorizationId), eq(note))).thenReturn(ret);
        Assert.assertEquals(ret, connector.doVoid(authorizationId, note));
    }
    
    @SuppressWarnings("serial")
    @Test
    public void doDirectPerformsMapToObjectConversions()
    {
        connector.doDirectPayment("127.0.0.1",   new HashMap<String, Object>() {{
            put("creditCardType", CreditCardTypeType.VISA);
            put("creditCardNumber", "4972116789019528");
            put("CVV2", "123");
            put("expMonth", 4);
            put("expYear", 2016);
        }}, new HashMap<String, Object>(), PaymentActionCode.ORDER, true);
        
        
        verify(facade).doDirectPayment(
            eq("127.0.0.1"), 
            refEq(new CreditCardDetailsType(){{
                setCreditCardType(CreditCardTypeType.VISA);
                setCreditCardNumber("4972116789019528");
                setCVV2("123");
                setExpMonth(4);
                setExpYear(2016);
            }}), 
            refEq(new PaymentDetailsType()), 
            eq(PaymentActionCodeType.ORDER), 
            eq(1));

    }

    private static BasicAmountType getAmount(final String amount, final CurrencyCode currency)
    {
        final BasicAmountType ret = new BasicAmountType();
        ret.setValue(amount);
        ret.setCurrencyID(currency.toPaypalType());
        return ret;
    }
}
