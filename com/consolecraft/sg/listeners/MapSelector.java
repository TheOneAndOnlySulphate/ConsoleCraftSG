package com.consolecraft.sg.main

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scoreboard.*;

import com.consolecraft.sg.main.MainClass;

import java.util.HashMap;

public class MapSelector implements Listener {

    private static MainClass m = MainClass.get();

    public int disableScore1;
    public String map1name;
    public String map2name;
    public String map3name;
    public String map4name;
    public String map5name;
    public String map6name;
    public String map7name;
    public String map8name;
    public String map9name;
    public HashMap<String, Integer> map;

        public MapSelector(MainClass instance) {
            disableScore1 = 1;

            map1name = instance.getConfig().getString("maps.map1.name");
            map2name = instance.getConfig().getString("maps.map2.name");
            map3name = instance.getConfig().getString("maps.map3.name");
            map4name = instance.getConfig().getString("maps.map4.name");
            map5name = instance.getConfig().getString("maps.map5.name");
            map6name = instance.getConfig().getString("maps.map6.name");
            map7name = instance.getConfig().getString("maps.map7.name");
            map8name = instance.getConfig().getString("maps.map8.name");
            map9name = instance.getConfig().getString("maps.map9.name");

            map.put(map1name, 0);

            if (map2name != null){
                map.put(map2name, 0);

            }
            if (map3name != null){
                map.put(map3name, 0);

            }
            if (map4name != null){
                map.put(map4name, 0);

            }
            if (map5name != null){
                map.put(map5name, 0);

            }
            if (map6name != null){
                map.put(map6name, 0);

            }
            if (map7name != null){
                map.put(map7name, 0);

            }
            if (map8name != null){
                map.put(map8name, 0);

            }
            if (map9name != null){
                map.put(map9name, 0);

            }
        }

    private void openGUI(Player player){
        Inventory inv = Bukkit.createInventory(null, 9, "Map Selector");

        ItemStack map1 = new ItemStack(Material.EMPTY_MAP);
        ItemMeta map1meta = map1.getItemMeta();
        map1meta.setDisplayName(ChatColor.GREEN+map1name);
        map1.setItemMeta(map1meta);
        inv.setItem(0, map1);

        if (map.size()>1){
            ItemStack map2 = new ItemStack(Material.EMPTY_MAP);
            ItemMeta map2meta = map2.getItemMeta();
            map2meta.setDisplayName(ChatColor.GREEN+map2name);
            map2.setItemMeta(map2meta);
            inv.setItem(1, map2);

        }

        if (map.size()>2){
            ItemStack map3 = new ItemStack(Material.EMPTY_MAP);
            ItemMeta map3meta = map3.getItemMeta();
            map3meta.setDisplayName(ChatColor.GREEN+map3name);
            map3.setItemMeta(map3meta);
            inv.setItem(2, map3);

        }

        if (map.size()>3){
            ItemStack map4 = new ItemStack(Material.EMPTY_MAP);
            ItemMeta map4meta = map4.getItemMeta();
            map4meta.setDisplayName(ChatColor.GREEN+map4name);
            map4.setItemMeta(map4meta);
            inv.setItem(3, map4);

        }

        if (map.size()>4){
            ItemStack map5 = new ItemStack(Material.EMPTY_MAP);
            ItemMeta map5meta = map5.getItemMeta();
            map5meta.setDisplayName(ChatColor.GREEN+map5name);
            map5.setItemMeta(map5meta);
            inv.setItem(0, map5);

        }

        if (map.size()>5){
            ItemStack map6 = new ItemStack(Material.EMPTY_MAP);
            ItemMeta map6meta = map6.getItemMeta();
            map6meta.setDisplayName(ChatColor.GREEN+map6name);
            map6.setItemMeta(map6meta);
            inv.setItem(0, map6);

        }

        if (map.size()>6){
            ItemStack map7 = new ItemStack(Material.EMPTY_MAP);
            ItemMeta map7meta = map7.getItemMeta();
            map7meta.setDisplayName(ChatColor.GREEN+map7name);
            map7.setItemMeta(map7meta);
            inv.setItem(0, map7);

        }

        if (map.size()>7){
            ItemStack map8 = new ItemStack(Material.EMPTY_MAP);
            ItemMeta map8meta = map8.getItemMeta();
            map8meta.setDisplayName(ChatColor.GREEN+map8name);
            map8.setItemMeta(map8meta);
            inv.setItem(0, map8);

        }

        if (map.size()>8){
            ItemStack map9 = new ItemStack(Material.EMPTY_MAP);
            ItemMeta map9meta = map9.getItemMeta();
            map9meta.setDisplayName(ChatColor.GREEN+map9name);
            map9.setItemMeta(map9meta);
            inv.setItem(0, map9);
        }
        player.openInventory(inv);
    }
    
    @EventHandler
    public void onInventoryClick(InventoryClickEvent event){
        if(!event.getInventory().getName().equalsIgnoreCase("Map Selector"))
        {
            return;}

        Player player = (Player) event.getWhoClicked();
        event.setCancelled(true);
        if(event.getCurrentItem() == null || event.getCurrentItem().getType()==Material.AIR || event.getCurrentItem().hasItemMeta() ){
            player.closeInventory();
            return;


        }
        if (event.getCurrentItem().getItemMeta().getDisplayName() == ChatColor.GREEN + map1name){
            int map1v = map.get(map1name);
            map1v++;
            map.put(map1name, map1v);
            player.sendMessage(ChatColor.GREEN+"You voted for the map" + map1name);
            player.closeInventory();

        }
        if (event.getCurrentItem().getItemMeta().getDisplayName() == ChatColor.GREEN + map2name){
            int map2v = map.get(map2name);
            map2v++;
            map.put(map2name, map2v);
            player.sendMessage(ChatColor.GREEN+"You voted for the map" + map2name);
            player.closeInventory();

        }
        if (event.getCurrentItem().getItemMeta().getDisplayName() == ChatColor.GREEN + map3name){
            int map3v = map.get(map3name);
            map3v++;
            map.put(map3name, map3v);
            player.sendMessage(ChatColor.GREEN+"You voted for the map" + map3name);
            player.closeInventory();

        }
        if (event.getCurrentItem().getItemMeta().getDisplayName() == ChatColor.GREEN + map4name){
            int map4v = map.get(map4name);
            map4v++;
            map.put(map4name, map4v);
            player.sendMessage(ChatColor.GREEN+"You voted for the map" + map4name);
            player.closeInventory();

        }
        if (event.getCurrentItem().getItemMeta().getDisplayName() == ChatColor.GREEN + map5name){
            int map5v = map.get(map5name);
            map5v++;
            map.put(map5name, map5v);
            player.sendMessage(ChatColor.GREEN+"You voted for the map" + map5name);
            player.closeInventory();

        }
        if (event.getCurrentItem().getItemMeta().getDisplayName() == ChatColor.GREEN + map6name){
            int map6v = map.get(map6name);
            map6v++;
            map.put(map6name, map6v);
            player.sendMessage(ChatColor.GREEN+"You voted for the map" + map6name);
            player.closeInventory();

        }
        if (event.getCurrentItem().getItemMeta().getDisplayName() == ChatColor.GREEN + map7name){
            int map7v = map.get(map7name);
            map7v++;
            map.put(map7name, map7v);
            player.sendMessage(ChatColor.GREEN+"You voted for the map" + map7name);
            player.closeInventory();

        }
        if (event.getCurrentItem().getItemMeta().getDisplayName() == ChatColor.GREEN + map8name){
            int map8v = map.get(map8name);
            map8v++;
            map.put(map1name, map8v);
            player.sendMessage(ChatColor.GREEN+"You voted for the map" + map8name);
            player.closeInventory();

        }
        if (event.getCurrentItem().getItemMeta().getDisplayName() == ChatColor.GREEN + map9name){
            int map9v = map.get(map9name);
            map9v++;
            map.put(map9name, map9v);
            player.sendMessage(ChatColor.GREEN+"You voted for the map" + map9name);
            player.closeInventory();

        }

    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        event.getPlayer().getInventory().addItem(new ItemStack(Material.EMPTY_MAP));


        ScoreboardManager manager = Bukkit.getScoreboardManager();
        Scoreboard board = manager.getNewScoreboard();
        Objective obj = board.registerNewObjective("dummy", "info");
        obj.setDisplaySlot(DisplaySlot.SIDEBAR);
        obj.setDisplayName(ChatColor.GREEN+"VOTES:"+ChatColor.RESET);



        Score map1S = obj.getScore(Bukkit.getOfflinePlayer(ChatColor.GREEN.toString()+ChatColor.BOLD.toString()+map1name+ChatColor.RESET));
        map1S.setScore(map.get(map1name));

        if (map.size()>1){
            Score map2s = obj.getScore(Bukkit.getOfflinePlayer(ChatColor.GREEN.toString()+ChatColor.BOLD.toString()+map2name+ChatColor.RESET));
            map2s.setScore(map.get(map2name));

        }
        if (map.size()>2){
            Score map3s = obj.getScore(Bukkit.getOfflinePlayer(ChatColor.GREEN.toString()+ChatColor.BOLD.toString()+map3name+ChatColor.RESET));
            map3s.setScore(map.get(map3name));

        }
        if (map.size()>3){
            Score map4s = obj.getScore(Bukkit.getOfflinePlayer(ChatColor.GREEN.toString()+ChatColor.BOLD.toString()+map4name+ChatColor.RESET));
            map4s.setScore(map.get(map4name));

        }
        if (map.size()>4){
            Score map5s = obj.getScore(Bukkit.getOfflinePlayer(ChatColor.GREEN.toString()+ChatColor.BOLD.toString()+map5name+ChatColor.RESET));
            map5s.setScore(map.get(map5name));

        }
        if (map.size()>5){
            Score map6s = obj.getScore(Bukkit.getOfflinePlayer(ChatColor.GREEN.toString()+ChatColor.BOLD.toString()+map6name+ChatColor.RESET));
            map6s.setScore(map.get(map6name));

        }
        if (map.size()>6){
            Score map7s = obj.getScore(Bukkit.getOfflinePlayer(ChatColor.GREEN.toString()+ChatColor.BOLD.toString()+map7name+ChatColor.RESET));
            map7s.setScore(map.get(map7name));

        }
        if (map.size()>7){
            Score map8s = obj.getScore(Bukkit.getOfflinePlayer(ChatColor.GREEN.toString()+ChatColor.BOLD.toString()+map8name+ChatColor.RESET));
            map8s.setScore(map.get(map8name));

        }
        if (map.size()>8){
            Score map9s = obj.getScore(Bukkit.getOfflinePlayer(ChatColor.GREEN.toString()+ChatColor.BOLD.toString()+map9name+ChatColor.RESET));
            map9s.setScore(map.get(map9name));

        }

        event.getPlayer().setScoreboard(board);



    }


    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event){
        Action a = event.getAction();
        ItemStack is = event.getItem();

        if (a == Action.PHYSICAL || is == null || is.getType() == Material.AIR){
            return;

        }
        if (is.getType() == Material.EMPTY_MAP){
            openGUI(event.getPlayer());
        }
    }

    public void scoreboardloop(Player player){
        for (disableScore1 =1, disableScore1=0;; ){

            ScoreboardManager manager = Bukkit.getScoreboardManager();
            Scoreboard board = manager.getNewScoreboard();
            Objective obj = board.registerNewObjective("dummy", "info");
            obj.setDisplaySlot(DisplaySlot.SIDEBAR);
            obj.setDisplayName(ChatColor.GREEN+"VOTES:"+ChatColor.RESET);



            Score map1S = obj.getScore(Bukkit.getOfflinePlayer(ChatColor.GREEN.toString()+ChatColor.BOLD.toString()+map1name+ChatColor.RESET));
            map1S.setScore(map.get(map1name));

            if (map.size()>1){
                Score map2s = obj.getScore(Bukkit.getOfflinePlayer(ChatColor.GREEN.toString()+ChatColor.BOLD.toString()+map2name+ChatColor.RESET));
                map2s.setScore(map.get(map2name));

            }
            if (map.size()>2){
                Score map3s = obj.getScore(Bukkit.getOfflinePlayer(ChatColor.GREEN.toString()+ChatColor.BOLD.toString()+map3name+ChatColor.RESET));
                map3s.setScore(map.get(map3name));

            }
            if (map.size()>3){
                Score map4s = obj.getScore(Bukkit.getOfflinePlayer(ChatColor.GREEN.toString()+ChatColor.BOLD.toString()+map4name+ChatColor.RESET));
                map4s.setScore(map.get(map4name));

            }
            if (map.size()>4){
                Score map5s = obj.getScore(Bukkit.getOfflinePlayer(ChatColor.GREEN.toString()+ChatColor.BOLD.toString()+map5name+ChatColor.RESET));
                map5s.setScore(map.get(map5name));

            }
            if (map.size()>5){
                Score map6s = obj.getScore(Bukkit.getOfflinePlayer(ChatColor.GREEN.toString()+ChatColor.BOLD.toString()+map6name+ChatColor.RESET));
                map6s.setScore(map.get(map6name));

            }
            if (map.size()>6){
                Score map7s = obj.getScore(Bukkit.getOfflinePlayer(ChatColor.GREEN.toString()+ChatColor.BOLD.toString()+map7name+ChatColor.RESET));
                map7s.setScore(map.get(map7name));

            }
            if (map.size()>7){
                Score map8s = obj.getScore(Bukkit.getOfflinePlayer(ChatColor.GREEN.toString()+ChatColor.BOLD.toString()+map8name+ChatColor.RESET));
                map8s.setScore(map.get(map8name));

            }
            if (map.size()>8){
                Score map9s = obj.getScore(Bukkit.getOfflinePlayer(ChatColor.GREEN.toString()+ChatColor.BOLD.toString()+map9name+ChatColor.RESET));
                map9s.setScore(map.get(map9name));

            }
            player.setScoreboard(board);

        }

    }
}
