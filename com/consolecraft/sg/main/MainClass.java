package com.consolecraft.sg.main;

import org.bukkit.Bukkit;
import com.consolecraft.sg.schedulers.Countdown;
import org.bukkit.plugin.java.JavaPlugin;

public class MainClass extends JavaPlugin {
    
    private static MainClass plugin;

    @Override
    public void onEnable() {
        plugin = this;
        Bukkit.getPluginManager().registerEvents(new mapChoose(), this);
        Bukkit.getPluginManager().registerEvents(new Countdown(), this);
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
