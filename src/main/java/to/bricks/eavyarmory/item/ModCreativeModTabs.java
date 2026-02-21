package to.bricks.eavyarmory.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import to.bricks.eavyarmory.EavyArmory;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EavyArmory.MOD_ID);

    public static final RegistryObject<CreativeModeTab> EAVYARMORY_TAB = CREATIVE_MODE_TAB.register("eavyarmory_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CERAMITE_INGOT.get()))
                    .title(Component.translatable("creativetab.eavyarmory_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        for(RegistryObject<Item> item : ModItems.ITEMS.getEntries()) {
                            pOutput.accept(item.get());
                        }
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
