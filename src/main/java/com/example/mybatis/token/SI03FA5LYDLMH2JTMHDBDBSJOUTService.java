
package com.example.mybatis.token;

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
@WebServiceClient(name = "SI_03FA5_LYDLMH2JTMHDB_DBSJ_OUTService", targetNamespace = "http://www.shenhuagroup.com.cn/MHDBXXJCXT", wsdlLocation = "file:/Users/admin/Desktop/ly/SI_03FA5_LYDLMH2JTMHDB_DBSJ_OUT.wsdl")
public class SI03FA5LYDLMH2JTMHDBDBSJOUTService
    extends Service
{

    private final static URL SI03FA5LYDLMH2JTMHDBDBSJOUTSERVICE_WSDL_LOCATION;
    private final static WebServiceException SI03FA5LYDLMH2JTMHDBDBSJOUTSERVICE_EXCEPTION;
    private final static QName SI03FA5LYDLMH2JTMHDBDBSJOUTSERVICE_QNAME = new QName("http://www.shenhuagroup.com.cn/MHDBXXJCXT", "SI_03FA5_LYDLMH2JTMHDB_DBSJ_OUTService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/Users/admin/Desktop/ly/SI_03FA5_LYDLMH2JTMHDB_DBSJ_OUT.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SI03FA5LYDLMH2JTMHDBDBSJOUTSERVICE_WSDL_LOCATION = url;
        SI03FA5LYDLMH2JTMHDBDBSJOUTSERVICE_EXCEPTION = e;
    }

    public SI03FA5LYDLMH2JTMHDBDBSJOUTService() {
        super(__getWsdlLocation(), SI03FA5LYDLMH2JTMHDBDBSJOUTSERVICE_QNAME);
    }

    public SI03FA5LYDLMH2JTMHDBDBSJOUTService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SI03FA5LYDLMH2JTMHDBDBSJOUTSERVICE_QNAME, features);
    }

    public SI03FA5LYDLMH2JTMHDBDBSJOUTService(URL wsdlLocation) {
        super(wsdlLocation, SI03FA5LYDLMH2JTMHDBDBSJOUTSERVICE_QNAME);
    }

    public SI03FA5LYDLMH2JTMHDBDBSJOUTService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SI03FA5LYDLMH2JTMHDBDBSJOUTSERVICE_QNAME, features);
    }

    public SI03FA5LYDLMH2JTMHDBDBSJOUTService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SI03FA5LYDLMH2JTMHDBDBSJOUTService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SI03FA5LYDLMH2JTMHDBDBSJOUT
     */
    @WebEndpoint(name = "SI_03FA5_LYDLMH2JTMHDB_DBSJ_OUTPort")
    public SI03FA5LYDLMH2JTMHDBDBSJOUT getSI03FA5LYDLMH2JTMHDBDBSJOUTPort() {
        return super.getPort(new QName("http://www.shenhuagroup.com.cn/MHDBXXJCXT", "SI_03FA5_LYDLMH2JTMHDB_DBSJ_OUTPort"), SI03FA5LYDLMH2JTMHDBDBSJOUT.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SI03FA5LYDLMH2JTMHDBDBSJOUT
     */
    @WebEndpoint(name = "SI_03FA5_LYDLMH2JTMHDB_DBSJ_OUTPort")
    public SI03FA5LYDLMH2JTMHDBDBSJOUT getSI03FA5LYDLMH2JTMHDBDBSJOUTPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.shenhuagroup.com.cn/MHDBXXJCXT", "SI_03FA5_LYDLMH2JTMHDB_DBSJ_OUTPort"), SI03FA5LYDLMH2JTMHDBDBSJOUT.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SI03FA5LYDLMH2JTMHDBDBSJOUTSERVICE_EXCEPTION!= null) {
            throw SI03FA5LYDLMH2JTMHDBDBSJOUTSERVICE_EXCEPTION;
        }
        return SI03FA5LYDLMH2JTMHDBDBSJOUTSERVICE_WSDL_LOCATION;
    }

}
