package net.mionex.firstplugin;

import net.mionex.firstplugin.customcommands.HealCommand;
import net.mionex.firstplugin.customcommands.TeleportPointCommand;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class FirstPlugin extends JavaPlugin implements Listener {


    @Override
    public void onEnable() {
//        Bukkit.getPluginManager().registerEvents(this, this);
        getCommand("heal").setExecutor(new HealCommand());
        getCommand("teleportPoint").setExecutor(new TeleportPointCommand());
    }

//    @EventHandler
//    public void onPlayerMove(PlayerMoveEvent e){
//
//        if (e.getTo().getX() > 100 && e.getTo().getZ() > 100) {
//            e.setCancelled(true);
//            e.getPlayer().sendMessage(ChatColor.DARK_BLUE + "YOU are frozen");
//        }
//
//    }
}
