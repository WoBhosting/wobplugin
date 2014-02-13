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
<<<<<<< HEAD
		String playername=joinEvent.getPlayer().getName();
		if (playername.equalsIgnoreCase("domefavor95") || playername.equalsIgnoreCase("bwcf99")){
			joinEvent.getPlayer().getWorld().strikeLightningEffect(joinEvent.getPlayer().getLocation());
			Bukkit.broadcastMessage(ChatColor.RED + "He has come.");
		}
=======
>>>>>>> parent of b5212c3... A Joshua Garde Easteregg
		joinEvent.getPlayer().sendMessage(ChatColor.RED + plugin.getConfig().getString("message"));
	}
	
}
