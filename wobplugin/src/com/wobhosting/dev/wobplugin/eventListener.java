package com.wobhosting.dev.wobplugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class eventListener implements Listener {
	private final wobplugin plugin;
	
	public eventListener(wobplugin instance){
		plugin = instance;
		
	}
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent joinEvent){
		if (joinEvent.getPlayer().getName().equalsIgnoreCase("domefavor95")) {
			joinEvent.getPlayer().getWorld().strikeLightning(joinEvent.getPlayer().getLocation());
			Bukkit.broadcastMessage(ChatColor.RED + "He has come.");
		}
		joinEvent.getPlayer().sendMessage(ChatColor.RED + plugin.getConfig().getString("message"));
	}
	
}
