
package net.mcreator.myfirstmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EmstickItem extends Item {
	public EmstickItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
