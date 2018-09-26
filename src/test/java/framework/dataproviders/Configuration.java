package framework.dataproviders;


import aqa.properties.PropertiesResourceManager;

public class Configuration {
    private static Environment currentEnvironment;

    private Configuration() {
    }

    public static synchronized Environment getCurrentEnvironment() {
        if (currentEnvironment == null)
            currentEnvironment = Environment.valueOf((System.getProperty("stage") != null ? System.getProperty("stage")
                    : new PropertiesResourceManager("selenium.properties").getProperty("environment")).toUpperCase());

        //message

        return currentEnvironment;
    }

}
