//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.20 at 10:09:09 PM CET 
//


package jaxb_version;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="targetedUserId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="campaignAlternatives" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="1000"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "targetedUserId",
    "campaignAlternatives"
})
@XmlRootElement(name = "pickEligibleCampaignRequest", namespace = "http://bird.kartaca.com/xmlschema/admin/delivery")
public class PickEligibleCampaignRequest {

    @XmlElement(namespace = "http://bird.kartaca.com/xmlschema/admin/delivery")
    protected long targetedUserId;
    @XmlElement(namespace = "http://bird.kartaca.com/xmlschema/admin/delivery", type = Long.class)
    protected List<Long> campaignAlternatives;

    /**
     * Gets the value of the targetedUserId property.
     * 
     */
    public long getTargetedUserId() {
        return targetedUserId;
    }

    /**
     * Sets the value of the targetedUserId property.
     * 
     */
    public void setTargetedUserId(long value) {
        this.targetedUserId = value;
    }

    /**
     * Gets the value of the campaignAlternatives property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the campaignAlternatives property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCampaignAlternatives().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getCampaignAlternatives() {
        if (campaignAlternatives == null) {
            campaignAlternatives = new ArrayList<Long>();
        }
        return this.campaignAlternatives;
    }

}
