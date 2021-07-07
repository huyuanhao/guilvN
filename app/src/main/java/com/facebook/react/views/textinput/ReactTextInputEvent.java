package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;

public class ReactTextInputEvent extends Event<ReactTextInputEvent> {
    public static final String EVENT_NAME = "topTextInput";
    public String mPreviousText;
    public int mRangeEnd;
    public int mRangeStart;
    public String mText;

    public ReactTextInputEvent(int i, String str, String str2, int i2, int i3) {
        super(i);
        this.mText = str;
        this.mPreviousText = str2;
        this.mRangeStart = i2;
        this.mRangeEnd = i3;
    }

    private WritableMap serializeEventData() {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble(ViewProps.START, (double) this.mRangeStart);
        createMap2.putDouble(ViewProps.END, (double) this.mRangeEnd);
        createMap.putString("text", this.mText);
        createMap.putString("previousText", this.mPreviousText);
        createMap.putMap("range", createMap2);
        createMap.putInt("target", getViewTag());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), serializeEventData());
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return EVENT_NAME;
    }
}
