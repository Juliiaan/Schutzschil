package de.julian.invgame1;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GameManager1 implements Listener {

    public Utils utils;
    public WinCheck winCheck;
    Inventory inv;
    

    public GameManager1(Utils utils, WinCheck winCheck) {
        this.utils = utils;
        this.winCheck = winCheck;
    }

    public void changePlayer() {
        if (!utils.getPlayers().isEmpty()) {
            String p1 = utils.getPlayers().get(0);
            String p2 = utils.getPlayers().get(1);
            if (utils.getCurrentPlayer().equalsIgnoreCase(p1)) {
                utils.setCurrentPlayer(p2);
            } else {
                utils.setCurrentPlayer(p1);
            }

        }
    }







    @EventHandler
    public void onClick(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();

        ItemStack stack = new ItemStack(Material.WOOD);
        ItemMeta meta = stack.getItemMeta();
        meta.setDisplayName("§bX");
        stack.setItemMeta(meta);

        e.setCancelled(true);

        ItemStack stack1 = new ItemStack(Material.STONE);
        ItemMeta meta1 = stack.getItemMeta();
        meta1.setDisplayName("§cO");
        stack1.setItemMeta(meta1);




        if (e.getClickedInventory().getItem(e.getSlot()) == null || e.getClickedInventory().getItem(e.getSlot()).getType() == Material.AIR) {
            if (p.getDisplayName().equalsIgnoreCase(utils.getCurrentPlayer())) {
                if (p.getDisplayName().equalsIgnoreCase(utils.getPlayers().get(0))) {
                    e.getClickedInventory().setItem(e.getSlot(), stack);
                    p.updateInventory();
                    changePlayer();
                    winCheck.checkForWin();
                }else{
                    e.getClickedInventory().setItem(e.getSlot(), stack1);
                    p.updateInventory();
                    changePlayer();
                    winCheck.checkForWin();


                }
            } else {
                e.setCancelled(true);
            }

        }

    }

}
