package com.taobao.accs.net;

import com.taobao.accs.data.Message;
import java.util.LinkedHashMap;
import java.util.Map;

public class BaseConnection$1 extends LinkedHashMap<Integer, Message> {

    /* renamed from: a */
    public final /* synthetic */ AbstractC3137b f7004a;

    public BaseConnection$1(AbstractC3137b bVar) {
        this.f7004a = bVar;
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry<Integer, Message> entry) {
        return size() > 10;
    }
}
