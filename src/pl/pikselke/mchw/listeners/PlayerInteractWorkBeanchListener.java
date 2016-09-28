package pl.pikselke.mchw.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import pl.pikselke.mchw.bag.BackPack;

public class PlayerInteractWorkBeanchListener implements Listener {
	
	
	@EventHandler
	public static void onInteract(PlayerInteractEvent e){
		Player p = e.getPlayer();
		if(e.getAction().equals(Action.RIGHT_CLICK_BLOCK)){
			if(e.getClickedBlock().equals(Material.WORKBENCH)){
				//e.getPlayer().openInventory(CraftingInventory1.openInv(p));
				return;
			}
			if(e.getAction().equals(Action.RIGHT_CLICK_BLOCK)){
				if(e.getClickedBlock().equals(Material.ACTIVATOR_RAIL)){
					e.getPlayer().openInventory(BackPack.getInv());
					return;
				}
			}
		}
	}

}
