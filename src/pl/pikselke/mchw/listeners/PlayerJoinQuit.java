package pl.pikselke.mchw.listeners;

import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerJoinQuit implements Listener {
	
	
	public static void onJoin(PlayerJoinEvent e){
		e.setJoinMessage("§7" + e.getPlayer() + " weszedl");
	}
	
	public static void onQuit(PlayerQuitEvent e){
		e.setQuitMessage("§7" + e.getPlayer() + " odeszedl");
	}

}
