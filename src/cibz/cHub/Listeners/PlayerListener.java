package cibz.cHub.Listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;

public class PlayerListener implements Listener {

    @EventHandler
    public void hunger(FoodLevelChangeEvent e){
        e.setCancelled(true);
    }

    @EventHandler
    public void fall(EntityDamageEvent e){
        if(e.getEntity() instanceof Player){
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void drop(PlayerDropItemEvent e){
        e.setCancelled(true);
    }

    @EventHandler
    public void pickup(PlayerPickupItemEvent e){
        e.setCancelled(true);
    }
}
