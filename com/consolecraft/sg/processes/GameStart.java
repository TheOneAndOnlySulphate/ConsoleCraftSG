package com.consolecraft.sg.processes;

//TODO: Add imports!

public class GameStart {
    
    BukkitUtils b = new BukkitUtils();
    
    public Location getSpawn1() {
        World w = Bukkit.getWorld(MainClass.get().getConfig().getString("world");
        double x = MainClass.get().getConfig().getDouble("spawn1x");
        double y = MainClass.get().getConfig().getDouble("spawn1y");
        double z = MainClass.get().getConfig().getDouble("spawn1z");
        Location spawn1 = new Location(w,x,y,z);
        return spawn1;
    }
    
    public Location getSpawn2() {
        World w = Bukkit.getWorld(MainClass.get().getConfig().getString("world");
        double x = MainClass.get().getConfig().getDouble("spawn2x");
        double y = MainClass.get().getConfig().getDouble("spawn2y");
        double z = MainClass.get().getConfig().getDouble("spawn2z");
        Location spawn2 = new Location(w,x,y,z);
        return spawn2;
    }
    
    public Location getSpawn3() {
        World w = Bukkit.getWorld(MainClass.get().getConfig().getString("world");
        double x = MainClass.get().getConfig().getDouble("spawn3x");
        double y = MainClass.get().getConfig().getDouble("spawn3y");
        double z = MainClass.get().getConfig().getDouble("spawn3z");
        Location spawn3 = new Location(w,x,y,z);
        return spawn3;
    }
    
    public void teleportPlayers() {
        int spawn = 1;
        for (Player p : Bukkit.getOnlinePlayers()) {
            if (spawn == 1) {
                p.teleport(spawn1);
                spawn++;
                continue;
            }
            else if (spawn == 2) {
                p.teleport(spawn2);
                spawn++;
                continue;
            }
            else if (spawn == 3) {
                p.teleport(spawn3);
                spawn++
            }
            else {
                p.teleport(spawn1);
            }
        }
    }
}
