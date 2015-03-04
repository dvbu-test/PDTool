
package com.compositesw.services.system.admin;

import javax.xml.ws.WebFault;
import com.compositesw.services.system.util.common.Fault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.1-b01-
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "fault", targetNamespace = "http://www.compositesw.com/services/system/util/common")
public class GetIntrospectedResourceIdsResultSoapFault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private Fault faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public GetIntrospectedResourceIdsResultSoapFault(String message, Fault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public GetIntrospectedResourceIdsResultSoapFault(String message, Fault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.compositesw.services.system.util.common.Fault
     */
    public Fault getFaultInfo() {
        return faultInfo;
    }

}
