package de.julian.invgame1;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class WinCheck {


    public Utils utils;
    public String Winner = null;


    public WinCheck(Utils utils) {
        this.utils = utils;
    }
    Inventory inv;


    public void checkForWin() {
        inv = AcceptCmd.inv;
    try {
        for (int i = 0; i <= 44; i++) {

            if (inv.getItem(i) != null) {

                //Horizontal X

                if (inv.getItem(0).getType() == Material.WOOD && inv.getItem(1).getType() == Material.WOOD && inv.getItem(2).getType() == Material.WOOD
                        && inv.getItem(3).getType() == Material.WOOD) {
                    setWinner(utils.getPlayers().get(0), utils.getPlayers().get(1));
                } else if (inv.getItem(9).getType() == Material.WOOD && inv.getItem(10).getType() == Material.WOOD && inv.getItem(11).getType() == Material.WOOD
                        && inv.getItem(12).getType() == Material.WOOD) {
                    setWinner(utils.getPlayers().get(0), utils.getPlayers().get(1));
                } else if (inv.getItem(18).getType() == Material.WOOD && inv.getItem(19).getType() == Material.WOOD && inv.getItem(20).getType() == Material.WOOD
                        && inv.getItem(21).getType() == Material.WOOD) {
                    setWinner(utils.getPlayers().get(0), utils.getPlayers().get(1));
                } else if (inv.getItem(27).getType() == Material.WOOD && inv.getItem(28).getType() == Material.WOOD && inv.getItem(29).getType() == Material.WOOD
                        && inv.getItem(30).getType() == Material.WOOD) {
                    setWinner(utils.getPlayers().get(0), utils.getPlayers().get(1));
                } else if (inv.getItem(36).getType() == Material.WOOD && inv.getItem(37).getType() == Material.WOOD && inv.getItem(38).getType() == Material.WOOD
                        && inv.getItem(39).getType() == Material.WOOD) {
                    setWinner(utils.getPlayers().get(0), utils.getPlayers().get(1));
                }else if (inv.getItem(41).getType() == Material.WOOD && inv.getItem(42).getType() == Material.WOOD && inv.getItem(43).getType() == Material.WOOD
                        && inv.getItem(44).getType() == Material.WOOD){
                    setWinner(utils.getPlayers().get(0), utils.getPlayers().get(1));
                }else if (inv.getItem(8).getType() == Material.WOOD && inv.getItem(7).getType() == Material.WOOD && inv.getItem(6).getType() == Material.WOOD
                        && inv.getItem(5).getType() == Material.WOOD) {
                    setWinner(utils.getPlayers().get(0), utils.getPlayers().get(1));
                }
                }
        }
    }catch (NullPointerException e){

    }
    }

    public String getWinner() {
        return Winner;
    }

    public void setWinner(String winner, String loser) {
        Winner = winner;

        for (Player all : Bukkit.getOnlinePlayers()){
            if (all.getDisplayName().equalsIgnoreCase(winner)){
                all.sendTitle("§a Du hast gewonnen", "§a" + winner);
            }else if (all.getDisplayName().equalsIgnoreCase(loser)){
                all.sendTitle("§cDu hast verloren", "§c" + loser);
            }
            all.closeInventory();
        }
    }
    
}
