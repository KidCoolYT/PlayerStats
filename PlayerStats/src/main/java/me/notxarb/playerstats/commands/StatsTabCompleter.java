package me.notxarb.playerstats.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.ArrayList;
import java.util.List;


public class StatsTabCompleter implements TabCompleter {

    List<String> arguments = new ArrayList<String>();

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {

        if (arguments.isEmpty()) {
            arguments.add("deaths");
            arguments.add("jumps");
            arguments.add("damage_dealt");
            arguments.add("logins");
            arguments.add("opened_chests");
            arguments.add("bell_rings");
            arguments.add("animals_bred");
            arguments.add("items_crafted");
            arguments.add("items_dropped");
            arguments.add("cake_eaten");
            arguments.add("leaves");
            arguments.add("players_killed");
            arguments.add("mobs_killed");
        }

        List<String> result = new ArrayList<String>();
        if (args.length == 1) {
            for (String a : arguments) {
                if (a.toLowerCase().startsWith(args[0].toLowerCase())) {
                    result.add(a);
                }
            }
            return result;
        }

        return null;
    }
}