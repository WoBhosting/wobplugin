package com.wobhosting.dev.wobplugin;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
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
		Player p = joinEvent.getPlayer();
		
		p.sendMessage(ChatColor.GREEN + plugin.getConfig().getString("message"));
	}
	
}
