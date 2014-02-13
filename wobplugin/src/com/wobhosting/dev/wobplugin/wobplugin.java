package com.wobhosting.dev.wobplugin;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;



public class wobplugin extends JavaPlugin{
	private final eventListener eventListener = new eventListener(this);
	
	
	@Override
	public void onEnable(){
		//declare commands
		getCommand("wobhosting").setExecutor(new wobPluginCommandExecutor(this));
		
		//register events
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(eventListener, this);
		
		//gen the config
		getConfig().options().copyDefaults(true);
		saveConfig();
		
		String message = getConfig().getString("message");
		
		//logging enabled success
		getLogger().info("WoBHosting plugin has been enabled.");
	}
	

	
	
	
	
	@Override
	public void onDisable(){
		// TODO Insert logic to be performed when the plugin is disabled
		getLogger().info("WoBHosting plugin has been DISABLED");
	}
	
}
