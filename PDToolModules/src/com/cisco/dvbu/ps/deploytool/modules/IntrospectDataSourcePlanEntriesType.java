//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-257 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.07 at 07:27:56 AM EDT 
//


package com.cisco.dvbu.ps.deploytool.modules;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			Introspect Data Source Plan Entry Type: Provides an iteration of detailed entries for introspection.
 * 		
 * 
 * <p>Java class for IntrospectDataSourcePlanEntriesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntrospectDataSourcePlanEntriesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="planEntry" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}IntrospectDataSourcePlanEntryType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntrospectDataSourcePlanEntriesType", propOrder = {
    "planEntry"
})
public class IntrospectDataSourcePlanEntriesType {

    protected IntrospectDataSourcePlanEntryType planEntry;

    /**
     * Gets the value of the planEntry property.
     * 
     * @return
     *     possible object is
     *     {@link IntrospectDataSourcePlanEntryType }
     *     
     */
    public IntrospectDataSourcePlanEntryType getPlanEntry() {
        return planEntry;
    }

    /**
     * Sets the value of the planEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntrospectDataSourcePlanEntryType }
     *     
     */
    public void setPlanEntry(IntrospectDataSourcePlanEntryType value) {
        this.planEntry = value;
    }

}
