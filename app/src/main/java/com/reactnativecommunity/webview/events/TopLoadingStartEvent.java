package com.reactnativecommunity.webview.events;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.p118pd.sdk.O0o0o;
import com.p118pd.sdk.o0O0OO00;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo43195d2 = {"Lcom/reactnativecommunity/webview/events/TopLoadingStartEvent;", "Lcom/facebook/react/uimanager/events/Event;", "viewId", "", "mEventData", "Lcom/facebook/react/bridge/WritableMap;", "(ILcom/facebook/react/bridge/WritableMap;)V", "canCoalesce", "", "dispatch", "", "rctEventEmitter", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "getCoalescingKey", "", "getEventName", "", "Companion", "react-native-webview_release"}, mo43196k = 1, mo43197mv = {1, 1, 13})
public final class TopLoadingStartEvent extends Event<TopLoadingStartEvent> {
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final String EVENT_NAME = "topLoadingStart";
    public final WritableMap mEventData;

    @Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo43195d2 = {"Lcom/reactnativecommunity/webview/events/TopLoadingStartEvent$Companion;", "", "()V", "EVENT_NAME", "", "react-native-webview_release"}, mo43196k = 1, mo43197mv = {1, 1, 13})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(O0o0o o0o0o) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TopLoadingStartEvent(int i, @NotNull WritableMap writableMap) {
        super(i);
        o0O0OO00.OooO0o(writableMap, "mEventData");
        this.mEventData = writableMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatch(@NotNull RCTEventEmitter rCTEventEmitter) {
        o0O0OO00.OooO0o(rCTEventEmitter, "rctEventEmitter");
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), this.mEventData);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    @NotNull
    public String getEventName() {
        return "topLoadingStart";
    }
}
