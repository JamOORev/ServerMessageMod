package servermessagemod.core.network.packets;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;

/**
 * Created by poppypoppop on 23/08/2014.
 */
public class PacketTPAAccept implements IMessage, IMessageHandler<PacketTPAAccept, IMessage> {
    public String name = "";
    public boolean accept;
    public int x, y, z;

    public PacketTPAAccept() {

    }

    public PacketTPAAccept(String a_name, boolean a_accept, int a_x, int a_y, int a_z) {
        name = a_name;
        accept = a_accept;
        x = a_x;
        y = a_y;
        z = a_y;
    }

    @Override
    public void fromBytes(ByteBuf buf) {

    }

    @Override
    public void toBytes(ByteBuf buf) {
    	
    }

    @Override
    public IMessage onMessage(PacketTPAAccept message, MessageContext ctx) {
        return null;
    }
}
