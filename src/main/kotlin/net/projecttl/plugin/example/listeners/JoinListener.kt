package net.projecttl.plugin.example.listeners

import PlayerManager
import net.kyori.adventure.text.Component
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

class JoinListener : Listener {
    @EventHandler
    fun joinMessage(event: PlayerJoinEvent) {
        event.joinMessage(Component.text("Test123! ${event.player.name}"))
    }
    @EventHandler
    fun getPlayerInChache(event: PlayerJoinEvent) {
        val player = event.player
        PlayerManager().getPlayer()
    }
}