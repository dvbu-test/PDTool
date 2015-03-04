
package com.compositesw.services.system.admin;

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
 * JAX-WS RI 2.2.1-b01-
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "archive", targetNamespace = "http://www.compositesw.com/services/system/admin", wsdlLocation = "file:/E:/dev/Workspaces/PDToolGitTest/PDTool/CISAdminApi/wsdl/CisAdminAPI.wsdl")
public class Archive
    extends Service
{

    private final static URL ARCHIVE_WSDL_LOCATION;
    private final static WebServiceException ARCHIVE_EXCEPTION;
    private final static QName ARCHIVE_QNAME = new QName("http://www.compositesw.com/services/system/admin", "archive");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/E:/dev/Workspaces/PDToolGitTest/PDTool/CISAdminApi/wsdl/CisAdminAPI.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ARCHIVE_WSDL_LOCATION = url;
        ARCHIVE_EXCEPTION = e;
    }

    public Archive() {
        super(__getWsdlLocation(), ARCHIVE_QNAME);
    }

    public Archive(WebServiceFeature... features) {
        super(__getWsdlLocation(), ARCHIVE_QNAME, features);
    }

    public Archive(URL wsdlLocation) {
        super(wsdlLocation, ARCHIVE_QNAME);
    }

    public Archive(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ARCHIVE_QNAME, features);
    }

    public Archive(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Archive(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ArchivePortType
     */
    @WebEndpoint(name = "archivePort")
    public ArchivePortType getArchivePort() {
        return super.getPort(new QName("http://www.compositesw.com/services/system/admin", "archivePort"), ArchivePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ArchivePortType
     */
    @WebEndpoint(name = "archivePort")
    public ArchivePortType getArchivePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.compositesw.com/services/system/admin", "archivePort"), ArchivePortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ARCHIVE_EXCEPTION!= null) {
            throw ARCHIVE_EXCEPTION;
        }
        return ARCHIVE_WSDL_LOCATION;
    }

}
