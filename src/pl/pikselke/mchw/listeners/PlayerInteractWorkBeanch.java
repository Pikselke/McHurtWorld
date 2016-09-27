package pl.pikselke.mchw.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import pl.pikselke.mchw.craftings.CraftingInventory1;

public class PlayerInteractWorkBeanch implements Listener {
	
	
	public static void onInteract(PlayerInteractEvent e){
		Player p = e.getPlayer();
		if(e.getAction().equals(Action.RIGHT_CLICK_BLOCK)){
			if(e.getClickedBlock().equals(Material.WORKBENCH)){
				e.getPlayer().openInventory(CraftingInventory1.openInv(p));
				return;
			}
		}
	}

}
