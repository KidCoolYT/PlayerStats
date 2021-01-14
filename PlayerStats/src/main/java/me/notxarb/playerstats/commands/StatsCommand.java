package me.notxarb.playerstats.commands;

import org.bukkit.ChatColor;
import org.bukkit.Statistic;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class StatsCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage("You can't run this command");
            return true;
        } else {
            Player player = (Player) sender;

            if (player.hasPermission("mystats.use")) {
                if (args.length == 0) {
                    player.sendMessage(ChatColor.RED + "Invalid Usage - /mystats <Stat>");
                    return true;
                }
                if (args.length == 1) {
                    if (args[0].equalsIgnoreCase("deaths")) {
                        player.sendMessage(ChatColor.AQUA + "You have " + player.getStatistic(Statistic.DEATHS) + " Deaths");
                        return true;
                    }
                    if (args[0].equalsIgnoreCase("jumps")) {
                        player.sendMessage(ChatColor.AQUA + "You have " + player.getStatistic(Statistic.JUMP) + " Jumps");
                        return true;
                    }
                    if (args[0].equalsIgnoreCase("damage_dealt")) {
                        player.sendMessage(ChatColor.AQUA + "You have " + player.getStatistic(Statistic.DAMAGE_DEALT) + " Damage Dealt");
                        return true;
                    }
                    if (args[0].equalsIgnoreCase("leaves")) {
                        player.sendMessage(ChatColor.AQUA + "You have " + player.getStatistic(Statistic.LEAVE_GAME) + " Leaves");
                        return true;
                    }
                    if (args[0].equalsIgnoreCase("logins")) {
                        player.sendMessage(ChatColor.AQUA + "You have " + (player.getStatistic(Statistic.LEAVE_GAME) + 1) + " Logins");
                        return true;
                    }
                    if (args[0].equalsIgnoreCase("opened_chests")) {
                        player.sendMessage(ChatColor.AQUA + "You have " + player.getStatistic(Statistic.CHEST_OPENED) + " Opened Chests");
                        return true;
                    }
                    if (args[0].equalsIgnoreCase("bell_rings")) {
                        player.sendMessage(ChatColor.AQUA + "You have " + player.getStatistic(Statistic.BELL_RING) + " Bell Rings");
                        return true;
                    }
                    if (args[0].equalsIgnoreCase("animals_bred")) {
                        player.sendMessage(ChatColor.AQUA + "You have " + player.getStatistic(Statistic.ANIMALS_BRED) + " Animals Bred");
                        return true;
                    }
                    if (args[0].equalsIgnoreCase("items_crafted")) {
                        player.sendMessage(ChatColor.AQUA + "You have " + player.getStatistic(Statistic.CRAFT_ITEM) + " Items Crafted");
                        return true;
                    }
                    if (args[0].equalsIgnoreCase("cake_eaten")) {
                        player.sendMessage(ChatColor.RED + "You have eaten " + player.getStatistic(Statistic.CAKE_SLICES_EATEN) + " Cake Slices, get some help.");
                        return true;
                    }
                    if (args[0].equalsIgnoreCase("players_killed")) {
                        player.sendMessage(ChatColor.AQUA + "You have " + player.getStatistic(Statistic.PLAYER_KILLS) + " Players Killed");
                        return true;
                    }
                    if (args[0].equalsIgnoreCase("mobs_killed")) {
                        player.sendMessage(ChatColor.AQUA + "You have " + player.getStatistic(Statistic.MOB_KILLS) + " Mobs Killed");
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
