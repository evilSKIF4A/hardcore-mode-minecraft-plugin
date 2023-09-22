package com.example.Player;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class PlayerListener implements Listener {

    private static final int TICK = 20;

    @EventHandler
    public static void onDamage(EntityDamageByEntityEvent entityEvent) {
        if (entityEvent.getEntityType() == EntityType.PLAYER
                && entityEvent.getDamager().getType() == EntityType.ZOMBIE) {
            Player player = (Player) entityEvent.getEntity();
            player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 5 * TICK, 5));
        }
    }
}
