package com.github.fleivinho.aulas;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onLoad() {
        getLogger().info("Carregando o plugin");
    }

    @Override
    public void onEnable() {
        getLogger().info("Plugin ligado com sucesso!");
        Bukkit.getPluginManager().registerEvents(new Eventos(), this);
        Bukkit.getConsoleSender().sendMessage("§aPlugin ligado!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
