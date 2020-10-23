package cibz.cHub.Main;

import cibz.cHub.Commands.*;
import cibz.cHub.Listeners.*;
import cibz.cHub.Scoreboard.Scoreboard;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static Main plugin;

    @Override
    public void onDisable() {
        saveConfig();
        saveDefaultConfig();
    }

    @Override
    public void onEnable() {
        plugin = this;

        //COMMANDS
        getCommand("Server").setExecutor(new ServerCommand());
        //LISTENERS
        getServer().getPluginManager().registerEvents(new TabListener(), this);
        getServer().getPluginManager().registerEvents(new EnderListener(), this);
        getServer().getPluginManager().registerEvents(new TeleportBowListener(), this);
        getServer().getPluginManager().registerEvents(new ConnectListener(), this);
        getServer().getPluginManager().registerEvents(new DisconnectListener(), this);
        getServer().getPluginManager().registerEvents(new ServerListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerListener(), this);
        getServer().getPluginManager().registerEvents(new ArmorListener(), this);
        getServer().getPluginManager().registerEvents(new Scoreboard(), this);
    }
}
