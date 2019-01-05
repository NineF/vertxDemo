package com.bulingbuu.verticle;

import io.vertx.core.AbstractVerticle;

/**
 * @author bulingbuu
 * @date 19-1-5 下午8:36
 */
public class MyFirstVerticle extends AbstractVerticle {

    @Override
    public void start() {
        vertx.createHttpServer().requestHandler(req -> {
            req.response()
               .putHeader("content-type", "text/plain")
               .end("Hello World!");
        }).listen(8080);
    }
}
