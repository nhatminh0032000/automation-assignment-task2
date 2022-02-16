package com.demo.automation.EnvironmentManager;

public class Environment {

    private static Environment instance;

    private String url;

    private Environment()
    {

    }

    public static Environment getInstance()
    {
        if (instance ==  null)
        {
            instance = new Environment();
        }
        return instance;
    }

    public String getUrl(EnvironmentType type)
    {
        if (type == EnvironmentType.PRODUCTION)
        {
            url = "https://tamara.co/en/tamara-stores.html";
        }
        return url;
    }
}
