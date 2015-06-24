package com.consolecraft.sg.main;

import org.bukkit.Bukkit;
import com.consolecraft.sg.schedulers.Countdown;
import com.consolecraft.sg.listeners.MapSelector;
import org.bukkit.plugin.java.JavaPlugin;

public class MainClass extends JavaPlugin {
    
    private static MainClass plugin;
    private NewCountdown ncd = new NewCountdown();

    @Override
    public void onEnable() {
        plugin = this;
        Bukkit.getPluginManager().registerEvents(new MapSelector(this), this);
        ncd.runScheduler();
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
