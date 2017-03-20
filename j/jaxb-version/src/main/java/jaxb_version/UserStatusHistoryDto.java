//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.20 at 10:09:09 PM CET 
//


package jaxb_version;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserStatusHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserStatusHistory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="status" type="{http://bird.kartaca.com/xmlschema/admin/delivery}UserStatusForHistory"/&gt;
 *         &lt;element name="reason" type="{http://bird.kartaca.com/xmlschema/admin/common}UserStatusReasonEnum"/&gt;
 *         &lt;element name="description" type="{http://bird.kartaca.com/xmlschema/admin/common}NotEmptyText510"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserStatusHistory", namespace = "http://bird.kartaca.com/xmlschema/admin/delivery", propOrder = {
    "status",
    "reason",
    "description"
})
public class UserStatusHistoryDto {

    @XmlElement(namespace = "http://bird.kartaca.com/xmlschema/admin/delivery", required = true)
    @XmlSchemaType(name = "string")
    protected UserStatusForHistory status;
    @XmlElement(namespace = "http://bird.kartaca.com/xmlschema/admin/delivery", required = true)
    @XmlSchemaType(name = "string")
    protected UserStatusReasonEnum reason;
    @XmlElement(namespace = "http://bird.kartaca.com/xmlschema/admin/delivery", required = true)
    protected String description;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link UserStatusForHistory }
     *     
     */
    public UserStatusForHistory getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserStatusForHistory }
     *     
     */
    public void setStatus(UserStatusForHistory value) {
        this.status = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link UserStatusReasonEnum }
     *     
     */
    public UserStatusReasonEnum getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserStatusReasonEnum }
     *     
     */
    public void setReason(UserStatusReasonEnum value) {
        this.reason = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
