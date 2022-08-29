package d.studio.protectionshop.commands

import d.studio.protectionshop.api.ItemAPI
import net.md_5.bungee.api.chat.HoverEvent
import org.bukkit.Bukkit
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.bukkit.inventory.Inventory

object openshop: CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {


        var message = ItemAPI()

        if(sender is Player) {
            var p: Player = sender
            var gui: Inventory = Bukkit.createInventory(p, 36, "Inventario")





            message.createMessage(p, "hola que tal")
            message.broadcast("hola", "p.staff")


            var e = message.createComponent("aaa")
            e.setHoverEvent(HoverEvent(HoverEvent.Action.SHOW_TEXT, message.createComponentBuilder("hover").create()))

            message.createTextHover("Hover de test", "Hover!")


        }

        return true;
    }
}