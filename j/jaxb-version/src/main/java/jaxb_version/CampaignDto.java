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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Campaign complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Campaign"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://bird.kartaca.com/xmlschema/admin/delivery}DeliveryItem"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="campaignId" type="{http://bird.kartaca.com/xmlschema/admin/delivery}IntegerIdentifier"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Campaign", namespace = "http://bird.kartaca.com/xmlschema/admin/delivery", propOrder = {
    "campaignId"
})
public class CampaignDto
    extends DeliveryItemDto
{

    @XmlElement(namespace = "http://bird.kartaca.com/xmlschema/admin/delivery")
    protected long campaignId;

    /**
     * Gets the value of the campaignId property.
     * 
     */
    public long getCampaignId() {
        return campaignId;
    }

    /**
     * Sets the value of the campaignId property.
     * 
     */
    public void setCampaignId(long value) {
        this.campaignId = value;
    }

}
