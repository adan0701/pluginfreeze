package fr.adantesdents.freeze;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandFreeze implements CommandExecutor {

	@Override
    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (args.length > 0) {
                Player target = player.getServer().getPlayer(args[0]);
                if (target != null) {
                	player.sendMessage("Vous avez gelé le joueur " + target.getName());
                	while (true) {
                        Location targetLocation = target.getLocation();
                        target.teleport(targetLocation);
                      //target.sendTitle("STOP CHEAT", "Go discord", 10, 200, 10); 
					}
                    
                } else {
                    player.sendMessage("Le joueur n'a pas été trouvé");
                }
            } else {
                player.sendMessage("Vous devez spécifier un joueur à geler");
            }
        } else {
            sender.sendMessage("Cette commande ne peut être utilisée que par un joueur en jeu");
        }
        return true;
    }
}