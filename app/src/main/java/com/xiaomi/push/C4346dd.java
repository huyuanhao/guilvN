package com.xiaomi.push;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.xiaomi.push.dd */
public class C4346dd extends C4337cx {

    /* renamed from: a */
    public C4337cx f11577a;

    /* renamed from: a */
    public final /* synthetic */ C4342db f11578a;

    /* renamed from: b */
    public final /* synthetic */ C4337cx f11579b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4346dd(C4342db dbVar, String str, C4337cx cxVar) {
        super(str);
        this.f11578a = dbVar;
        this.f11579b = cxVar;
        C4337cx cxVar2 = this.f11579b;
        this.f11577a = cxVar2;
        ((C4337cx) this).f11548b = ((C4337cx) this).f11548b;
        if (cxVar2 != null) {
            this.f11552f = cxVar2.f11552f;
        }
    }

    @Override // com.xiaomi.push.C4337cx
    /* renamed from: a */
    public synchronized ArrayList<String> mo41615a(boolean z) {
        ArrayList<String> arrayList;
        arrayList = new ArrayList<>();
        if (this.f11577a != null) {
            arrayList.addAll(this.f11577a.mo41615a(true));
        }
        synchronized (C4342db.f11565b) {
            C4337cx cxVar = C4342db.f11565b.get(((C4337cx) this).f11548b);
            if (cxVar != null) {
                Iterator<String> it = cxVar.mo41615a(true).iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    if (arrayList.indexOf(next) == -1) {
                        arrayList.add(next);
                    }
                }
                arrayList.remove(((C4337cx) this).f11548b);
                arrayList.add(((C4337cx) this).f11548b);
            }
        }
        return arrayList;
    }

    @Override // com.xiaomi.push.C4337cx
    /* renamed from: a */
    public synchronized void mo41622a(String str, C4336cw cwVar) {
        if (this.f11577a != null) {
            this.f11577a.mo41622a(str, cwVar);
        }
    }

    @Override // com.xiaomi.push.C4337cx
    /* renamed from: b */
    public boolean mo41628b() {
        return false;
    }
}
