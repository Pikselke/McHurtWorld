package pl.pikselke.mchw.bag;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import pl.pikselke.mchw.Main;

public class BackPack implements Listener{

	private static HashMap<UUID, Inventory> backpacks = new HashMap<UUID, Inventory>();
	
	private static Inventory inv;
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e){
		setInv(Bukkit.createInventory(e.getPlayer(), InventoryType.CHEST, "Backpack"));
		
		if(Main.getPlugin().getConfig().contains("backpack." + e.getPlayer().getUniqueId())){
			for(String item : Main.getPlugin().getConfig().getConfigurationSection("backpack." + e.getPlayer().getUniqueId()).getKeys(false)){
				inv.addItem(loadItemBackPack(Main.getPlugin().getConfig().getConfigurationSection("backpack." + e.getPlayer().getUniqueId() + "'" + item)));
				
			}
		}
		backpacks.put(e.getPlayer().getUniqueId(),  inv);
		
	}
	
	@EventHandler
	public void onQuit(PlayerQuitEvent e){
		if(!Main.getPlugin().getConfig().contains("backpack." + e.getPlayer().getUniqueId())){
			Main.getPlugin().getConfig().createSection("backpacks" + e.getPlayer().getUniqueId());
		}
		char c = 'a';
		for(ItemStack itemStack : backpacks.get(e.getPlayer().getUniqueId())){
			if(itemStack !=null){
				saveItemBackPack(Main.getPlugin().getConfig().createSection("backpacks." + e.getPlayer().getUniqueId() + "'" + c++), itemStack);
			}
		}
		Main.getPlugin().saveConfig();
	}
	
	private static void saveItemBackPack(ConfigurationSection s, ItemStack is){
		s.set("type", is.getType().name());
		s.set("amount", is.getAmount());
	}
	
	public static void saveBackPack(){
        for (Entry<UUID, Inventory> entry : backpacks.entrySet()) {
            if (!Main.getPlugin().getConfig().contains("backpacks." + entry.getKey())) {
                    Main.getPlugin().getConfig().createSection("backpacks." + entry.getKey());
            }
           
            char c = 'a';
            for (ItemStack itemStack : entry.getValue()) {
                    if (itemStack != null) {
                          	saveItemBackPack(Main.getPlugin().getConfig().createSection("backpacks." + entry.getKey() + "." + c++), itemStack);
                    }
            }
        }
	}
	
	private ItemStack loadItemBackPack(ConfigurationSection s){
		return new ItemStack(Material.valueOf(s.getString("type")), s.getInt("amount"));
	}
	public static Inventory getInv() {
		return inv;
	}
	public static void setInv(Inventory inv) {
		BackPack.inv = inv;
	}
	
	

}
