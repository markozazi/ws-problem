//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.09 at 06:31:44 AM CEST 
//


package com.example.ws.gekon;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for MERGE_TIFFQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MERGE_TIFFQuery"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="documents" type="{urn:Gekon}InputSet" minOccurs="0"/&gt;
 *         &lt;element name="storage_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="appl_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MERGE_TIFFQuery", propOrder = {
    "documents",
    "storageType",
    "applId"
})
public class MERGETIFFQuery {

    @XmlElementRef(name = "documents", namespace = "urn:Gekon", type = JAXBElement.class, required = false)
    protected JAXBElement<InputSet> documents;
    @XmlElementRef(name = "storage_type", namespace = "urn:Gekon", type = JAXBElement.class, required = false)
    protected JAXBElement<String> storageType;
    @XmlElementRef(name = "appl_id", namespace = "urn:Gekon", type = JAXBElement.class, required = false)
    protected JAXBElement<String> applId;

    /**
     * Gets the value of the documents property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InputSet }{@code >}
     *     
     */
    public JAXBElement<InputSet> getDocuments() {
        return documents;
    }

    /**
     * Sets the value of the documents property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InputSet }{@code >}
     *     
     */
    public void setDocuments(JAXBElement<InputSet> value) {
        this.documents = value;
    }

    /**
     * Gets the value of the storageType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStorageType() {
        return storageType;
    }

    /**
     * Sets the value of the storageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStorageType(JAXBElement<String> value) {
        this.storageType = value;
    }

    /**
     * Gets the value of the applId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApplId() {
        return applId;
    }

    /**
     * Sets the value of the applId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApplId(JAXBElement<String> value) {
        this.applId = value;
    }

}
