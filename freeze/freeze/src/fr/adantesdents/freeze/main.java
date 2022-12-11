package fr.adantesdents.freeze;

import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		System.out.println("Le plugin freeze a bien demarrer");
		getCommand("freeze").setExecutor(new CommandFreeze());
	}

}
