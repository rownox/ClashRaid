package me.rownox.clashraid;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Clashraid extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("start").setExecutor(new Clashraid());

        saveDefaultConfig();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static Clashraid getInstance() {
        return (Clashraid) Bukkit.getServer().getPluginManager().getPlugin("Clashraid");
    }
}
