package Singleton;

import Singleton.ConfigManager.ConfigManager;

public class Main {
    public static void main(String[] args) {
        ConfigManager manager = ConfigManager.getInstance();
        manager.set("name", "Mosh");

        ConfigManager other = ConfigManager.getInstance();
        System.out.println(other.get("name"));
    }
}
