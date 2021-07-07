package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;

public class ReactContentSizeChangedEvent extends Event<ReactTextChangedEvent> {
    public static final String EVENT_NAME = "topContentSizeChange";
    public float mContentHeight;
    public float mContentWidth;

    public ReactContentSizeChangedEvent(int i, float f, float f2) {
        super(i);
        this.mContentWidth = f;
        this.mContentHeight = f2;
    }

    private WritableMap serializeEventData() {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble("width", (double) this.mContentWidth);
        createMap2.putDouble("height", (double) this.mContentHeight);
        createMap.putMap("contentSize", createMap2);
        createMap.putInt("target", getViewTag());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), serializeEventData());
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topContentSizeChange";
    }
}
