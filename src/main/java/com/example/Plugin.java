package com.example;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import com.example.Player.PlayerListener;

/*
 * hardcore-mode java plugin
 */
public class Plugin extends JavaPlugin {
  private static final Logger LOGGER = Logger.getLogger("hardcore-mode");

  public void onEnable() {
    LOGGER.info("hardcore-mode enabled");

    Bukkit.getPluginManager().registerEvents(new PlayerListener(), this);

  }

  public void onDisable() {
    LOGGER.info("hardcore-mode disabled");
  }
}
