/*
 * MagicTelecomAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 on 06/22/2016
 */
package com.magictelecom.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class TokenForm 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5501234822748981460L;
    private Token token;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("token")
    public Token getToken ( ) { 
        return this.token;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("token")
    public void setToken (Token value) { 
        this.token = value;
        notifyObservers(this.token);
    }
 
}
 