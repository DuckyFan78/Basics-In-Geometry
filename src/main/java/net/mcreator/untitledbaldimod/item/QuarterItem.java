
package net.mcreator.untitledbaldimod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class QuarterItem extends Item {
	public QuarterItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
