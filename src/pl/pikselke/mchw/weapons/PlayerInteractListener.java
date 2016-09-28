package pl.pikselke.mchw.weapons;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class PlayerInteractListener implements Listener {
	
	@EventHandler
	public void M4SemiShoot(PlayerInteractEvent e){
		Player p = e.getPlayer();
		if(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK){
			if(e.getItem() != null && e.getItem().getType() == Material.WOOD_HOE){
				Location loc = p.getLocation();
				Entity f = loc.getWorld().spawnEntity(loc.add(loc.getDirection()) , EntityType.SNOWBALL);
				f.setVelocity(loc.getDirection().multiply(0.5));
			}
		}
	}
	
	@EventHandler
	public void AwpShoot(PlayerInteractEvent e){
		Player p = e.getPlayer();
		if(e.getAction() == Action.RIGHT_CLICK_BLOCK || e.getAction() == Action.RIGHT_CLICK_AIR){
			if(e.getItem() != null && e.getItem().equals(Material.IRON_BARDING)){
				Location loc = p.getLocation();
				Entity f = loc.getWorld().spawnEntity(loc.add(loc.getDirection()) , EntityType.SNOWBALL);
				f.setVelocity(loc.getDirection().multiply(2.5));
			}
		}
	}
	
	@EventHandler
	public void M4AutoShoot(PlayerInteractEvent e){
		Player p = e.getPlayer();
		if(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK){
			if(e.getItem() != null && e.getItem().equals(Material.DIAMOND_BARDING)){
				Location loc = p.getLocation();
				Entity f = loc.getWorld().spawnEntity(loc.add(loc.getDirection()) , EntityType.SNOWBALL);
				f.setVelocity(loc.getDirection().multiply(2.5));
			}
		}
	}
	
	@EventHandler
	public void PistolShoot(PlayerInteractEvent e){
		Player p = e.getPlayer();
		if(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK){
			if(e.getItem() != null && e.getItem().getType() == Material.STONE_HOE){
				Location loc = p.getLocation();
				Entity f = loc.getWorld().spawnEntity(loc.add(loc.getDirection()) , EntityType.SNOWBALL);
				f.setVelocity(loc.getDirection().multiply(0.5));
			}
		}
	}
	
	@EventHandler
	public void ShotGunShoot(PlayerInteractEvent e){
		Player p = e.getPlayer();
		if(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK){
			if(e.getItem() != null && e.getItem().getType() == Material.GOLD_BARDING){
				Location loc = p.getLocation();
				Entity f = loc.getWorld().spawnEntity(loc.add(loc.getDirection()) , EntityType.SNOWBALL);
				f.setVelocity(loc.getDirection().multiply(0.5));
			}
		}
	}
}


