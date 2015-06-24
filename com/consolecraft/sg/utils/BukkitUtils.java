package com.consolecraft.sg.utils;

public class BukkitUtils {

    public int getPlayers() {
        int players = 0;
        for (Player p : Bukkit.getOnlinePlayers()) {
            players++;
        }
        return players;
    }
}
