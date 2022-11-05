package me.rownox.clashraid;

import org.bukkit.plugin.java.JavaPlugin;

public final class Clashraid extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("start").setExecutor(new Clashraid());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
