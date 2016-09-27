package pl.pikselke.mchw.craftings.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryClick implements Listener {
	
	@EventHandler
	    public void onInventoryClickEvent(InventoryClickEvent e) {
	        if (e.getInventory() == null) {
	            return;
	        }
	        if (e.getCurrentItem() == null) {
	            return;
	        }
	        if (e.getCurrentItem().getType().equals(Material.AIR)) {
	            return;
	        }
	        if (!e.getCurrentItem().hasItemMeta()) {
	            return;
	        }
	        if (e.getInventory().getName() == null) {
	            return;
	        }
	        if (!e.getInventory().getName().equalsIgnoreCase("§d§lEFEKTY - §E§LMENU")) {
	            return;
	        }
	        e.setCancelled(true);
	        Player p = (Player)e.getWhoClicked();
	        if(e.getCurrentItem().getType() == Material.STAINED_GLASS_PANE && e.getCurrentItem().getData().getData() == 1) {
	            return;
	        }
	        if(e.getCurrentItem().getType() == Material.STAINED_GLASS_PANE && e.getCurrentItem().getData().getData() == 2) {
	        	return;
	        }		  
	        if(e.getCurrentItem().getType() == Material.STAINED_GLASS_PANE && e.getCurrentItem().getData().getData() == 3) {
	        	return;
	        }
	        if(e.getCurrentItem().getType() == Material.STAINED_GLASS_PANE && e.getCurrentItem().getData().getData() == 4) {
	            return;
	        }
	        if(e.getCurrentItem().getType() == Material.STAINED_GLASS_PANE && e.getCurrentItem().getData().getData() == 5) {
	        	return;
	        }		  
	        if(e.getCurrentItem().getType() == Material.STAINED_GLASS_PANE && e.getCurrentItem().getData().getData() == 6) {
	        	return;
	        }
	        if(e.getCurrentItem().getType() == Material.STAINED_GLASS_PANE && e.getCurrentItem().getData().getData() == 7) {
	            return;
	        }
	        if(e.getCurrentItem().getType() == Material.STAINED_GLASS_PANE && e.getCurrentItem().getData().getData() == 8) {
	        	return;
	        }		  
	        if(e.getCurrentItem().getType() == Material.STAINED_GLASS_PANE && e.getCurrentItem().getData().getData() == 9) {
	        	return;
	        }
	        p.closeInventory();
	    }
}



