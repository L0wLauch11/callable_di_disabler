package me.lowlauch.callable_di_disabler;

import net.labymod.serverapi.bukkit.utils.PacketUtils;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class DisableDamageIndicator
{
    public static void sendDisable(Player p) {
        PacketUtils packetUtils = Main.getInstance().labymodPacketUtils;
        packetUtils.sendPacket(p, packetUtils.getPluginMessagePacket("DAMAGEINDICATOR", new byte[]{0}));
    }

    public static void sendDisable(String playerName) {
        Player p = Bukkit.getPlayer(playerName);

        if (p == null || !p.isOnline()) {
            return;
        }

        PacketUtils packetUtils = Main.getInstance().labymodPacketUtils;
        packetUtils.sendPacket(p, packetUtils.getPluginMessagePacket("DAMAGEINDICATOR", new byte[]{0}));
    }
}
