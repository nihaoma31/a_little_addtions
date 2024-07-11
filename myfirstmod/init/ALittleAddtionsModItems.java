
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.myfirstmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.myfirstmod.item.YuzusswordItem;
import net.mcreator.myfirstmod.item.ThunderingpulseItem;
import net.mcreator.myfirstmod.item.SuyuzaswordItem;
import net.mcreator.myfirstmod.item.SpeacialstickItem;
import net.mcreator.myfirstmod.item.OmgomgomgohyayayayItem;
import net.mcreator.myfirstmod.item.MymaskItem;
import net.mcreator.myfirstmod.item.GOLDENWINDItem;
import net.mcreator.myfirstmod.item.EnhancedironItem;
import net.mcreator.myfirstmod.item.Endwoodpickaxe2Item;
import net.mcreator.myfirstmod.item.EndstickItem;
import net.mcreator.myfirstmod.item.EmstickItem;
import net.mcreator.myfirstmod.item.CoreItem;
import net.mcreator.myfirstmod.item.BlueroseItem;
import net.mcreator.myfirstmod.item.BloodItem;
import net.mcreator.myfirstmod.item.BetterendItem;
import net.mcreator.myfirstmod.ALittleAddtionsMod;

public class ALittleAddtionsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ALittleAddtionsMod.MODID);
	public static final RegistryObject<Item> YUZUSSWORD = REGISTRY.register("yuzussword", () -> new YuzusswordItem());
	public static final RegistryObject<Item> SPEACIALSTICK = REGISTRY.register("speacialstick", () -> new SpeacialstickItem());
	public static final RegistryObject<Item> ENDWOOD = block(ALittleAddtionsModBlocks.ENDWOOD);
	public static final RegistryObject<Item> ENDLEAVES = block(ALittleAddtionsModBlocks.ENDLEAVES);
	public static final RegistryObject<Item> ENDGRASS = block(ALittleAddtionsModBlocks.ENDGRASS);
	public static final RegistryObject<Item> ENDWOODBLOCK = block(ALittleAddtionsModBlocks.ENDWOODBLOCK);
	public static final RegistryObject<Item> ENDSTICK = REGISTRY.register("endstick", () -> new EndstickItem());
	public static final RegistryObject<Item> ENDWOODPICKAXE_2 = REGISTRY.register("endwoodpickaxe_2", () -> new Endwoodpickaxe2Item());
	public static final RegistryObject<Item> BETTEREND = REGISTRY.register("betterend", () -> new BetterendItem());
	public static final RegistryObject<Item> GOLDENWIND = REGISTRY.register("goldenwind", () -> new GOLDENWINDItem());
	public static final RegistryObject<Item> TREE = block(ALittleAddtionsModBlocks.TREE);
	public static final RegistryObject<Item> EMLEAVES = block(ALittleAddtionsModBlocks.EMLEAVES);
	public static final RegistryObject<Item> EMWOOD = block(ALittleAddtionsModBlocks.EMWOOD);
	public static final RegistryObject<Item> EMSTICK = REGISTRY.register("emstick", () -> new EmstickItem());
	public static final RegistryObject<Item> MYMASK_HELMET = REGISTRY.register("mymask_helmet", () -> new MymaskItem.Helmet());
	public static final RegistryObject<Item> MYMASK_CHESTPLATE = REGISTRY.register("mymask_chestplate", () -> new MymaskItem.Chestplate());
	public static final RegistryObject<Item> MYMASK_LEGGINGS = REGISTRY.register("mymask_leggings", () -> new MymaskItem.Leggings());
	public static final RegistryObject<Item> MYMASK_BOOTS = REGISTRY.register("mymask_boots", () -> new MymaskItem.Boots());
	public static final RegistryObject<Item> AYYAYA = block(ALittleAddtionsModBlocks.AYYAYA);
	public static final RegistryObject<Item> OMGOMGOMGOHYAYAYAY = REGISTRY.register("omgomgomgohyayayay", () -> new OmgomgomgohyayayayItem());
	public static final RegistryObject<Item> BLOODYCORE = block(ALittleAddtionsModBlocks.BLOODYCORE);
	public static final RegistryObject<Item> CORE = REGISTRY.register("core", () -> new CoreItem());
	public static final RegistryObject<Item> BLOOD_BUCKET = REGISTRY.register("blood_bucket", () -> new BloodItem());
	public static final RegistryObject<Item> SUYUZASWORD = REGISTRY.register("suyuzasword", () -> new SuyuzaswordItem());
	public static final RegistryObject<Item> ENHANCEDIRON = REGISTRY.register("enhancediron", () -> new EnhancedironItem());
	public static final RegistryObject<Item> MOSS_2 = block(ALittleAddtionsModBlocks.MOSS_2);
	public static final RegistryObject<Item> BLUEROSE = REGISTRY.register("bluerose", () -> new BlueroseItem());
	public static final RegistryObject<Item> THUNDERINGPULSE = REGISTRY.register("thunderingpulse", () -> new ThunderingpulseItem());
	public static final RegistryObject<Item> ENDSOIL = block(ALittleAddtionsModBlocks.ENDSOIL);
	public static final RegistryObject<Item> WOD = block(ALittleAddtionsModBlocks.WOD);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
