
package net.mcreator.myfirstmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EndstickItem extends Item {
	public EndstickItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.UNCOMMON));
	}
}
