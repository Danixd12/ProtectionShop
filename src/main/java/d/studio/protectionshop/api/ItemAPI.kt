package d.studio.protectionshop.api

import net.md_5.bungee.api.chat.BaseComponent
import net.md_5.bungee.api.chat.ComponentBuilder
import net.md_5.bungee.api.chat.HoverEvent
import net.md_5.bungee.api.chat.TextComponent
import org.bukkit.Bukkit
import org.bukkit.ChatColor
import org.bukkit.entity.Player

class ItemAPI {


    /**
     * Crea un nuevo mensaje
     * @param player
     * @param msg
     * @param args
     */
    fun createMessage(p: Player, args: String) {

            return p.sendMessage(ChatColor.translateAlternateColorCodes('&', args))
    }

    fun broadcast(args: String, perms: String): Int {


        return Bukkit.broadcast(args, perms)
    }

    fun createComponent(args: String): BaseComponent {

        var bc: BaseComponent = TextComponent(args)

        Bukkit.spigot().broadcast(bc)

        return bc
    }

    fun createComponentBuilder(args: String): ComponentBuilder {

        return ComponentBuilder(args)
    }

    fun createTextHover(args: String, hoverText: String): BaseComponent {

        var e = createComponent(args)
        e.hoverEvent = HoverEvent(HoverEvent.Action.SHOW_TEXT, createComponentBuilder(hoverText).create())

        return e
    }


}
