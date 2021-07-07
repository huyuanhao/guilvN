package com.xiaomi.push;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.xiaomi.push.ed */
public class C4377ed extends AbstractC4379ef {
    public C4377ed(Context context, int i) {
        super(context, i);
    }

    @Override // com.xiaomi.push.AbstractC4379ef
    /* renamed from: b */
    private String m12156b() {
        Bundle extras;
        StringBuilder sb = new StringBuilder();
        try {
            Intent registerReceiver = ((AbstractC4379ef) this).f11645a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (!(registerReceiver == null || (extras = registerReceiver.getExtras()) == null)) {
                Set<String> keySet = extras.keySet();
                JSONObject jSONObject = new JSONObject();
                if (keySet != null && keySet.size() > 0) {
                    for (String str : keySet) {
                        if (!TextUtils.isEmpty(str)) {
                            try {
                                jSONObject.put(str, String.valueOf(extras.get(str)));
                            } catch (Exception unused) {
                            }
                        }
                    }
                    sb.append(jSONObject);
                }
            }
        } catch (Exception unused2) {
        }
        return sb.toString();
    }

    @Override // com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.C4251ai.AbstractRunnableC4252a
    /* renamed from: a */
    public int mo41384a() {
        return 20;
    }

    @Override // com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.C4251ai.AbstractRunnableC4252a
    /* renamed from: a */
    public EnumC4496hq m12158a() {
        return EnumC4496hq.Battery;
    }

    @Override // com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.C4251ai.AbstractRunnableC4252a
    /* renamed from: a */
    public String m12159a() {
        return m12156b();
    }
}
