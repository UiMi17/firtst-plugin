package net.mionex.firstplugin.customcommands;

import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class TeleportPointCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender,
                             @NotNull Command command,
                             @NotNull String s,
                             @NotNull String[] strings) {
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;
            if (strings.length == 1) {
                if (strings[0].equalsIgnoreCase("teleport")) {

                    player.teleport(new Location(player.getWorld(), 0D, player.getWorld().getHighestBlockYAt(0, 0), 0D));
                }
            } else {
                player.sendMessage(Color.RED +
                        "After /teleportPoint you should write if you want to setPoint or teleport");

            }
        }


        return false;
    }
}
