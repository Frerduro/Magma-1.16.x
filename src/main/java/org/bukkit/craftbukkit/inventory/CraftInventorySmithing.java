package org.bukkit.craftbukkit.inventory;

import net.minecraft.inventory.IInventory;
import org.bukkit.inventory.SmithingInventory;

public class CraftInventorySmithing extends CraftResultInventory implements SmithingInventory {

    public CraftInventorySmithing(IInventory inventory, IInventory resultInventory) {
        super(inventory, resultInventory);
    }
}
