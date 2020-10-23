package cibz.cHub.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class ArmorListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();

        //ARMOR
        if (p.hasPermission("zevon.top")) {
            ItemStack topH = new ItemStack(Material.LEATHER_HELMET);
            LeatherArmorMeta meta = (LeatherArmorMeta) topH.getItemMeta();
            meta.setColor(Color.ORANGE);
            meta.setDisplayName("§6f");
            topH.setItemMeta(meta);

            ItemStack topC = new ItemStack(Material.LEATHER_CHESTPLATE);
            LeatherArmorMeta metaC = (LeatherArmorMeta) topH.getItemMeta();
            metaC.setColor(Color.ORANGE);
            meta.setDisplayName("§6f");
            topC.setItemMeta(metaC);

            ItemStack topL = new ItemStack(Material.LEATHER_LEGGINGS);
            LeatherArmorMeta metaL = (LeatherArmorMeta) topH.getItemMeta();
            metaL.setColor(Color.ORANGE);
            meta.setDisplayName("§6f");
            topL.setItemMeta(metaL);

            ItemStack topB = new ItemStack(Material.LEATHER_BOOTS);
            LeatherArmorMeta metaB = (LeatherArmorMeta) topH.getItemMeta();
            metaB.setColor(Color.ORANGE);
            meta.setDisplayName("§6f");
            topB.setItemMeta(metaB);

            p.getInventory().setHelmet(topH);
            p.getInventory().setChestplate(topC);
            p.getInventory().setLeggings(topL);
            p.getInventory().setBoots(topB);
        }
        if (p.hasPermission("zevon.med")) {
            ItemStack medH = new ItemStack(Material.LEATHER_HELMET);
            LeatherArmorMeta meta = (LeatherArmorMeta) medH.getItemMeta();
            meta.setColor(Color.YELLOW);
            meta.setDisplayName("§ef");
            medH.setItemMeta(meta);

            ItemStack medC = new ItemStack(Material.LEATHER_CHESTPLATE);
            LeatherArmorMeta metaC = (LeatherArmorMeta) medH.getItemMeta();
            metaC.setColor(Color.YELLOW);
            meta.setDisplayName("§ef");
            medC.setItemMeta(metaC);

            ItemStack medL = new ItemStack(Material.LEATHER_LEGGINGS);
            LeatherArmorMeta metaL = (LeatherArmorMeta) medH.getItemMeta();
            metaL.setColor(Color.YELLOW);
            meta.setDisplayName("§ef");
            medL.setItemMeta(metaL);

            ItemStack medB = new ItemStack(Material.LEATHER_BOOTS);
            LeatherArmorMeta metaB = (LeatherArmorMeta) medH.getItemMeta();
            metaB.setColor(Color.YELLOW);
            meta.setDisplayName("§ef");
            medB.setItemMeta(metaB);

            p.getInventory().setHelmet(medH);
            p.getInventory().setChestplate(medC);
            p.getInventory().setLeggings(medL);
            p.getInventory().setBoots(medB);
        }
        if (p.hasPermission("zevon.bottom")) {
            ItemStack lowH = new ItemStack(Material.LEATHER_HELMET);
            LeatherArmorMeta meta = (LeatherArmorMeta) lowH.getItemMeta();
            meta.setColor(Color.GRAY);
            meta.setDisplayName("§8f");
            lowH.setItemMeta(meta);

            ItemStack lowC = new ItemStack(Material.LEATHER_CHESTPLATE);
            LeatherArmorMeta metaC = (LeatherArmorMeta) lowH.getItemMeta();
            metaC.setColor(Color.GRAY);
            meta.setDisplayName("§8f");
            lowC.setItemMeta(metaC);

            ItemStack lowL = new ItemStack(Material.LEATHER_LEGGINGS);
            LeatherArmorMeta metaL = (LeatherArmorMeta) lowH.getItemMeta();
            metaL.setColor(Color.GRAY);
            meta.setDisplayName("§8f");
            lowL.setItemMeta(metaL);

            ItemStack lowB = new ItemStack(Material.LEATHER_BOOTS);
            LeatherArmorMeta metaB = (LeatherArmorMeta) lowH.getItemMeta();
            metaB.setColor(Color.GRAY);
            meta.setDisplayName("§8f");
            lowB.setItemMeta(metaB);

            p.getInventory().setHelmet(lowH);
            p.getInventory().setChestplate(lowC);
            p.getInventory().setLeggings(lowL);
            p.getInventory().setBoots(lowB);
        }
    }
}

