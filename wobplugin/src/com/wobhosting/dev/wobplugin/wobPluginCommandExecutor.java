package com.wobhosting.dev.wobplugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class wobPluginCommandExecutor implements CommandExecutor {
	private wobplugin plugin;
	public wobPluginCommandExecutor(wobplugin plugin){
		this.plugin = plugin;
		
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		
		if (cmd.getName().equalsIgnoreCase("wobhosting")){
			player.sendMessage(ChatColor.BLUE + plugin.getConfig().getString("message"));
		}
		return false;
	}

}
