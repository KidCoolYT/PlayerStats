package me.notxarb.playerstats;

import me.notxarb.playerstats.commands.StatsCommand;
import me.notxarb.playerstats.commands.StatsTabCompleter;
import org.bukkit.plugin.java.JavaPlugin;

public final class PlayerStats extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("PLAYERSTATS ENABLED");
        getCommand("mystats").setExecutor(new StatsCommand());
        getCommand("mystats").setTabCompleter(new StatsTabCompleter());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("PLAYERSTATS DISABLED");
    }
}
