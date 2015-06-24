package com.consolecraft.sg.schedulers;

//Written by Sulphate
//24.06.15
//12:38 GMT

import com.consolecraft.sg.main.MainClass;
import org.Bukkit;
//Written completely on GitHub, so I can't check for errors or needed imports :P

public class NewCountdown {

    MainClass m = MainClass.get();
    private int id = 0;
    private int time = m.getConfig().getInt("countdown-time");
    private int requiredplayers = m.getConfig().getInt("needed-players");
    private int time2 = time;
    private int players = 0;
    private int neededplayers = 0;

    public void runScheduler() {
    
        id = Bukkit.getScheduler().scheduleSyncRepeatingTask(m,new Runnable() {
            public void run() {
                neededplayers = 0;
                players = 0;
                for (Player p : Bukkit.getOnlinePlayers()) {
                    players++;
                    p.setLevel(time);
                    p.setExp(0);
                }
                neededplayers = requiredplayers - players;
                if (players > requiredplayers-1 && time % 10 == 0 || time == 3 || time == 2 || time == 1) {
                    Bukkit.broadcastMessage("§6>> §c" + time + " §eseconds until the game begins!");
                    time--;
                }
                else if (players == 0) {
                    time = time2;
                }
                else if (players < requiredplayers && time % 10 == 0 && players > 0) {
                    Bukkit.broadcastMessage("§6>> §c" + neededplayers + " §eplayers are needed to start the game!");
                    time = time2;
                }
                if (players > requiredplayers-1 && time == 0) {
                    //TODO: Start Game!
                }
            }
        },0L,20L);
    }
}
        
