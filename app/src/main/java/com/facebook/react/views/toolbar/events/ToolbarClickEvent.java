package com.facebook.react.views.toolbar.events;

import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;

public class ToolbarClickEvent extends Event<ToolbarClickEvent> {
    public static final String EVENT_NAME = "topSelect";
    public final int position;

    public ToolbarClickEvent(int i, int i2) {
        super(i);
        this.position = i2;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("position", getPosition());
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), writableNativeMap);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topSelect";
    }

    public int getPosition() {
        return this.position;
    }
}
