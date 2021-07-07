package com.p118pd.sdk;

import android.os.Build;
import android.view.View;
import android.widget.ListView;
import androidx.annotation.NonNull;

/* renamed from: com.pd.sdk.o00o0000  reason: case insensitive filesystem */
public final class C7146o00o0000 {
    public static void OooO00o(@NonNull ListView listView, int i) {
        View childAt;
        if (Build.VERSION.SDK_INT >= 19) {
            listView.scrollListBy(i);
            return;
        }
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        if (firstVisiblePosition != -1 && (childAt = listView.getChildAt(0)) != null) {
            listView.setSelectionFromTop(firstVisiblePosition, childAt.getTop() - i);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m18515OooO00o(@NonNull ListView listView, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            return listView.canScrollList(i);
        }
        int childCount = listView.getChildCount();
        if (childCount == 0) {
            return false;
        }
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        if (i > 0) {
            int bottom = listView.getChildAt(childCount - 1).getBottom();
            if (firstVisiblePosition + childCount < listView.getCount() || bottom > listView.getHeight() - listView.getListPaddingBottom()) {
                return true;
            }
            return false;
        }
        int top = listView.getChildAt(0).getTop();
        if (firstVisiblePosition > 0 || top < listView.getListPaddingTop()) {
            return true;
        }
        return false;
    }
}
