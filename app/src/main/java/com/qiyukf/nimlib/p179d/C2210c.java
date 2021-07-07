package com.qiyukf.nimlib.p179d;

import android.os.Handler;
import com.qiyukf.nimlib.sdk.Observer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.qiyukf.nimlib.d.c */
public final class C2210c {

    /* renamed from: a */
    public final Map<String, List<Observer>> f4406a = new ConcurrentHashMap();

    /* renamed from: b */
    public final C2211d f4407b;

    public C2210c(Handler handler) {
        this.f4407b = new C2211d(handler);
    }

    /* renamed from: a */
    public final boolean mo34818a(C2218i iVar) {
        Object[] objArr;
        if (!iVar.mo34829a().startsWith("observe") || (objArr = iVar.f4416a.f4423b) == null || objArr.length != 2 || !(objArr[0] instanceof Observer) || !(objArr[1] instanceof Boolean)) {
            return false;
        }
        Observer observer = (Observer) objArr[0];
        if (((Boolean) objArr[1]).booleanValue()) {
            String str = iVar.f4416a.f4422a;
            List<Observer> list = this.f4406a.get(str);
            if (list == null) {
                list = new ArrayList<>();
                this.f4406a.put(str, list);
            }
            synchronized (list) {
                list.add(observer);
            }
            this.f4407b.mo34820a(iVar.f4416a.f4422a, observer);
        } else {
            List<Observer> list2 = this.f4406a.get(iVar.f4416a.f4422a);
            if (list2 != null) {
                synchronized (list2) {
                    list2.remove(observer);
                }
            }
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo34819b(C2218i iVar) {
        ArrayList<Observer> arrayList;
        List<Observer> list = this.f4406a.get(iVar.f4416a.f4422a);
        if (list == null) {
            return false;
        }
        synchronized (list) {
            arrayList = new ArrayList(list);
        }
        for (Observer observer : arrayList) {
            observer.onEvent(iVar.f4416a.f4423b[0]);
        }
        return true;
    }
}
