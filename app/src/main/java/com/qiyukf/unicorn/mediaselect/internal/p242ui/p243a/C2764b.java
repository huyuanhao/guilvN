package com.qiyukf.unicorn.mediaselect.internal.p242ui.p243a;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2739a;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2745e;
import java.io.File;

/* renamed from: com.qiyukf.unicorn.mediaselect.internal.ui.a.b */
public final class C2764b extends CursorAdapter {
    public C2764b(Context context) {
        super(context, (Cursor) null, false);
    }

    public final void bindView(View view, Context context, Cursor cursor) {
        C2739a a = C2739a.m6328a(cursor);
        ((TextView) view.findViewById(C2364R.C2367id.ysf_album_name)).setText(a.mo36502a(context));
        ((TextView) view.findViewById(C2364R.C2367id.ysf_album_media_count)).setText(String.valueOf(a.mo36504c()));
        C2745e.m6339a().f5689p.mo36481a(context.getResources().getDimensionPixelSize(C2364R.dimen.ysf_media_grid_size), (ImageView) view.findViewById(C2364R.C2367id.ysf_album_cover), Uri.fromFile(new File(a.mo36503b())));
    }

    public final View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return LayoutInflater.from(context).inflate(C2364R.layout.ysf_album_list_item, viewGroup, false);
    }
}
