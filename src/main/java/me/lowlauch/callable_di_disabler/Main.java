package me.lowlauch.callable_di_disabler;

import org.bukkit.plugin.java.JavaPlugin;
import net.labymod.serverapi.bukkit.utils.PacketUtils;

import java.util.Objects;

public final class Main extends JavaPlugin {
    public static Main instance;
    public PacketUtils labymodPacketUtils = new PacketUtils();

    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;

        Objects.requireNonNull(getCommand("calldidisabler")).setExecutor(new CommandHandler());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static Main getInstance() {
        return instance;
    }
}
