package es.goodmem.pong;

import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class PongPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onChat(AsyncPlayerChatEvent event) {
        String message = event.getMessage().toLowerCase();
        for(Player player : event.getRecipients()) {
            if(message.contains(player.getName().toLowerCase())) {
                player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_PLACE, 3F, 3F);
            }
        }
    }
}
