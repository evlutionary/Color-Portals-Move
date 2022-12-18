package com.snowgears.colorportals.events;

import com.snowgears.colorportals.Portal;
import org.bukkit.entity.Player;
import org.bukkit.entity.Entity;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class MovePortalEvent extends Event {

    private static final HandlerList handlers = new HandlerList();
    private Portal portal;
    private Player player;
    private Entity entity;

    public MovePortalEvent(Portal p, Player player, Entity e) {
        portal = p;
	entity = e;
        this.player = player;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public Portal getPortal() {
        return portal;
    }

    public Player getPlayer() {
        return player;
    }

    public Entity getEntity() {
	return entity;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

}