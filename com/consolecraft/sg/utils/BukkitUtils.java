package com.consolecraft.sg.utils;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class BukkitUtils {

    public int getPlayers() {
        int players = 0;
        for (Player p : Bukkit.getOnlinePlayers()) {
            players++;
        }
        return players;
    }
}
