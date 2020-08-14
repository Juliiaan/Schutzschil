package de.julian.invgame1;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class AcceptCmd implements CommandExecutor {

    public Utils utils;
    static Inventory inv;

    public AcceptCmd(Utils utils) {
        this.utils = utils;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (sender instanceof Player){
            Player p = (Player)sender;
            if (args.length == 1){
                if (args[0] != null){
                    Player target = Bukkit.getPlayer(args[0]);
                    inv = Bukkit.createInventory(null, 9*5, "4 Gewinnt");
                    if (utils.getChallenged().containsKey(target)){
                        p.openInventory(inv);
                        target.openInventory(inv);




                    }
                    utils.getPlayers().add(p.getDisplayName());
                    utils.getPlayers().add(target.getDisplayName());
                    utils.setCurrentPlayer(p.getDisplayName());
                }

            }

        }


        return false;
    }

}
