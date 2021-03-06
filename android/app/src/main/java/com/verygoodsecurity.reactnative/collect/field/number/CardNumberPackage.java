package com.verygoodsecurity.reactnative.collect.field.number;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import com.verygoodsecurity.reactnative.collect.VGSCollectOnCreateViewInstanceListener;

public class CardNumberPackage implements ReactPackage {

  private VGSCollectOnCreateViewInstanceListener listener;
  private CardNumberManager calManager;

  public CardNumberPackage(VGSCollectOnCreateViewInstanceListener listener) {
    this.listener = listener;
  }

  @Override
  public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
      if (calManager == null) {
        calManager = new CardNumberManager(listener);
      }
      return Arrays.<NativeModule>asList(
              new CardNumberModule(reactContext, calManager)
      );
  }

  @Override
  public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
    if (calManager == null) {
      calManager = new CardNumberManager(listener);
    }
    return Arrays.<ViewManager>asList(
            calManager
    );
  }
}