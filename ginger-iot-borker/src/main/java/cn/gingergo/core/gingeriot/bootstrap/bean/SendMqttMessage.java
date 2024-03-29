package cn.gingergo.core.gingeriot.bootstrap.bean;

import cn.gingergo.core.gingeriot.enums.ConfirmStatus;
import io.netty.channel.Channel;
import io.netty.handler.codec.mqtt.MqttQoS;
import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class SendMqttMessage {

    private int messageId;

    private Channel channel;

    private volatile ConfirmStatus confirmStatus;

    private long time;

    private byte[]  byteBuf;

    private boolean isRetain;

    private MqttQoS qos;

    private String topic;

}
