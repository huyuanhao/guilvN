package com.huawei.hms.support.api.push.p046b.p047a.p048a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.huawei.hms.support.api.push.b.a.a.c */
public class C1191c {

    /* renamed from: a */
    public SharedPreferences f1299a;

    public C1191c(Context context, String str) {
        if (context != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                Context createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
                SharedPreferences sharedPreferences = createDeviceProtectedStorageContext.getSharedPreferences("move_to_de_records", 0);
                if (!sharedPreferences.getBoolean(str, false)) {
                    if (createDeviceProtectedStorageContext.moveSharedPreferencesFrom(context, str)) {
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.putBoolean(str, true);
                        edit.apply();
                    }
                }
                context = createDeviceProtectedStorageContext;
            }
            this.f1299a = context.getSharedPreferences(str, 0);
            return;
        }
        throw new NullPointerException("context is null!");
    }

    /* renamed from: a */
    public boolean mo15697a(String str) {
        SharedPreferences sharedPreferences = this.f1299a;
        return sharedPreferences != null && sharedPreferences.getBoolean(str, false);
    }

    /* renamed from: b */
    public String mo15700b(String str) {
        SharedPreferences sharedPreferences = this.f1299a;
        return sharedPreferences != null ? sharedPreferences.getString(str, "") : "";
    }

    /* renamed from: c */
    public boolean mo15701c(String str) {
        SharedPreferences sharedPreferences = this.f1299a;
        return sharedPreferences != null && sharedPreferences.contains(str);
    }

    /* renamed from: d */
    public boolean mo15702d(String str) {
        SharedPreferences.Editor edit;
        SharedPreferences sharedPreferences = this.f1299a;
        if (sharedPreferences == null || !sharedPreferences.contains(str) || (edit = this.f1299a.edit()) == null) {
            return false;
        }
        return edit.remove(str).commit();
    }

    /* renamed from: a */
    public boolean mo15698a(String str, Object obj) {
        SharedPreferences.Editor edit = this.f1299a.edit();
        if (obj instanceof String) {
            edit.putString(str, String.valueOf(obj));
        } else if (obj instanceof Integer) {
            edit.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Short) {
            edit.putInt(str, ((Short) obj).shortValue());
        } else if (obj instanceof Byte) {
            edit.putInt(str, ((Byte) obj).byteValue());
        } else if (obj instanceof Long) {
            edit.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof Float) {
            edit.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Double) {
            edit.putFloat(str, (float) ((Double) obj).doubleValue());
        } else if (obj instanceof Boolean) {
            edit.putBoolean(str, ((Boolean) obj).booleanValue());
        }
        return edit.commit();
    }

    /* renamed from: a */
    public boolean mo15699a(String str, String str2) {
        SharedPreferences.Editor edit;
        SharedPreferences sharedPreferences = this.f1299a;
        if (sharedPreferences == null || (edit = sharedPreferences.edit()) == null) {
            return false;
        }
        return edit.putString(str, str2).commit();
    }

    /* renamed from: a */
    public void mo15695a(String str, Long l) {
        SharedPreferences.Editor edit;
        SharedPreferences sharedPreferences = this.f1299a;
        if (sharedPreferences != null && (edit = sharedPreferences.edit()) != null) {
            edit.putLong(str, l.longValue()).commit();
        }
    }

    /* renamed from: a */
    public void mo15696a(String str, boolean z) {
        SharedPreferences.Editor edit;
        SharedPreferences sharedPreferences = this.f1299a;
        if (sharedPreferences != null && (edit = sharedPreferences.edit()) != null) {
            edit.putBoolean(str, z).commit();
        }
    }

    /* renamed from: a */
    public Map<String, ?> mo15694a() {
        SharedPreferences sharedPreferences = this.f1299a;
        if (sharedPreferences != null) {
            return sharedPreferences.getAll();
        }
        return new HashMap();
    }
}
