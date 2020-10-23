package cibz.cHub.Listeners;

import cibz.ePerms.Main.Permission;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class TabListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();
        String rank = Permission.getRank(p);
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

        p.setPlayerListName(color + p.getName());
    }
}
