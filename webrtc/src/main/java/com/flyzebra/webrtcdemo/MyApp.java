/**
 * FileName: MyApp
 * Author: FlyZebra
 * Email:flycnzebra@gmail.com
 * Date: 2023/5/28 8:22
 * Description:
 */
package com.flyzebra.webrtcdemo;

import android.app.Application;

import org.webrtc.PeerConnectionFactory;

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        PeerConnectionFactory.initialize(PeerConnectionFactory
                .InitializationOptions
                .builder(this)
                .setEnableInternalTracer(true)
                .createInitializationOptions());
    }
}
