package cibz.cHub.Commands;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


public class ServerCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;

        Inventory inv = Bukkit.createInventory(null, 9, "§6Server Selector");

        ItemStack selector = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta selectormeta = selector.getItemMeta();
        selectormeta.setDisplayName("§ePractice");
        selector.setItemMeta(selectormeta);
        
        inv.setItem(4, selector);
        p.openInventory(inv);
        return true;
    }
}
