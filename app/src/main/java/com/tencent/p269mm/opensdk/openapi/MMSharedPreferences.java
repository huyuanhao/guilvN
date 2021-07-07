package com.tencent.p269mm.opensdk.openapi;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import com.tencent.p269mm.opensdk.utils.C3389c;
import com.tencent.p269mm.opensdk.utils.Log;
import com.umeng.message.proguard.C3848l;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.tencent.mm.opensdk.openapi.MMSharedPreferences */
public class MMSharedPreferences implements SharedPreferences {
    public static final String TAG = "MicroMsg.SDK.SharedPreferences";
    public final String[] columns = {C3848l.f10389g, "key", "type", "value"};

    /* renamed from: cr */
    public final ContentResolver f8345cr;
    public REditor editor = null;
    public final HashMap<String, Object> values = new HashMap<>();

    /* renamed from: com.tencent.mm.opensdk.openapi.MMSharedPreferences$REditor */
    public static class REditor implements SharedPreferences.Editor {
        public boolean clear = false;

        /* renamed from: cr */
        public ContentResolver f8346cr;
        public Set<String> remove = new HashSet();
        public Map<String, Object> values = new HashMap();

        public REditor(ContentResolver contentResolver) {
            this.f8346cr = contentResolver;
        }

        public void apply() {
        }

        public SharedPreferences.Editor clear() {
            this.clear = true;
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:34:0x0097  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0099  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00ae  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x003f A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean commit() {
            /*
            // Method dump skipped, instructions count: 194
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p269mm.opensdk.openapi.MMSharedPreferences.REditor.commit():boolean");
        }

        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            this.values.put(str, Boolean.valueOf(z));
            this.remove.remove(str);
            return this;
        }

        public SharedPreferences.Editor putFloat(String str, float f) {
            this.values.put(str, Float.valueOf(f));
            this.remove.remove(str);
            return this;
        }

        public SharedPreferences.Editor putInt(String str, int i) {
            this.values.put(str, Integer.valueOf(i));
            this.remove.remove(str);
            return this;
        }

        public SharedPreferences.Editor putLong(String str, long j) {
            this.values.put(str, Long.valueOf(j));
            this.remove.remove(str);
            return this;
        }

        public SharedPreferences.Editor putString(String str, String str2) {
            this.values.put(str, str2);
            this.remove.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            return null;
        }

        public SharedPreferences.Editor remove(String str) {
            this.remove.add(str);
            return this;
        }
    }

    public MMSharedPreferences(Context context) {
        this.f8345cr = context.getContentResolver();
    }

    private Object getValue(String str) {
        try {
            Cursor query = this.f8345cr.query(C3389c.C3391b.CONTENT_URI, this.columns, "key = ?", new String[]{str}, null);
            if (query == null) {
                return null;
            }
            Object a = query.moveToFirst() ? C3389c.C3390a.m8658a(query.getInt(query.getColumnIndex("type")), query.getString(query.getColumnIndex("value"))) : null;
            query.close();
            return a;
        } catch (Exception e) {
            Log.m8651e(TAG, "getValue exception:" + e.getMessage());
            return null;
        }
    }

    public boolean contains(String str) {
        return getValue(str) != null;
    }

    public SharedPreferences.Editor edit() {
        if (this.editor == null) {
            this.editor = new REditor(this.f8345cr);
        }
        return this.editor;
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        try {
            Cursor query = this.f8345cr.query(C3389c.C3391b.CONTENT_URI, this.columns, null, null, null);
            if (query == null) {
                return null;
            }
            int columnIndex = query.getColumnIndex("key");
            int columnIndex2 = query.getColumnIndex("type");
            int columnIndex3 = query.getColumnIndex("value");
            while (query.moveToNext()) {
                this.values.put(query.getString(columnIndex), C3389c.C3390a.m8658a(query.getInt(columnIndex2), query.getString(columnIndex3)));
            }
            query.close();
            return this.values;
        } catch (Exception e) {
            Log.m8651e(TAG, "getAll exception:" + e.getMessage());
            return this.values;
        }
    }

    public boolean getBoolean(String str, boolean z) {
        Object value = getValue(str);
        return (value == null || !(value instanceof Boolean)) ? z : ((Boolean) value).booleanValue();
    }

    public float getFloat(String str, float f) {
        Object value = getValue(str);
        return (value == null || !(value instanceof Float)) ? f : ((Float) value).floatValue();
    }

    public int getInt(String str, int i) {
        Object value = getValue(str);
        return (value == null || !(value instanceof Integer)) ? i : ((Integer) value).intValue();
    }

    public long getLong(String str, long j) {
        Object value = getValue(str);
        return (value == null || !(value instanceof Long)) ? j : ((Long) value).longValue();
    }

    public String getString(String str, String str2) {
        Object value = getValue(str);
        return (value == null || !(value instanceof String)) ? str2 : (String) value;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        return null;
    }

    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }
}
