package com.consolecraft.sg.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
    
    private static MainClass plugin;

    @Override
    public void onEnable() {
        plugin = this;
       Bukkit.getPluginManager().registerEvents(new mapChoose(), this);
    saveDefaultConfig();
    }
    
    @Override
    public void onDisable() {
        plugin = null;
    }
    
    public MainClass get() {
        return plugin;
    }
    
}
