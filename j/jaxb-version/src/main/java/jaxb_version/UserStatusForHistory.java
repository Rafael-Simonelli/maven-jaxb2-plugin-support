//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.20 at 10:09:09 PM CET 
//


package jaxb_version;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserStatusForHistory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserStatusForHistory"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;whiteSpace value="collapse"/&gt;
 *     &lt;enumeration value="REGISTERED"/&gt;
 *     &lt;enumeration value="BLOCKED"/&gt;
 *     &lt;enumeration value="UNDER_INSPECTION"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UserStatusForHistory", namespace = "http://bird.kartaca.com/xmlschema/admin/delivery")
@XmlEnum
public enum UserStatusForHistory {

    REGISTERED,
    BLOCKED,
    UNDER_INSPECTION;

    public String value() {
        return name();
    }

    public static UserStatusForHistory fromValue(String v) {
        return valueOf(v);
    }

}
