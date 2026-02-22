package to.bricks.eavyarmory.item;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import to.bricks.eavyarmory.EavyArmory;
import to.bricks.eavyarmory.item.custom.ModArmorItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EavyArmory.MOD_ID);

    //MATERIALS
    public static final RegistryObject<Item> CERAMITE_INGOT = ITEMS.register("ceramite_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COMPOUND = ITEMS.register("compound",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CERAMITEPOWDER = ITEMS.register("ceramite_powder",
            () -> new Item(new Item.Properties()));

    //ARMOR
    public static final RegistryObject<Item> LIGHTPOWERHELMET = ITEMS.register("light_power_armor_helmet",
            () -> new ModArmorItem(ModArmorMaterials.POWER1, ModArmorItem.Type.HELMET,new Item.Properties()));
    public static final RegistryObject<Item> LIGHTPOWERCHEST = ITEMS.register("light_power_armor_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.POWER1, ModArmorItem.Type.CHESTPLATE,new Item.Properties()));
    public static final RegistryObject<Item> LIGHTPOWERLEGGINGS = ITEMS.register("light_power_armor_leggings",
            () -> new ModArmorItem(ModArmorMaterials.POWER1, ModArmorItem.Type.LEGGINGS,new Item.Properties()));
    public static final RegistryObject<Item> LIGHTPOWERBOOTS = ITEMS.register("light_power_armor_boots",
            () -> new ModArmorItem(ModArmorMaterials.POWER1, ModArmorItem.Type.BOOTS,new Item.Properties()));

    public static final RegistryObject<Item> POWERHELMET = ITEMS.register("power_armor_helmet",
            () -> new ModArmorItem(ModArmorMaterials.POWER2, ModArmorItem.Type.HELMET,new Item.Properties()));
    public static final RegistryObject<Item> POWERCHEST = ITEMS.register("power_armor_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.POWER2, ModArmorItem.Type.CHESTPLATE,new Item.Properties()));
    public static final RegistryObject<Item> POWERLEGGINGS = ITEMS.register("power_armor_leggings",
            () -> new ModArmorItem(ModArmorMaterials.POWER2, ModArmorItem.Type.LEGGINGS,new Item.Properties()));
    public static final RegistryObject<Item> POWERBOOTS = ITEMS.register("power_armor_boots",
            () -> new ModArmorItem(ModArmorMaterials.POWER2, ModArmorItem.Type.BOOTS,new Item.Properties()));

    public static final RegistryObject<Item> ADVPOWERHELMET = ITEMS.register("advanced_power_armor_helmet",
            () -> new ModArmorItem(ModArmorMaterials.POWER3, ModArmorItem.Type.HELMET,new Item.Properties()));
    public static final RegistryObject<Item> ADVPOWERCHEST = ITEMS.register("advanced_power_armor_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.POWER3, ModArmorItem.Type.CHESTPLATE,new Item.Properties()));
    public static final RegistryObject<Item> ADVPOWERLEGGINGS = ITEMS.register("advanced_power_armor_leggings",
            () -> new ModArmorItem(ModArmorMaterials.POWER3, ModArmorItem.Type.LEGGINGS,new Item.Properties()));
    public static final RegistryObject<Item> ADVPOWERBOOTS = ITEMS.register("advanced_power_armor_boots",
            () -> new ModArmorItem(ModArmorMaterials.POWER3, ModArmorItem.Type.BOOTS,new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
