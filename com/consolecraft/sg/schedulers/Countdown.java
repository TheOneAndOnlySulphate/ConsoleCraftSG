package com.consolecraft.sg.main;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scheduler.BukkitRunnable;

/**
 * Created by robin on 22/06/15.
 */
 
public class Countdown {

  MainClass m = MainClass.get();
  private int time = m.getConfig().getInt("countdowntime");
  private int settime = time;

     @EventHandler
     public void onPlayerJoin (final PlayerJoinEvent event){
        int playerstostartCount = plugin.getConfig().getInt("playerstostart");
        if(Bukkit.getServer().getOnlinePlayers().size() >= playerstostartCount ){

            new BukkitRunnable() {
                @Override
                public void run() {
                    if (time == 0) {
                        this.cancel();
                    else{
                        event.getPlayer().setLevel(time);
                        time--;}
                }
            }.runTaskTimer(plugin,0,20);
        }
    }
}
