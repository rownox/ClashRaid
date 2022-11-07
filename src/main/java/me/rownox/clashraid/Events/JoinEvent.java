package me.rownox.clashraid.Events;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEvent implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        String name = p.getName();
        Location loc = new Location(Bukkit.getWorld("spawn"), 0, 60, 0, 0, 0);

        p.teleport(loc);
        p.setFoodLevel(8);
        Bukkit.broadcastMessage(name + " Joined the game.");
    }
}
