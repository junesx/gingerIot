package cn.gingergo.core.gingeriot.bootstrap.coder;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;

import java.util.List;

/**
 * WebSocketFrameToByteBufDecoder
 **/
public class WebSocketFrameToByteBufDecoder extends MessageToMessageDecoder<BinaryWebSocketFrame> {

    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, BinaryWebSocketFrame wsFrame, List<Object> out) throws Exception {
        ByteBuf buf = wsFrame.content();
        buf.retain();
        out.add(buf);
    }
}
