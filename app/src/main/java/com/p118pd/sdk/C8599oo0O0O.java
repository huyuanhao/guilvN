package com.p118pd.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.pd.sdk.oo0O0O  reason: case insensitive filesystem */
public class C8599oo0O0O {
    @Nullable
    public final OooO00o OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final List<OooO00o> f21714OooO00o;
    @Nullable
    public final OooO00o OooO0O0;
    @Nullable
    public final OooO00o OooO0OO;

    /* renamed from: com.pd.sdk.oo0O0O$OooO00o */
    public static class OooO00o {
        public final String OooO00o;
        public final String OooO0O0;

        public OooO00o(@NonNull String str, @NonNull String str2) {
            this.OooO00o = str;
            this.OooO0O0 = str2;
        }
    }

    public C8599oo0O0O(@Nullable OooO00o oooO00o, @Nullable OooO00o oooO00o2, @Nullable OooO00o oooO00o3, @NonNull LinkedList<OooO00o> linkedList) {
        this.OooO00o = oooO00o;
        this.OooO0O0 = oooO00o2;
        this.OooO0OO = oooO00o3;
        this.f21714OooO00o = linkedList;
    }

    public List<String> OooO00o() {
        LinkedList linkedList = new LinkedList();
        OooO00o oooO00o = this.OooO00o;
        if (oooO00o != null) {
            linkedList.add(oooO00o.OooO0O0);
        }
        OooO00o oooO00o2 = this.OooO0O0;
        if (oooO00o2 != null) {
            linkedList.add(oooO00o2.OooO0O0);
        }
        for (int i = 0; i < this.f21714OooO00o.size(); i++) {
            linkedList.add(this.f21714OooO00o.get(i).OooO0O0);
        }
        return linkedList;
    }

    public List<String> OooO0O0() {
        LinkedList linkedList = new LinkedList();
        OooO00o oooO00o = this.OooO00o;
        if (oooO00o != null) {
            linkedList.add(oooO00o.OooO00o);
        }
        OooO00o oooO00o2 = this.OooO0O0;
        if (oooO00o2 != null) {
            linkedList.add(oooO00o2.OooO00o);
        }
        for (int i = 0; i < this.f21714OooO00o.size(); i++) {
            linkedList.add(this.f21714OooO00o.get(i).OooO00o);
        }
        return linkedList;
    }

    public static C8599oo0O0O OooO00o(@NonNull ReadableMap readableMap) {
        return new C8599oo0O0O(OooO00o(readableMap, "takePhotoButtonTitle", "photo"), OooO00o(readableMap, "chooseFromLibraryButtonTitle", "library"), OooO00o(readableMap, "cancelButtonTitle", "cancel"), m20243OooO00o(readableMap));
    }

    @Nullable
    public static OooO00o OooO00o(@NonNull ReadableMap readableMap, @NonNull String str, @NonNull String str2) {
        if (!C8603oo0O0OO.OooO00o(readableMap, str)) {
            return null;
        }
        return new OooO00o(readableMap.getString(str), str2);
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static LinkedList<OooO00o> m20243OooO00o(@NonNull ReadableMap readableMap) {
        LinkedList<OooO00o> linkedList = new LinkedList<>();
        if (!readableMap.hasKey("customButtons")) {
            return linkedList;
        }
        ReadableArray array = readableMap.getArray("customButtons");
        for (int i = 0; i < array.size(); i++) {
            ReadableMap map = array.getMap(i);
            linkedList.add(new OooO00o(map.getString("title"), map.getString("name")));
        }
        return linkedList;
    }
}
