/*
 * MagicTelecomAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 on 06/22/2016
 */
package com.magictelecom.api.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;

import com.magictelecom.api.http.client.HttpClient;
import com.magictelecom.api.http.client.HttpContext;
import com.magictelecom.api.http.request.HttpRequest;
import com.magictelecom.api.http.response.HttpResponse;
import com.magictelecom.api.http.response.HttpStringResponse;
import com.magictelecom.api.http.client.APICallBack;
import com.magictelecom.api.*;
import com.magictelecom.api.models.*;

public class UsersController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static UsersController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the UsersController class 
     */
    public static UsersController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new UsersController();
            }
        }
        return instance;
    }

    /**
     * Allow clients to test authentication.
     * @return	Returns the void response from the API call 
     */
    public void getAuthenticationsAsync(
                final APICallBack<LinkedHashMap<String, Object>> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/authentications");
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5034637857123663334L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
                    put( "X-Auth-Token", Configuration.getXAuthToken() );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest request = getClientInstance().get(queryUrl, headers, null);

        //invoke request and get response
        Runnable responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext context, HttpResponse response) {
                        try {
                            //Error handling using HTTP status codes
                            int responseCode = response.getStatusCode();
                            if (responseCode == 401)
                                throw new APIException("You are not authenticated", context);

                            else if (responseCode == 403)
                                throw new APIException("This action needs a valid WSSE header", context);

                            else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", context);

                            //handle errors defined at the API level
                            validateResponse(response, context);

                            //extract result from the http response
                            LinkedHashMap<String, Object> result = APIHelper.deserialize(((HttpStringResponse)response).getBody());

                            //let the caller know of the success
                            callBack.onSuccess(context, result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(context, exception);
                        }
                    }
                    public void onFailure(HttpContext context, Throwable error) {
                        //let the caller know of the failure
                        callBack.onFailure(context, error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(responseTask);
    }
        
}