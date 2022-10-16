package me.hyperfirers.socialsmanager.commands;

import me.hyperfirers.socialsmanager.SocialsManager;
import me.hyperfirers.socialsmanager.Utils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class DiscordCommand implements CommandExecutor {
    private SocialsManager plugin;
    public DiscordCommand(SocialsManager plugin){
        this.plugin = plugin;
        plugin.getCommand("discord").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage(Utils.chat(plugin.getConfig().getString("discord")));
        return false;
    }
}
