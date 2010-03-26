/**
 * Soap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce16.soap.partner;

public interface Soap extends java.rmi.Remote {

    /**
     * Login to the Salesforce.com SOAP Api
     */
    public com.sforce16.soap.partner.LoginResult login(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException, com.sforce16.soap.partner.fault.UnexpectedErrorFault, com.sforce16.soap.partner.fault.InvalidIdFault, com.sforce16.soap.partner.fault.LoginFault;

    /**
     * Describe an sObject
     */
    public com.sforce16.soap.partner.DescribeSObjectResult describeSObject(java.lang.String sObjectType) throws java.rmi.RemoteException, com.sforce16.soap.partner.fault.UnexpectedErrorFault, com.sforce16.soap.partner.fault.InvalidSObjectFault;

    /**
     * Describe a number sObjects
     */
    public com.sforce16.soap.partner.DescribeSObjectResult[] describeSObjects(java.lang.String[] sObjectType) throws java.rmi.RemoteException, com.sforce16.soap.partner.fault.UnexpectedErrorFault, com.sforce16.soap.partner.fault.InvalidSObjectFault;

    /**
     * Describe the Global state
     */
    public com.sforce16.soap.partner.DescribeGlobalResult describeGlobal() throws java.rmi.RemoteException, com.sforce16.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Describe the layout of an sObject
     */
    public com.sforce16.soap.partner.DescribeLayoutResult describeLayout(java.lang.String sObjectType, java.lang.String[] recordTypeIds) throws java.rmi.RemoteException, com.sforce16.soap.partner.fault.UnexpectedErrorFault, com.sforce16.soap.partner.fault.InvalidSObjectFault, com.sforce16.soap.partner.fault.InvalidIdFault;

    /**
     * Describe the layout of the SoftPhone
     */
    public com.sforce16.soap.partner.DescribeSoftphoneLayoutResult describeSoftphoneLayout() throws java.rmi.RemoteException, com.sforce16.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Describe the tabs that appear on a users page
     */
    public com.sforce16.soap.partner.DescribeTabSetResult[] describeTabs() throws java.rmi.RemoteException, com.sforce16.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Create a set of new sObjects
     */
    public com.sforce16.soap.partner.SaveResult[] create(com.sforce16.soap.partner.sobject.SObject[] sObjects) throws java.rmi.RemoteException, com.sforce16.soap.partner.fault.UnexpectedErrorFault, com.sforce16.soap.partner.fault.InvalidSObjectFault, com.sforce16.soap.partner.fault.InvalidIdFault, com.sforce16.soap.partner.fault.InvalidFieldFault;

    /**
     * Update a set of sObjects
     */
    public com.sforce16.soap.partner.SaveResult[] update(com.sforce16.soap.partner.sobject.SObject[] sObjects) throws java.rmi.RemoteException, com.sforce16.soap.partner.fault.UnexpectedErrorFault, com.sforce16.soap.partner.fault.InvalidSObjectFault, com.sforce16.soap.partner.fault.InvalidIdFault, com.sforce16.soap.partner.fault.InvalidFieldFault;

    /**
     * Update or insert a set of sObjects based on object id
     */
    public com.sforce16.soap.partner.UpsertResult[] upsert(java.lang.String externalIDFieldName, com.sforce16.soap.partner.sobject.SObject[] sObjects) throws java.rmi.RemoteException, com.sforce16.soap.partner.fault.UnexpectedErrorFault, com.sforce16.soap.partner.fault.InvalidSObjectFault, com.sforce16.soap.partner.fault.InvalidIdFault, com.sforce16.soap.partner.fault.InvalidFieldFault;

    /**
     * Merge and update a set of sObjects based on object id
     */
    public com.sforce16.soap.partner.MergeResult[] merge(com.sforce16.soap.partner.MergeRequest[] request) throws java.rmi.RemoteException, com.sforce16.soap.partner.fault.UnexpectedErrorFault, com.sforce16.soap.partner.fault.InvalidSObjectFault, com.sforce16.soap.partner.fault.InvalidIdFault, com.sforce16.soap.partner.fault.InvalidFieldFault;

    /**
     * Delete a set of sObjects
     */
    public com.sforce16.soap.partner.DeleteResult[] delete(java.lang.String[] ids) throws java.rmi.RemoteException, com.sforce16.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Undelete a set of sObjects
     */
    public com.sforce16.soap.partner.UndeleteResult[] undelete(java.lang.String[] ids) throws java.rmi.RemoteException, com.sforce16.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Empty a set of sObjects from the recycle bin
     */
    public com.sforce16.soap.partner.EmptyRecycleBinResult[] emptyRecycleBin(java.lang.String[] ids) throws java.rmi.RemoteException, com.sforce16.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Get a set of sObjects
     */
    public com.sforce16.soap.partner.sobject.SObject[] retrieve(java.lang.String fieldList, java.lang.String sObjectType, java.lang.String[] ids) throws java.rmi.RemoteException, com.sforce16.soap.partner.fault.UnexpectedErrorFault, com.sforce16.soap.partner.fault.InvalidSObjectFault, com.sforce16.soap.partner.fault.InvalidIdFault, com.sforce16.soap.partner.fault.MalformedQueryFault, com.sforce16.soap.partner.fault.InvalidFieldFault;

    /**
     * Submit an entity to a workflow process or process a workitem
     */
    public com.sforce16.soap.partner.ProcessResult[] process(com.sforce16.soap.partner.ProcessRequest[] actions) throws java.rmi.RemoteException, com.sforce16.soap.partner.fault.UnexpectedErrorFault, com.sforce16.soap.partner.fault.InvalidIdFault;

    /**
     * convert a set of leads
     */
    public com.sforce16.soap.partner.LeadConvertResult[] convertLead(com.sforce16.soap.partner.LeadConvert[] leadConverts) throws java.rmi.RemoteException, com.sforce16.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Logout the current user, invalidating the current session.
     */
    public void logout() throws java.rmi.RemoteException, com.sforce16.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Logs out and invalidates session ids
     */
    public com.sforce16.soap.partner.InvalidateSessionsResult[] invalidateSessions(java.lang.String[] sessionIds) throws java.rmi.RemoteException, com.sforce16.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Get the IDs for deleted sObjects
     */
    public com.sforce16.soap.partner.GetDeletedResult getDeleted(java.lang.String sObjectType, java.util.Calendar startDate, java.util.Calendar endDate) throws java.rmi.RemoteException, com.sforce16.soap.partner.fault.UnexpectedErrorFault, com.sforce16.soap.partner.fault.InvalidSObjectFault;

    /**
     * Get the IDs for updated sObjects
     */
    public com.sforce16.soap.partner.GetUpdatedResult getUpdated(java.lang.String sObjectType, java.util.Calendar startDate, java.util.Calendar endDate) throws java.rmi.RemoteException, com.sforce16.soap.partner.fault.UnexpectedErrorFault, com.sforce16.soap.partner.fault.InvalidSObjectFault;

    /**
     * Create a Query Cursor
     */
    public com.sforce16.soap.partner.QueryResult query(java.lang.String queryString) throws java.rmi.RemoteException, com.sforce16.soap.partner.fault.UnexpectedErrorFault, com.sforce16.soap.partner.fault.InvalidSObjectFault, com.sforce16.soap.partner.fault.InvalidIdFault, com.sforce16.soap.partner.fault.InvalidQueryLocatorFault, com.sforce16.soap.partner.fault.MalformedQueryFault, com.sforce16.soap.partner.fault.InvalidFieldFault;

    /**
     * Create a Query Cursor, including deleted sObjects
     */
    public com.sforce16.soap.partner.QueryResult queryAll(java.lang.String queryString) throws java.rmi.RemoteException, com.sforce16.soap.partner.fault.UnexpectedErrorFault, com.sforce16.soap.partner.fault.InvalidSObjectFault, com.sforce16.soap.partner.fault.InvalidIdFault, com.sforce16.soap.partner.fault.InvalidQueryLocatorFault, com.sforce16.soap.partner.fault.MalformedQueryFault, com.sforce16.soap.partner.fault.InvalidFieldFault;

    /**
     * Gets the next batch of sObjects from a query
     */
    public com.sforce16.soap.partner.QueryResult queryMore(java.lang.String queryLocator) throws java.rmi.RemoteException, com.sforce16.soap.partner.fault.UnexpectedErrorFault, com.sforce16.soap.partner.fault.InvalidQueryLocatorFault, com.sforce16.soap.partner.fault.InvalidFieldFault;

    /**
     * Search for sObjects
     */
    public com.sforce16.soap.partner.SearchResult search(java.lang.String searchString) throws java.rmi.RemoteException, com.sforce16.soap.partner.fault.MalformedSearchFault, com.sforce16.soap.partner.fault.UnexpectedErrorFault, com.sforce16.soap.partner.fault.InvalidSObjectFault, com.sforce16.soap.partner.fault.InvalidFieldFault;

    /**
     * Gets server timestamp
     */
    public com.sforce16.soap.partner.GetServerTimestampResult getServerTimestamp() throws java.rmi.RemoteException, com.sforce16.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Set a user's password
     */
    public com.sforce16.soap.partner.SetPasswordResult setPassword(java.lang.String userId, java.lang.String password) throws java.rmi.RemoteException, com.sforce16.soap.partner.fault.UnexpectedErrorFault, com.sforce16.soap.partner.fault.InvalidIdFault, com.sforce16.soap.partner.fault.InvalidNewPasswordFault;

    /**
     * Reset a user's password
     */
    public com.sforce16.soap.partner.ResetPasswordResult resetPassword(java.lang.String userId) throws java.rmi.RemoteException, com.sforce16.soap.partner.fault.UnexpectedErrorFault, com.sforce16.soap.partner.fault.InvalidIdFault;

    /**
     * Returns standard information relevant to the current user
     */
    public com.sforce16.soap.partner.GetUserInfoResult getUserInfo() throws java.rmi.RemoteException, com.sforce16.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Send outbound email
     */
    public com.sforce16.soap.partner.SendEmailResult[] sendEmail(com.sforce16.soap.partner.Email[] messages) throws java.rmi.RemoteException, com.sforce16.soap.partner.fault.UnexpectedErrorFault;
}
