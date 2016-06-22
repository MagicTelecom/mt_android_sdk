/*
 * MagicTelecomAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 on 06/22/2016
 */
package com.magictelecom.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Trunk 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5051531275577389309L;
    private Routing routing;
    private String description;
    private String sipEndPointUri;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("_routing")
    public Routing getRouting ( ) { 
        return this.routing;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("_routing")
    public void setRouting (Routing value) { 
        this.routing = value;
        notifyObservers(this.routing);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
        notifyObservers(this.description);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("sip_end_point_uri")
    public String getSipEndPointUri ( ) { 
        return this.sipEndPointUri;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("sip_end_point_uri")
    public void setSipEndPointUri (String value) { 
        this.sipEndPointUri = value;
        notifyObservers(this.sipEndPointUri);
    }
 
}
 