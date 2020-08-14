package de.julian.invgame1;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import java.util.ArrayList;
import java.util.HashMap;

public class Utils {

     HashMap<Player, Player> challenged = new HashMap<>();
    public String currentPlayer = null;

    public ArrayList<String> players = new ArrayList<>();

    public String getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(String currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public ArrayList<String> getPlayers() {
        return players;
    }


    public HashMap<Player, Player> getChallenged() {
        return challenged;
    }


}
