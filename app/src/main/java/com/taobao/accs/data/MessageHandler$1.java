package com.taobao.accs.data;

import java.util.LinkedHashMap;
import java.util.Map;

public class MessageHandler$1 extends LinkedHashMap<String, String> {

    /* renamed from: a */
    public final /* synthetic */ C3113d f6930a;

    public MessageHandler$1(C3113d dVar) {
        this.f6930a = dVar;
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry<String, String> entry) {
        return size() > 50;
    }
}
