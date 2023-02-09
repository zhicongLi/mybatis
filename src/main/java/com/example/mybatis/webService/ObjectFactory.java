
package com.example.mybatis.webService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.mybatis.webService package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SyncTask_QNAME = new QName("http://ws.task.portal.core.platform.shinfotech.com/", "syncTask");
    private final static QName _SyncTaskResponse_QNAME = new QName("http://ws.task.portal.core.platform.shinfotech.com/", "syncTaskResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.mybatis.webService
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SyncTask }
     * 
     */
    public SyncTask createSyncTask() {
        return new SyncTask();
    }

    /**
     * Create an instance of {@link SyncTaskResponse }
     * 
     */
    public SyncTaskResponse createSyncTaskResponse() {
        return new SyncTaskResponse();
    }

    /**
     * Create an instance of {@link PortalTask }
     * 
     */
    public PortalTask createPortalTask() {
        return new PortalTask();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncTask }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.task.portal.core.platform.shinfotech.com/", name = "syncTask")
    public JAXBElement<SyncTask> createSyncTask(SyncTask value) {
        return new JAXBElement<SyncTask>(_SyncTask_QNAME, SyncTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncTaskResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.task.portal.core.platform.shinfotech.com/", name = "syncTaskResponse")
    public JAXBElement<SyncTaskResponse> createSyncTaskResponse(SyncTaskResponse value) {
        return new JAXBElement<SyncTaskResponse>(_SyncTaskResponse_QNAME, SyncTaskResponse.class, null, value);
    }

}
