package cibz.cHub.Listeners;

import org.bukkit.Location;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

public class TeleportBowListener implements Listener {

    @EventHandler
    public void bow(ProjectileHitEvent e){
        if(e.getEntity() instanceof Arrow){
            Player p = (Player) e.getEntity().getShooter();
            Location l = e.getEntity().getLocation();
            p.teleport(l);
            p.sendMessage("§7swoosh!");
            e.getEntity().remove();
        }
    }
}
