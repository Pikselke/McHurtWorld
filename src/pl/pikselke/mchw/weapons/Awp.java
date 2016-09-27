package pl.pikselke.mchw.weapons;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import pl.pikselke.mchw.utils.RegisterGunsItemStack;

public class Awp implements Listener{
	
	public static RegisterGunsItemStack rgis;
	

	@EventHandler
	public void GunShoot(PlayerInteractEvent e){
		Player p = e.getPlayer();
		if(e.getAction() == Action.RIGHT_CLICK_BLOCK || e.getAction() == Action.RIGHT_CLICK_AIR){
			if(e.getItem() != null && e.getItem().equals(rgis.is)){
				Location loc = p.getLocation();
				Entity f = loc.getWorld().spawnEntity(loc.add(loc.getDirection()) , EntityType.SNOWBALL);
				f.setVelocity(loc.getDirection().multiply(2.5));
				}
		}
	
	
	
	}
}
