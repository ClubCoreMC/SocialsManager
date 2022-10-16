package me.hyperfirers.socialsmanager.listeners;

import me.hyperfirers.socialsmanager.SocialsManager;
import me.hyperfirers.socialsmanager.Utils;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class MOTDListener implements Listener {
    private SocialsManager plugin;
    public MOTDListener(SocialsManager plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e){
        if(plugin.getConfig().getBoolean("motd.enabled") == true){
            Bukkit.getScheduler().runTaskLater(plugin, () -> {
                e.getPlayer().sendMessage(Utils.chat(plugin.getConfig().getString("motd.message")));
            }, 20 * 1L);
        } else {
            return;
        }
    }
}
