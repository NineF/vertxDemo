package com.bulingbuu.verticle;

import io.vertx.core.AbstractVerticle;

/**
 * @author bulingbuu
 * @date 19-1-5 下午8:42
 */
public class MainVerticle extends AbstractVerticle {
    @Override
    public void start() {
        vertx.deployVerticle(MyFirstVerticle.class.getName());
    }
}