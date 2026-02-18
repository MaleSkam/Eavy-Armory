package to.bricks.eavyarmory.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import to.bricks.eavyarmory.EavyArmory;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EavyArmory.MOD_ID);

    public static final RegistryObject<Item> CERAMITE = ITEMS.register("ceramite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COMPOUND = ITEMS.register("compound",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
