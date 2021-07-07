package com.facebook.react.views.drawer.events;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;

public class DrawerSlideEvent extends Event<DrawerSlideEvent> {
    public static final String EVENT_NAME = "topDrawerSlide";
    public final float mOffset;

    public DrawerSlideEvent(int i, float f) {
        super(i);
        this.mOffset = f;
    }

    private WritableMap serializeEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("offset", (double) getOffset());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), serializeEventData());
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return EVENT_NAME;
    }

    public float getOffset() {
        return this.mOffset;
    }
}
