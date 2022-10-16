package me.hyperfirers.socialsmanager.commands;

import me.hyperfirers.socialsmanager.SocialsManager;
import me.hyperfirers.socialsmanager.Utils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class SocialsCommand implements CommandExecutor {
    private SocialsManager plugin;
    public SocialsCommand(SocialsManager plugin){
        this.plugin = plugin;
        plugin.getCommand("socials").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage(Utils.chat(plugin.getConfig().getString("socials")));
        return false;
    }
}
