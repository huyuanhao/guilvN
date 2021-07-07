package com.facebook.react.uimanager;

import android.widget.ImageView;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.events.TouchEventType;
import com.facebook.react.views.textinput.ReactTextInputSelectionEvent;
import java.util.HashMap;
import java.util.Map;

public class UIManagerModuleConstants {
    public static final String ACTION_DISMISSED = "dismissed";
    public static final String ACTION_ITEM_SELECTED = "itemSelected";

    public static Map getBubblingEventTypeConstants() {
        return MapBuilder.builder().put("topChange", MapBuilder.m946of("phasedRegistrationNames", MapBuilder.m947of("bubbled", "onChange", "captured", "onChangeCapture"))).put("topSelect", MapBuilder.m946of("phasedRegistrationNames", MapBuilder.m947of("bubbled", "onSelect", "captured", "onSelectCapture"))).put(TouchEventType.getJSEventName(TouchEventType.START), MapBuilder.m946of("phasedRegistrationNames", MapBuilder.m947of("bubbled", "onTouchStart", "captured", "onTouchStartCapture"))).put(TouchEventType.getJSEventName(TouchEventType.MOVE), MapBuilder.m946of("phasedRegistrationNames", MapBuilder.m947of("bubbled", "onTouchMove", "captured", "onTouchMoveCapture"))).put(TouchEventType.getJSEventName(TouchEventType.END), MapBuilder.m946of("phasedRegistrationNames", MapBuilder.m947of("bubbled", "onTouchEnd", "captured", "onTouchEndCapture"))).put(TouchEventType.getJSEventName(TouchEventType.CANCEL), MapBuilder.m946of("phasedRegistrationNames", MapBuilder.m947of("bubbled", "onTouchCancel", "captured", "onTouchCancelCapture"))).build();
    }

    public static Map<String, Object> getConstants() {
        HashMap newHashMap = MapBuilder.newHashMap();
        newHashMap.put("UIView", MapBuilder.m946of("ContentMode", MapBuilder.m948of("ScaleAspectFit", Integer.valueOf(ImageView.ScaleType.FIT_CENTER.ordinal()), "ScaleAspectFill", Integer.valueOf(ImageView.ScaleType.CENTER_CROP.ordinal()), "ScaleAspectCenter", Integer.valueOf(ImageView.ScaleType.CENTER_INSIDE.ordinal()))));
        newHashMap.put("StyleConstants", MapBuilder.m946of("PointerEventsValues", MapBuilder.m949of("none", Integer.valueOf(PointerEvents.NONE.ordinal()), "boxNone", Integer.valueOf(PointerEvents.BOX_NONE.ordinal()), "boxOnly", Integer.valueOf(PointerEvents.BOX_ONLY.ordinal()), "unspecified", Integer.valueOf(PointerEvents.AUTO.ordinal()))));
        newHashMap.put("PopupMenu", MapBuilder.m947of("dismissed", "dismissed", ACTION_ITEM_SELECTED, ACTION_ITEM_SELECTED));
        newHashMap.put("AccessibilityEventTypes", MapBuilder.m948of("typeWindowStateChanged", 32, "typeViewFocused", 8, "typeViewClicked", 1));
        return newHashMap;
    }

    public static Map getDirectEventTypeConstants() {
        return MapBuilder.builder().put("topContentSizeChange", MapBuilder.m946of("registrationName", "onContentSizeChange")).put("topLayout", MapBuilder.m946of("registrationName", ViewProps.ON_LAYOUT)).put("topLoadingError", MapBuilder.m946of("registrationName", "onLoadingError")).put("topLoadingFinish", MapBuilder.m946of("registrationName", "onLoadingFinish")).put("topLoadingStart", MapBuilder.m946of("registrationName", "onLoadingStart")).put(ReactTextInputSelectionEvent.EVENT_NAME, MapBuilder.m946of("registrationName", "onSelectionChange")).put("topMessage", MapBuilder.m946of("registrationName", "onMessage")).put("topScrollBeginDrag", MapBuilder.m946of("registrationName", "onScrollBeginDrag")).put("topScrollEndDrag", MapBuilder.m946of("registrationName", "onScrollEndDrag")).put("topScroll", MapBuilder.m946of("registrationName", "onScroll")).put("topMomentumScrollBegin", MapBuilder.m946of("registrationName", "onMomentumScrollBegin")).put("topMomentumScrollEnd", MapBuilder.m946of("registrationName", "onMomentumScrollEnd")).build();
    }
}
