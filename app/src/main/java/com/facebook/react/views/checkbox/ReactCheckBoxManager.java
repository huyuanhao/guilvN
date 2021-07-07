package com.facebook.react.views.checkbox;

import android.content.Context;
import android.widget.CompoundButton;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.p118pd.sdk.o0000;

public class ReactCheckBoxManager extends SimpleViewManager<ReactCheckBox> {
    public static final CompoundButton.OnCheckedChangeListener ON_CHECKED_CHANGE_LISTENER = new CompoundButton.OnCheckedChangeListener() {
        /* class com.facebook.react.views.checkbox.ReactCheckBoxManager.C08641 */

        private ReactContext getReactContext(CompoundButton compoundButton) {
            Context context = compoundButton.getContext();
            if (context instanceof o0000) {
                return (ReactContext) ((o0000) context).getBaseContext();
            }
            return (ReactContext) compoundButton.getContext();
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            ((UIManagerModule) getReactContext(compoundButton).getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(new ReactCheckBoxEvent(compoundButton.getId(), z));
        }
    };
    public static final String REACT_CLASS = "AndroidCheckBox";

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return REACT_CLASS;
    }

    @ReactProp(defaultBoolean = true, name = "enabled")
    public void setEnabled(ReactCheckBox reactCheckBox, boolean z) {
        reactCheckBox.setEnabled(z);
    }

    @ReactProp(name = ViewProps.f984ON)
    public void setOn(ReactCheckBox reactCheckBox, boolean z) {
        reactCheckBox.setOnCheckedChangeListener(null);
        reactCheckBox.setOn(z);
        reactCheckBox.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    public void addEventEmitters(ThemedReactContext themedReactContext, ReactCheckBox reactCheckBox) {
        reactCheckBox.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactCheckBox createViewInstance(ThemedReactContext themedReactContext) {
        return new ReactCheckBox(themedReactContext);
    }
}
