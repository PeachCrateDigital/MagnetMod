package io.peachapps.magnetized.init;

import io.peachapps.magnetized.Magnetized;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import java.util.function.Supplier;

public class ModItemGroups {

    public static final ItemGroup MOD_ITEM_GROUP = new ModItemGroup(Magnetized.MODID, () -> new ItemStack(ModItems.LOAD_STONE));

    public static class ModItemGroup extends ItemGroup {
        public final Supplier<ItemStack> iconStupplier;

        public ModItemGroup(final String name, final Supplier<ItemStack> iconSupplier) {
            super(name);
            this.iconStupplier = iconSupplier;
        }

        @Override
        public ItemStack createIcon() {
            return iconStupplier.get();
        }
    }
}
