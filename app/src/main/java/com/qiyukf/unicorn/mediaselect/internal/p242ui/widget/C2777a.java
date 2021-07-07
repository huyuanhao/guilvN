package com.qiyukf.unicorn.mediaselect.internal.p242ui.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.os.Build;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CursorAdapter;
import android.widget.ListPopupWindow;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2739a;

@TargetApi(11)
/* renamed from: com.qiyukf.unicorn.mediaselect.internal.ui.widget.a */
public final class C2777a {

    /* renamed from: a */
    public CursorAdapter f5809a;

    /* renamed from: b */
    public TextView f5810b;

    /* renamed from: c */
    public ListPopupWindow f5811c;

    /* renamed from: d */
    public AdapterView.OnItemSelectedListener f5812d;

    public C2777a(@NonNull Context context) {
        ListPopupWindow listPopupWindow = new ListPopupWindow(context);
        this.f5811c = listPopupWindow;
        listPopupWindow.setModal(true);
        float f = context.getResources().getDisplayMetrics().density;
        this.f5811c.setContentWidth((int) (216.0f * f));
        this.f5811c.setHorizontalOffset((int) (16.0f * f));
        this.f5811c.setVerticalOffset((int) (f * -48.0f));
        this.f5811c.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            /* class com.qiyukf.unicorn.mediaselect.internal.p242ui.widget.C2777a.C27781 */

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C2777a.this.m6440b(adapterView.getContext(), i);
                if (C2777a.this.f5812d != null) {
                    C2777a.this.f5812d.onItemSelected(adapterView, view, i, j);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private void m6440b(Context context, int i) {
        this.f5811c.dismiss();
        Cursor cursor = this.f5809a.getCursor();
        cursor.moveToPosition(i);
        try {
            String a = C2739a.m6328a(cursor).mo36502a(context);
            if (this.f5810b.getVisibility() == 0 || Build.VERSION.SDK_INT < 14) {
                this.f5810b.setText(a);
                return;
            }
            this.f5810b.setAlpha(0.0f);
            this.f5810b.setText(a);
            this.f5810b.animate().alpha(1.0f).setDuration((long) context.getResources().getInteger(17694722)).start();
        } catch (CursorIndexOutOfBoundsException e) {
            C1709a.m3015b("AlbumsSpinner", "value is outArray", e);
        }
    }

    /* renamed from: a */
    public final void mo36606a(Context context, int i) {
        this.f5811c.setSelection(i);
        m6440b(context, i);
    }

    /* renamed from: a */
    public final void mo36607a(View view) {
        this.f5811c.setAnchorView(view);
    }

    /* renamed from: a */
    public final void mo36608a(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f5812d = onItemSelectedListener;
    }

    /* renamed from: a */
    public final void mo36609a(CursorAdapter cursorAdapter) {
        this.f5811c.setAdapter(cursorAdapter);
        this.f5809a = cursorAdapter;
    }

    /* renamed from: a */
    public final void mo36610a(TextView textView) {
        this.f5810b = textView;
        textView.setVisibility(8);
        this.f5810b.setOnClickListener(new View.OnClickListener() {
            /* class com.qiyukf.unicorn.mediaselect.internal.p242ui.widget.C2777a.View$OnClickListenerC27792 */

            public final void onClick(View view) {
                int dimensionPixelSize = view.getResources().getDimensionPixelSize(C2364R.dimen.ysf_album_item_height);
                C2777a.this.f5811c.setHeight(C2777a.this.f5809a.getCount() > 6 ? dimensionPixelSize * 6 : dimensionPixelSize * C2777a.this.f5809a.getCount());
                C2777a.this.f5811c.show();
            }
        });
        if (Build.VERSION.SDK_INT >= 19) {
            TextView textView2 = this.f5810b;
            textView2.setOnTouchListener(this.f5811c.createDragToOpenListener(textView2));
        }
    }
}
