package com.individual.config;

/**
 * Configuration
 */
public class Configuration {

    private int port;
    private String webroot;

    public int getPort() {
        return this.port;
    }

    public String getWebRoot() {
        return this.webroot;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setWebRoot(String webroot) {
        this.webroot = webroot;
    }
    
}