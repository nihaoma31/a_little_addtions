
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.myfirstmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.myfirstmod.ALittleAddtionsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ALittleAddtionsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ALittleAddtionsMod.MODID);
	public static final RegistryObject<CreativeModeTab> ALLTHENEWTHINGS = REGISTRY.register("allthenewthings",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.a_little_addtions.allthenewthings")).icon(() -> new ItemStack(ALittleAddtionsModItems.YUZUSSWORD.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ALittleAddtionsModItems.SPEACIALSTICK.get());
				tabData.accept(ALittleAddtionsModItems.YUZUSSWORD.get());
				tabData.accept(ALittleAddtionsModBlocks.ENDLEAVES.get().asItem());
				tabData.accept(ALittleAddtionsModBlocks.ENDGRASS.get().asItem());
				tabData.accept(ALittleAddtionsModItems.ENDSTICK.get());
				tabData.accept(ALittleAddtionsModItems.ENDWOODPICKAXE_2.get());
				tabData.accept(ALittleAddtionsModItems.GOLDENWIND.get());
				tabData.accept(ALittleAddtionsModBlocks.TREE.get().asItem());
				tabData.accept(ALittleAddtionsModBlocks.EMLEAVES.get().asItem());
				tabData.accept(ALittleAddtionsModBlocks.EMWOOD.get().asItem());
				tabData.accept(ALittleAddtionsModItems.EMSTICK.get());
				tabData.accept(ALittleAddtionsModItems.MYMASK_HELMET.get());
				tabData.accept(ALittleAddtionsModItems.MYMASK_CHESTPLATE.get());
				tabData.accept(ALittleAddtionsModItems.MYMASK_LEGGINGS.get());
				tabData.accept(ALittleAddtionsModItems.MYMASK_BOOTS.get());
				tabData.accept(ALittleAddtionsModBlocks.AYYAYA.get().asItem());
				tabData.accept(ALittleAddtionsModItems.OMGOMGOMGOHYAYAYAY.get());
				tabData.accept(ALittleAddtionsModBlocks.BLOODYCORE.get().asItem());
				tabData.accept(ALittleAddtionsModItems.CORE.get());
				tabData.accept(ALittleAddtionsModItems.BLOOD_BUCKET.get());
				tabData.accept(ALittleAddtionsModItems.SUYUZASWORD.get());
				tabData.accept(ALittleAddtionsModItems.ENHANCEDIRON.get());
				tabData.accept(ALittleAddtionsModBlocks.MOSS_2.get().asItem());
				tabData.accept(ALittleAddtionsModItems.BLUEROSE.get());
				tabData.accept(ALittleAddtionsModItems.THUNDERINGPULSE.get());
				tabData.accept(ALittleAddtionsModBlocks.ENDSOIL.get().asItem());
				tabData.accept(ALittleAddtionsModBlocks.WOD.get().asItem());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(ALittleAddtionsModBlocks.ENDWOOD.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(ALittleAddtionsModItems.BETTEREND.get());
		}
	}
}
