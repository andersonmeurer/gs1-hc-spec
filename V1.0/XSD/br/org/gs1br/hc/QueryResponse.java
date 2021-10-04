//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.10.04 at 03:23:26 PM BRT 
//


package br.org.gs1br.hc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sender" type="{http://hc.gs1br.org.br/}Partner"/>
 *         &lt;element name="mbrAgt" type="{http://hc.gs1br.org.br/}Partner" minOccurs="0"/>
 *         &lt;element name="receiver" type="{http://hc.gs1br.org.br/}Partner"/>
 *         &lt;element name="response" type="{http://hc.gs1br.org.br/}ResponseList" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="additionalInfo" type="{http://hc.gs1br.org.br/}infolist" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://hc.gs1br.org.br/}id" />
 *       &lt;attribute name="date" type="{http://hc.gs1br.org.br/}UtcOnlyDateTime" />
 *       &lt;attribute name="schemaVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sender",
    "mbrAgt",
    "receiver",
    "response",
    "additionalInfo"
})
@XmlRootElement(name = "QueryResponse")
public class QueryResponse {

    @XmlElement(required = true)
    protected Partner sender;
    protected Partner mbrAgt;
    @XmlElement(required = true)
    protected Partner receiver;
    protected List<ResponseList> response;
    @XmlElement(required = true)
    protected List<Infolist> additionalInfo;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "date")
    protected XMLGregorianCalendar date;
    @XmlAttribute(name = "schemaVersion")
    protected String schemaVersion;

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link Partner }
     *     
     */
    public Partner getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Partner }
     *     
     */
    public void setSender(Partner value) {
        this.sender = value;
    }

    /**
     * Gets the value of the mbrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link Partner }
     *     
     */
    public Partner getMbrAgt() {
        return mbrAgt;
    }

    /**
     * Sets the value of the mbrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Partner }
     *     
     */
    public void setMbrAgt(Partner value) {
        this.mbrAgt = value;
    }

    /**
     * Gets the value of the receiver property.
     * 
     * @return
     *     possible object is
     *     {@link Partner }
     *     
     */
    public Partner getReceiver() {
        return receiver;
    }

    /**
     * Sets the value of the receiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link Partner }
     *     
     */
    public void setReceiver(Partner value) {
        this.receiver = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the response property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseList }
     * 
     * 
     */
    public List<ResponseList> getResponse() {
        if (response == null) {
            response = new ArrayList<ResponseList>();
        }
        return this.response;
    }

    /**
     * Gets the value of the additionalInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Infolist }
     * 
     * 
     */
    public List<Infolist> getAdditionalInfo() {
        if (additionalInfo == null) {
            additionalInfo = new ArrayList<Infolist>();
        }
        return this.additionalInfo;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the schemaVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaVersion() {
        return schemaVersion;
    }

    /**
     * Sets the value of the schemaVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaVersion(String value) {
        this.schemaVersion = value;
    }

}
