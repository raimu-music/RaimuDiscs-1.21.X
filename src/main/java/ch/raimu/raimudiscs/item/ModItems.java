package ch.raimu.raimudiscs.item;

import ch.raimu.raimudiscs.RaimuDiscsMod;
import ch.raimu.raimudiscs.sound.ModSounds;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.awt.*;
import java.util.List;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(RaimuDiscsMod.MOD_ID);



    public static final DeferredItem<Item> DISC_BLUE_DAWN = ITEMS.register("blue_dawn_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.BLUE_DAWN_KEY).stacksTo(1)));
    public static final DeferredItem<Item> DISC_OVERGROWN = ITEMS.register("overgrown_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.OVERGROWN_KEY).stacksTo(1)));
    public static final DeferredItem<Item> DISC_NATSUKASHII = ITEMS.register("natsukashii_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.NATSUKASHII_KEY).stacksTo(1)));
    public static final DeferredItem<Item> DISC_KAZE_NI_NATTE = ITEMS.register("kaze_ni_natte_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.KAZE_NI_NATTE_KEY).stacksTo(1)));
    public static final DeferredItem<Item> DISC_DANDELIONS_LULLABY = ITEMS.register("dandelions_lullaby_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.DANDELIONS_LULLABY_KEY).stacksTo(1)));
    public static final DeferredItem<Item> DISC_NAP_TIME_IN_SHIBUYA = ITEMS.register("nap_time_in_shibuya_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.NAP_TIME_IN_SHIBUYA_KEY).stacksTo(1)));
    public static final DeferredItem<Item> DISC_EARTH_CALLING = ITEMS.register("earth_calling_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.EARTH_CALLING_KEY).stacksTo(1)));
    public static final DeferredItem<Item> DISC_FLUID_MIND = ITEMS.register("fluid_mind_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.FLUID_MIND_KEY).stacksTo(1)));


    public static final DeferredItem<Item> FRAGMENT_OVERGROWN = ITEMS.register("overgrown_fragment",
            () -> new Item(new Item.Properties()){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.raimudiscsmod.overgrown_fragment.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> FRAGMENT_BLUE_DAWN = ITEMS.register("blue_dawn_fragment",
            () -> new Item(new Item.Properties()){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.raimudiscsmod.blue_dawn_fragment.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> FRAGMENT_NATSUKASHII = ITEMS.register("natsukashii_fragment",
            () -> new Item(new Item.Properties()){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.raimudiscsmod.natsukashii_fragment.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> FRAGMENT_KAZE_NI_NATTE = ITEMS.register("kaze_ni_natte_fragment",
            () -> new Item(new Item.Properties()){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.raimudiscsmod.kaze_ni_natte_fragment.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> FRAGMENT_DANDELIONS_LULLABY = ITEMS.register("dandelions_lullaby_fragment",
            () -> new Item(new Item.Properties()){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.raimudiscsmod.dandelions_lullaby_fragment.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> FRAGMENT_NAP_TIME_IN_SHIBUYA = ITEMS.register("nap_time_in_shibuya_fragment",
            () -> new Item(new Item.Properties()){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.raimudiscsmod.nap_time_in_shibuya_fragment.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> FRAGMENT_EARTH_CALLING = ITEMS.register("earth_calling_fragment",
            () -> new Item(new Item.Properties()){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.raimudiscsmod.earth_calling_fragment.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> FRAGMENT_FLUID_MIND = ITEMS.register("fluid_mind_fragment",
            () -> new Item(new Item.Properties()){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.raimudiscsmod.fluid_mind_fragment.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });





    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
