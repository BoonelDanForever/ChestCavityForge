package net.tigereye.chestcavity.mixin;


//@Mixin(HandshakeHandler.class)
public class MixinHanshake {

    //@Inject(at = @At("TAIL"), method = "<init>")
    //public void sendServerPackets(Connection networkManager, NetworkDirection side, CallbackInfo ci) {
    //    if(side == NetworkDirection.LOGIN_TO_CLIENT) {
    //        int count = OrganManager.GeneratedOrganData.size();
    //        ArrayList<OrganDataPacketHelper> helpers = new ArrayList<>();
    //        OrganManager.GeneratedOrganData.forEach((id, data) -> helpers.add(new OrganDataPacketHelper(id, data.pseudoOrgan, data.organScores.size(), data.organScores)));
    //        //System.out.println("BOONELDAN TEST PACKET SENT");
    //        NetworkHandler.CHANNEL.send(PacketDistributor.ALL.noArg(), new OrganDataPacket(count, helpers));
    //    }
    //}
}
