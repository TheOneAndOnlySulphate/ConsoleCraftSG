package com.consolecraft.sg.main;


import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;



public class main extends JavaPlugin {

    @Override
    public void onEnable() {
       Bukkit.getPluginManager().registerEvents(new mapChoose(), this);
    saveDefaultConfig();
    }
    
    @Override
    public void onDisable() {
    }
}
