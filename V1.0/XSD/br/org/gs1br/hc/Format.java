//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.10.04 at 03:23:26 PM BRT 
//


package br.org.gs1br.hc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for format.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="format">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SNCM"/>
 *     &lt;enumeration value="EPCIS"/>
 *     &lt;enumeration value="HC"/>
 *     &lt;enumeration value="eINVOICE"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "format")
@XmlEnum
public enum Format {

    SNCM("SNCM"),
    EPCIS("EPCIS"),
    HC("HC"),
    @XmlEnumValue("eINVOICE")
    E_INVOICE("eINVOICE"),
    OTHER("OTHER");
    private final String value;

    Format(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Format fromValue(String v) {
        for (Format c: Format.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
