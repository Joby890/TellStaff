package com.gmail.crash1703.TellStaff;
 
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
 
public class TellStaff_Other implements CommandExecutor {
 
        @SuppressWarnings("unused")
        private TellStaff plugin;
       
        public TellStaff_Other(TellStaff plugin) {
                this.plugin = plugin;
               
        }
        
        public String formatString(String string) {
	        String s = string;
	            for(@SuppressWarnings("unused") ChatColor color : ChatColor.values()) {
	                s = s.replaceAll("(&([a-f0-9]))", "\u00A7$2");
	            }
	        return s;
	    }
       
        @Override
        public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        	 StringBuilder builder = new StringBuilder();
             for(String s : args) {
                 builder.append(s);
                 builder.append(" ");
             }
             String message = builder.toString();
             if(cmd.getName().equalsIgnoreCase("tellstaff"))
             for(Player player : Bukkit.getOnlinePlayers() ) {
                     if(player.hasPermission("tellstaff.staff")) {
                             sender.sendMessage(ChatColor.AQUA + "[" + ChatColor.BLUE + "TellStaff" + ChatColor.AQUA + "]" + ChatColor.GOLD + " Message From: " + ChatColor.YELLOW + (sender.getName()));  
             sender.sendMessage((message));
                     }else{
               sender.sendMessage(ChatColor.RED + "I'm sorry, but you are not a staff member!");
                     }
             }
			return false;
        } 
}   
