package pl.pikselke.mchw.craftings;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CraftingInventory1 {
	
	static Inventory inv;
	
	
	public static InventoryView openInv(Player p){
		inv = Bukkit.createInventory(null, 9, "§6Wytwarzanie!");
		
		ItemStack is = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 1);
		ItemMeta im = is.getItemMeta();
		im.setDisplayName("§7Narzedzia");
		
		ItemStack is1 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 2);
		ItemMeta im1 = is1.getItemMeta();
		im1.setDisplayName("§7Maszyny");
		
		ItemStack is2 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 3);
		ItemMeta im2 = is2.getItemMeta();
		im2.setDisplayName("§7Materialy");
		
		ItemStack is3 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 4);
		ItemMeta im3 = is3.getItemMeta();
		im3.setDisplayName("§7Amunicja");
		
		ItemStack is4 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 5);
		ItemMeta im4 = is4.getItemMeta();
		im4.setDisplayName("§7Uzbrojenie");
		
		ItemStack is5 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 6);
		ItemMeta im5 = is5.getItemMeta();
		im5.setDisplayName("§7Najazdy");
		
		ItemStack is6 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 7);
		ItemMeta im6 = is6.getItemMeta();
		im6.setDisplayName("§7Wyposazenie");
		
		ItemStack is7 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 8);
		ItemMeta im7 = is7.getItemMeta();
		im7.setDisplayName("§7Fryzury");
		
		ItemStack is8 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 9);
		ItemMeta im8 = is8.getItemMeta();
		im8.setDisplayName("§7Pulapki");
		
		inv.setItem(0, is);
		inv.setItem(1, is1);
		inv.setItem(2, is2);
		inv.setItem(3, is3);
		inv.setItem(4, is4);
		inv.setItem(5, is5);
		inv.setItem(6, is6);
		inv.setItem(7, is7);
		inv.setItem(8, is8);
		
		p.openInventory(inv);
		
		return null;
	}

}
