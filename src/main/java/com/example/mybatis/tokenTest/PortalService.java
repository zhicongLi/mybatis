
package com.example.mybatis.tokenTest;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "PortalService", targetNamespace = "webservices.Portal.weaver.com.cn", wsdlLocation = "http://39.107.83.4:956/services/PortalService?wsdl")
public class PortalService
    extends Service
{

    private final static URL PORTALSERVICE_WSDL_LOCATION;
    private final static WebServiceException PORTALSERVICE_EXCEPTION;
    private final static QName PORTALSERVICE_QNAME = new QName("webservices.Portal.weaver.com.cn", "PortalService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://39.107.83.4:956/services/PortalService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PORTALSERVICE_WSDL_LOCATION = url;
        PORTALSERVICE_EXCEPTION = e;
    }

    public PortalService() {
        super(__getWsdlLocation(), PORTALSERVICE_QNAME);
    }

    public PortalService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PORTALSERVICE_QNAME, features);
    }

    public PortalService(URL wsdlLocation) {
        super(wsdlLocation, PORTALSERVICE_QNAME);
    }

    public PortalService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PORTALSERVICE_QNAME, features);
    }

    public PortalService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PortalService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PortalServicePortType
     */
    @WebEndpoint(name = "PortalServiceHttpPort")
    public PortalServicePortType getPortalServiceHttpPort() {
        return super.getPort(new QName("webservices.Portal.weaver.com.cn", "PortalServiceHttpPort"), PortalServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PortalServicePortType
     */
    @WebEndpoint(name = "PortalServiceHttpPort")
    public PortalServicePortType getPortalServiceHttpPort(WebServiceFeature... features) {
        return super.getPort(new QName("webservices.Portal.weaver.com.cn", "PortalServiceHttpPort"), PortalServicePortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PORTALSERVICE_EXCEPTION!= null) {
            throw PORTALSERVICE_EXCEPTION;
        }
        return PORTALSERVICE_WSDL_LOCATION;
    }

}
