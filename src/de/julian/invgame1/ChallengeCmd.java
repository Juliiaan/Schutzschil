package de.julian.invgame1;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ChallengeCmd implements CommandExecutor {

    public Utils utils;

    public ChallengeCmd(Utils utils) {
        this.utils = utils;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (sender instanceof Player){
            Player p = (Player)sender;
            if (args.length == 1) {
                if (args[0] != null) {
                    Player target = Bukkit.getPlayer(args[0]);
                    utils.getChallenged().put(p, target);
                    p.sendMessage("§aDu hast den Spieler §7" + target.getDisplayName() + " §azu einer Runde 4 Gewinnt eingeladen.");
                    target.sendMessage("§a Der Spieler §7" + p.getDisplayName() + " §ahat dich zu einer Runde 4 Gewinnt eingeladen.");

                }
            }
        }


        return false;
    }

}
