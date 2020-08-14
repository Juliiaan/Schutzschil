package de.julian.invgame1;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Invgame1 extends JavaPlugin {

    public Utils utils = new Utils();

    @Override
    public void onEnable() {
        register();
        Bukkit.getConsoleSender().sendMessage("§54 Gewinnt aktiviert.");



    }

    public void register(){
        getCommand("challenge").setExecutor(new ChallengeCmd(utils));
        getCommand("accept").setExecutor(new AcceptCmd(utils));
        Bukkit.getPluginManager().registerEvents(new GameManager1(utils, new WinCheck(utils)), this);

    }

}
