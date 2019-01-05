package com.bulingbuu;

import com.bulingbuu.verticle.MyFirstVerticle;
import io.vertx.core.Vertx;

/**
 * @author bulingbuu
 * @date 19-1-5 下午8:34
 */
public class HelloWorld {
    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(MyFirstVerticle.class.getName());
    }
}
