
package com.netsuite.webservices.platform;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.0
 * 2015-05-08T11:20:34.069+08:00
 * Generated source version: 3.1.0
 */

@WebFault(name = "insufficientPermissionFault", targetNamespace = "urn:faults_2014_2.platform.webservices.netsuite.com")
public class InsufficientPermissionFault extends Exception {
    
    private com.netsuite.webservices.platform.faults.InsufficientPermissionFault insufficientPermissionFault;

    public InsufficientPermissionFault() {
        super();
    }
    
    public InsufficientPermissionFault(String message) {
        super(message);
    }
    
    public InsufficientPermissionFault(String message, Throwable cause) {
        super(message, cause);
    }

    public InsufficientPermissionFault(String message, com.netsuite.webservices.platform.faults.InsufficientPermissionFault insufficientPermissionFault) {
        super(message);
        this.insufficientPermissionFault = insufficientPermissionFault;
    }

    public InsufficientPermissionFault(String message, com.netsuite.webservices.platform.faults.InsufficientPermissionFault insufficientPermissionFault, Throwable cause) {
        super(message, cause);
        this.insufficientPermissionFault = insufficientPermissionFault;
    }

    public com.netsuite.webservices.platform.faults.InsufficientPermissionFault getFaultInfo() {
        return this.insufficientPermissionFault;
    }
}