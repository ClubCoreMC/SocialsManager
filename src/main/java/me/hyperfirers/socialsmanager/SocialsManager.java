package me.hyperfirers.socialsmanager;

import me.hyperfirers.socialsmanager.commands.*;
import me.hyperfirers.socialsmanager.listeners.MOTDListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class SocialsManager extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        saveDefaultConfig();
        new StoreCommand(this);
        new DiscordCommand(this);
        new SocialsCommand(this);
        new TwitterCommand(this);
        new WebsiteCommand(this);

        getServer().getPluginManager().registerEvents(new MOTDListener(this), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
