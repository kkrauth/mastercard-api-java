//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.18 at 10:46:38 PM CST 
//


package com.mastercard.api.fraud.merchant.v1.domain;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcquirerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TransactionReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Merchant" type="{http://mastercard.com/termination}merchant_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "acquirerId",
    "transactionReferenceNumber",
    "merchant"
})
@XmlRootElement(name = "TerminationInquiryRequest")
public class TerminationInquiryRequest {

    @XmlElement(name = "AcquirerId", required = true)
    protected String acquirerId;
    @XmlElement(name = "TransactionReferenceNumber")
    protected String transactionReferenceNumber;
    @XmlElement(name = "Merchant", required = true)
    protected MerchantType merchant;

    /**
     * Gets the value of the acquirerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcquirerId() {
        return acquirerId;
    }

    /**
     * Sets the value of the acquirerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcquirerId(String value) {
        this.acquirerId = value;
    }

    /**
     * Gets the value of the transactionReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionReferenceNumber() {
        return transactionReferenceNumber;
    }

    /**
     * Sets the value of the transactionReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionReferenceNumber(String value) {
        this.transactionReferenceNumber = value;
    }

    /**
     * Gets the value of the merchant property.
     * 
     * @return
     *     possible object is
     *     {@link MerchantType }
     *     
     */
    public MerchantType getMerchant() {
        return merchant;
    }

    /**
     * Sets the value of the merchant property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantType }
     *     
     */
    public void setMerchant(MerchantType value) {
        this.merchant = value;
    }

}