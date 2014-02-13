package com.wobhosting.dev.wobplugin;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.Bukkit;

public class eventListener implements Listener {
	private final wobplugin plugin;
	
	public eventListener(wobplugin instance){
		plugin = instance;
		
	}
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent joinEvent){
		String playername=joinEvent.getPlayer().getName();
		if (playername.equalsIgnoreCase("domefavor95") || playername.equalsIgnoreCase("bwcf99")){
			joinEvent.getPlayer().getWorld().strikeLightningEffect(joinEvent.getPlayer().getLocation());
			Bukkit.broadcastMessage(ChatColor.RED + "He has come.");
		}
		joinEvent.getPlayer().sendMessage(ChatColor.RED + plugin.getConfig().getString("message"));
	}
	
}
