package cibz.cHub.Listeners;

import cibz.ePerms.Main.Permission;
import org.bukkit.*;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ConnectListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        p.getInventory().clear();
        String rank = Permission.getRank(p);
        String colors = Permission.getColor(rank);
        if (colors == null) {
            colors = "&f";
        }
        ChatColor color = ChatColor.WHITE;

        if (colors.contains("&1")) {
            color = ChatColor.DARK_BLUE;
        }
        if (colors.contains("&2")) {
            color = ChatColor.DARK_GREEN;
        }
        if (colors.contains("&3")) {
            color = ChatColor.DARK_AQUA;
        }
        if (colors.contains("&4")) {
            color = ChatColor.DARK_RED;
        }
        if (colors.contains("&5")) {
            color = ChatColor.DARK_PURPLE;
        }
        if (colors.contains("&6")) {
            color = ChatColor.GOLD;
        }
        if (colors.contains("&7")) {
            color = ChatColor.GRAY;
        }
        if (colors.contains("&8")) {
            color = ChatColor.DARK_GRAY;
        }
        if (colors.contains("&9")) {
            color = ChatColor.BLUE;
        }
        if (colors.contains("&a")) {
            color = ChatColor.GREEN;
        }
        if (colors.contains("&b")) {
            color = ChatColor.AQUA;
        }
        if (colors.contains("&c")) {
            color = ChatColor.RED;
        }
        if (colors.contains("&d")) {
            color = ChatColor.LIGHT_PURPLE;
        }
        if (colors.contains("&e")) {
            color = ChatColor.YELLOW;
        }
        if (colors.contains("&f")) {
            color = ChatColor.WHITE;
        }

        int onlineP = 0;
        for (final Player online : Bukkit.getServer().getOnlinePlayers()) {
            onlineP++;
        }
        p.sendMessage("§6§m--------------------------------------------------");
        p.sendMessage("§6§l                    Zevon Network");
        p.sendMessage("");
        p.sendMessage("  §eWelcome " + color + p.getName() + "§e to the §6§lZevon Network§e!");
        p.sendMessage(new StringBuilder().append("§f§l • §6Online: §r").append(onlineP).toString() + "§7/§f1,000");
        p.sendMessage("§f§l • §6Your Rank§7: " + color + rank);
        p.sendMessage("§f§l • §6Servers Online§7: §cCouldn't find any servers.");
        p.sendMessage("§6§m--------------------------------------------------");
        e.setJoinMessage("");

        //ITEMS
        ItemStack bow = new ItemStack(Material.BOW);
        bow.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 999);
        ItemMeta bowmeta = bow.getItemMeta();
        bowmeta.setDisplayName("§eTeleport Bow");
        bow.setItemMeta(bowmeta);

        ItemStack selector = new ItemStack(Material.COMPASS);
        ItemMeta selectormeta = selector.getItemMeta();
        selectormeta.setDisplayName("§6Server Selector");
        selector.setItemMeta(selectormeta);

        ItemStack epearl = new ItemStack(Material.ENDER_PEARL);
        ItemMeta epearlmeta = epearl.getItemMeta();
        epearlmeta.setDisplayName("§eEnderbutt");
        epearl.setItemMeta(epearlmeta);

        p.getInventory().setItem(0, bow);
        p.getInventory().setItem(4, selector);
        p.getInventory().setItem(8, epearl);
        p.getInventory().setItem(27, new ItemStack(Material.ARROW));
    }
}
