package com.qiyukf.nim.uikit.common.p150ui.listview;

import android.os.Build;
import android.widget.ListView;

/* renamed from: com.qiyukf.nim.uikit.common.ui.listview.a */
public final class C1933a {

    /* renamed from: com.qiyukf.nim.uikit.common.ui.listview.a$a */
    public interface AbstractC1935a {
    }

    /* renamed from: a */
    public static void m3769a(final ListView listView) {
        final int count = listView.getAdapter().getCount() - 1;
        listView.post(new Runnable() {
            /* class com.qiyukf.nim.uikit.common.p150ui.listview.C1933a.RunnableC19341 */

            /* renamed from: c */
            public final /* synthetic */ int f3718c = 0;

            /* renamed from: d */
            public final /* synthetic */ AbstractC1935a f3719d = null;

            public final void run() {
                if (Build.VERSION.SDK_INT >= 11) {
                    listView.setSelectionFromTop(count, this.f3718c);
                } else {
                    listView.setSelection(count);
                }
            }
        });
    }
}
