package d.studio.protectionshop

import d.studio.protectionshop.api.ItemAPI
import d.studio.protectionshop.commands.openshop
import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

class ProtectionShop : JavaPlugin() {

    lateinit var api: ItemAPI
    override fun onEnable() {

        api = ItemAPI()

        logger.info("Minion and Protection shop loaded!")
        logger.info("- Author: DaniCraftingYT")
        logger.info("- Depends: VaultAPI")

        Bukkit.getPluginCommand("pshop")?.setExecutor(openshop)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}