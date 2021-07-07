package com.facebook.react.views.checkbox;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;

public class ReactCheckBoxEvent extends Event<ReactCheckBoxEvent> {
    public static final String EVENT_NAME = "topChange";
    public final boolean mIsChecked;

    public ReactCheckBoxEvent(int i, boolean z) {
        super(i);
        this.mIsChecked = z;
    }

    private WritableMap serializeEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("target", getViewTag());
        createMap.putBoolean("value", getIsChecked());
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
        return "topChange";
    }

    public boolean getIsChecked() {
        return this.mIsChecked;
    }
}
