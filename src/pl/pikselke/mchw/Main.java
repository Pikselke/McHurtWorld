package pl.pikselke.mchw;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import pl.pikselke.mchw.bag.BackPack;
import pl.pikselke.mchw.enums.McHwEnum;
import pl.pikselke.mchw.listeners.PlayerInteractWorkBeanchListener;
import pl.pikselke.mchw.listeners.PlayerJoinQuitListener;
import pl.pikselke.mchw.scoreboard.ScoreBoardListener;
import pl.pikselke.mchw.weapons.PlayerInteractListener;

public class Main extends JavaPlugin{
	
	private static Main plugin;
	
	public void onEnable(){
		McHwEnum.setMode(McHwEnum.OFFLINE);
		plugin = this;
		createListeners();
		createCommands();
		
	}
	
	public void onDisable(){
		BackPack.saveBackPack();
	}
	
	
	private static void createCommands(){
		
	}
	
	private static void createListeners(){
		Bukkit.getPluginManager().registerEvents((Listener) new ScoreBoardListener(), Main.getPlugin());
		Bukkit.getPluginManager().registerEvents((Listener) new PlayerJoinQuitListener(), Main.getPlugin());
		Bukkit.getPluginManager().registerEvents((Listener) new PlayerInteractWorkBeanchListener(), Main.getPlugin());
		Bukkit.getPluginManager().registerEvents((Listener) new PlayerInteractListener(), Main.getPlugin());
		Bukkit.getPluginManager().registerEvents((Listener) new ScoreBoardListener(), Main.getPlugin());
		Bukkit.getPluginManager().registerEvents((Listener) new BackPack(), Main.getPlugin());
	}
	
	
	
	public static Main getPlugin(){
		return plugin;
	}

}
