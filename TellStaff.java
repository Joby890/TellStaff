package com.gmail.crash1703.TellStaff;

  /* Copyright (C) 2013 AnUnknownMiner
 * 
 * All rights reserved unless otherwise explicitly stated!
 * 
 * This program is free software, that's fun right?
 * 
 * Otherwise Stated Part:
 * 
 *  Modification of this plugin is ALLOWED, ONLY through GitHub's support system.
 *  All types of reproduction of this plugin or "knockoff" type under a different 
 *  name and/or author is prohibited, and will proper action will be taken.
 */                                                                                                       																																																												

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.yaml.snakeyaml.error.Mark;
import org.bukkit.event.Listener;
import org.bukkit.configuration.file.FileConfiguration;

import java.util.logging.Logger;


public class TellStaff extends JavaPlugin implements Listener {


	public void onEnable() {
		getCommand("tellstaff").setExecutor(new TellStaff_Other (this));
		PluginDescriptionFile pdfFile = getDescription();
		logger.info((new StringBuilder(String.valueOf(pdfFile.getName()))).append(" version ").append(pdfFile.getVersion()).append(" has been enabled!").toString());
		FileConfiguration config = getConfig();
                config.options().copyDefaults(true);
                saveConfig();
                this.reloadConfig();
	}
	
	public void onDisable() {
		PluginDescriptionFile pdfFile = getDescription();
		logger.info((new StringBuilder(String.valueOf(pdfFile.getName()))).append(" version ").append(pdfFile.getVersion()).append(" has been disabled!").toString());
		logger.info("This version of TellStaff is still in Beta stage, more features are to come!");
		this.saveConfig();
        }

 public final Logger logger = Logger.getLogger("Minecraft");
 public static Mark plugin; 
}
