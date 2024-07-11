
package net.mcreator.myfirstmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.myfirstmod.init.ALittleAddtionsModFluids;

public class BloodItem extends BucketItem {
	public BloodItem() {
		super(ALittleAddtionsModFluids.BLOOD, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.UNCOMMON));
	}
}
