package cibz.cHub.Scoreboard;

import cibz.cHub.Main.Main;
import cibz.ePerms.Main.Permission;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.ChatColor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Scoreboard implements Listener {

    public Map<Player, Scoreboard> scoreboards = new HashMap<Player, Scoreboard>();

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        ScoreUtils Utils = ScoreUtils.createScore(player);
        Utils.setTitle("&6&lZevon Network");
        Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(Main.plugin, new Runnable() {
            @Override
            public void run() {
                updateScoreboard(player);
            }
        }, 0L, 200L);
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        if(ScoreUtils.hasScore(player)) {
            ScoreUtils.removeScore(player);
        }
    }
    public static void updateScoreboard(Player player) {
        if(ScoreUtils.hasScore(player)) {
            ScoreUtils Utils = ScoreUtils.getByPlayer(player);
            ArrayList<String> list = new ArrayList<>();
            int onlineP = 0;
            for (final Player online : Bukkit.getServer().getOnlinePlayers()) {
                onlineP++;
            }
            String rank = Permission.getRank(player);
            String colors = Permission.getColor(rank);
            if(colors == null){
                colors = "&f";
            }
            ChatColor color = ChatColor.WHITE;

            if(colors.contains("&1")){
                color = ChatColor.DARK_BLUE;
            }
            if(colors.contains("&2")){
                color = ChatColor.DARK_GREEN;
            }
            if(colors.contains("&3")){
                color = ChatColor.DARK_AQUA;
            }
            if(colors.contains("&4")){
                color = ChatColor.DARK_RED;
            }
            if(colors.contains("&5")){
                color = ChatColor.DARK_PURPLE;
            }
            if(colors.contains("&6")){
                color = ChatColor.GOLD;
            }
            if(colors.contains("&7")){
                color = ChatColor.GRAY;
            }
            if(colors.contains("&8")){
                color = ChatColor.DARK_GRAY;
            }
            if(colors.contains("&9")){
                color = ChatColor.BLUE;
            }
            if(colors.contains("&a")){
                color = ChatColor.GREEN;
            }
            if(colors.contains("&b")){
                color = ChatColor.AQUA;
            }
            if(colors.contains("&c")){
                color = ChatColor.RED;
            }
            if(colors.contains("&d")){
                color = ChatColor.LIGHT_PURPLE;
            }
            if(colors.contains("&e")){
                color = ChatColor.YELLOW;
            }
            if(colors.contains("&f")){
                color = ChatColor.WHITE;
            }

            list.add("&7&l&m------------------");
            list.add("&6Players Online&7:");
            list.add(new StringBuilder().append("&7&l* &r").append(onlineP).toString() + "&7/&f1,000");
            list.add("");
            list.add("&6Rank&7: " + color + rank);
            list.add(" ");
            list.add("&7&ostore.zevon.cc");
            list.add("&7&l&m------------------");
            Utils.setSlotsFromList(list);
        }
    }
}
