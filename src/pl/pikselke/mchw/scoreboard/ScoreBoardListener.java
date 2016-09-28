package pl.pikselke.mchw.scoreboard;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

import pl.pikselke.mchw.Main;

public class ScoreBoardListener implements Listener {
	
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e){
		final Player p = e.getPlayer();
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		final Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("test", "dumy");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		obj.setDisplayName("§6McHurtWorld");
		
		Score score = obj.getScore("§6Poziom glodu: ");
		score.setScore(10);
		
		long food = Math.round(p.getFoodLevel());
		
		Score score1 = obj.getScore(String.valueOf(food));
		score1.setScore(9);
		
		Score score2 = obj.getScore("§6Poziom krwi: ");
		score2.setScore(8);
		
		
		Score score3 = obj.getScore("§62000");
		score3.setScore(7);
		
		
		Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(), new Runnable(){
			public void run(){
				
				p.setScoreboard(board);
			}
		}, 0, 20*10);
	}

}
