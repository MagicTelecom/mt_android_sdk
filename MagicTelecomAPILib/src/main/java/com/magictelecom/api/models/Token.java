/*
 * MagicTelecomAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 on 06/22/2016
 */
package com.magictelecom.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Token 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5510988968926997876L;
    private boolean isActive;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("is_active")
    public boolean getIsActive ( ) { 
        return this.isActive;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("is_active")
    public void setIsActive (boolean value) { 
        this.isActive = value;
        notifyObservers(this.isActive);
    }
 
}
 