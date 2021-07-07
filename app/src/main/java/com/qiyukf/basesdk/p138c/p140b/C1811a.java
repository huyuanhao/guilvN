package com.qiyukf.basesdk.p138c.p140b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.text.Html;
import android.text.TextUtils;
import android.widget.TextView;
import com.qiyukf.basesdk.p138c.p140b.AbstractC1825b;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.qiyukf.basesdk.c.b.a */
public final class C1811a implements Html.ImageGetter {

    /* renamed from: a */
    public static final Pattern f3341a = Pattern.compile("<(img|IMG)\\s+([^>]*)>");

    /* renamed from: b */
    public static final Pattern f3342b = Pattern.compile("(width|WIDTH)\\s*=\\s*\"?(\\w+)\"?");

    /* renamed from: c */
    public static final Pattern f3343c = Pattern.compile("(height|HEIGHT)\\s*=\\s*\"?(\\w+)\"?");

    /* renamed from: d */
    public TextView f3344d;

    /* renamed from: e */
    public AbstractC1825b f3345e;

    /* renamed from: f */
    public List<C1819b> f3346f = new ArrayList();

    /* renamed from: g */
    public int f3347g;

    /* renamed from: com.qiyukf.basesdk.c.b.a$a */
    public class C1818a extends BitmapDrawable {

        /* renamed from: b */
        public final int f3359b;

        /* renamed from: c */
        public Drawable f3360c;

        public C1818a(int i) {
            this.f3359b = i;
        }

        /* renamed from: a */
        private int m3447a() {
            return C1811a.this.f3344d.getResources().getDisplayMetrics().heightPixels;
        }

        /* renamed from: a */
        private int m3448a(float f) {
            return (int) ((f * C1811a.this.f3344d.getResources().getDisplayMetrics().density) + 0.5f);
        }

        /* JADX WARNING: Removed duplicated region for block: B:29:0x0088  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo34084a(android.graphics.drawable.Drawable r3, boolean r4) {
            /*
            // Method dump skipped, instructions count: 150
            */
            throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.basesdk.p138c.p140b.C1811a.C1818a.mo34084a(android.graphics.drawable.Drawable, boolean):void");
        }

        public final void draw(Canvas canvas) {
            Bitmap bitmap;
            Drawable drawable = this.f3360c;
            if (drawable == null) {
                return;
            }
            if (!(drawable instanceof BitmapDrawable) || ((bitmap = ((BitmapDrawable) drawable).getBitmap()) != null && !bitmap.isRecycled())) {
                this.f3360c.draw(canvas);
            }
        }
    }

    /* renamed from: com.qiyukf.basesdk.c.b.a$b */
    public static class C1819b {

        /* renamed from: a */
        public final int f3361a;

        /* renamed from: b */
        public final int f3362b;

        public C1819b(int i, int i2) {
            this.f3361a = i;
            this.f3362b = i2;
        }

        /* renamed from: a */
        public final boolean mo34086a() {
            return this.f3361a >= 0 && this.f3362b >= 0;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m3436a(C1811a aVar, Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            aVar.f3344d.post(runnable);
        }
    }

    /* renamed from: b */
    public static int m3437b(String str) {
        try {
            return Integer.valueOf(str).intValue();
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public final void mo34074a(TextView textView) {
        this.f3344d = textView;
    }

    /* renamed from: a */
    public final void mo34075a(AbstractC1825b bVar) {
        this.f3345e = bVar;
    }

    /* renamed from: a */
    public final void mo34076a(String str) {
        Matcher matcher = f3341a.matcher(str);
        while (matcher.find()) {
            String trim = matcher.group(2).trim();
            Matcher matcher2 = f3342b.matcher(trim);
            int i = -1;
            int b = matcher2.find() ? m3437b(matcher2.group(2).trim()) : -1;
            Matcher matcher3 = f3343c.matcher(trim);
            if (matcher3.find()) {
                i = m3437b(matcher3.group(2).trim());
            }
            this.f3346f.add(new C1819b(b, i));
        }
    }

    public final Drawable getDrawable(String str) {
        int i = this.f3347g;
        this.f3347g = i + 1;
        final C1818a aVar = new C1818a(i);
        if (this.f3345e != null && !TextUtils.isEmpty(str)) {
            aVar.mo34084a(this.f3345e.mo34099a(), false);
            if (str.startsWith("VIDEO_IMG_TAG")) {
                this.f3345e.mo34102b(str.substring(13), new AbstractC1825b.AbstractC1826a() {
                    /* class com.qiyukf.basesdk.p138c.p140b.C1811a.C18121 */

                    @Override // com.qiyukf.basesdk.p138c.p140b.AbstractC1825b.AbstractC1826a
                    /* renamed from: a */
                    public final void mo34078a() {
                        C1811a.m3436a(C1811a.this, new Runnable() {
                            /* class com.qiyukf.basesdk.p138c.p140b.C1811a.C18121.RunnableC18142 */

                            public final void run() {
                                C18121 r0 = C18121.this;
                                aVar.mo34084a(C1811a.this.f3345e.mo34101b(), false);
                                C1811a.this.f3344d.setText(C1811a.this.f3344d.getText());
                            }
                        });
                    }

                    @Override // com.qiyukf.basesdk.p138c.p140b.AbstractC1825b.AbstractC1826a
                    /* renamed from: a */
                    public final void mo34079a(final Bitmap bitmap) {
                        C1811a.m3436a(C1811a.this, new Runnable() {
                            /* class com.qiyukf.basesdk.p138c.p140b.C1811a.C18121.RunnableC18131 */

                            public final void run() {
                                aVar.mo34084a(new BitmapDrawable(C1811a.this.f3344d.getResources(), bitmap), true);
                                C1811a.this.f3344d.setText(C1811a.this.f3344d.getText());
                            }
                        });
                    }
                });
            } else {
                this.f3345e.mo34100a(str, new AbstractC1825b.AbstractC1826a() {
                    /* class com.qiyukf.basesdk.p138c.p140b.C1811a.C18152 */

                    @Override // com.qiyukf.basesdk.p138c.p140b.AbstractC1825b.AbstractC1826a
                    /* renamed from: a */
                    public final void mo34078a() {
                        C1811a.m3436a(C1811a.this, new Runnable() {
                            /* class com.qiyukf.basesdk.p138c.p140b.C1811a.C18152.RunnableC18172 */

                            public final void run() {
                                C18152 r0 = C18152.this;
                                aVar.mo34084a(C1811a.this.f3345e.mo34101b(), false);
                                C1811a.this.f3344d.setText(C1811a.this.f3344d.getText());
                            }
                        });
                    }

                    @Override // com.qiyukf.basesdk.p138c.p140b.AbstractC1825b.AbstractC1826a
                    /* renamed from: a */
                    public final void mo34079a(final Bitmap bitmap) {
                        C1811a.m3436a(C1811a.this, new Runnable() {
                            /* class com.qiyukf.basesdk.p138c.p140b.C1811a.C18152.RunnableC18161 */

                            public final void run() {
                                aVar.mo34084a(new BitmapDrawable(C1811a.this.f3344d.getResources(), bitmap), true);
                                C1811a.this.f3344d.setText(C1811a.this.f3344d.getText());
                            }
                        });
                    }
                });
            }
        }
        return aVar;
    }
}
