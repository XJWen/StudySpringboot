package com.study.springboot.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.nio.charset.Charset;

/**
 * 自定义http编码配置
 * **/
@ConfigurationProperties(prefix = "spring.http.encoding")
public class MyHttpEncodingProperties {
    //设置http编码方式
    public static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");

    private Charset charset = DEFAULT_CHARSET;

    private boolean force = true;

    public Charset getCharset() {
        return charset;
    }

    public void setCharset(Charset charset) {
        this.charset = charset;
    }

    public boolean isForce() {
        return force;
    }

    public void setForce(boolean force) {
        this.force = force;
    }
}
