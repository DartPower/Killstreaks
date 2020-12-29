package io.dpteam.Killstreaks;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionType;

public class Main extends JavaPlugin implements Listener {
	public static Inventory rankup;
	ItemStack k2;
	ItemStack k3;
	ItemStack k4;
	Potion regen;
	ItemStack k5;
	ItemStack k6;
	ItemStack k7;
	ItemStack k8;
	Potion speed;
	ItemStack k9;
	ItemStack k10;
	ItemStack kss;
	ItemMeta k2m;
	ItemMeta k3m;
	ItemMeta k4m;
	ItemMeta k5m;
	ItemMeta k6m;
	ItemMeta k7m;
	ItemMeta k8m;
	ItemMeta k9m;
	ItemMeta k10m;
	ItemMeta kssm;
	ItemStack r0;
	ItemStack r1;
	ItemStack r2;
	ItemStack r3;
	ItemStack r4;
	ItemStack r5;
	ItemStack r6;
	ItemStack r7;
	ItemStack r8;

	public Main() {
		super();
		this.k2 = new ItemStack(Material.LEGACY_DIAMOND_BOOTS);
		this.k3 = new ItemStack(Material.LEGACY_GOLDEN_APPLE);
		this.k4 = new ItemStack(Material.LEGACY_DIAMOND_SWORD);
		this.regen = new Potion(PotionType.REGEN, 1);
		this.k5 = this.regen.toItemStack(1);
		this.k6 = new ItemStack(Material.LEGACY_ENDER_PEARL);
		this.k7 = new ItemStack(Material.LEGACY_DIAMOND_CHESTPLATE);
		this.k8 = new ItemStack(Material.LEGACY_BOW);
		this.speed = new Potion(PotionType.SPEED, 2);
		this.k9 = this.speed.toItemStack(1);
		this.k10 = new ItemStack(Material.LEGACY_GOLDEN_APPLE, 1, (short)1);
		this.kss = new ItemStack(Material.LEGACY_BLAZE_POWDER);
		this.k2m = this.k2.getItemMeta();
		this.k3m = this.k3.getItemMeta();
		this.k4m = this.k4.getItemMeta();
		this.k5m = this.k5.getItemMeta();
		this.k6m = this.k6.getItemMeta();
		this.k7m = this.k7.getItemMeta();
		this.k8m = this.k8.getItemMeta();
		this.k9m = this.k9.getItemMeta();
		this.k10m = this.k10.getItemMeta();
		this.kssm = this.kss.getItemMeta();
		this.r0 = new ItemStack(Material.LEGACY_REDSTONE_BLOCK, 2);
		this.r1 = new ItemStack(Material.LEGACY_REDSTONE_BLOCK, 3);
		this.r2 = new ItemStack(Material.LEGACY_REDSTONE_BLOCK, 4);
		this.r3 = new ItemStack(Material.LEGACY_REDSTONE_BLOCK, 5);
		this.r4 = new ItemStack(Material.LEGACY_REDSTONE_BLOCK, 6);
		this.r5 = new ItemStack(Material.LEGACY_REDSTONE_BLOCK, 7);
		this.r6 = new ItemStack(Material.LEGACY_REDSTONE_BLOCK, 8);
		this.r7 = new ItemStack(Material.LEGACY_REDSTONE_BLOCK, 9);
		this.r8 = new ItemStack(Material.LEGACY_REDSTONE_BLOCK, 10);
	}

	public void onEnable() {
		this.getServer().getPluginManager().registerEvents(this, this);
		rankup = Bukkit.createInventory((InventoryHolder)null, 18, ChatColor.GREEN + "Killstreak Shop");
		this.k2m.setDisplayName(ChatColor.AQUA + "Diamond Boots");
		this.k3m.setDisplayName(ChatColor.GOLD + "Golden Apple");
		this.k4m.setDisplayName(ChatColor.BLUE + "Diamond Sword");
		this.k5m.setDisplayName(ChatColor.RED + "Potion of Regen 1");
		this.k6m.setDisplayName(ChatColor.DARK_GREEN + "Ender Pearl");
		this.k7m.setDisplayName(ChatColor.AQUA + "Diamond Chestplate");
		this.k8m.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
		this.k8m.setDisplayName(ChatColor.RED + "Power I Bow");
		this.k9m.setDisplayName(ChatColor.BLUE + "Speed II Potion");
		this.k10m.setDisplayName("" + ChatColor.GOLD + ChatColor.BOLD + "The one, the only, the God Apple");
		this.kssm.setDisplayName(ChatColor.GOLD + "Click me to view killstreaks!");
		this.k2.setItemMeta(this.k2m);
		this.k3.setItemMeta(this.k3m);
		this.k4.setItemMeta(this.k4m);
		this.k5.setItemMeta(this.k5m);
		this.k6.setItemMeta(this.k6m);
		this.k7.setItemMeta(this.k7m);
		this.k8.setItemMeta(this.k8m);
		this.k9.setItemMeta(this.k9m);
		this.k10.setItemMeta(this.k10m);
		this.kss.setItemMeta(this.kssm);
		rankup.setItem(0, this.k2);
		rankup.setItem(1, this.k3);
		rankup.setItem(2, this.k4);
		rankup.setItem(3, this.k5);
		rankup.setItem(4, this.k6);
		rankup.setItem(5, this.k7);
		rankup.setItem(6, this.k8);
		rankup.setItem(7, this.k9);
		rankup.setItem(8, this.k10);
		rankup.setItem(9, this.r0);
		rankup.setItem(10, this.r1);
		rankup.setItem(11, this.r2);
		rankup.setItem(12, this.r3);
		rankup.setItem(13, this.r4);
		rankup.setItem(14, this.r5);
		rankup.setItem(15, this.r6);
		rankup.setItem(16, this.r7);
		rankup.setItem(17, this.r8);
		this.getServer().getLogger().info("[Killstreaks] Plugin loaded and enabled");
	}

	@Override
	public void onDisable() {
		this.getServer().getLogger().info("[Killstreaks] Plugin unloaded and disabled");
	}

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (label.equalsIgnoreCase("ks")) {
			Player p = (Player)sender;
			p.openInventory(rankup);
		}

		return super.onCommand(sender, command, label, args);
	}

	@EventHandler
	public void onInventoryClick(InventoryClickEvent e) {
		if (e.getInventory().equals(rankup)) {
			Player p = (Player)e.getWhoClicked();
			e.setCancelled(true);
			p.closeInventory();
			int level = p.getLevel();
			if (e.getCurrentItem().isSimilar(this.k2) && p.getLevel() >= 2) {
				p.getInventory().setBoots(this.k2);
				p.sendMessage(ChatColor.RED + "[DPT.MC] " + ChatColor.GREEN + "Killstreak Item Sent.");
				p.setLevel(level - 2);
			}

			if (e.getCurrentItem().isSimilar(this.k3) && p.getLevel() >= 3) {
				p.getInventory().addItem(new ItemStack[]{this.k3});
				p.sendMessage(ChatColor.RED + "[DPT.MC] " + ChatColor.GREEN + "Killstreak Item Sent.");
				p.setLevel(level - 3);
			}

			if (e.getCurrentItem().isSimilar(this.k4) && p.getLevel() >= 4) {
				p.getInventory().addItem(new ItemStack[]{this.k4});
				p.sendMessage(ChatColor.RED + "[DPT.MC] " + ChatColor.GREEN + "Killstreak Item Sent.");
				p.setLevel(level - 4);
			}

			if (e.getCurrentItem().isSimilar(this.k5) && p.getLevel() >= 5) {
				p.getInventory().addItem(new ItemStack[]{this.k5});
				p.sendMessage(ChatColor.RED + "[DPT.MC] " + ChatColor.GREEN + "Killstreak Item Sent.");
				p.setLevel(level - 5);
			}

			if (e.getCurrentItem().equals(this.k6) && p.getLevel() >= 6) {
				p.getInventory().addItem(new ItemStack[]{this.k6});
				p.sendMessage(ChatColor.RED + "[DPT.MC] " + ChatColor.GREEN + "Killstreak Item Sent.");
				p.setLevel(level - 6);
			}

			if (e.getCurrentItem().equals(this.k7) && p.getLevel() >= 7) {
				p.getInventory().setChestplate(this.k7);
				p.sendMessage(ChatColor.RED + "[DPT.MC] " + ChatColor.GREEN + "Killstreak Item Sent.");
				p.setLevel(level - 7);
			}

			if (e.getCurrentItem().equals(this.k8) && p.getLevel() >= 8) {
				p.getInventory().addItem(new ItemStack[]{this.k8});
				p.sendMessage(ChatColor.RED + "[DPT.MC] " + ChatColor.GREEN + "Killstreak Item Sent.");
				p.setLevel(level - 8);
			}

			if (e.getCurrentItem().equals(this.k9) && p.getLevel() >= 9) {
				p.getInventory().addItem(new ItemStack[]{this.k9});
				p.sendMessage(ChatColor.RED + "[DPT.MC] " + ChatColor.GREEN + "Killstreak Item Sent.");
				p.setLevel(level - 9);
			}

			if (e.getCurrentItem().equals(this.k10) && p.getLevel() >= 10) {
				p.getInventory().addItem(new ItemStack[]{this.k10});
				p.sendMessage(ChatColor.RED + "[DPT.MC] " + ChatColor.GREEN + "Killstreak Item Sent.");
				p.setLevel(level - 10);
			}
		}
	}

	@EventHandler
	public void onEntityDeath(EntityDeathEvent e) {
		Player killer = e.getEntity().getKiller();
		Player death = (Player)e.getEntity();
		int level = killer.getLevel();
		killer.setLevel(level + 1);
		death.setLevel(0);
		if (level == 1) {
			killer.getInventory().addItem(new ItemStack[]{this.kss});
		}
	}

	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		if (p.getItemInHand().getType().equals(Material.LEGACY_BLAZE_POWDER)) {
			p.openInventory(rankup);
			p.playEffect(p.getLocation(), Effect.MOBSPAWNER_FLAMES, 1);
		}
	}
}
