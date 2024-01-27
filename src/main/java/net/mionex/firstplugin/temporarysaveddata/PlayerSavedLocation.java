package net.mionex.firstplugin.temporarysaveddata;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public class PlayerSavedLocation {
    private Player player;
    private Location playerSavedLocation = null;

    public PlayerSavedLocation(Player player, Location playerSavedLocation) {
        this.player = player;
        this.playerSavedLocation = playerSavedLocation;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Location getPlayerSavedLocation() {
        return playerSavedLocation;
    }

    public void setPlayerSavedLocation(Location playerSavedLocation) {
        this.playerSavedLocation = playerSavedLocation;
    }
}
