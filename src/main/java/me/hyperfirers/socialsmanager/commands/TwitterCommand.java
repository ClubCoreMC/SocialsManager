package me.hyperfirers.socialsmanager.commands;

import me.hyperfirers.socialsmanager.SocialsManager;
import me.hyperfirers.socialsmanager.Utils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class TwitterCommand implements CommandExecutor {
    private SocialsManager plugin;
    public TwitterCommand(SocialsManager plugin){
        this.plugin = plugin;
        plugin.getCommand("twitter").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage(Utils.chat(plugin.getConfig().getString("discord")));
        return false;
    }
}
