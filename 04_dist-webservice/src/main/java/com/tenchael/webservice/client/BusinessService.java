
package com.tenchael.webservice.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "BusinessService", targetNamespace = "http://webservice.tenchael.com/client", wsdlLocation = "http://192.168.1.187:9527/BusinessService?wsdl")
public class BusinessService
    extends Service
{

    private final static URL BUSINESSSERVICE_WSDL_LOCATION;
    private final static WebServiceException BUSINESSSERVICE_EXCEPTION;
    private final static QName BUSINESSSERVICE_QNAME = new QName("http://webservice.tenchael.com/client", "BusinessService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.1.187:9527/BusinessService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BUSINESSSERVICE_WSDL_LOCATION = url;
        BUSINESSSERVICE_EXCEPTION = e;
    }

    public BusinessService() {
        super(__getWsdlLocation(), BUSINESSSERVICE_QNAME);
    }

    public BusinessService(WebServiceFeature... features) {
        super(__getWsdlLocation(), BUSINESSSERVICE_QNAME, features);
    }

    public BusinessService(URL wsdlLocation) {
        super(wsdlLocation, BUSINESSSERVICE_QNAME);
    }

    public BusinessService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BUSINESSSERVICE_QNAME, features);
    }

    public BusinessService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BusinessService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Business
     */
    @WebEndpoint(name = "BusinessPort")
    public Business getBusinessPort() {
        return super.getPort(new QName("http://webservice.tenchael.com/client", "BusinessPort"), Business.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Business
     */
    @WebEndpoint(name = "BusinessPort")
    public Business getBusinessPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice.tenchael.com/client", "BusinessPort"), Business.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BUSINESSSERVICE_EXCEPTION!= null) {
            throw BUSINESSSERVICE_EXCEPTION;
        }
        return BUSINESSSERVICE_WSDL_LOCATION;
    }

}
