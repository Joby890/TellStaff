package com.gmail.crash1703.TellStaff;
                                                                                                         																																																												

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.yaml.snakeyaml.error.Mark;
import org.bukkit.event.Listener;
import org.bukkit.configuration.file.FileConfiguration;

import java.util.logging.Logger;


public final class TellStaff extends JavaPlugin
    implements Listener
{
	public void Main()
    {
       server = getServer();
       Bukkit.getServer().getOnlinePlayers();
    }
	@Override
	public void onEnable() {
		getCommand("tellstaff").setExecutor(new TellStaff_Other (this));
		PluginDescriptionFile pdfFile = getDescription();
		logger.info((new StringBuilder(String.valueOf(pdfFile.getName()))).append(" version ").append(pdfFile.getVersion()).append(" has been enabled!").toString());
		FileConfiguration config = getConfig();
        config.options().copyDefaults(true);
        saveConfig();
        this.reloadConfig();
	}
	@Override
	public void onDisable() {
		PluginDescriptionFile pdfFile = getDescription();
		logger.info((new StringBuilder(String.valueOf(pdfFile.getName()))).append(" version ").append(pdfFile.getVersion()).append(" has been disabled!").toString());
		logger.info("This version of TellStaff is still in Beta stage, more features are to come!");
		this.saveConfig();

		
 }
 Server server;
 public final Logger logger = Logger.getLogger("Minecraft");
 public static Mark plugin; 
}
