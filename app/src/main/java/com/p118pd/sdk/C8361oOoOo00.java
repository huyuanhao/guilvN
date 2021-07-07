package com.p118pd.sdk;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.views.text.FontMetricsUtil;
import com.github.mikephil.charting.data.BubbleEntry;
import com.qiyukf.unicorn.api.msg.attachment.FileAttachment;
import java.util.ArrayList;

/* renamed from: com.pd.sdk.oOoOo00  reason: case insensitive filesystem */
public class C8361oOoOo00 extends AbstractC8385oOoOoo0O<C8213oOOoOO00, BubbleEntry> {
    @Override // com.p118pd.sdk.AbstractC8385oOoOoo0O
    public C8213oOOoOO00 OooO00o() {
        return new C8213oOOoOO00();
    }

    @Override // com.p118pd.sdk.AbstractC8385oOoOoo0O
    public AbstractC8265oOOoooO0<BubbleEntry> OooO00o(ArrayList<BubbleEntry> arrayList, String str) {
        return new C8214oOOoOO0O(arrayList, str);
    }

    @Override // com.p118pd.sdk.AbstractC8385oOoOoo0O
    public void OooO00o(AbstractC8194oOOo0OoO oooo0ooo, AbstractC8265oOOoooO0<BubbleEntry> ooooooo0, ReadableMap readableMap) {
        C8214oOOoOO0O oooooo0o = (C8214oOOoOO0O) ooooooo0;
        C8367oOoOo0o.OooO00o(oooo0ooo, oooooo0o, readableMap);
        C8367oOoOo0o.OooO00o(oooooo0o, readableMap);
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "highlightCircleWidth")) {
            oooooo0o.OooO00o((float) readableMap.getDouble("highlightCircleWidth"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Boolean, "normalizeSizeEnabled")) {
            oooooo0o.OooO0oO(readableMap.getBoolean("normalizeSizeEnabled"));
        }
    }

    @Override // com.p118pd.sdk.AbstractC8385oOoOoo0O
    public BubbleEntry OooO00o(ReadableArray readableArray, int i) {
        if (ReadableType.Map.equals(readableArray.getType(i))) {
            ReadableMap map = readableArray.getMap(i);
            float f = (float) i;
            if (map.hasKey(FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT)) {
                f = (float) map.getDouble(FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT);
            }
            if (C8368oOoOo0o0.OooO00o(map, ReadableType.Number, "y") && C8368oOoOo0o0.OooO00o(map, ReadableType.Number, FileAttachment.KEY_SIZE)) {
                return new BubbleEntry(f, (float) map.getDouble("y"), (float) map.getDouble(FileAttachment.KEY_SIZE), C8369oOoOo0oO.OooO00o(map));
            }
            throw new IllegalArgumentException("Invalid BubbleEntry data");
        }
        throw new IllegalArgumentException("Invalid BubbleEntry data");
    }
}
