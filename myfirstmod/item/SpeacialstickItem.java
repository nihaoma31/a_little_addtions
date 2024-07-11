
package net.mcreator.myfirstmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SpeacialstickItem extends Item {
	public SpeacialstickItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.EPIC));
	}
}
