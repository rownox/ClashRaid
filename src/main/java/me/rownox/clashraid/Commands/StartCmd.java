package me.rownox.clashraid.Commands;

import me.rownox.clashraid.Utils.WorldManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.UUID;

public class StartCmd implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player p) {
            if (args.length == 2) {
                if (args[0].equalsIgnoreCase("create")) {
                    String world = args[1];
                    WorldManager.cloneWorld(world, world + "_" + UUID.randomUUID());
                } else if (args[0].equalsIgnoreCase("delete")) {
                    String world = args[1];
                    WorldManager.deleteWorld(world);
                }
            }
        }
        return false;
    }
}
