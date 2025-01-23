package net.tigereye.chestcavity.util;


import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.network.PacketDistributor;
import net.tigereye.chestcavity.chestcavities.instance.ChestCavityInstance;
import net.tigereye.chestcavity.network.NetworkHandler;
import net.tigereye.chestcavity.network.packets.ChestCavityUpdatePacket;

import java.util.Map;

public class NetworkUtil {
    //S2C = SERVER TO CLIENT //I think

    public static boolean SendS2CChestCavityUpdatePacket(ChestCavityInstance cc){
        cc.updateInstantiated = true;
        if((!cc.owner.level.isClientSide()) && cc.owner instanceof ServerPlayerEntity) {
            ServerPlayerEntity spe = (ServerPlayerEntity) cc.owner;
            Map<ResourceLocation, Float> organScores = cc.getOrganScores();
            NetworkHandler.CHANNEL.send(PacketDistributor.TRACKING_ENTITY.with(() -> spe), new ChestCavityUpdatePacket(cc.opened, organScores.size(), organScores));
            return true;
        }
        return false;
    }
}
