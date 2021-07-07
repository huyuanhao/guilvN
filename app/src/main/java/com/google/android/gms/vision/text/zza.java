package com.google.android.gms.vision.text;

import java.util.Comparator;
import java.util.Map;

public final class zza implements Comparator<Map.Entry<String, Integer>> {
    public zza(TextBlock textBlock) {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Map.Entry<String, Integer> entry, Map.Entry<String, Integer> entry2) {
        return entry.getValue().compareTo(entry2.getValue());
    }
}
