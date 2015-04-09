package com.mastercard.api.partnerwallet.services;

import java.security.PrivateKey;
import java.util.Map;

import javax.xml.bind.JAXBElement;

import com.mastercard.api.common.Environment;
import com.mastercard.api.common.OAuthParameters;
import com.mastercard.api.partnerwallet.domain.all.AuthorizeCheckoutRequest;
import com.mastercard.api.partnerwallet.domain.all.AuthorizeCheckoutResponse;
import com.mastercard.api.partnerwallet.domain.all.ShippingAddressVerificationResponse;
import com.mastercard.api.partnerwallet.services.common.AbstractPartnerService;

public class CheckoutAuthorizationService extends AbstractPartnerService {

	
	public CheckoutAuthorizationService(Environment environment, String consumerKey, PrivateKey privateKey) {
		super(environment, consumerKey, privateKey);
		this.sandboxUrl = "https://sandbox.api.mastercard.com/masterpass/partner/v6/checkout";
		this.productionUrl = "https://api.mastercard.com/masterpass/partner/v6/checkout";
		this.mtfUrl = "https://api.mastercard.com/mtf/masterpass/partner/v6/checkout";
	}
	
	
	
	public AuthorizeCheckoutResponse getAuthorizeCheckoutResponse(AuthorizeCheckoutRequest request) {
		System.out.println(xmlToString(request));
		Map<String,String> responseMap = doRequest(getUrl(),POST,xmlToString(request));
        String response = responseMap.get(MESSAGE);
		System.out.println("Return object: " + response);
        return (AuthorizeCheckoutResponse) stringToXml(response,  AuthorizeCheckoutResponse.class);
	}
}
