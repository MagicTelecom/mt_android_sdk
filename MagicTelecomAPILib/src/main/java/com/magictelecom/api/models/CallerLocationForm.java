/*
 * MagicTelecomAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 on 06/22/2016
 */
package com.magictelecom.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CallerLocationForm 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5146188318862652931L;
    private CallerLocation callerLocation;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("caller_location")
    public CallerLocation getCallerLocation ( ) { 
        return this.callerLocation;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("caller_location")
    public void setCallerLocation (CallerLocation value) { 
        this.callerLocation = value;
        notifyObservers(this.callerLocation);
    }
 
}
 