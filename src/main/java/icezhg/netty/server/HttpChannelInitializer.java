package icezhg.netty.server;

import icezhg.netty.encoder.TimeEncoder;
import icezhg.netty.encoder.TimeEncoder2;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpRequestDecoder;
import io.netty.handler.codec.http.HttpRequestEncoder;

/**
 * Created by zhongjibing on 2018/11/17.
 */
public class HttpChannelInitializer extends ChannelInitializer {
    @Override
    protected void initChannel(Channel channel) throws Exception {
        channel.pipeline()
//                .addLast("decoder", new HttpRequestDecoder())
//                .addLast("encoder", new HttpRequestEncoder())
//                .addLast("aggregator", new HttpObjectAggregator(512*1024))
//                .addLast("handler", new TimeServerHandler());
                .addLast(new TimeEncoder2(), new TimeServerHandler2());
    }
}
