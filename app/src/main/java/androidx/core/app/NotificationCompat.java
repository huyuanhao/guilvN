package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.C0045R;
import com.bumptech.glide.load.engine.GlideException;
import com.p118pd.sdk.AbstractC6992o000OO00;
import com.p118pd.sdk.C6994o000OOO;
import com.p118pd.sdk.C6999o000OOoO;
import com.p118pd.sdk.C7002o000Oo00;
import com.p118pd.sdk.C7070o00O0o0o;
import com.p118pd.sdk.C7484o0OoO0o;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class NotificationCompat {
    public static final int OooO = 8;

    /* renamed from: OooO  reason: collision with other field name */
    public static final String f13867OooO = "android.icon";
    public static final int OooO00o = -1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f13868OooO00o = "android.title";
    public static final int OooO0O0 = 1;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final String f13869OooO0O0 = "android.title.big";
    public static final int OooO0OO = 2;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final String f13870OooO0OO = "android.text";
    public static final int OooO0Oo = 4;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static final String f13871OooO0Oo = "android.subText";
    public static final int OooO0o = 1;

    /* renamed from: OooO0o  reason: collision with other field name */
    public static final String f13872OooO0o = "android.infoText";
    public static final int OooO0o0 = -1;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public static final String f13873OooO0o0 = "android.remoteInputHistory";
    public static final int OooO0oO = 2;

    /* renamed from: OooO0oO  reason: collision with other field name */
    public static final String f13874OooO0oO = "android.summaryText";
    public static final int OooO0oo = 4;

    /* renamed from: OooO0oo  reason: collision with other field name */
    public static final String f13875OooO0oo = "android.bigText";
    public static final int OooOO0 = 16;

    /* renamed from: OooOO0  reason: collision with other field name */
    public static final String f13876OooOO0 = "android.largeIcon";
    public static final int OooOO0O = 32;

    /* renamed from: OooOO0O  reason: collision with other field name */
    public static final String f13877OooOO0O = "android.largeIcon.big";
    public static final int OooOO0o = 64;

    /* renamed from: OooOO0o  reason: collision with other field name */
    public static final String f13878OooOO0o = "android.progress";
    public static final int OooOOO = 256;

    /* renamed from: OooOOO  reason: collision with other field name */
    public static final String f13879OooOOO = "android.progressIndeterminate";
    @Deprecated
    public static final int OooOOO0 = 128;

    /* renamed from: OooOOO0  reason: collision with other field name */
    public static final String f13880OooOOO0 = "android.progressMax";
    public static final int OooOOOO = 512;

    /* renamed from: OooOOOO  reason: collision with other field name */
    public static final String f13881OooOOOO = "android.showChronometer";
    public static final int OooOOOo = 0;

    /* renamed from: OooOOOo  reason: collision with other field name */
    public static final String f13882OooOOOo = "android.showWhen";
    public static final int OooOOo = -2;

    /* renamed from: OooOOo  reason: collision with other field name */
    public static final String f13883OooOOo = "android.textLines";
    public static final int OooOOo0 = -1;

    /* renamed from: OooOOo0  reason: collision with other field name */
    public static final String f13884OooOOo0 = "android.picture";
    public static final int OooOOoo = 1;

    /* renamed from: OooOOoo  reason: collision with other field name */
    public static final String f13885OooOOoo = "android.template";
    public static final int OooOo = -1;

    /* renamed from: OooOo  reason: collision with other field name */
    public static final String f13886OooOo = "android.selfDisplayName";
    @ColorInt
    public static final int OooOo0 = 0;

    /* renamed from: OooOo0  reason: collision with other field name */
    public static final String f13887OooOo0 = "android.backgroundImageUri";
    public static final int OooOo00 = 2;

    /* renamed from: OooOo00  reason: collision with other field name */
    public static final String f13888OooOo00 = "android.people";
    public static final int OooOo0O = 1;

    /* renamed from: OooOo0O  reason: collision with other field name */
    public static final String f13889OooOo0O = "android.mediaSession";
    public static final int OooOo0o = 0;

    /* renamed from: OooOo0o  reason: collision with other field name */
    public static final String f13890OooOo0o = "android.compactActions";
    public static final int OooOoO = 1;

    /* renamed from: OooOoO  reason: collision with other field name */
    public static final String f13891OooOoO = "android.conversationTitle";
    public static final int OooOoO0 = 0;

    /* renamed from: OooOoO0  reason: collision with other field name */
    public static final String f13892OooOoO0 = "android.messagingStyleUser";
    public static final int OooOoOO = 2;

    /* renamed from: OooOoOO  reason: collision with other field name */
    public static final String f13893OooOoOO = "android.messages";
    public static final int OooOoo = 1;

    /* renamed from: OooOoo  reason: collision with other field name */
    public static final String f13894OooOoo = "android.hiddenConversationTitle";
    public static final int OooOoo0 = 0;

    /* renamed from: OooOoo0  reason: collision with other field name */
    public static final String f13895OooOoo0 = "android.isGroupConversation";
    public static final int OooOooO = 2;

    /* renamed from: OooOooO  reason: collision with other field name */
    public static final String f13896OooOooO = "android.audioContents";
    public static final String OooOooo = "call";
    public static final String Oooo = "service";
    public static final String Oooo0 = "promo";
    public static final String Oooo000 = "msg";
    public static final String Oooo00O = "email";
    public static final String Oooo00o = "event";
    public static final String Oooo0O0 = "alarm";
    public static final String Oooo0OO = "progress";
    public static final String Oooo0o = "err";
    public static final String Oooo0o0 = "social";
    public static final String Oooo0oO = "transport";
    public static final String Oooo0oo = "sys";
    public static final String OoooO0 = "recommendation";
    public static final String OoooO00 = "reminder";
    public static final String OoooO0O = "status";

    public static class Action {
        public static final int OooO = 6;
        public static final String OooO00o = "android.support.action.showsUserInterface";
        public static final String OooO0O0 = "android.support.action.semanticAction";
        public static final int OooO0OO = 0;
        public static final int OooO0Oo = 1;
        public static final int OooO0o = 3;
        public static final int OooO0o0 = 2;
        public static final int OooO0oO = 4;
        public static final int OooO0oo = 5;
        public static final int OooOO0 = 7;
        public static final int OooOO0O = 8;
        public static final int OooOO0o = 9;
        public static final int OooOOO0 = 10;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final int f13897OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public PendingIntent f13898OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Bundle f13899OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public CharSequence f13900OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f13901OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final C7002o000Oo00[] f13902OooO00o;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public int f13903OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public boolean f13904OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public final C7002o000Oo00[] f13905OooO0O0;

        public static final class OooO00o {
            public final int OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final PendingIntent f13906OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final Bundle f13907OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final CharSequence f13908OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public ArrayList<C7002o000Oo00> f13909OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public boolean f13910OooO00o;
            public int OooO0O0;

            /* renamed from: OooO0O0  reason: collision with other field name */
            public boolean f13911OooO0O0;

            public OooO00o(int i, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i, charSequence, pendingIntent, new Bundle(), null, true, 0, true);
            }

            public OooO00o OooO00o(Bundle bundle) {
                if (bundle != null) {
                    this.f13907OooO00o.putAll(bundle);
                }
                return this;
            }

            public OooO00o OooO0O0(boolean z) {
                this.f13911OooO0O0 = z;
                return this;
            }

            public OooO00o(Action action) {
                this(action.f13903OooO0O0, action.f13900OooO00o, action.f13898OooO00o, new Bundle(action.f13899OooO00o), action.m14491OooO0O0(), action.m14488OooO00o(), action.OooO0O0(), action.f13904OooO0O0);
            }

            public Bundle OooO00o() {
                return this.f13907OooO00o;
            }

            public OooO00o OooO00o(C7002o000Oo00 o000oo00) {
                if (this.f13909OooO00o == null) {
                    this.f13909OooO00o = new ArrayList<>();
                }
                this.f13909OooO00o.add(o000oo00);
                return this;
            }

            public OooO00o(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C7002o000Oo00[] o000oo00Arr, boolean z, int i2, boolean z2) {
                ArrayList<C7002o000Oo00> arrayList;
                this.f13910OooO00o = true;
                this.f13911OooO0O0 = true;
                this.OooO00o = i;
                this.f13908OooO00o = OooO0OO.OooO00o(charSequence);
                this.f13906OooO00o = pendingIntent;
                this.f13907OooO00o = bundle;
                if (o000oo00Arr == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList<>(Arrays.asList(o000oo00Arr));
                }
                this.f13909OooO00o = arrayList;
                this.f13910OooO00o = z;
                this.OooO0O0 = i2;
                this.f13911OooO0O0 = z2;
            }

            public OooO00o OooO00o(boolean z) {
                this.f13910OooO00o = z;
                return this;
            }

            public OooO00o OooO00o(int i) {
                this.OooO0O0 = i;
                return this;
            }

            public OooO00o OooO00o(OooO0O0 oooO0O0) {
                oooO0O0.OooO00o(this);
                return this;
            }

            /* renamed from: OooO00o  reason: collision with other method in class */
            public Action m14492OooO00o() {
                C7002o000Oo00[] o000oo00Arr;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<C7002o000Oo00> arrayList3 = this.f13909OooO00o;
                if (arrayList3 != null) {
                    Iterator<C7002o000Oo00> it = arrayList3.iterator();
                    while (it.hasNext()) {
                        C7002o000Oo00 next = it.next();
                        if (next.OooO0O0()) {
                            arrayList.add(next);
                        } else {
                            arrayList2.add(next);
                        }
                    }
                }
                C7002o000Oo00[] o000oo00Arr2 = null;
                if (arrayList.isEmpty()) {
                    o000oo00Arr = null;
                } else {
                    o000oo00Arr = (C7002o000Oo00[]) arrayList.toArray(new C7002o000Oo00[arrayList.size()]);
                }
                if (!arrayList2.isEmpty()) {
                    o000oo00Arr2 = (C7002o000Oo00[]) arrayList2.toArray(new C7002o000Oo00[arrayList2.size()]);
                }
                return new Action(this.OooO00o, this.f13908OooO00o, this.f13906OooO00o, this.f13907OooO00o, o000oo00Arr2, o000oo00Arr, this.f13910OooO00o, this.OooO0O0, this.f13911OooO0O0);
            }
        }

        public interface OooO0O0 {
            OooO00o OooO00o(OooO00o oooO00o);
        }

        public static final class OooO0OO implements OooO0O0 {
            public static final String OooO00o = "android.wearable.EXTENSIONS";
            public static final int OooO0O0 = 1;

            /* renamed from: OooO0O0  reason: collision with other field name */
            public static final String f13912OooO0O0 = "flags";
            public static final int OooO0OO = 2;

            /* renamed from: OooO0OO  reason: collision with other field name */
            public static final String f13913OooO0OO = "inProgressLabel";
            public static final int OooO0Oo = 4;

            /* renamed from: OooO0Oo  reason: collision with other field name */
            public static final String f13914OooO0Oo = "confirmLabel";
            public static final int OooO0o0 = 1;

            /* renamed from: OooO0o0  reason: collision with other field name */
            public static final String f13915OooO0o0 = "cancelLabel";

            /* renamed from: OooO00o  reason: collision with other field name */
            public int f13916OooO00o = 1;

            /* renamed from: OooO00o  reason: collision with other field name */
            public CharSequence f13917OooO00o;

            /* renamed from: OooO0O0  reason: collision with other field name */
            public CharSequence f13918OooO0O0;

            /* renamed from: OooO0OO  reason: collision with other field name */
            public CharSequence f13919OooO0OO;

            public OooO0OO() {
            }

            @Override // androidx.core.app.NotificationCompat.Action.OooO0O0
            public OooO00o OooO00o(OooO00o oooO00o) {
                Bundle bundle = new Bundle();
                int i = this.f13916OooO00o;
                if (i != 1) {
                    bundle.putInt("flags", i);
                }
                CharSequence charSequence = this.f13917OooO00o;
                if (charSequence != null) {
                    bundle.putCharSequence("inProgressLabel", charSequence);
                }
                CharSequence charSequence2 = this.f13918OooO0O0;
                if (charSequence2 != null) {
                    bundle.putCharSequence("confirmLabel", charSequence2);
                }
                CharSequence charSequence3 = this.f13919OooO0OO;
                if (charSequence3 != null) {
                    bundle.putCharSequence("cancelLabel", charSequence3);
                }
                oooO00o.OooO00o().putBundle("android.wearable.EXTENSIONS", bundle);
                return oooO00o;
            }

            @Deprecated
            public OooO0OO OooO0O0(CharSequence charSequence) {
                this.f13918OooO0O0 = charSequence;
                return this;
            }

            /* renamed from: OooO0OO  reason: collision with other method in class */
            public boolean m14496OooO0OO() {
                return (this.f13916OooO00o & 1) != 0;
            }

            @Deprecated
            public CharSequence OooO0O0() {
                return this.f13918OooO0O0;
            }

            @Deprecated
            public OooO0OO OooO0OO(CharSequence charSequence) {
                this.f13917OooO00o = charSequence;
                return this;
            }

            public OooO0OO(Action action) {
                Bundle bundle = action.m14486OooO00o().getBundle("android.wearable.EXTENSIONS");
                if (bundle != null) {
                    this.f13916OooO00o = bundle.getInt("flags", 1);
                    this.f13917OooO00o = bundle.getCharSequence("inProgressLabel");
                    this.f13918OooO0O0 = bundle.getCharSequence("confirmLabel");
                    this.f13919OooO0OO = bundle.getCharSequence("cancelLabel");
                }
            }

            /* renamed from: OooO0O0  reason: collision with other method in class */
            public boolean m14495OooO0O0() {
                return (this.f13916OooO00o & 2) != 0;
            }

            @Deprecated
            public CharSequence OooO0OO() {
                return this.f13917OooO00o;
            }

            public OooO0OO OooO0O0(boolean z) {
                OooO00o(4, z);
                return this;
            }

            public OooO0OO OooO0OO(boolean z) {
                OooO00o(2, z);
                return this;
            }

            /* renamed from: OooO00o */
            public OooO0OO clone() {
                OooO0OO oooO0OO = new OooO0OO();
                oooO0OO.f13916OooO00o = this.f13916OooO00o;
                oooO0OO.f13917OooO00o = this.f13917OooO00o;
                oooO0OO.f13918OooO0O0 = this.f13918OooO0O0;
                oooO0OO.f13919OooO0OO = this.f13919OooO0OO;
                return oooO0OO;
            }

            public OooO0OO OooO00o(boolean z) {
                OooO00o(1, z);
                return this;
            }

            private void OooO00o(int i, boolean z) {
                if (z) {
                    this.f13916OooO00o = i | this.f13916OooO00o;
                    return;
                }
                this.f13916OooO00o = (i ^ -1) & this.f13916OooO00o;
            }

            @Deprecated
            public OooO0OO OooO00o(CharSequence charSequence) {
                this.f13919OooO0OO = charSequence;
                return this;
            }

            @Deprecated
            /* renamed from: OooO00o  reason: collision with other method in class */
            public CharSequence m14493OooO00o() {
                return this.f13919OooO0OO;
            }

            /* renamed from: OooO00o  reason: collision with other method in class */
            public boolean m14494OooO00o() {
                return (this.f13916OooO00o & 4) != 0;
            }
        }

        @Retention(RetentionPolicy.SOURCE)
        public @interface SemanticAction {
        }

        public Action(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true);
        }

        public int OooO00o() {
            return this.f13903OooO0O0;
        }

        /* renamed from: OooO0O0  reason: collision with other method in class */
        public C7002o000Oo00[] m14491OooO0O0() {
            return this.f13902OooO00o;
        }

        public Action(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C7002o000Oo00[] o000oo00Arr, C7002o000Oo00[] o000oo00Arr2, boolean z, int i2, boolean z2) {
            this.f13904OooO0O0 = true;
            this.f13903OooO0O0 = i;
            this.f13900OooO00o = OooO0OO.OooO00o(charSequence);
            this.f13898OooO00o = pendingIntent;
            this.f13899OooO00o = bundle == null ? new Bundle() : bundle;
            this.f13902OooO00o = o000oo00Arr;
            this.f13905OooO0O0 = o000oo00Arr2;
            this.f13901OooO00o = z;
            this.f13897OooO00o = i2;
            this.f13904OooO0O0 = z2;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public CharSequence m14487OooO00o() {
            return this.f13900OooO00o;
        }

        public int OooO0O0() {
            return this.f13897OooO00o;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public PendingIntent m14485OooO00o() {
            return this.f13898OooO00o;
        }

        /* renamed from: OooO0O0  reason: collision with other method in class */
        public boolean m14490OooO0O0() {
            return this.f13904OooO0O0;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public Bundle m14486OooO00o() {
            return this.f13899OooO00o;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m14488OooO00o() {
            return this.f13901OooO00o;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public C7002o000Oo00[] m14489OooO00o() {
            return this.f13905OooO0O0;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface BadgeIconType {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface GroupAlertBehavior {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface NotificationVisibility {
    }

    public static class OooO00o extends OooO {
        public Bitmap OooO00o;
        public Bitmap OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public boolean f13922OooO0O0;

        public OooO00o() {
        }

        public OooO00o OooO00o(CharSequence charSequence) {
            ((OooO) this).f13920OooO00o = OooO0OO.OooO00o(charSequence);
            return this;
        }

        public OooO00o OooO0O0(CharSequence charSequence) {
            ((OooO) this).OooO0O0 = OooO0OO.OooO00o(charSequence);
            ((OooO) this).f13921OooO00o = true;
            return this;
        }

        public OooO00o(OooO0OO oooO0OO) {
            OooO00o(oooO0OO);
        }

        public OooO00o OooO00o(Bitmap bitmap) {
            this.OooO0O0 = bitmap;
            this.f13922OooO0O0 = true;
            return this;
        }

        public OooO00o OooO0O0(Bitmap bitmap) {
            this.OooO00o = bitmap;
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.OooO, androidx.core.app.NotificationCompat.OooO
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public void OooO00o(AbstractC6992o000OO00 o000oo00) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(o000oo00.OooO00o()).setBigContentTitle(((OooO) this).f13920OooO00o).bigPicture(this.OooO00o);
                if (this.f13922OooO0O0) {
                    bigPicture.bigLargeIcon(this.OooO0O0);
                }
                if (((OooO) this).f13921OooO00o) {
                    bigPicture.setSummaryText(((OooO) this).OooO0O0);
                }
            }
        }
    }

    public static class OooO0O0 extends OooO {
        public CharSequence OooO0OO;

        public OooO0O0() {
        }

        public OooO0O0 OooO00o(CharSequence charSequence) {
            this.OooO0OO = OooO0OO.OooO00o(charSequence);
            return this;
        }

        public OooO0O0 OooO0O0(CharSequence charSequence) {
            ((OooO) this).f13920OooO00o = OooO0OO.OooO00o(charSequence);
            return this;
        }

        public OooO0O0 OooO0OO(CharSequence charSequence) {
            this.OooO0O0 = OooO0OO.OooO00o(charSequence);
            ((OooO) this).f13921OooO00o = true;
            return this;
        }

        public OooO0O0(OooO0OO oooO0OO) {
            OooO00o(oooO0OO);
        }

        @Override // androidx.core.app.NotificationCompat.OooO, androidx.core.app.NotificationCompat.OooO
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public void OooO00o(AbstractC6992o000OO00 o000oo00) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigText = new Notification.BigTextStyle(o000oo00.OooO00o()).setBigContentTitle(((OooO) this).f13920OooO00o).bigText(this.OooO0OO);
                if (((OooO) this).f13921OooO00o) {
                    bigText.setSummaryText(this.OooO0O0);
                }
            }
        }
    }

    public static class OooO0OO {
        public static final int OooO = 5120;
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public long f13923OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Notification f13924OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public PendingIntent f13925OooO00o;
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

        /* renamed from: OooO00o  reason: collision with other field name */
        public Context f13926OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Bitmap f13927OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Bundle f13928OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public RemoteViews f13929OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public OooO f13930OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public CharSequence f13931OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public String f13932OooO00o;
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

        /* renamed from: OooO00o  reason: collision with other field name */
        public ArrayList<Action> f13933OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f13934OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public CharSequence[] f13935OooO00o;
        public int OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public Notification f13936OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public PendingIntent f13937OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public RemoteViews f13938OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public CharSequence f13939OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public String f13940OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public ArrayList<Action> f13941OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public boolean f13942OooO0O0;
        public int OooO0OO;

        /* renamed from: OooO0OO  reason: collision with other field name */
        public RemoteViews f13943OooO0OO;

        /* renamed from: OooO0OO  reason: collision with other field name */
        public CharSequence f13944OooO0OO;

        /* renamed from: OooO0OO  reason: collision with other field name */
        public String f13945OooO0OO;
        @Deprecated

        /* renamed from: OooO0OO  reason: collision with other field name */
        public ArrayList<String> f13946OooO0OO;

        /* renamed from: OooO0OO  reason: collision with other field name */
        public boolean f13947OooO0OO;
        public int OooO0Oo;

        /* renamed from: OooO0Oo  reason: collision with other field name */
        public RemoteViews f13948OooO0Oo;

        /* renamed from: OooO0Oo  reason: collision with other field name */
        public CharSequence f13949OooO0Oo;

        /* renamed from: OooO0Oo  reason: collision with other field name */
        public String f13950OooO0Oo;

        /* renamed from: OooO0Oo  reason: collision with other field name */
        public boolean f13951OooO0Oo;
        public int OooO0o;

        /* renamed from: OooO0o  reason: collision with other field name */
        public boolean f13952OooO0o;
        public int OooO0o0;

        /* renamed from: OooO0o0  reason: collision with other field name */
        public String f13953OooO0o0;

        /* renamed from: OooO0o0  reason: collision with other field name */
        public boolean f13954OooO0o0;
        public int OooO0oO;

        /* renamed from: OooO0oO  reason: collision with other field name */
        public boolean f13955OooO0oO;
        public int OooO0oo;

        public OooO0OO(@NonNull Context context, @NonNull String str) {
            this.f13933OooO00o = new ArrayList<>();
            this.f13941OooO0O0 = new ArrayList<>();
            this.f13934OooO00o = true;
            this.f13954OooO0o0 = false;
            this.OooO0o0 = 0;
            this.OooO0o = 0;
            this.OooO0oO = 0;
            this.OooO0oo = 0;
            Notification notification = new Notification();
            this.f13936OooO0O0 = notification;
            this.f13926OooO00o = context;
            this.f13950OooO0Oo = str;
            notification.when = System.currentTimeMillis();
            this.f13936OooO0O0.audioStreamType = -1;
            this.OooO0O0 = 0;
            this.f13946OooO0OO = new ArrayList<>();
        }

        public OooO0OO OooO00o(int i, int i2) {
            Notification notification = this.f13936OooO0O0;
            notification.icon = i;
            notification.iconLevel = i2;
            return this;
        }

        public OooO0OO OooO0O0(long j) {
            this.f13936OooO0O0.when = j;
            return this;
        }

        public OooO0OO OooO0OO(CharSequence charSequence) {
            this.f13931OooO00o = OooO00o(charSequence);
            return this;
        }

        public OooO0OO OooO0Oo(CharSequence charSequence) {
            this.f13949OooO0Oo = OooO00o(charSequence);
            return this;
        }

        public OooO0OO OooO0o(boolean z) {
            OooO00o(8, z);
            return this;
        }

        public OooO0OO OooO0o0(int i) {
            this.OooO00o = i;
            return this;
        }

        public OooO0OO OooO0oO(boolean z) {
            this.f13934OooO00o = z;
            return this;
        }

        public OooO0OO OooO0oo(boolean z) {
            this.f13942OooO0O0 = z;
            return this;
        }

        public OooO0OO OooO0O0(CharSequence charSequence) {
            this.f13939OooO0O0 = OooO00o(charSequence);
            return this;
        }

        public OooO0OO OooO0OO(int i) {
            Notification notification = this.f13936OooO0O0;
            notification.defaults = i;
            if ((i & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public OooO0OO OooO0Oo(boolean z) {
            this.f13954OooO0o0 = z;
            return this;
        }

        public OooO0OO OooO0o(int i) {
            this.OooO0O0 = i;
            return this;
        }

        public OooO0OO OooO0o0(CharSequence charSequence) {
            this.f13936OooO0O0.tickerText = OooO00o(charSequence);
            return this;
        }

        public OooO0OO OooO0oO(int i) {
            this.f13936OooO0O0.icon = i;
            return this;
        }

        public OooO0OO OooO0oo(int i) {
            this.OooO0o = i;
            return this;
        }

        public OooO0OO OooO00o(CharSequence[] charSequenceArr) {
            this.f13935OooO00o = charSequenceArr;
            return this;
        }

        public OooO0OO OooO0O0(PendingIntent pendingIntent) {
            this.f13936OooO0O0.deleteIntent = pendingIntent;
            return this;
        }

        public OooO0OO OooO0Oo(String str) {
            this.f13932OooO00o = str;
            return this;
        }

        public OooO0OO OooO0o(String str) {
            this.f13940OooO0O0 = str;
            return this;
        }

        public OooO0OO OooO0o0(boolean z) {
            OooO00o(2, z);
            return this;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public OooO0OO m14504OooO00o(CharSequence charSequence) {
            this.f13944OooO0OO = OooO00o(charSequence);
            return this;
        }

        public OooO0OO OooO0O0(boolean z) {
            this.f13952OooO0o = z;
            this.f13955OooO0oO = true;
            return this;
        }

        public OooO0OO OooO0OO(boolean z) {
            this.f13951OooO0Oo = z;
            return this;
        }

        public OooO0OO OooO0Oo(RemoteViews remoteViews) {
            this.f13948OooO0Oo = remoteViews;
            return this;
        }

        public OooO0OO OooO0o0(String str) {
            this.f13953OooO0o0 = str;
            return this;
        }

        public OooO0OO OooO00o(int i, int i2, boolean z) {
            this.OooO0OO = i;
            this.OooO0Oo = i2;
            this.f13947OooO0OO = z;
            return this;
        }

        public OooO0OO OooO0OO(RemoteViews remoteViews) {
            this.f13938OooO0O0 = remoteViews;
            return this;
        }

        public OooO0OO OooO0Oo(int i) {
            this.OooO0oo = i;
            return this;
        }

        public OooO0OO OooO0O0(String str) {
            this.f13945OooO0OO = str;
            return this;
        }

        public OooO0OO OooO0OO(@NonNull String str) {
            this.f13950OooO0Oo = str;
            return this;
        }

        public OooO0OO OooO0O0(Bundle bundle) {
            this.f13928OooO00o = bundle;
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public RemoteViews OooO0OO() {
            return this.f13948OooO0Oo;
        }

        public OooO0OO OooO00o(RemoteViews remoteViews) {
            this.f13936OooO0O0.contentView = remoteViews;
            return this;
        }

        @RequiresApi(21)
        public OooO0OO OooO0O0(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            return OooO0O0(new Action(i, charSequence, pendingIntent));
        }

        public OooO0OO OooO00o(PendingIntent pendingIntent) {
            this.f13925OooO00o = pendingIntent;
            return this;
        }

        @RequiresApi(21)
        public OooO0OO OooO0O0(Action action) {
            this.f13941OooO0O0.add(action);
            return this;
        }

        public OooO0OO OooO00o(PendingIntent pendingIntent, boolean z) {
            this.f13937OooO0O0 = pendingIntent;
            OooO00o(128, z);
            return this;
        }

        public OooO0OO OooO0O0(@ColorInt int i) {
            this.OooO0o0 = i;
            return this;
        }

        public OooO0OO OooO0O0(RemoteViews remoteViews) {
            this.f13943OooO0OO = remoteViews;
            return this;
        }

        public OooO0OO OooO00o(CharSequence charSequence, RemoteViews remoteViews) {
            this.f13936OooO0O0.tickerText = OooO00o(charSequence);
            this.f13929OooO00o = remoteViews;
            return this;
        }

        @Deprecated
        /* renamed from: OooO0O0  reason: collision with other method in class */
        public Notification m14505OooO0O0() {
            return m14500OooO00o();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: OooO0O0  reason: collision with other method in class */
        public RemoteViews m14506OooO0O0() {
            return this.f13938OooO0O0;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public OooO0OO m14503OooO00o(Bitmap bitmap) {
            this.f13927OooO00o = OooO00o(bitmap);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public int OooO0O0() {
            return this.OooO0O0;
        }

        private Bitmap OooO00o(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f13926OooO00o.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C0045R.dimen.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(C0045R.dimen.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double d = (double) dimensionPixelSize;
            double max = (double) Math.max(1, bitmap.getWidth());
            Double.isNaN(d);
            Double.isNaN(max);
            double d2 = d / max;
            double d3 = (double) dimensionPixelSize2;
            double max2 = (double) Math.max(1, bitmap.getHeight());
            Double.isNaN(d3);
            Double.isNaN(max2);
            double min = Math.min(d2, d3 / max2);
            double width = (double) bitmap.getWidth();
            Double.isNaN(width);
            double height = (double) bitmap.getHeight();
            Double.isNaN(height);
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(width * min), (int) Math.ceil(height * min), true);
        }

        @Deprecated
        public OooO0OO(Context context) {
            this(context, null);
        }

        public OooO0OO OooO00o(Uri uri) {
            Notification notification = this.f13936OooO0O0;
            notification.sound = uri;
            notification.audioStreamType = -1;
            if (Build.VERSION.SDK_INT >= 21) {
                notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        public OooO0OO OooO00o(Uri uri, int i) {
            Notification notification = this.f13936OooO0O0;
            notification.sound = uri;
            notification.audioStreamType = i;
            if (Build.VERSION.SDK_INT >= 21) {
                notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setLegacyStreamType(i).build();
            }
            return this;
        }

        public OooO0OO OooO00o(long[] jArr) {
            this.f13936OooO0O0.vibrate = jArr;
            return this;
        }

        public OooO0OO OooO00o(@ColorInt int i, int i2, int i3) {
            Notification notification = this.f13936OooO0O0;
            notification.ledARGB = i;
            notification.ledOnMS = i2;
            notification.ledOffMS = i3;
            int i4 = (i2 == 0 || i3 == 0) ? 0 : 1;
            Notification notification2 = this.f13936OooO0O0;
            notification2.flags = i4 | (notification2.flags & -2);
            return this;
        }

        public OooO0OO OooO00o(boolean z) {
            OooO00o(16, z);
            return this;
        }

        private void OooO00o(int i, boolean z) {
            if (z) {
                Notification notification = this.f13936OooO0O0;
                notification.flags = i | notification.flags;
                return;
            }
            Notification notification2 = this.f13936OooO0O0;
            notification2.flags = (i ^ -1) & notification2.flags;
        }

        public OooO0OO OooO00o(String str) {
            this.f13946OooO0OO.add(str);
            return this;
        }

        public OooO0OO OooO00o(Bundle bundle) {
            if (bundle != null) {
                Bundle bundle2 = this.f13928OooO00o;
                if (bundle2 == null) {
                    this.f13928OooO00o = new Bundle(bundle);
                } else {
                    bundle2.putAll(bundle);
                }
            }
            return this;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public Bundle m14501OooO00o() {
            if (this.f13928OooO00o == null) {
                this.f13928OooO00o = new Bundle();
            }
            return this.f13928OooO00o;
        }

        public OooO0OO OooO00o(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f13933OooO00o.add(new Action(i, charSequence, pendingIntent));
            return this;
        }

        public OooO0OO OooO00o(Action action) {
            this.f13933OooO00o.add(action);
            return this;
        }

        public OooO0OO OooO00o(OooO oooO) {
            if (this.f13930OooO00o != oooO) {
                this.f13930OooO00o = oooO;
                if (oooO != null) {
                    oooO.OooO00o(this);
                }
            }
            return this;
        }

        public OooO0OO OooO00o(Notification notification) {
            this.f13924OooO00o = notification;
            return this;
        }

        public OooO0OO OooO00o(long j) {
            this.f13923OooO00o = j;
            return this;
        }

        public OooO0OO OooO00o(int i) {
            this.OooO0oO = i;
            return this;
        }

        public OooO0OO OooO00o(OooO0o oooO0o) {
            oooO0o.OooO00o(this);
            return this;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public Notification m14500OooO00o() {
            return new C7484o0OoO0o(this).m19109OooO00o();
        }

        public static CharSequence OooO00o(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: OooO00o  reason: collision with other method in class */
        public RemoteViews m14502OooO00o() {
            return this.f13943OooO0OO;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: OooO00o  reason: collision with other method in class */
        public long m14499OooO00o() {
            if (this.f13934OooO00o) {
                return this.f13936OooO0O0.when;
            }
            return 0;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public int OooO00o() {
            return this.OooO0o0;
        }
    }

    public interface OooO0o {
        OooO0OO OooO00o(OooO0OO oooO0OO);
    }

    /* renamed from: androidx.core.app.NotificationCompat$OooO0oO  reason: case insensitive filesystem */
    public static class C5030OooO0oO extends OooO {
        public ArrayList<CharSequence> OooO00o = new ArrayList<>();

        public C5030OooO0oO() {
        }

        public C5030OooO0oO OooO00o(CharSequence charSequence) {
            this.OooO00o.add(OooO0OO.OooO00o(charSequence));
            return this;
        }

        public C5030OooO0oO OooO0O0(CharSequence charSequence) {
            ((OooO) this).f13920OooO00o = OooO0OO.OooO00o(charSequence);
            return this;
        }

        public C5030OooO0oO OooO0OO(CharSequence charSequence) {
            this.OooO0O0 = OooO0OO.OooO00o(charSequence);
            ((OooO) this).f13921OooO00o = true;
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.OooO, androidx.core.app.NotificationCompat.OooO
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public void OooO00o(AbstractC6992o000OO00 o000oo00) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(o000oo00.OooO00o()).setBigContentTitle(((OooO) this).f13920OooO00o);
                if (((OooO) this).f13921OooO00o) {
                    bigContentTitle.setSummaryText(this.OooO0O0);
                }
                Iterator<CharSequence> it = this.OooO00o.iterator();
                while (it.hasNext()) {
                    bigContentTitle.addLine(it.next());
                }
            }
        }

        public C5030OooO0oO(OooO0OO oooO0OO) {
            OooO00o(oooO0OO);
        }
    }

    /* renamed from: androidx.core.app.NotificationCompat$OooO0oo  reason: case insensitive filesystem */
    public static class C5031OooO0oo extends OooO {
        public static final int OooO00o = 25;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C6999o000OOoO f13967OooO00o;
        @Nullable

        /* renamed from: OooO00o  reason: collision with other field name */
        public Boolean f13968OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final List<OooO00o> f13969OooO00o = new ArrayList();
        @Nullable
        public CharSequence OooO0OO;

        /* renamed from: androidx.core.app.NotificationCompat$OooO0oo$OooO00o */
        public static final class OooO00o {
            public static final String OooO = "sender_person";
            public static final String OooO0O0 = "text";
            public static final String OooO0OO = "time";
            public static final String OooO0Oo = "sender";
            public static final String OooO0o = "uri";
            public static final String OooO0o0 = "type";
            public static final String OooO0oO = "extras";
            public static final String OooO0oo = "person";
            public final long OooO00o;
            @Nullable

            /* renamed from: OooO00o  reason: collision with other field name */
            public Uri f13970OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public Bundle f13971OooO00o;
            @Nullable

            /* renamed from: OooO00o  reason: collision with other field name */
            public final C6999o000OOoO f13972OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final CharSequence f13973OooO00o;
            @Nullable

            /* renamed from: OooO00o  reason: collision with other field name */
            public String f13974OooO00o;

            public OooO00o(CharSequence charSequence, long j, @Nullable C6999o000OOoO o000oooo) {
                this.f13971OooO00o = new Bundle();
                this.f13973OooO00o = charSequence;
                this.OooO00o = j;
                this.f13972OooO00o = o000oooo;
            }

            public OooO00o OooO00o(String str, Uri uri) {
                this.f13974OooO00o = str;
                this.f13970OooO00o = uri;
                return this;
            }

            @NonNull
            /* renamed from: OooO0O0  reason: collision with other method in class */
            public CharSequence m14527OooO0O0() {
                return this.f13973OooO00o;
            }

            private Bundle OooO0O0() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.f13973OooO00o;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", this.OooO00o);
                C6999o000OOoO o000oooo = this.f13972OooO00o;
                if (o000oooo != null) {
                    bundle.putCharSequence("sender", o000oooo.m18221OooO00o());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable(OooO, this.f13972OooO00o.OooO00o());
                    } else {
                        bundle.putBundle(OooO0oo, this.f13972OooO00o.m18218OooO00o());
                    }
                }
                String str = this.f13974OooO00o;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.f13970OooO00o;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.f13971OooO00o;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }

            public long OooO00o() {
                return this.OooO00o;
            }

            @NonNull
            /* renamed from: OooO00o  reason: collision with other method in class */
            public Bundle m14523OooO00o() {
                return this.f13971OooO00o;
            }

            @Nullable
            @Deprecated
            /* renamed from: OooO00o  reason: collision with other method in class */
            public CharSequence m14525OooO00o() {
                C6999o000OOoO o000oooo = this.f13972OooO00o;
                if (o000oooo == null) {
                    return null;
                }
                return o000oooo.m18221OooO00o();
            }

            @Deprecated
            public OooO00o(CharSequence charSequence, long j, CharSequence charSequence2) {
                this(charSequence, j, new C6999o000OOoO.OooO00o().OooO00o(charSequence2).OooO00o());
            }

            @Nullable
            /* renamed from: OooO00o  reason: collision with other method in class */
            public C6999o000OOoO m14524OooO00o() {
                return this.f13972OooO00o;
            }

            @Nullable
            /* renamed from: OooO00o  reason: collision with other method in class */
            public String m14526OooO00o() {
                return this.f13974OooO00o;
            }

            @Nullable
            /* renamed from: OooO00o  reason: collision with other method in class */
            public Uri m14522OooO00o() {
                return this.f13970OooO00o;
            }

            @NonNull
            public static Bundle[] OooO00o(List<OooO00o> list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    bundleArr[i] = list.get(i).OooO0O0();
                }
                return bundleArr;
            }

            @NonNull
            public static List<OooO00o> OooO00o(Parcelable[] parcelableArr) {
                OooO00o OooO00o2;
                ArrayList arrayList = new ArrayList(parcelableArr.length);
                for (int i = 0; i < parcelableArr.length; i++) {
                    if ((parcelableArr[i] instanceof Bundle) && (OooO00o2 = OooO00o((Bundle) parcelableArr[i])) != null) {
                        arrayList.add(OooO00o2);
                    }
                }
                return arrayList;
            }

            @Nullable
            public static OooO00o OooO00o(Bundle bundle) {
                C6999o000OOoO o000oooo;
                try {
                    if (bundle.containsKey("text")) {
                        if (bundle.containsKey("time")) {
                            if (bundle.containsKey(OooO0oo)) {
                                o000oooo = C6999o000OOoO.OooO00o(bundle.getBundle(OooO0oo));
                            } else if (!bundle.containsKey(OooO) || Build.VERSION.SDK_INT < 28) {
                                o000oooo = bundle.containsKey("sender") ? new C6999o000OOoO.OooO00o().OooO00o(bundle.getCharSequence("sender")).OooO00o() : null;
                            } else {
                                o000oooo = C6999o000OOoO.OooO00o((Person) bundle.getParcelable(OooO));
                            }
                            OooO00o oooO00o = new OooO00o(bundle.getCharSequence("text"), bundle.getLong("time"), o000oooo);
                            if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                                oooO00o.OooO00o(bundle.getString("type"), (Uri) bundle.getParcelable("uri"));
                            }
                            if (bundle.containsKey("extras")) {
                                oooO00o.m14523OooO00o().putAll(bundle.getBundle("extras"));
                            }
                            return oooO00o;
                        }
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }
        }

        public C5031OooO0oo() {
        }

        @Override // androidx.core.app.NotificationCompat.OooO
        /* renamed from: OooO00o  reason: collision with other method in class */
        public C6999o000OOoO m14517OooO00o() {
            return this.f13967OooO00o;
        }

        @Deprecated
        /* renamed from: OooO0O0  reason: collision with other method in class */
        public CharSequence m14521OooO0O0() {
            return this.f13967OooO00o.m18221OooO00o();
        }

        private boolean OooO0O0() {
            for (int size = this.f13969OooO00o.size() - 1; size >= 0; size--) {
                OooO00o oooO00o = this.f13969OooO00o.get(size);
                if (oooO00o.m14524OooO00o() != null && oooO00o.m14524OooO00o().m18221OooO00o() == null) {
                    return true;
                }
            }
            return false;
        }

        public C5031OooO0oo OooO00o(@Nullable CharSequence charSequence) {
            this.OooO0OO = charSequence;
            return this;
        }

        @Deprecated
        public C5031OooO0oo(@NonNull CharSequence charSequence) {
            this.f13967OooO00o = new C6999o000OOoO.OooO00o().OooO00o(charSequence).OooO00o();
        }

        @Override // androidx.core.app.NotificationCompat.OooO
        @Nullable
        /* renamed from: OooO00o  reason: collision with other method in class */
        public CharSequence m14518OooO00o() {
            return this.OooO0OO;
        }

        @Deprecated
        public C5031OooO0oo OooO00o(CharSequence charSequence, long j, CharSequence charSequence2) {
            this.f13969OooO00o.add(new OooO00o(charSequence, j, new C6999o000OOoO.OooO00o().OooO00o(charSequence2).OooO00o()));
            if (this.f13969OooO00o.size() > 25) {
                this.f13969OooO00o.remove(0);
            }
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.OooO
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public void OooO0O0(Bundle bundle) {
            this.f13969OooO00o.clear();
            if (bundle.containsKey(NotificationCompat.f13892OooOoO0)) {
                this.f13967OooO00o = C6999o000OOoO.OooO00o(bundle.getBundle(NotificationCompat.f13892OooOoO0));
            } else {
                this.f13967OooO00o = new C6999o000OOoO.OooO00o().OooO00o((CharSequence) bundle.getString("android.selfDisplayName")).OooO00o();
            }
            CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
            this.OooO0OO = charSequence;
            if (charSequence == null) {
                this.OooO0OO = bundle.getCharSequence(NotificationCompat.f13894OooOoo);
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
            if (parcelableArray != null) {
                this.f13969OooO00o.addAll(OooO00o.OooO00o(parcelableArray));
            }
            if (bundle.containsKey(NotificationCompat.f13895OooOoo0)) {
                this.f13968OooO00o = Boolean.valueOf(bundle.getBoolean(NotificationCompat.f13895OooOoo0));
            }
        }

        public C5031OooO0oo(@NonNull C6999o000OOoO o000oooo) {
            if (!TextUtils.isEmpty(o000oooo.m18221OooO00o())) {
                this.f13967OooO00o = o000oooo;
                return;
            }
            throw new IllegalArgumentException("User's name must not be empty.");
        }

        public C5031OooO0oo OooO00o(CharSequence charSequence, long j, C6999o000OOoO o000oooo) {
            m14516OooO00o(new OooO00o(charSequence, j, o000oooo));
            return this;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public C5031OooO0oo m14516OooO00o(OooO00o oooO00o) {
            this.f13969OooO00o.add(oooO00o);
            if (this.f13969OooO00o.size() > 25) {
                this.f13969OooO00o.remove(0);
            }
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.OooO
        /* renamed from: OooO00o  reason: collision with other method in class */
        public List<OooO00o> m14519OooO00o() {
            return this.f13969OooO00o;
        }

        public C5031OooO0oo OooO00o(boolean z) {
            this.f13968OooO00o = Boolean.valueOf(z);
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.OooO
        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m14520OooO00o() {
            OooO0OO oooO0OO = ((OooO) this).OooO00o;
            if (oooO0OO == null || oooO0OO.f13926OooO00o.getApplicationInfo().targetSdkVersion >= 28 || this.f13968OooO00o != null) {
                Boolean bool = this.f13968OooO00o;
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } else if (this.OooO0OO != null) {
                return true;
            } else {
                return false;
            }
        }

        @Nullable
        public static C5031OooO0oo OooO00o(Notification notification) {
            Bundle OooO00o2 = NotificationCompat.m14477OooO00o(notification);
            if (OooO00o2 != null && !OooO00o2.containsKey("android.selfDisplayName") && !OooO00o2.containsKey(NotificationCompat.f13892OooOoO0)) {
                return null;
            }
            try {
                C5031OooO0oo oooO0oo = new C5031OooO0oo();
                oooO0oo.OooO0O0(OooO00o2);
                return oooO0oo;
            } catch (ClassCastException unused) {
                return null;
            }
        }

        @Override // androidx.core.app.NotificationCompat.OooO, androidx.core.app.NotificationCompat.OooO
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public void OooO00o(AbstractC6992o000OO00 o000oo00) {
            CharSequence charSequence;
            Notification.MessagingStyle messagingStyle;
            Notification.MessagingStyle.Message message;
            OooO00o(m14520OooO00o());
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                if (i >= 28) {
                    messagingStyle = new Notification.MessagingStyle(this.f13967OooO00o.OooO00o());
                } else {
                    messagingStyle = new Notification.MessagingStyle(this.f13967OooO00o.m18221OooO00o());
                }
                if (this.f13968OooO00o.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                    messagingStyle.setConversationTitle(this.OooO0OO);
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    messagingStyle.setGroupConversation(this.f13968OooO00o.booleanValue());
                }
                for (OooO00o oooO00o : this.f13969OooO00o) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        C6999o000OOoO OooO00o2 = oooO00o.m14524OooO00o();
                        message = new Notification.MessagingStyle.Message(oooO00o.m14527OooO0O0(), oooO00o.OooO00o(), OooO00o2 == null ? null : OooO00o2.OooO00o());
                    } else {
                        message = new Notification.MessagingStyle.Message(oooO00o.m14527OooO0O0(), oooO00o.OooO00o(), oooO00o.m14524OooO00o() != null ? oooO00o.m14524OooO00o().m18221OooO00o() : null);
                    }
                    if (oooO00o.m14526OooO00o() != null) {
                        message.setData(oooO00o.m14526OooO00o(), oooO00o.m14522OooO00o());
                    }
                    messagingStyle.addMessage(message);
                }
                messagingStyle.setBuilder(o000oo00.OooO00o());
                return;
            }
            OooO00o OooO00o3 = OooO00o();
            if (this.OooO0OO != null && this.f13968OooO00o.booleanValue()) {
                o000oo00.OooO00o().setContentTitle(this.OooO0OO);
            } else if (OooO00o3 != null) {
                o000oo00.OooO00o().setContentTitle("");
                if (OooO00o3.m14524OooO00o() != null) {
                    o000oo00.OooO00o().setContentTitle(OooO00o3.m14524OooO00o().m18221OooO00o());
                }
            }
            if (OooO00o3 != null) {
                Notification.Builder OooO00o4 = o000oo00.OooO00o();
                if (this.OooO0OO != null) {
                    charSequence = OooO00o(OooO00o3);
                } else {
                    charSequence = OooO00o3.m14527OooO0O0();
                }
                OooO00o4.setContentText(charSequence);
            }
            if (Build.VERSION.SDK_INT >= 16) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                boolean z = this.OooO0OO != null || OooO0O0();
                for (int size = this.f13969OooO00o.size() - 1; size >= 0; size--) {
                    OooO00o oooO00o2 = this.f13969OooO00o.get(size);
                    CharSequence OooO00o5 = z ? OooO00o(oooO00o2) : oooO00o2.m14527OooO0O0();
                    if (size != this.f13969OooO00o.size() - 1) {
                        spannableStringBuilder.insert(0, (CharSequence) "\n");
                    }
                    spannableStringBuilder.insert(0, OooO00o5);
                }
                new Notification.BigTextStyle(o000oo00.OooO00o()).setBigContentTitle(null).bigText(spannableStringBuilder);
            }
        }

        @Override // androidx.core.app.NotificationCompat.OooO
        @Nullable
        private OooO00o OooO00o() {
            for (int size = this.f13969OooO00o.size() - 1; size >= 0; size--) {
                OooO00o oooO00o = this.f13969OooO00o.get(size);
                if (!(oooO00o.m14524OooO00o() == null || TextUtils.isEmpty(oooO00o.m14524OooO00o().m18221OooO00o()))) {
                    return oooO00o;
                }
            }
            if (this.f13969OooO00o.isEmpty()) {
                return null;
            }
            List<OooO00o> list = this.f13969OooO00o;
            return list.get(list.size() - 1);
        }

        private CharSequence OooO00o(OooO00o oooO00o) {
            C7070o00O0o0o OooO00o2 = C7070o00O0o0o.OooO00o();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            boolean z = Build.VERSION.SDK_INT >= 21;
            int i = z ? -16777216 : -1;
            CharSequence charSequence = "";
            CharSequence OooO00o3 = oooO00o.m14524OooO00o() == null ? charSequence : oooO00o.m14524OooO00o().m18221OooO00o();
            if (TextUtils.isEmpty(OooO00o3)) {
                OooO00o3 = this.f13967OooO00o.m18221OooO00o();
                if (z && ((OooO) this).OooO00o.OooO00o() != 0) {
                    i = ((OooO) this).OooO00o.OooO00o();
                }
            }
            CharSequence OooO00o4 = OooO00o2.m18350OooO00o(OooO00o3);
            spannableStringBuilder.append(OooO00o4);
            spannableStringBuilder.setSpan(OooO00o(i), spannableStringBuilder.length() - OooO00o4.length(), spannableStringBuilder.length(), 33);
            if (oooO00o.m14527OooO0O0() != null) {
                charSequence = oooO00o.m14527OooO0O0();
            }
            spannableStringBuilder.append((CharSequence) GlideException.OooO00o.o0ooOoO).append(OooO00o2.m18350OooO00o(charSequence));
            return spannableStringBuilder;
        }

        @NonNull
        private TextAppearanceSpan OooO00o(int i) {
            return new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i), null);
        }

        @Override // androidx.core.app.NotificationCompat.OooO
        public void OooO00o(Bundle bundle) {
            super.OooO00o(bundle);
            bundle.putCharSequence("android.selfDisplayName", this.f13967OooO00o.m18221OooO00o());
            bundle.putBundle(NotificationCompat.f13892OooOoO0, this.f13967OooO00o.m18218OooO00o());
            bundle.putCharSequence(NotificationCompat.f13894OooOoo, this.OooO0OO);
            if (this.OooO0OO != null && this.f13968OooO00o.booleanValue()) {
                bundle.putCharSequence("android.conversationTitle", this.OooO0OO);
            }
            if (!this.f13969OooO00o.isEmpty()) {
                bundle.putParcelableArray("android.messages", OooO00o.OooO00o(this.f13969OooO00o));
            }
            Boolean bool = this.f13968OooO00o;
            if (bool != null) {
                bundle.putBoolean(NotificationCompat.f13895OooOoo0, bool.booleanValue());
            }
        }
    }

    public static final class OooOO0 implements OooO0o {
        public static final int OooO = -1;

        /* renamed from: OooO  reason: collision with other field name */
        public static final String f13975OooO = "contentIcon";
        public static final String OooO0OO = "android.wearable.EXTENSIONS";
        public static final String OooO0Oo = "actions";
        public static final String OooO0o = "displayIntent";
        public static final String OooO0o0 = "flags";
        public static final String OooO0oO = "pages";
        public static final String OooO0oo = "background";
        public static final int OooOO0 = 0;

        /* renamed from: OooOO0  reason: collision with other field name */
        public static final String f13976OooOO0 = "contentIconGravity";
        public static final int OooOO0O = 1;

        /* renamed from: OooOO0O  reason: collision with other field name */
        public static final String f13977OooOO0O = "contentActionIndex";
        public static final int OooOO0o = 2;

        /* renamed from: OooOO0o  reason: collision with other field name */
        public static final String f13978OooOO0o = "customSizePreset";
        public static final int OooOOO = 4;

        /* renamed from: OooOOO  reason: collision with other field name */
        public static final String f13979OooOOO = "gravity";
        public static final int OooOOO0 = 3;

        /* renamed from: OooOOO0  reason: collision with other field name */
        public static final String f13980OooOOO0 = "customContentHeight";
        public static final int OooOOOO = 5;

        /* renamed from: OooOOOO  reason: collision with other field name */
        public static final String f13981OooOOOO = "hintScreenTimeout";
        public static final int OooOOOo = 0;

        /* renamed from: OooOOOo  reason: collision with other field name */
        public static final String f13982OooOOOo = "dismissalId";
        public static final int OooOOo = 1;
        public static final int OooOOo0 = -1;

        /* renamed from: OooOOo0  reason: collision with other field name */
        public static final String f13983OooOOo0 = "bridgeTag";
        public static final int OooOOoo = 2;
        public static final int OooOo = 64;
        public static final int OooOo0 = 8;
        public static final int OooOo00 = 4;
        public static final int OooOo0O = 16;
        public static final int OooOo0o = 32;
        public static final int OooOoO = 8388613;
        public static final int OooOoO0 = 1;
        public static final int OooOoOO = 80;
        public int OooO00o = 1;

        /* renamed from: OooO00o  reason: collision with other field name */
        public PendingIntent f13984OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Bitmap f13985OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public String f13986OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public ArrayList<Action> f13987OooO00o = new ArrayList<>();
        public int OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public String f13988OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public ArrayList<Notification> f13989OooO0O0 = new ArrayList<>();

        /* renamed from: OooO0OO  reason: collision with other field name */
        public int f13990OooO0OO = 8388613;

        /* renamed from: OooO0Oo  reason: collision with other field name */
        public int f13991OooO0Oo = -1;

        /* renamed from: OooO0o  reason: collision with other field name */
        public int f13992OooO0o;

        /* renamed from: OooO0o0  reason: collision with other field name */
        public int f13993OooO0o0 = 0;

        /* renamed from: OooO0oO  reason: collision with other field name */
        public int f13994OooO0oO = 80;

        /* renamed from: OooO0oo  reason: collision with other field name */
        public int f13995OooO0oo;

        public OooOO0() {
        }

        @Override // androidx.core.app.NotificationCompat.OooO0o
        public OooO0OO OooO00o(OooO0OO oooO0OO) {
            Bundle bundle = new Bundle();
            if (!this.f13987OooO00o.isEmpty()) {
                if (Build.VERSION.SDK_INT >= 16) {
                    ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.f13987OooO00o.size());
                    Iterator<Action> it = this.f13987OooO00o.iterator();
                    while (it.hasNext()) {
                        Action next = it.next();
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 20) {
                            arrayList.add(OooO00o(next));
                        } else if (i >= 16) {
                            arrayList.add(C6994o000OOO.OooO00o(next));
                        }
                    }
                    bundle.putParcelableArrayList("actions", arrayList);
                } else {
                    bundle.putParcelableArrayList("actions", null);
                }
            }
            int i2 = this.OooO00o;
            if (i2 != 1) {
                bundle.putInt("flags", i2);
            }
            PendingIntent pendingIntent = this.f13984OooO00o;
            if (pendingIntent != null) {
                bundle.putParcelable("displayIntent", pendingIntent);
            }
            if (!this.f13989OooO0O0.isEmpty()) {
                ArrayList<Notification> arrayList2 = this.f13989OooO0O0;
                bundle.putParcelableArray("pages", (Parcelable[]) arrayList2.toArray(new Notification[arrayList2.size()]));
            }
            Bitmap bitmap = this.f13985OooO00o;
            if (bitmap != null) {
                bundle.putParcelable("background", bitmap);
            }
            int i3 = this.OooO0O0;
            if (i3 != 0) {
                bundle.putInt("contentIcon", i3);
            }
            int i4 = this.f13990OooO0OO;
            if (i4 != 8388613) {
                bundle.putInt("contentIconGravity", i4);
            }
            int i5 = this.f13991OooO0Oo;
            if (i5 != -1) {
                bundle.putInt("contentActionIndex", i5);
            }
            int i6 = this.f13993OooO0o0;
            if (i6 != 0) {
                bundle.putInt("customSizePreset", i6);
            }
            int i7 = this.f13992OooO0o;
            if (i7 != 0) {
                bundle.putInt("customContentHeight", i7);
            }
            int i8 = this.f13994OooO0oO;
            if (i8 != 80) {
                bundle.putInt("gravity", i8);
            }
            int i9 = this.f13995OooO0oo;
            if (i9 != 0) {
                bundle.putInt("hintScreenTimeout", i9);
            }
            String str = this.f13986OooO00o;
            if (str != null) {
                bundle.putString("dismissalId", str);
            }
            String str2 = this.f13988OooO0O0;
            if (str2 != null) {
                bundle.putString("bridgeTag", str2);
            }
            oooO0OO.m14501OooO00o().putBundle("android.wearable.EXTENSIONS", bundle);
            return oooO0OO;
        }

        public OooOO0 OooO0O0(List<Notification> list) {
            this.f13989OooO0O0.addAll(list);
            return this;
        }

        /* renamed from: OooO0OO  reason: collision with other method in class */
        public OooOO0 clone() {
            OooOO0 oooOO0 = new OooOO0();
            oooOO0.f13987OooO00o = new ArrayList<>(this.f13987OooO00o);
            oooOO0.OooO00o = this.OooO00o;
            oooOO0.f13984OooO00o = this.f13984OooO00o;
            oooOO0.f13989OooO0O0 = new ArrayList<>(this.f13989OooO0O0);
            oooOO0.f13985OooO00o = this.f13985OooO00o;
            oooOO0.OooO0O0 = this.OooO0O0;
            oooOO0.f13990OooO0OO = this.f13990OooO0OO;
            oooOO0.f13991OooO0Oo = this.f13991OooO0Oo;
            oooOO0.f13993OooO0o0 = this.f13993OooO0o0;
            oooOO0.f13992OooO0o = this.f13992OooO0o;
            oooOO0.f13994OooO0oO = this.f13994OooO0oO;
            oooOO0.f13995OooO0oo = this.f13995OooO0oo;
            oooOO0.f13986OooO00o = this.f13986OooO00o;
            oooOO0.f13988OooO0O0 = this.f13988OooO0O0;
            return oooOO0;
        }

        @Deprecated
        public OooOO0 OooO0Oo(int i) {
            this.f13992OooO0o = i;
            return this;
        }

        @Deprecated
        public OooOO0 OooO0o(int i) {
            this.f13994OooO0oO = i;
            return this;
        }

        @Deprecated
        public OooOO0 OooO0o0(int i) {
            this.f13993OooO0o0 = i;
            return this;
        }

        public OooOO0 OooO0oO(boolean z) {
            OooO00o(8, z);
            return this;
        }

        /* renamed from: OooO0O0  reason: collision with other method in class */
        public OooOO0 m14535OooO0O0() {
            this.f13989OooO0O0.clear();
            return this;
        }

        @Deprecated
        public int OooO0Oo() {
            return this.f13992OooO0o;
        }

        @Deprecated
        public int OooO0o() {
            return this.f13994OooO0oO;
        }

        @Deprecated
        public int OooO0o0() {
            return this.f13993OooO0o0;
        }

        /* renamed from: OooO0oO  reason: collision with other method in class */
        public boolean m14544OooO0oO() {
            return (this.OooO00o & 8) != 0;
        }

        /* renamed from: OooO0O0  reason: collision with other method in class */
        public List<Notification> m14537OooO0O0() {
            return this.f13989OooO0O0;
        }

        public OooOO0 OooO0Oo(boolean z) {
            OooO00o(64, z);
            return this;
        }

        @Deprecated
        public OooOO0 OooO0o(boolean z) {
            OooO00o(4, z);
            return this;
        }

        @Deprecated
        public OooOO0 OooO0o0(boolean z) {
            OooO00o(2, z);
            return this;
        }

        @Deprecated
        public OooOO0 OooO0oO(int i) {
            this.f13995OooO0oo = i;
            return this;
        }

        @Deprecated
        public OooOO0 OooO0O0(int i) {
            this.OooO0O0 = i;
            return this;
        }

        /* renamed from: OooO0Oo  reason: collision with other method in class */
        public boolean m14541OooO0Oo() {
            return (this.OooO00o & 64) != 0;
        }

        @Deprecated
        /* renamed from: OooO0o  reason: collision with other method in class */
        public boolean m14542OooO0o() {
            return (this.OooO00o & 4) != 0;
        }

        @Deprecated
        /* renamed from: OooO0o0  reason: collision with other method in class */
        public boolean m14543OooO0o0() {
            return (this.OooO00o & 2) != 0;
        }

        @Deprecated
        public int OooO0oO() {
            return this.f13995OooO0oo;
        }

        @Deprecated
        public int OooO0O0() {
            return this.OooO0O0;
        }

        public OooOO0 OooO0O0(boolean z) {
            OooO00o(32, z);
            return this;
        }

        /* renamed from: OooO0O0  reason: collision with other method in class */
        public boolean m14538OooO0O0() {
            return (this.OooO00o & 32) != 0;
        }

        public OooOO0 OooO0O0(String str) {
            this.f13986OooO00o = str;
            return this;
        }

        public OooOO0(Notification notification) {
            Bundle OooO00o2 = NotificationCompat.m14477OooO00o(notification);
            Bundle bundle = OooO00o2 != null ? OooO00o2.getBundle("android.wearable.EXTENSIONS") : null;
            if (bundle != null) {
                ArrayList parcelableArrayList = bundle.getParcelableArrayList("actions");
                if (Build.VERSION.SDK_INT >= 16 && parcelableArrayList != null) {
                    int size = parcelableArrayList.size();
                    Action[] actionArr = new Action[size];
                    for (int i = 0; i < size; i++) {
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 20) {
                            actionArr[i] = NotificationCompat.OooO00o((Notification.Action) parcelableArrayList.get(i));
                        } else if (i2 >= 16) {
                            actionArr[i] = C6994o000OOO.OooO00o((Bundle) parcelableArrayList.get(i));
                        }
                    }
                    Collections.addAll(this.f13987OooO00o, actionArr);
                }
                this.OooO00o = bundle.getInt("flags", 1);
                this.f13984OooO00o = (PendingIntent) bundle.getParcelable("displayIntent");
                Notification[] OooO00o3 = NotificationCompat.OooO00o(bundle, "pages");
                if (OooO00o3 != null) {
                    Collections.addAll(this.f13989OooO0O0, OooO00o3);
                }
                this.f13985OooO00o = (Bitmap) bundle.getParcelable("background");
                this.OooO0O0 = bundle.getInt("contentIcon");
                this.f13990OooO0OO = bundle.getInt("contentIconGravity", 8388613);
                this.f13991OooO0Oo = bundle.getInt("contentActionIndex", -1);
                this.f13993OooO0o0 = bundle.getInt("customSizePreset", 0);
                this.f13992OooO0o = bundle.getInt("customContentHeight");
                this.f13994OooO0oO = bundle.getInt("gravity", 80);
                this.f13995OooO0oo = bundle.getInt("hintScreenTimeout");
                this.f13986OooO00o = bundle.getString("dismissalId");
                this.f13988OooO0O0 = bundle.getString("bridgeTag");
            }
        }

        /* renamed from: OooO0O0  reason: collision with other method in class */
        public String m14536OooO0O0() {
            return this.f13986OooO00o;
        }

        @Deprecated
        public OooOO0 OooO0OO(int i) {
            this.f13990OooO0OO = i;
            return this;
        }

        @Deprecated
        public int OooO0OO() {
            return this.f13990OooO0OO;
        }

        @Deprecated
        public OooOO0 OooO0OO(boolean z) {
            OooO00o(16, z);
            return this;
        }

        @Deprecated
        /* renamed from: OooO0OO  reason: collision with other method in class */
        public boolean m14540OooO0OO() {
            return (this.OooO00o & 16) != 0;
        }

        @RequiresApi(20)
        public static Notification.Action OooO00o(Action action) {
            Bundle bundle;
            Notification.Action.Builder builder = new Notification.Action.Builder(action.OooO00o(), action.m14487OooO00o(), action.m14485OooO00o());
            if (action.m14486OooO00o() != null) {
                bundle = new Bundle(action.m14486OooO00o());
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", action.m14488OooO00o());
            if (Build.VERSION.SDK_INT >= 24) {
                builder.setAllowGeneratedReplies(action.m14488OooO00o());
            }
            builder.addExtras(bundle);
            C7002o000Oo00[] OooO0O02 = action.m14491OooO0O0();
            if (OooO0O02 != null) {
                for (RemoteInput remoteInput : C7002o000Oo00.OooO00o(OooO0O02)) {
                    builder.addRemoteInput(remoteInput);
                }
            }
            return builder.build();
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public OooOO0 m14531OooO00o(Action action) {
            this.f13987OooO00o.add(action);
            return this;
        }

        public OooOO0 OooO00o(List<Action> list) {
            this.f13987OooO00o.addAll(list);
            return this;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public OooOO0 m14530OooO00o() {
            this.f13987OooO00o.clear();
            return this;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public List<Action> m14533OooO00o() {
            return this.f13987OooO00o;
        }

        public OooOO0 OooO00o(PendingIntent pendingIntent) {
            this.f13984OooO00o = pendingIntent;
            return this;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public PendingIntent m14528OooO00o() {
            return this.f13984OooO00o;
        }

        public OooOO0 OooO00o(Notification notification) {
            this.f13989OooO0O0.add(notification);
            return this;
        }

        public OooOO0 OooO00o(Bitmap bitmap) {
            this.f13985OooO00o = bitmap;
            return this;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public Bitmap m14529OooO00o() {
            return this.f13985OooO00o;
        }

        public OooOO0 OooO00o(int i) {
            this.f13991OooO0Oo = i;
            return this;
        }

        public int OooO00o() {
            return this.f13991OooO0Oo;
        }

        public OooOO0 OooO00o(boolean z) {
            OooO00o(1, z);
            return this;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m14534OooO00o() {
            return (this.OooO00o & 1) != 0;
        }

        public OooOO0 OooO00o(String str) {
            this.f13988OooO0O0 = str;
            return this;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public String m14532OooO00o() {
            return this.f13988OooO0O0;
        }

        private void OooO00o(int i, boolean z) {
            if (z) {
                this.OooO00o = i | this.OooO00o;
                return;
            }
            this.OooO00o = (i ^ -1) & this.OooO00o;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface StreamType {
    }

    public static Notification[] OooO00o(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Notification[]) || parcelableArray == null) {
            return (Notification[]) parcelableArray;
        }
        Notification[] notificationArr = new Notification[parcelableArray.length];
        for (int i = 0; i < parcelableArray.length; i++) {
            notificationArr[i] = (Notification) parcelableArray[i];
        }
        bundle.putParcelableArray(str, notificationArr);
        return notificationArr;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static boolean m14483OooO0O0(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            if ((notification.flags & 512) != 0) {
                return true;
            }
            return false;
        } else if (i >= 19) {
            return notification.extras.getBoolean("android.support.isGroupSummary");
        } else {
            if (i >= 16) {
                return C6994o000OOO.m18208OooO00o(notification).getBoolean("android.support.isGroupSummary");
            }
            return false;
        }
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public static String m14484OooO0OO(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            return notification.getGroup();
        }
        if (i >= 19) {
            return notification.extras.getString("android.support.groupKey");
        }
        if (i >= 16) {
            return C6994o000OOO.m18208OooO00o(notification).getString("android.support.groupKey");
        }
        return null;
    }

    public static String OooO0Oo(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getShortcutId();
        }
        return null;
    }

    public static String OooO0o0(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            return notification.getSortKey();
        }
        if (i >= 19) {
            return notification.extras.getString("android.support.sortKey");
        }
        if (i >= 16) {
            return C6994o000OOO.m18208OooO00o(notification).getString("android.support.sortKey");
        }
        return null;
    }

    /* renamed from: androidx.core.app.NotificationCompat$OooO0Oo  reason: case insensitive filesystem */
    public static final class C5028OooO0Oo implements OooO0o {
        public static final String OooO = "remote_input";
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final String OooO00o = "android.car.EXTENSIONS";
        public static final String OooO0O0 = "large_icon";
        public static final String OooO0OO = "car_conversation";
        public static final String OooO0Oo = "app_color";
        public static final String OooO0o = "author";
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final String OooO0o0 = "invisible_actions";
        public static final String OooO0oO = "text";
        public static final String OooO0oo = "messages";
        public static final String OooOO0 = "on_reply";
        public static final String OooOO0O = "on_read";
        public static final String OooOO0o = "participants";
        public static final String OooOOO0 = "timestamp";

        /* renamed from: OooO00o  reason: collision with other field name */
        public int f13956OooO00o = 0;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Bitmap f13957OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public OooO00o f13958OooO00o;

        /* renamed from: androidx.core.app.NotificationCompat$OooO0Oo$OooO00o */
        public static class OooO00o {
            public final long OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final PendingIntent f13959OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final C7002o000Oo00 f13960OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final String[] f13961OooO00o;
            public final PendingIntent OooO0O0;

            /* renamed from: OooO0O0  reason: collision with other field name */
            public final String[] f13962OooO0O0;

            /* renamed from: androidx.core.app.NotificationCompat$OooO0Oo$OooO00o$OooO00o  reason: collision with other inner class name */
            public static class C4884OooO00o {
                public long OooO00o;

                /* renamed from: OooO00o  reason: collision with other field name */
                public PendingIntent f13963OooO00o;

                /* renamed from: OooO00o  reason: collision with other field name */
                public C7002o000Oo00 f13964OooO00o;

                /* renamed from: OooO00o  reason: collision with other field name */
                public final String f13965OooO00o;

                /* renamed from: OooO00o  reason: collision with other field name */
                public final List<String> f13966OooO00o = new ArrayList();
                public PendingIntent OooO0O0;

                public C4884OooO00o(String str) {
                    this.f13965OooO00o = str;
                }

                public C4884OooO00o OooO00o(String str) {
                    this.f13966OooO00o.add(str);
                    return this;
                }

                public C4884OooO00o OooO00o(PendingIntent pendingIntent, C7002o000Oo00 o000oo00) {
                    this.f13964OooO00o = o000oo00;
                    this.OooO0O0 = pendingIntent;
                    return this;
                }

                public C4884OooO00o OooO00o(PendingIntent pendingIntent) {
                    this.f13963OooO00o = pendingIntent;
                    return this;
                }

                public C4884OooO00o OooO00o(long j) {
                    this.OooO00o = j;
                    return this;
                }

                public OooO00o OooO00o() {
                    List<String> list = this.f13966OooO00o;
                    return new OooO00o((String[]) list.toArray(new String[list.size()]), this.f13964OooO00o, this.OooO0O0, this.f13963OooO00o, new String[]{this.f13965OooO00o}, this.OooO00o);
                }
            }

            public OooO00o(String[] strArr, C7002o000Oo00 o000oo00, PendingIntent pendingIntent, PendingIntent pendingIntent2, String[] strArr2, long j) {
                this.f13961OooO00o = strArr;
                this.f13960OooO00o = o000oo00;
                this.OooO0O0 = pendingIntent2;
                this.f13959OooO00o = pendingIntent;
                this.f13962OooO0O0 = strArr2;
                this.OooO00o = j;
            }

            /* renamed from: OooO00o  reason: collision with other method in class */
            public String[] m14513OooO00o() {
                return this.f13961OooO00o;
            }

            public PendingIntent OooO0O0() {
                return this.f13959OooO00o;
            }

            /* renamed from: OooO00o  reason: collision with other method in class */
            public C7002o000Oo00 m14511OooO00o() {
                return this.f13960OooO00o;
            }

            /* renamed from: OooO0O0  reason: collision with other method in class */
            public String[] m14514OooO0O0() {
                return this.f13962OooO0O0;
            }

            /* renamed from: OooO00o  reason: collision with other method in class */
            public PendingIntent m14510OooO00o() {
                return this.OooO0O0;
            }

            /* renamed from: OooO00o  reason: collision with other method in class */
            public String m14512OooO00o() {
                String[] strArr = this.f13962OooO0O0;
                if (strArr.length > 0) {
                    return strArr[0];
                }
                return null;
            }

            public long OooO00o() {
                return this.OooO00o;
            }
        }

        public C5028OooO0Oo() {
        }

        @RequiresApi(21)
        public static OooO00o OooO00o(@Nullable Bundle bundle) {
            String[] strArr;
            C7002o000Oo00 o000oo00 = null;
            if (bundle == null) {
                return null;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("messages");
            if (parcelableArray != null) {
                int length = parcelableArray.length;
                String[] strArr2 = new String[length];
                boolean z = false;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = true;
                        break;
                    } else if (!(parcelableArray[i] instanceof Bundle)) {
                        break;
                    } else {
                        strArr2[i] = ((Bundle) parcelableArray[i]).getString("text");
                        if (strArr2[i] == null) {
                            break;
                        }
                        i++;
                    }
                }
                if (!z) {
                    return null;
                }
                strArr = strArr2;
            } else {
                strArr = null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("on_read");
            PendingIntent pendingIntent2 = (PendingIntent) bundle.getParcelable("on_reply");
            RemoteInput remoteInput = (RemoteInput) bundle.getParcelable("remote_input");
            String[] stringArray = bundle.getStringArray("participants");
            if (stringArray == null || stringArray.length != 1) {
                return null;
            }
            if (remoteInput != null) {
                o000oo00 = new C7002o000Oo00(remoteInput.getResultKey(), remoteInput.getLabel(), remoteInput.getChoices(), remoteInput.getAllowFreeFormInput(), remoteInput.getExtras(), null);
            }
            return new OooO00o(strArr, o000oo00, pendingIntent2, pendingIntent, stringArray, bundle.getLong("timestamp"));
        }

        public C5028OooO0Oo(Notification notification) {
            Bundle bundle;
            if (Build.VERSION.SDK_INT >= 21) {
                if (NotificationCompat.m14477OooO00o(notification) == null) {
                    bundle = null;
                } else {
                    bundle = NotificationCompat.m14477OooO00o(notification).getBundle("android.car.EXTENSIONS");
                }
                if (bundle != null) {
                    this.f13957OooO00o = (Bitmap) bundle.getParcelable("large_icon");
                    this.f13956OooO00o = bundle.getInt("app_color", 0);
                    this.f13958OooO00o = OooO00o(bundle.getBundle("car_conversation"));
                }
            }
        }

        @RequiresApi(21)
        public static Bundle OooO00o(@NonNull OooO00o oooO00o) {
            Bundle bundle = new Bundle();
            String str = (oooO00o.m14514OooO0O0() == null || oooO00o.m14514OooO0O0().length <= 1) ? null : oooO00o.m14514OooO0O0()[0];
            int length = oooO00o.m14513OooO00o().length;
            Parcelable[] parcelableArr = new Parcelable[length];
            for (int i = 0; i < length; i++) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("text", oooO00o.m14513OooO00o()[i]);
                bundle2.putString("author", str);
                parcelableArr[i] = bundle2;
            }
            bundle.putParcelableArray("messages", parcelableArr);
            C7002o000Oo00 OooO00o2 = oooO00o.m14511OooO00o();
            if (OooO00o2 != null) {
                bundle.putParcelable("remote_input", new RemoteInput.Builder(OooO00o2.m18229OooO00o()).setLabel(OooO00o2.m18228OooO00o()).setChoices(OooO00o2.m18232OooO00o()).setAllowFreeFormInput(OooO00o2.m18231OooO00o()).addExtras(OooO00o2.OooO00o()).build());
            }
            bundle.putParcelable("on_reply", oooO00o.OooO0O0());
            bundle.putParcelable("on_read", oooO00o.m14510OooO00o());
            bundle.putStringArray("participants", oooO00o.m14514OooO0O0());
            bundle.putLong("timestamp", oooO00o.OooO00o());
            return bundle;
        }

        @Override // androidx.core.app.NotificationCompat.OooO0o
        public OooO0OO OooO00o(OooO0OO oooO0OO) {
            if (Build.VERSION.SDK_INT < 21) {
                return oooO0OO;
            }
            Bundle bundle = new Bundle();
            Bitmap bitmap = this.f13957OooO00o;
            if (bitmap != null) {
                bundle.putParcelable("large_icon", bitmap);
            }
            int i = this.f13956OooO00o;
            if (i != 0) {
                bundle.putInt("app_color", i);
            }
            OooO00o oooO00o = this.f13958OooO00o;
            if (oooO00o != null) {
                bundle.putBundle("car_conversation", OooO00o(oooO00o));
            }
            oooO0OO.m14501OooO00o().putBundle("android.car.EXTENSIONS", bundle);
            return oooO0OO;
        }

        public C5028OooO0Oo OooO00o(@ColorInt int i) {
            this.f13956OooO00o = i;
            return this;
        }

        @ColorInt
        public int OooO00o() {
            return this.f13956OooO00o;
        }

        public C5028OooO0Oo OooO00o(Bitmap bitmap) {
            this.f13957OooO00o = bitmap;
            return this;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public Bitmap m14507OooO00o() {
            return this.f13957OooO00o;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public C5028OooO0Oo m14509OooO00o(OooO00o oooO00o) {
            this.f13958OooO00o = oooO00o;
            return this;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public OooO00o m14508OooO00o() {
            return this.f13958OooO00o;
        }
    }

    /* renamed from: androidx.core.app.NotificationCompat$OooO0o0  reason: case insensitive filesystem */
    public static class C5029OooO0o0 extends OooO {
        public static final int OooO00o = 3;

        @Override // androidx.core.app.NotificationCompat.OooO, androidx.core.app.NotificationCompat.OooO
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m14515OooO00o(AbstractC6992o000OO00 o000oo00) {
            if (Build.VERSION.SDK_INT >= 24) {
                o000oo00.OooO00o().setStyle(new Notification.DecoratedCustomViewStyle());
            }
        }

        @Override // androidx.core.app.NotificationCompat.OooO
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public RemoteViews OooO0O0(AbstractC6992o000OO00 o000oo00) {
            if (Build.VERSION.SDK_INT < 24 && ((OooO) this).OooO00o.m14506OooO0O0() != null) {
                return OooO00o(((OooO) this).OooO00o.m14506OooO0O0(), false);
            }
            return null;
        }

        @Override // androidx.core.app.NotificationCompat.OooO
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public RemoteViews OooO0OO(AbstractC6992o000OO00 o000oo00) {
            RemoteViews remoteViews;
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews OooO0OO = ((OooO) this).OooO00o.OooO0OO();
            if (OooO0OO != null) {
                remoteViews = OooO0OO;
            } else {
                remoteViews = ((OooO) this).OooO00o.m14506OooO0O0();
            }
            if (OooO0OO == null) {
                return null;
            }
            return OooO00o(remoteViews, true);
        }

        @Override // androidx.core.app.NotificationCompat.OooO, androidx.core.app.NotificationCompat.OooO
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public RemoteViews OooO00o(AbstractC6992o000OO00 o000oo00) {
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews OooO00o2 = ((OooO) this).OooO00o.m14502OooO00o();
            if (OooO00o2 == null) {
                OooO00o2 = ((OooO) this).OooO00o.m14506OooO0O0();
            }
            if (OooO00o2 == null) {
                return null;
            }
            return OooO00o(OooO00o2, true);
        }

        private RemoteViews OooO00o(RemoteViews remoteViews, boolean z) {
            ArrayList<Action> arrayList;
            int min;
            boolean z2 = true;
            int i = 0;
            RemoteViews OooO00o2 = OooO00o(true, C0045R.layout.notification_template_custom_big, false);
            OooO00o2.removeAllViews(C0045R.C0048id.actions);
            if (!z || (arrayList = ((OooO) this).OooO00o.f13933OooO00o) == null || (min = Math.min(arrayList.size(), 3)) <= 0) {
                z2 = false;
            } else {
                for (int i2 = 0; i2 < min; i2++) {
                    OooO00o2.addView(C0045R.C0048id.actions, OooO00o(((OooO) this).OooO00o.f13933OooO00o.get(i2)));
                }
            }
            if (!z2) {
                i = 8;
            }
            OooO00o2.setViewVisibility(C0045R.C0048id.actions, i);
            OooO00o2.setViewVisibility(C0045R.C0048id.action_divider, i);
            OooO00o(OooO00o2, remoteViews);
            return OooO00o2;
        }

        private RemoteViews OooO00o(Action action) {
            boolean z = action.f13898OooO00o == null;
            RemoteViews remoteViews = new RemoteViews(((OooO) this).OooO00o.f13926OooO00o.getPackageName(), z ? C0045R.layout.notification_action_tombstone : C0045R.layout.notification_action);
            remoteViews.setImageViewBitmap(C0045R.C0048id.action_image, OooO00o(action.OooO00o(), ((OooO) this).OooO00o.f13926OooO00o.getResources().getColor(C0045R.C0046color.notification_action_color_filter)));
            remoteViews.setTextViewText(C0045R.C0048id.action_text, action.f13900OooO00o);
            if (!z) {
                remoteViews.setOnClickPendingIntent(C0045R.C0048id.action_container, action.f13898OooO00o);
            }
            if (Build.VERSION.SDK_INT >= 15) {
                remoteViews.setContentDescription(C0045R.C0048id.action_container, action.f13900OooO00o);
            }
            return remoteViews;
        }
    }

    public static abstract class OooO {
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public OooO0OO OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public CharSequence f13920OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f13921OooO00o = false;
        public CharSequence OooO0O0;

        public static float OooO00o(float f, float f2, float f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public RemoteViews OooO00o(AbstractC6992o000OO00 o000oo00) {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public void OooO00o(Bundle bundle) {
        }

        public void OooO00o(OooO0OO oooO0OO) {
            if (this.OooO00o != oooO0OO) {
                this.OooO00o = oooO0OO;
                if (oooO0OO != null) {
                    oooO0OO.OooO00o(this);
                }
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m14498OooO00o(AbstractC6992o000OO00 o000oo00) {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public RemoteViews OooO0O0(AbstractC6992o000OO00 o000oo00) {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public void OooO0O0(Bundle bundle) {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public RemoteViews OooO0OO(AbstractC6992o000OO00 o000oo00) {
            return null;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public Notification m14497OooO00o() {
            OooO0OO oooO0OO = this.OooO00o;
            if (oooO0OO != null) {
                return oooO0OO.m14500OooO00o();
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:63:0x0183  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x018f  */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x019d  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x01bf  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x0200  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x0205  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x0207  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x0211  */
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.widget.RemoteViews OooO00o(boolean r13, int r14, boolean r15) {
            /*
            // Method dump skipped, instructions count: 535
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.NotificationCompat.OooO.OooO00o(boolean, int, boolean):android.widget.RemoteViews");
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Bitmap OooO00o(int i, int i2) {
            return OooO00o(i, i2, 0);
        }

        private Bitmap OooO00o(int i, int i2, int i3) {
            Drawable drawable = this.OooO00o.f13926OooO00o.getResources().getDrawable(i);
            int intrinsicWidth = i3 == 0 ? drawable.getIntrinsicWidth() : i3;
            if (i3 == 0) {
                i3 = drawable.getIntrinsicHeight();
            }
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i3, Bitmap.Config.ARGB_8888);
            drawable.setBounds(0, 0, intrinsicWidth, i3);
            if (i2 != 0) {
                drawable.mutate().setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
            }
            drawable.draw(new Canvas(createBitmap));
            return createBitmap;
        }

        private Bitmap OooO00o(int i, int i2, int i3, int i4) {
            int i5 = C0045R.C0047drawable.notification_icon_background;
            if (i4 == 0) {
                i4 = 0;
            }
            Bitmap OooO00o2 = OooO00o(i5, i4, i2);
            Canvas canvas = new Canvas(OooO00o2);
            Drawable mutate = this.OooO00o.f13926OooO00o.getResources().getDrawable(i).mutate();
            mutate.setFilterBitmap(true);
            int i6 = (i2 - i3) / 2;
            int i7 = i3 + i6;
            mutate.setBounds(i6, i6, i7, i7);
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            mutate.draw(canvas);
            return OooO00o2;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public void OooO00o(RemoteViews remoteViews, RemoteViews remoteViews2) {
            OooO00o(remoteViews);
            remoteViews.removeAllViews(C0045R.C0048id.notification_main_column);
            remoteViews.addView(C0045R.C0048id.notification_main_column, remoteViews2.clone());
            remoteViews.setViewVisibility(C0045R.C0048id.notification_main_column, 0);
            if (Build.VERSION.SDK_INT >= 21) {
                remoteViews.setViewPadding(C0045R.C0048id.notification_main_column_container, 0, OooO00o(), 0, 0);
            }
        }

        private void OooO00o(RemoteViews remoteViews) {
            remoteViews.setViewVisibility(C0045R.C0048id.title, 8);
            remoteViews.setViewVisibility(C0045R.C0048id.text2, 8);
            remoteViews.setViewVisibility(C0045R.C0048id.text, 8);
        }

        private int OooO00o() {
            Resources resources = this.OooO00o.f13926OooO00o.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C0045R.dimen.notification_top_pad);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(C0045R.dimen.notification_top_pad_large_text);
            float OooO00o2 = (OooO00o(resources.getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
            return Math.round(((1.0f - OooO00o2) * ((float) dimensionPixelSize)) + (OooO00o2 * ((float) dimensionPixelSize2)));
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static String m14482OooO0O0(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getChannelId();
        }
        return null;
    }

    public static int OooO0OO(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getGroupAlertBehavior();
        }
        return 0;
    }

    public static int OooO0O0(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getBadgeIconType();
        }
        return 0;
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Bundle m14477OooO00o(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            return notification.extras;
        }
        if (i >= 16) {
            return C6994o000OOO.m18208OooO00o(notification);
        }
        return null;
    }

    public static int OooO00o(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            Notification.Action[] actionArr = notification.actions;
            if (actionArr != null) {
                return actionArr.length;
            }
            return 0;
        } else if (i >= 16) {
            return C6994o000OOO.OooO00o(notification);
        } else {
            return 0;
        }
    }

    public static Action OooO00o(Notification notification, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 20) {
            return OooO00o(notification.actions[i]);
        }
        Bundle bundle = null;
        if (i2 >= 19) {
            Notification.Action action = notification.actions[i];
            SparseArray sparseParcelableArray = notification.extras.getSparseParcelableArray("android.support.actionExtras");
            if (sparseParcelableArray != null) {
                bundle = (Bundle) sparseParcelableArray.get(i);
            }
            return C6994o000OOO.OooO00o(action.icon, action.title, action.actionIntent, bundle);
        } else if (i2 >= 16) {
            return C6994o000OOO.OooO00o(notification, i);
        } else {
            return null;
        }
    }

    @RequiresApi(20)
    public static Action OooO00o(Notification.Action action) {
        C7002o000Oo00[] o000oo00Arr;
        boolean z;
        int i;
        RemoteInput[] remoteInputs = action.getRemoteInputs();
        if (remoteInputs == null) {
            o000oo00Arr = null;
        } else {
            C7002o000Oo00[] o000oo00Arr2 = new C7002o000Oo00[remoteInputs.length];
            for (int i2 = 0; i2 < remoteInputs.length; i2++) {
                RemoteInput remoteInput = remoteInputs[i2];
                o000oo00Arr2[i2] = new C7002o000Oo00(remoteInput.getResultKey(), remoteInput.getLabel(), remoteInput.getChoices(), remoteInput.getAllowFreeFormInput(), remoteInput.getExtras(), null);
            }
            o000oo00Arr = o000oo00Arr2;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            z = action.getExtras().getBoolean("android.support.allowGeneratedReplies") || action.getAllowGeneratedReplies();
        } else {
            z = action.getExtras().getBoolean("android.support.allowGeneratedReplies");
        }
        boolean z2 = action.getExtras().getBoolean(Action.OooO00o, true);
        if (Build.VERSION.SDK_INT >= 28) {
            i = action.getSemanticAction();
        } else {
            i = action.getExtras().getInt(Action.OooO0O0, 0);
        }
        return new Action(action.icon, action.title, action.actionIntent, action.getExtras(), o000oo00Arr, null, z, i, z2);
    }

    @RequiresApi(21)
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static List<Action> m14480OooO00o(Notification notification) {
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        Bundle bundle2 = notification.extras.getBundle("android.car.EXTENSIONS");
        if (!(bundle2 == null || (bundle = bundle2.getBundle(C5028OooO0Oo.OooO0o0)) == null)) {
            for (int i = 0; i < bundle.size(); i++) {
                arrayList.add(C6994o000OOO.OooO00o(bundle.getBundle(Integer.toString(i))));
            }
        }
        return arrayList;
    }

    @RequiresApi(19)
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static CharSequence m14478OooO00o(Notification notification) {
        return notification.extras.getCharSequence("android.title");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m14479OooO00o(Notification notification) {
        if (Build.VERSION.SDK_INT >= 21) {
            return notification.category;
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m14481OooO00o(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            if ((notification.flags & 256) != 0) {
                return true;
            }
            return false;
        } else if (i >= 19) {
            return notification.extras.getBoolean("android.support.localOnly");
        } else {
            if (i >= 16) {
                return C6994o000OOO.m18208OooO00o(notification).getBoolean("android.support.localOnly");
            }
            return false;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static long m14476OooO00o(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getTimeoutAfter();
        }
        return 0;
    }
}
