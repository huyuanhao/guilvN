package com.xiaomi.push;

import android.content.Context;
import android.database.Cursor;
import com.xiaomi.push.C4312cd;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.xiaomi.push.by */
public class C4305by extends C4312cd.AbstractC4314b<Long> {

    /* renamed from: a */
    public long f11468a = 0;

    /* renamed from: a */
    public String f11469a;

    public C4305by(String str, List<String> list, String str2, String[] strArr, String str3, String str4, String str5, int i, String str6) {
        super(str, list, str2, strArr, str3, str4, str5, i);
        this.f11469a = str6;
    }

    /* renamed from: a */
    public static C4305by m11862a(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("count(*)");
        return new C4305by(str, arrayList, null, null, null, null, null, 0, "job to get count of all message");
    }

    @Override // com.xiaomi.push.C4312cd.AbstractC4314b
    /* renamed from: a */
    public Long m11865a(Context context, Cursor cursor) {
        return Long.valueOf(cursor.getLong(0));
    }

    @Override // com.xiaomi.push.C4312cd.AbstractC4314b, com.xiaomi.push.C4312cd.AbstractRunnableC4313a, com.xiaomi.push.C4312cd.AbstractRunnableC4313a, com.xiaomi.push.C4312cd.AbstractRunnableC4313a, com.xiaomi.push.C4312cd.AbstractRunnableC4313a
    /* renamed from: a */
    public Object mo41545a() {
        return Long.valueOf(this.f11468a);
    }

    @Override // com.xiaomi.push.C4312cd.AbstractC4314b
    /* renamed from: a */
    public void mo41546a(Context context, List<Long> list) {
        if (context != null && list != null && list.size() > 0) {
            this.f11468a = list.get(0).longValue();
        }
    }
}
