package pl.pikselke.mchw;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import pl.pikselke.mchw.craftings.listeners.InventoryClick;
import pl.pikselke.mchw.enums.McHwEnum;
import pl.pikselke.mchw.listeners.PlayerInteractWorkBeanch;
import pl.pikselke.mchw.listeners.PlayerJoinQuit;
import pl.pikselke.mchw.weapons.Awp;
import pl.pikselke.mchw.weapons.M4Auto;
import pl.pikselke.mchw.weapons.M4Semi;
import pl.pikselke.mchw.weapons.Pistol;
import pl.pikselke.mchw.weapons.ShotGun;

public class Main extends JavaPlugin{
	
	public static Main plugin;
	
	public void onEnable(){
		McHwEnum.setMode(McHwEnum.PRACE);
		plugin = this;
		CreateListeners();
		
	}
	
	
	public static void CreateCommands(){
		
	}
	
	public static void CreateListeners(){
		Bukkit.getPluginManager().registerEvents((Listener) new PlayerJoinQuit(), Main.getPlugin());
		Bukkit.getPluginManager().registerEvents((Listener) new InventoryClick(), Main.getPlugin());
		Bukkit.getPluginManager().registerEvents((Listener) new PlayerInteractWorkBeanch(), Main.getPlugin());
		Bukkit.getPluginManager().registerEvents((Listener) new ShotGun(), Main.getPlugin());
		Bukkit.getPluginManager().registerEvents((Listener) new Awp(), Main.getPlugin());
		Bukkit.getPluginManager().registerEvents((Listener) new M4Auto(), Main.getPlugin());
		Bukkit.getPluginManager().registerEvents((Listener) new M4Semi(), Main.getPlugin());
		Bukkit.getPluginManager().registerEvents((Listener) new Pistol(), Main.getPlugin());
	}
	
	public static void CreateReszte(){
		
	}
	
	public static Main getPlugin(){
		return plugin;
	}

}
