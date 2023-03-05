package net.bonn2.bigdoorsphysics.versions;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Entity;

public interface VersionUtil {

    /**
     * Test if a VersionUtil will work in the loaded environment.
     * @return True if all checks pass, False if they fail.
     */
    boolean test();

    /**
     * Teleports an entity that has another entity riding it.
     * @param entity    The entity at the bottom of the stack.
     * @param passenger The entity on top of the stack.
     * @param location  The location to teleport the bottom entity.
     */
    void teleportWithPassenger(Entity entity, Entity passenger, Location location);

    static int getMajorVersion() {
        return Integer.parseInt(Bukkit.getServer().getMinecraftVersion().split("\\.")[1]);
    }
}
