package me.lowlauch.callable_di_disabler;

import net.labymod.serverapi.bukkit.utils.PacketUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandHandler implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String commandString, String[] args) {
        if (commandString.equalsIgnoreCase("calldidisabler")) {
            if (args.length > 0) {
                DisableDamageIndicator.sendDisable(args[0]);
            } else {
                if (!(commandSender instanceof Player)) {
                    commandSender.sendMessage("Du musst ein Spieler sein!");
                    return true;
                }

                Player p = (Player) commandSender;
                DisableDamageIndicator.sendDisable(p);
            }

            return true;
        }

        return false;
    }
}
