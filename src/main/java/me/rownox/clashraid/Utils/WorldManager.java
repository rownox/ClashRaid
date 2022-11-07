package me.rownox.clashraid.Utils;

import org.apache.commons.io.FileUtils;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.WorldCreator;

import java.io.File;
import java.io.IOException;

public final class WorldManager {

    public static World cloneWorld(String name, String cloneName) {
        File origWorld = new File(Bukkit.getServer().getWorldContainer(), name);
        if (!origWorld.exists()) {
            Bukkit.getLogger().warning("World does not exist");
            return null;
        }
        File clonedWorld = new File(Bukkit.getServer().getWorldContainer(), cloneName);
        if (clonedWorld.exists()) {
            Bukkit.getLogger().warning("World already exists");
            return null;
        }
        try {
            FileUtils.copyDirectory(origWorld, clonedWorld); //copies the original world and puts it in the cloned world location
            for (File file : clonedWorld.listFiles()) {
                if (file.isFile()) {
                    if (file.getName().equalsIgnoreCase("uid.dat")) {
                        file.delete();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return Bukkit.getServer().createWorld(new WorldCreator(cloneName)); //recognizes the world from the file
    }

    public static void deleteWorld(String worldName) {
        World world = Bukkit.getWorld(worldName);
        File directory = new File(Bukkit.getServer().getWorldContainer(), worldName);
        Bukkit.unloadWorld(world, false);

        try {
            FileUtils.deleteDirectory(directory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}