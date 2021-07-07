package com.facebook.react.views.modal;

import android.content.DialogInterface;
import android.view.View;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.modal.ReactModalHostView;
import java.util.Map;

@ReactModule(name = ReactModalHostManager.REACT_CLASS)
public class ReactModalHostManager extends ViewGroupManager<ReactModalHostView> {
    public static final String REACT_CLASS = "RCTModalHostView";

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.builder().put(RequestCloseEvent.EVENT_NAME, MapBuilder.m946of("registrationName", "onRequestClose")).put(ShowEvent.EVENT_NAME, MapBuilder.m946of("registrationName", "onShow")).build();
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<? extends LayoutShadowNode> getShadowNodeClass() {
        return ModalHostShadowNode.class;
    }

    @ReactProp(name = "animationType")
    public void setAnimationType(ReactModalHostView reactModalHostView, String str) {
        reactModalHostView.setAnimationType(str);
    }

    @ReactProp(name = "hardwareAccelerated")
    public void setHardwareAccelerated(ReactModalHostView reactModalHostView, boolean z) {
        reactModalHostView.setHardwareAccelerated(z);
    }

    @ReactProp(name = "transparent")
    public void setTransparent(ReactModalHostView reactModalHostView, boolean z) {
        reactModalHostView.setTransparent(z);
    }

    public void addEventEmitters(ThemedReactContext themedReactContext, final ReactModalHostView reactModalHostView) {
        final EventDispatcher eventDispatcher = ((UIManagerModule) themedReactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher();
        reactModalHostView.setOnRequestCloseListener(new ReactModalHostView.OnRequestCloseListener() {
            /* class com.facebook.react.views.modal.ReactModalHostManager.C08671 */

            @Override // com.facebook.react.views.modal.ReactModalHostView.OnRequestCloseListener
            public void onRequestClose(DialogInterface dialogInterface) {
                eventDispatcher.dispatchEvent(new RequestCloseEvent(reactModalHostView.getId()));
            }
        });
        reactModalHostView.setOnShowListener(new DialogInterface.OnShowListener() {
            /* class com.facebook.react.views.modal.ReactModalHostManager.DialogInterface$OnShowListenerC08682 */

            public void onShow(DialogInterface dialogInterface) {
                eventDispatcher.dispatchEvent(new ShowEvent(reactModalHostView.getId()));
            }
        });
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public LayoutShadowNode createShadowNodeInstance() {
        return new ModalHostShadowNode();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactModalHostView createViewInstance(ThemedReactContext themedReactContext) {
        return new ReactModalHostView(themedReactContext);
    }

    public void onAfterUpdateTransaction(ReactModalHostView reactModalHostView) {
        super.onAfterUpdateTransaction((View) reactModalHostView);
        reactModalHostView.showOrUpdate();
    }

    public void onDropViewInstance(ReactModalHostView reactModalHostView) {
        super.onDropViewInstance((View) reactModalHostView);
        reactModalHostView.onDropInstance();
    }
}
