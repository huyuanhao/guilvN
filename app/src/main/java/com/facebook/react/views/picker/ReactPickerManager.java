package com.facebook.react.views.picker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.picker.ReactPicker;
import com.facebook.react.views.picker.events.PickerItemSelectEvent;
import javax.annotation.Nullable;

public abstract class ReactPickerManager extends SimpleViewManager<ReactPicker> {

    public static class PickerEventEmitter implements ReactPicker.OnSelectListener {
        public final EventDispatcher mEventDispatcher;
        public final ReactPicker mReactPicker;

        public PickerEventEmitter(ReactPicker reactPicker, EventDispatcher eventDispatcher) {
            this.mReactPicker = reactPicker;
            this.mEventDispatcher = eventDispatcher;
        }

        @Override // com.facebook.react.views.picker.ReactPicker.OnSelectListener
        public void onItemSelected(int i) {
            this.mEventDispatcher.dispatchEvent(new PickerItemSelectEvent(this.mReactPicker.getId(), i));
        }
    }

    public static class ReactPickerAdapter extends ArrayAdapter<ReadableMap> {
        public final LayoutInflater mInflater;
        @Nullable
        public Integer mPrimaryTextColor;

        public ReactPickerAdapter(Context context, ReadableMap[] readableMapArr) {
            super(context, 0, readableMapArr);
            this.mInflater = (LayoutInflater) Assertions.assertNotNull(context.getSystemService("layout_inflater"));
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            return getView(i, view, viewGroup, true);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return getView(i, view, viewGroup, false);
        }

        public void setPrimaryTextColor(@Nullable Integer num) {
            this.mPrimaryTextColor = num;
            notifyDataSetChanged();
        }

        private View getView(int i, View view, ViewGroup viewGroup, boolean z) {
            Integer num;
            ReadableMap readableMap = (ReadableMap) getItem(i);
            if (view == null) {
                view = this.mInflater.inflate(z ? 17367049 : 17367048, viewGroup, false);
            }
            TextView textView = (TextView) view;
            textView.setText(readableMap.getString("label"));
            if (!z && (num = this.mPrimaryTextColor) != null) {
                textView.setTextColor(num.intValue());
            } else if (readableMap.hasKey(ViewProps.COLOR) && !readableMap.isNull(ViewProps.COLOR)) {
                textView.setTextColor(readableMap.getInt(ViewProps.COLOR));
            }
            return view;
        }
    }

    @ReactProp(customType = "Color", name = ViewProps.COLOR)
    public void setColor(ReactPicker reactPicker, @Nullable Integer num) {
        reactPicker.setPrimaryColor(num);
        ReactPickerAdapter reactPickerAdapter = (ReactPickerAdapter) reactPicker.getAdapter();
        if (reactPickerAdapter != null) {
            reactPickerAdapter.setPrimaryTextColor(num);
        }
    }

    @ReactProp(defaultBoolean = true, name = "enabled")
    public void setEnabled(ReactPicker reactPicker, boolean z) {
        reactPicker.setEnabled(z);
    }

    @ReactProp(name = "items")
    public void setItems(ReactPicker reactPicker, @Nullable ReadableArray readableArray) {
        if (readableArray != null) {
            ReadableMap[] readableMapArr = new ReadableMap[readableArray.size()];
            for (int i = 0; i < readableArray.size(); i++) {
                readableMapArr[i] = readableArray.getMap(i);
            }
            ReactPickerAdapter reactPickerAdapter = new ReactPickerAdapter(reactPicker.getContext(), readableMapArr);
            reactPickerAdapter.setPrimaryTextColor(reactPicker.getPrimaryColor());
            reactPicker.setAdapter((SpinnerAdapter) reactPickerAdapter);
            return;
        }
        reactPicker.setAdapter((SpinnerAdapter) null);
    }

    @ReactProp(name = "prompt")
    public void setPrompt(ReactPicker reactPicker, @Nullable String str) {
        reactPicker.setPrompt(str);
    }

    @ReactProp(name = "selected")
    public void setSelected(ReactPicker reactPicker, int i) {
        reactPicker.setStagedSelection(i);
    }

    public void addEventEmitters(ThemedReactContext themedReactContext, ReactPicker reactPicker) {
        reactPicker.setOnSelectListener(new PickerEventEmitter(reactPicker, ((UIManagerModule) themedReactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher()));
    }

    public void onAfterUpdateTransaction(ReactPicker reactPicker) {
        super.onAfterUpdateTransaction((View) reactPicker);
        reactPicker.updateStagedSelection();
    }
}
