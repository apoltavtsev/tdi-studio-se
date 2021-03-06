/*
 * XML Type:  DistributeCampaignActivityRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.DistributeCampaignActivityRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML DistributeCampaignActivityRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface DistributeCampaignActivityRequest extends com.microsoft.schemas.crm._2007.webservices.Request
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DistributeCampaignActivityRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("distributecampaignactivityrequestdd5btype");
    
    /**
     * Gets the "CampaignActivityId" element
     */
    java.lang.String getCampaignActivityId();
    
    /**
     * Gets (as xml) the "CampaignActivityId" element
     */
    com.microsoft.wsdl.types.Guid xgetCampaignActivityId();
    
    /**
     * Sets the "CampaignActivityId" element
     */
    void setCampaignActivityId(java.lang.String campaignActivityId);
    
    /**
     * Sets (as xml) the "CampaignActivityId" element
     */
    void xsetCampaignActivityId(com.microsoft.wsdl.types.Guid campaignActivityId);
    
    /**
     * Gets the "Propagate" element
     */
    boolean getPropagate();
    
    /**
     * Gets (as xml) the "Propagate" element
     */
    org.apache.xmlbeans.XmlBoolean xgetPropagate();
    
    /**
     * Sets the "Propagate" element
     */
    void setPropagate(boolean propagate);
    
    /**
     * Sets (as xml) the "Propagate" element
     */
    void xsetPropagate(org.apache.xmlbeans.XmlBoolean propagate);
    
    /**
     * Gets the "Activity" element
     */
    com.microsoft.schemas.crm._2006.webservices.BusinessEntity getActivity();
    
    /**
     * Sets the "Activity" element
     */
    void setActivity(com.microsoft.schemas.crm._2006.webservices.BusinessEntity activity);
    
    /**
     * Appends and returns a new empty "Activity" element
     */
    com.microsoft.schemas.crm._2006.webservices.BusinessEntity addNewActivity();
    
    /**
     * Gets the "TemplateId" element
     */
    java.lang.String getTemplateId();
    
    /**
     * Gets (as xml) the "TemplateId" element
     */
    com.microsoft.wsdl.types.Guid xgetTemplateId();
    
    /**
     * Sets the "TemplateId" element
     */
    void setTemplateId(java.lang.String templateId);
    
    /**
     * Sets (as xml) the "TemplateId" element
     */
    void xsetTemplateId(com.microsoft.wsdl.types.Guid templateId);
    
    /**
     * Gets the "OwnershipOptions" element
     */
    com.microsoft.schemas.crm._2006.coretypes.PropagationOwnershipOptions.Enum getOwnershipOptions();
    
    /**
     * Gets (as xml) the "OwnershipOptions" element
     */
    com.microsoft.schemas.crm._2006.coretypes.PropagationOwnershipOptions xgetOwnershipOptions();
    
    /**
     * Sets the "OwnershipOptions" element
     */
    void setOwnershipOptions(com.microsoft.schemas.crm._2006.coretypes.PropagationOwnershipOptions.Enum ownershipOptions);
    
    /**
     * Sets (as xml) the "OwnershipOptions" element
     */
    void xsetOwnershipOptions(com.microsoft.schemas.crm._2006.coretypes.PropagationOwnershipOptions ownershipOptions);
    
    /**
     * Gets the "Owner" element
     */
    com.microsoft.schemas.crm._2006.coretypes.Moniker getOwner();
    
    /**
     * Sets the "Owner" element
     */
    void setOwner(com.microsoft.schemas.crm._2006.coretypes.Moniker owner);
    
    /**
     * Appends and returns a new empty "Owner" element
     */
    com.microsoft.schemas.crm._2006.coretypes.Moniker addNewOwner();
    
    /**
     * Gets the "SendEmail" element
     */
    boolean getSendEmail();
    
    /**
     * Gets (as xml) the "SendEmail" element
     */
    org.apache.xmlbeans.XmlBoolean xgetSendEmail();
    
    /**
     * Sets the "SendEmail" element
     */
    void setSendEmail(boolean sendEmail);
    
    /**
     * Sets (as xml) the "SendEmail" element
     */
    void xsetSendEmail(org.apache.xmlbeans.XmlBoolean sendEmail);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2007.webservices.DistributeCampaignActivityRequest newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.DistributeCampaignActivityRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.DistributeCampaignActivityRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.DistributeCampaignActivityRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.DistributeCampaignActivityRequest parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.DistributeCampaignActivityRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.DistributeCampaignActivityRequest parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.DistributeCampaignActivityRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.DistributeCampaignActivityRequest parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.DistributeCampaignActivityRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.DistributeCampaignActivityRequest parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.DistributeCampaignActivityRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.DistributeCampaignActivityRequest parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.DistributeCampaignActivityRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.DistributeCampaignActivityRequest parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.DistributeCampaignActivityRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.DistributeCampaignActivityRequest parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.DistributeCampaignActivityRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.DistributeCampaignActivityRequest parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.DistributeCampaignActivityRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.DistributeCampaignActivityRequest parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.DistributeCampaignActivityRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.DistributeCampaignActivityRequest parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.DistributeCampaignActivityRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.DistributeCampaignActivityRequest parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.DistributeCampaignActivityRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.DistributeCampaignActivityRequest parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.DistributeCampaignActivityRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.DistributeCampaignActivityRequest parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.DistributeCampaignActivityRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.DistributeCampaignActivityRequest parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.DistributeCampaignActivityRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.DistributeCampaignActivityRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.DistributeCampaignActivityRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.DistributeCampaignActivityRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.DistributeCampaignActivityRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
