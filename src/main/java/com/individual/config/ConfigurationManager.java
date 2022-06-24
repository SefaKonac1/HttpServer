package com.individual.config;

public class ConfigurationManager {
    
    private static Configuration currentConfiguration;
    private static ConfigurationManager configurationManager;

    private ConfigurationManager() {

    }

    public static ConfigurationManager getInstance() {
        if (configurationManager == null) {
            configurationManager = new ConfigurationManager();
        }
        return configurationManager;
    }

    /*
     * used to load conf file by path provided 
     */

    public void loadConfigurationFile(String filePath) {

    }

    /**
     * returns the current loaded configuration
     */
    public static Configuration getCurrentConfiguration() {
        return currentConfiguration;
    }

}
