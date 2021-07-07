package com.qiyukf.unicorn.mediaselect.internal.p238a;

import android.content.Context;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import com.qiyukf.unicorn.mediaselect.internal.p242ui.widget.IncapableDialog;

/* renamed from: com.qiyukf.unicorn.mediaselect.internal.a.c */
public final class C2742c {

    /* renamed from: a */
    public int f5666a;

    /* renamed from: b */
    public String f5667b;

    /* renamed from: c */
    public String f5668c;

    public C2742c(String str) {
        this.f5666a = 0;
        this.f5668c = str;
    }

    public C2742c(String str, byte b) {
        this.f5666a = 0;
        this.f5666a = 1;
        this.f5668c = str;
    }

    /* renamed from: a */
    public static void m6336a(Context context, C2742c cVar) {
        if (cVar != null) {
            int i = cVar.f5666a;
            if (i == 1) {
                IncapableDialog.newInstance(cVar.f5667b, cVar.f5668c).show(((FragmentActivity) context).getSupportFragmentManager(), IncapableDialog.class.getName());
            } else if (i != 2) {
                Toast.makeText(context, cVar.f5668c, 0).show();
            }
        }
    }
}
