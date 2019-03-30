package com.itheone.redis;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author caohaifengx@163.com 2019-03-14 16:42
 */
@ConfigurationProperties(prefix = "redis")
public class RedisProperties {

    private String host;
    private int port;

    public int getPort() {
        return port;
    }
    public void setPort(int port) {
        this.port = port;
    }
    public String getHost() {
        return host;
    }
    public void setHost(String host) {
        this.host = host;
    }
}
