
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.myfirstmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.myfirstmod.block.WodBlock;
import net.mcreator.myfirstmod.block.TreeBlock;
import net.mcreator.myfirstmod.block.OmgomgomgohyayayayPortalBlock;
import net.mcreator.myfirstmod.block.Moss2Block;
import net.mcreator.myfirstmod.block.EndwoodblockBlock;
import net.mcreator.myfirstmod.block.EndwoodBlock;
import net.mcreator.myfirstmod.block.EndsoilBlock;
import net.mcreator.myfirstmod.block.EndleavesBlock;
import net.mcreator.myfirstmod.block.EndgrassBlock;
import net.mcreator.myfirstmod.block.EmwoodBlock;
import net.mcreator.myfirstmod.block.EmleavesBlock;
import net.mcreator.myfirstmod.block.CorePortalBlock;
import net.mcreator.myfirstmod.block.BloodycoreBlock;
import net.mcreator.myfirstmod.block.BloodBlock;
import net.mcreator.myfirstmod.block.BetterendPortalBlock;
import net.mcreator.myfirstmod.block.AyyayaBlock;
import net.mcreator.myfirstmod.ALittleAddtionsMod;

public class ALittleAddtionsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ALittleAddtionsMod.MODID);
	public static final RegistryObject<Block> ENDWOOD = REGISTRY.register("endwood", () -> new EndwoodBlock());
	public static final RegistryObject<Block> ENDLEAVES = REGISTRY.register("endleaves", () -> new EndleavesBlock());
	public static final RegistryObject<Block> ENDGRASS = REGISTRY.register("endgrass", () -> new EndgrassBlock());
	public static final RegistryObject<Block> ENDWOODBLOCK = REGISTRY.register("endwoodblock", () -> new EndwoodblockBlock());
	public static final RegistryObject<Block> BETTEREND_PORTAL = REGISTRY.register("betterend_portal", () -> new BetterendPortalBlock());
	public static final RegistryObject<Block> TREE = REGISTRY.register("tree", () -> new TreeBlock());
	public static final RegistryObject<Block> EMLEAVES = REGISTRY.register("emleaves", () -> new EmleavesBlock());
	public static final RegistryObject<Block> EMWOOD = REGISTRY.register("emwood", () -> new EmwoodBlock());
	public static final RegistryObject<Block> AYYAYA = REGISTRY.register("ayyaya", () -> new AyyayaBlock());
	public static final RegistryObject<Block> OMGOMGOMGOHYAYAYAY_PORTAL = REGISTRY.register("omgomgomgohyayayay_portal", () -> new OmgomgomgohyayayayPortalBlock());
	public static final RegistryObject<Block> BLOODYCORE = REGISTRY.register("bloodycore", () -> new BloodycoreBlock());
	public static final RegistryObject<Block> CORE_PORTAL = REGISTRY.register("core_portal", () -> new CorePortalBlock());
	public static final RegistryObject<Block> BLOOD = REGISTRY.register("blood", () -> new BloodBlock());
	public static final RegistryObject<Block> MOSS_2 = REGISTRY.register("moss_2", () -> new Moss2Block());
	public static final RegistryObject<Block> ENDSOIL = REGISTRY.register("endsoil", () -> new EndsoilBlock());
	public static final RegistryObject<Block> WOD = REGISTRY.register("wod", () -> new WodBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
