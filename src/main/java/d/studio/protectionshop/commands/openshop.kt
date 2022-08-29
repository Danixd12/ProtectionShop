package d.studio.protectionshop.commands

import d.studio.protectionshop.api.ItemAPI
import d.studio.protectionshop.api.Type
import de.tr7zw.nbtapi.NBTItem
import net.md_5.bungee.api.chat.BaseComponent
import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.bukkit.inventory.Inventory
import org.bukkit.inventory.ItemStack


object openshop: CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {


        var message = ItemAPI()

        if(sender is Player) {
            var p: Player = sender
            var gui: Inventory = Bukkit.createInventory(p, 36, "Inventario")


            var item = ItemStack(Material.DIAMOND_SWORD)
            val hoverEventComponents = arrayOf<BaseComponent>(
                message.createComponent(NBTItem.convertItemtoNBT(item).compound.toString())
            )

            message.createMessage(p, "hola que tal")
            message.broadcast("hola", "p.staff")

            message.createHover("Hover de test", hoverEventComponents, Type.ITEM, true)

        }

        return true;
    }
}