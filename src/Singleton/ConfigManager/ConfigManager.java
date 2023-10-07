package Singleton.ConfigManager;

import java.util.HashMap;
import java.util.Map;

/*
    * Singleton pattern: Ensure that a class has only a single instance.
    * The responsibility of this class is to create its own single instance.
 */
public class ConfigManager {
    //?Attributes:
    private Map<String,Object> settings = new HashMap<>(); //Map to store our application settings

    //* Holds the instance of our class. We make this instance static, so it can be accessible from outside of this class
    private static ConfigManager instance = new ConfigManager();

    //Constructor
    //* By making the constructor private, we cannot access from outside from this class
    private ConfigManager() {}

    //* Return the single instance
    public static ConfigManager getInstance() {
        return instance;
    }

    //? Getters and Setters for working with the HashMap
    public void set(String key, Object value){
        settings.put(key, value);
    }

    public Object get(String key){
        return settings.get(key);
    }
}
