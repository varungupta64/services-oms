package com.exclusively.unicommerce.service;

import java.io.IOException;
import java.math.BigDecimal;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Iterator;
import java.sql.Timestamp;
import java.util.Date;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.security.cert.X509Certificate;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import javax.xml.soap.Name;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFactory;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;

import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.SoapHeaderElement;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.ws.soap.saaj.SaajSoapMessage;
import org.springframework.xml.transform.StringSource;

import com.exclusively.oms.entities.Order;
import com.exclusively.oms.entities.Suborder;
import com.unicommerce.wsdl.Address;
import com.unicommerce.wsdl.AddressRef;
import com.unicommerce.wsdl.CreateSaleOrderRequest;
import com.unicommerce.wsdl.SaleOrder;
import com.unicommerce.wsdl.SaleOrderAddress;
import com.unicommerce.wsdl.SaleOrderAddress.Addresses;
import com.unicommerce.wsdl.SaleOrderItem;


public class SaleOrderClient extends WebServiceGatewaySupport{
	
	private static final String uri = "https://exclusively.unicommerce.com/services/soap/uniware16.wsdl?version=1.6"; //"http://requestb.in/14x2fvf1"; //  
	public String createSaleOrder(Order order,SaleOrder.SaleOrderItems SOI) throws NoSuchAlgorithmException, KeyManagementException
	{
		/*changes start*/
		/*
		 *  fix for
		 *    Exception in thread "main" javax.net.ssl.SSLHandshakeException:
		 *       sun.security.validator.ValidatorException:
		 *           PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException:
		 *               unable to find valid certification path to requested target
		 */
		/*TrustManager[] trustAllCerts = new TrustManager[] {mp(date.getTime()).toString());
							CreatedSOAPElement.addTextNode("");

						  }catch (SOAPException e) { 
		   new X509TrustManager() {
		      public java.security.cert.X509Certificate[] getAcceptedIssuers() {
		        return null;
		      }

		      public void checkClientTrusted(X509Certificate[] certs, String authType) {  }

		      public void checkServerTrusted(X509Certificate[] certs, String authType) {  }

			@Override
			public void checkClientTrusted(java.security.cert.X509Certificate[] arg0, String arg1)
					throws CertificateException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void checkServerTrusted(java.security.cert.X509Certificate[] arg0, String arg1)
					throws CertificateException {
				// TODO Auto-generated method stub
				
			}

		   }
		};

		SSLContext sc = SSLContext.getInstance("SSL");
		sc.init(null, trustAllCerts, new java.security.SecureRandom());
		HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

		// Create all-trusting host name verifier
		HostnameVerifier allHostsValid = new HostnameVerifier() {
		    public boolean verify(String hostname, SSLSession session) {
		      return true;
		    }
		};
		// Install the all-trusting host verifier
		HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);*/
		/*
		 * end of the fix
		 */
		/*changes end*/
		
		SaleOrder saleorder = new SaleOrder();
		saleorder = setSaleOrderObject(order,SOI);
		CreateSaleOrderRequest request = new CreateSaleOrderRequest();
		request.setSaleOrder(saleorder);
		
		try{
		
		JAXBElement jaxbelement = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive(uri, request, 
				new WebServiceMessageCallback()	{
					public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException 
			{
						  SaajSoapMessage saajSoapMessage = (SaajSoapMessage)message;
						  SOAPMessage soapMessage = saajSoapMessage.getSaajMessage();
						  SOAPPart soapPart = soapMessage.getSOAPPart();  
						  try {
							
							SOAPEnvelope soapEnvelope = soapPart.getEnvelope();
							SOAPBody soapBody = soapEnvelope.getBody();
							SOAPHeader soapHeader = soapEnvelope.getHeader();
							
							String msg = soapBody.getLocalName();							
							soapEnvelope.removeNamespaceDeclaration(soapEnvelope.getPrefix());					
							soapEnvelope.setPrefix("soapenv");
							soapHeader.setPrefix("soapenv");
							soapBody.setPrefix("ser");
							
							soapEnvelope.addNamespaceDeclaration("ser","http://uniware.unicommerce.com/services/");
							Name headerElementName = soapEnvelope.createName("Security","wsse",
					                    "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
							SOAPHeaderElement soapHeaderElement = soapHeader.addHeaderElement(headerElementName);
							soapHeaderElement.addNamespaceDeclaration("wsu","http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");
							soapHeaderElement.setMustUnderstand(true);
							
							SOAPElement usernameTokenSOAPElement = soapHeaderElement.addChildElement("UsernameToken","wsse").addAttribute(QName.valueOf("wsu:Id"),"UsernameToken-EF9408A24B65E1B26A14454250497141");
					
							SOAPElement userNameSOAPElement = usernameTokenSOAPElement.addChildElement("Username","wsse");					
								userNameSOAPElement.addTextNode("exclusively");
							
							SOAPElement passwordSOAPElement = usernameTokenSOAPElement.addChildElement("Password","wsse");
								passwordSOAPElement.setAttribute("Type","http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText");
								passwordSOAPElement.addTextNode("37985b05-e0da-4a5c-9b18-2a795f6e03d2");
							
							SOAPElement NonceSOAPElement = usernameTokenSOAPElement.addChildElement("Nonce","wsse");
								NonceSOAPElement.setAttribute("EncodingType","http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#Base64Binary");
								NonceSOAPElement.addTextNode("H8dHWiGKYpxEnwXvn/BO6A==");
							
								
							java.util.Date date= new java.util.Date();
							SOAPElement CreatedSOAPElement = usernameTokenSOAPElement.addChildElement("Created","wsu");
							//System.out.println(new Timestamp(date.getTime()).toString());
							CreatedSOAPElement.addTextNode(new Timestamp(date.getTime()).toString());

						  }catch (SOAPException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			}			
		});
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return "Pushed to Unicommerce";
	}
	
	public SaleOrder setSaleOrderObject(Order order,SaleOrder.SaleOrderItems SOI)
	{
		SaleOrder saleorder = new SaleOrder();
		Address BillingAdd = new Address();
		Address ShippingAdd = new Address();
		SaleOrder.Addresses addresses = new SaleOrder.Addresses();
		AddressRef billingAddRef = new AddressRef();
		AddressRef shippingAddRef = new AddressRef();
		
		BillingAdd.setId("1");
		BillingAdd.setName(order.getBillingName());
		BillingAdd.setAddressLine1(order.getBillingAddressLine1()); 
		BillingAdd.setCity(order.getBillingCity());
		BillingAdd.setState(order.getBillingState());
		BillingAdd.setCountry(order.getBillingCountry());
		BillingAdd.setPincode(order.getBillingPincode());
		BillingAdd.setPhone(order.getBillingPhone());
		BillingAdd.setEmail(order.getBillingEmail());
		
		ShippingAdd.setId("2");
		ShippingAdd.setName(order.getShippingName());
		ShippingAdd.setAddressLine1(order.getShippingAddressLine1());
		ShippingAdd.setCity(order.getShippingCity());
		ShippingAdd.setState(order.getShippingState());
		ShippingAdd.setCountry(order.getShippingCountry());
		ShippingAdd.setPincode(order.getShippingPincode());
		ShippingAdd.setPhone(order.getShippingPhone());
		ShippingAdd.setEmail(order.getShippingEmail());
		
		addresses.getAddress().add(ShippingAdd);
		addresses.getAddress().add(BillingAdd);
		
		
		billingAddRef.setRef("1");
		shippingAddRef.setRef("2");
		
		saleorder.setBillingAddress(billingAddRef);
		saleorder.setShippingAddress(shippingAddRef);
		saleorder.setCashOnDelivery(true);
		saleorder.setAddresses(addresses);
		saleorder.setChannel("Custom");
		saleorder.setCode(String.valueOf(order.getSuborders().get(0).getOrderId()));
		saleorder.setDisplayOrderCode(String.valueOf(order.getSuborders().get(0).getOrderId()));
		saleorder.setSaleOrderItems(SOI);
		
		return saleorder;
	}
}
