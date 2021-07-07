package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;

public class ReactTextChangedEvent extends Event<ReactTextChangedEvent> {
    public static final String EVENT_NAME = "topChange";
    public int mEventCount;
    public String mText;

    public ReactTextChangedEvent(int i, String str, int i2) {
        super(i);
        this.mText = str;
        this.mEventCount = i2;
    }

    private WritableMap serializeEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("text", this.mText);
        createMap.putInt("eventCount", this.mEventCount);
        createMap.putInt("target", getViewTag());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), serializeEventData());
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topChange";
    }
}
