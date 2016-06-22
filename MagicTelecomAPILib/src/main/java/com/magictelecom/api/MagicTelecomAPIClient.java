/*
 * MagicTelecomAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 on 06/22/2016
 */
package com.magictelecom.api;

import com.magictelecom.api.controllers.*;
import com.magictelecom.api.http.client.HttpClient;

public class MagicTelecomAPIClient {
    /**
     * Singleton access to Users controller
     * @return	Returns the UsersController instance 
     */
    public UsersController getUsers() {
        return UsersController.getInstance();
    }

    /**
     * Singleton access to Accounts controller
     * @return	Returns the AccountsController instance 
     */
    public AccountsController getAccounts() {
        return AccountsController.getInstance();
    }

    /**
     * Singleton access to Dids controller
     * @return	Returns the DidsController instance 
     */
    public DidsController getDids() {
        return DidsController.getInstance();
    }

    /**
     * Singleton access to DidsProducts controller
     * @return	Returns the DidsProductsController instance 
     */
    public DidsProductsController getDidsProducts() {
        return DidsProductsController.getInstance();
    }

    /**
     * Get the shared http client currently being used for API calls
     * @return The http client instance currently being used
     */
    public HttpClient getSharedHttpClient() {
        return BaseController.getClientInstance();
    }
    
    /**
     * Set a shared http client to be used for API calls
     * @param httpClient The http client to use
     */
    public void setSharedHttpClient(HttpClient httpClient) {
        BaseController.setClientInstance(httpClient);
    }

    /**
     * Default constructor 
     */     
    public MagicTelecomAPIClient() { }
}