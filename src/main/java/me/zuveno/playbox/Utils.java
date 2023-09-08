package me.zuveno.playbox;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class Utils {

    //Very helpful thing =)
    public String convertString(String string) {
        return ChatColor.translateAlternateColorCodes('&', string);
    }

    //Empty log for some stuff
    public void voidLog(String string) {
        Bukkit.getConsoleSender().sendMessage("\n" + string);
    }


}
