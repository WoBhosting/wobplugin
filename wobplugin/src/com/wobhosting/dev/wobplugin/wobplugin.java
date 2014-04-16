package com.wobhosting.dev.wobplugin;
import java.util.HashMap;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;



public class wobplugin extends JavaPlugin{
	private final eventListener eventListener = new eventListener(this);
	public static HashMap<String, Integer> ticketCreate = null;
	
	@Override
	public void onEnable(){
		//declare commands
		getCommand("wobhosting").setExecutor(new commandExecutor(this));
		
		//register events
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(eventListener, this);
		
		//gen the config
		getConfig().options().copyDefaults(true);
		saveConfig();
		
		//logging enabled success
		getLogger().info("WoBHosting plugin has been enabled.");
		Bukkit.broadcastMessage(getConfig().getString("test5"));
	}
	
	@Override
	public void onDisable(){
		getLogger().info("WoBHosting plugin has been DISABLED");
	}
	
}
