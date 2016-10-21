package com.source.showcase.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by aliyakgul on 21/10/16.
 */

//http://md5.jsontest.com/?text=text
public class ResponseModel {

    @SerializedName("X-Cloud-Trace-Context")
    @Expose
    public String context;

    @SerializedName("Upgrade-Insecure-Requests")
    @Expose
    public String requests;

    @SerializedName("Accept-Language")
    @Expose
    public String language;

    @SerializedName("Host")
    @Expose
    public String host;

    @SerializedName("Referer")
    @Expose
    public String referer;

    @SerializedName("User-Agent")
    @Expose
    public String agent;

    @SerializedName("Accept")
    @Expose
    public String accepts;

    @Override
    public String toString() {
        return "ResponseModel{" +
                "accepts='" + accepts + '\'' +
                ", context='" + context + '\'' +
                ", requests='" + requests + '\'' +
                ", language='" + language + '\'' +
                ", host='" + host + '\'' +
                ", referer='" + referer + '\'' +
                ", agent='" + agent + '\'' +
                '}';
    }
}
