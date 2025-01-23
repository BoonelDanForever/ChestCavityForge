package net.tigereye.chestcavity.util;

import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.Mod;
import net.tigereye.chestcavity.ChestCavity;

@Mod.EventBusSubscriber(modid = ChestCavity.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ForgeEventBusSubscriber {

    //@SubscribeEvent
    public static void loadCustomResources(WorldEvent.Load event) {

    }
}
