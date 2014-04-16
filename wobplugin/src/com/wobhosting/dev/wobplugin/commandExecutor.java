package com.wobhosting.dev.wobplugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class commandExecutor implements CommandExecutor {
	private wobplugin plugin;
	public commandExecutor(wobplugin plugin){
		this.plugin = plugin;
		
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		
		if (cmd.getName().equalsIgnoreCase("wobhosting")){
			if (label.isEmpty()) sender.sendMessage("Usage: ");
			if (label.equalsIgnoreCase("ticket")) wobplugin.ticketCreate.put(sender.getName(), true);
		}
		return true;
	}

}
