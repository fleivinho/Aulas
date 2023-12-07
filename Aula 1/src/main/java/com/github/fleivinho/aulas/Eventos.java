package com.github.fleivinho.aulas;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Eventos implements Listener {

    @EventHandler
    void aoEntrar(PlayerJoinEvent e) {
        e.setJoinMessage(null);
        Player player = e.getPlayer();
        player.sendMessage("§aSeja muito bem vindo ao servidor!");

        if (player.isOp()) {
            Bukkit.broadcastMessage("§3§l" + player.getName() + " §eentrou no servidor!");
        } else {
            Bukkit.broadcastMessage("§e" + player.getName() + " entrou no servidor!");
        }
    }
}
