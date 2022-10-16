package me.hyperfirers.socialsmanager;

import org.bukkit.ChatColor;

public class Utils {

    public static String chat (String s) {
        return ChatColor.translateAlternateColorCodes('&', s);
    }

    public static long getRandomNumber(long min, long max) {
        return (long) ((Math.random() * (max - min)) + min);
    }
}