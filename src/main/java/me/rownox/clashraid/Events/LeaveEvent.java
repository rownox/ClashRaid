package me.rownox.clashraid.Events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class LeaveEvent implements Listener {

    public void onLeave(PlayerQuitEvent e) {
        Player p = e.getPlayer();
        String name = p.getName();

        Bukkit.broadcastMessage(name + " Left the game.");
    }
}
