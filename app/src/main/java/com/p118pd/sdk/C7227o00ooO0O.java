package com.p118pd.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* renamed from: com.pd.sdk.o00ooO0O  reason: case insensitive filesystem */
public final class C7227o00ooO0O {
    public static final int OooO00o = 1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static C7227o00ooO0O f19734OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Object f19735OooO00o = new Object();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f19736OooO00o = "LocalBroadcastManager";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final boolean f19737OooO00o = false;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Context f19738OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Handler f19739OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ArrayList<OooO0O0> f19740OooO00o = new ArrayList<>();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final HashMap<BroadcastReceiver, ArrayList<OooO0OO>> f19741OooO00o = new HashMap<>();
    public final HashMap<String, ArrayList<OooO0OO>> OooO0O0 = new HashMap<>();

    /* renamed from: com.pd.sdk.o00ooO0O$OooO00o */
    public class OooO00o extends Handler {
        public OooO00o(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                C7227o00ooO0O.this.OooO00o();
            }
        }
    }

    /* renamed from: com.pd.sdk.o00ooO0O$OooO0O0 */
    public static final class OooO0O0 {
        public final Intent OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final ArrayList<OooO0OO> f19742OooO00o;

        public OooO0O0(Intent intent, ArrayList<OooO0OO> arrayList) {
            this.OooO00o = intent;
            this.f19742OooO00o = arrayList;
        }
    }

    /* renamed from: com.pd.sdk.o00ooO0O$OooO0OO */
    public static final class OooO0OO {
        public final BroadcastReceiver OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final IntentFilter f19743OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f19744OooO00o;
        public boolean OooO0O0;

        public OooO0OO(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f19743OooO00o = intentFilter;
            this.OooO00o = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.OooO00o);
            sb.append(" filter=");
            sb.append(this.f19743OooO00o);
            if (this.OooO0O0) {
                sb.append(" DEAD");
            }
            sb.append(C7522o0Ooo0o.OooO0Oo);
            return sb.toString();
        }
    }

    public C7227o00ooO0O(Context context) {
        this.f19738OooO00o = context;
        this.f19739OooO00o = new OooO00o(context.getMainLooper());
    }

    @NonNull
    public static C7227o00ooO0O OooO00o(@NonNull Context context) {
        C7227o00ooO0O o00ooo0o;
        synchronized (f19735OooO00o) {
            if (f19734OooO00o == null) {
                f19734OooO00o = new C7227o00ooO0O(context.getApplicationContext());
            }
            o00ooo0o = f19734OooO00o;
        }
        return o00ooo0o;
    }

    public void OooO00o(@NonNull BroadcastReceiver broadcastReceiver, @NonNull IntentFilter intentFilter) {
        synchronized (this.f19741OooO00o) {
            OooO0OO oooO0OO = new OooO0OO(intentFilter, broadcastReceiver);
            ArrayList<OooO0OO> arrayList = this.f19741OooO00o.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.f19741OooO00o.put(broadcastReceiver, arrayList);
            }
            arrayList.add(oooO0OO);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList<OooO0OO> arrayList2 = this.OooO0O0.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.OooO0O0.put(action, arrayList2);
                }
                arrayList2.add(oooO0OO);
            }
        }
    }

    public void OooO00o(@NonNull BroadcastReceiver broadcastReceiver) {
        synchronized (this.f19741OooO00o) {
            ArrayList<OooO0OO> remove = this.f19741OooO00o.remove(broadcastReceiver);
            if (remove != null) {
                for (int size = remove.size() - 1; size >= 0; size--) {
                    OooO0OO oooO0OO = remove.get(size);
                    oooO0OO.OooO0O0 = true;
                    for (int i = 0; i < oooO0OO.f19743OooO00o.countActions(); i++) {
                        String action = oooO0OO.f19743OooO00o.getAction(i);
                        ArrayList<OooO0OO> arrayList = this.OooO0O0.get(action);
                        if (arrayList != null) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                OooO0OO oooO0OO2 = arrayList.get(size2);
                                if (oooO0OO2.OooO00o == broadcastReceiver) {
                                    oooO0OO2.OooO0O0 = true;
                                    arrayList.remove(size2);
                                }
                            }
                            if (arrayList.size() <= 0) {
                                this.OooO0O0.remove(action);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18718OooO00o(@NonNull Intent intent) {
        String str;
        ArrayList<OooO0OO> arrayList;
        String str2;
        int i;
        ArrayList arrayList2;
        synchronized (this.f19741OooO00o) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f19738OooO00o.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z = (intent.getFlags() & 8) != 0;
            if (z) {
                String str3 = "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent;
            }
            ArrayList<OooO0OO> arrayList3 = this.OooO0O0.get(intent.getAction());
            if (arrayList3 != null) {
                if (z) {
                    String str4 = "Action list: " + arrayList3;
                }
                ArrayList arrayList4 = null;
                int i2 = 0;
                while (i2 < arrayList3.size()) {
                    OooO0OO oooO0OO = arrayList3.get(i2);
                    if (z) {
                        String str5 = "Matching against filter " + oooO0OO.f19743OooO00o;
                    }
                    if (oooO0OO.f19744OooO00o) {
                        i = i2;
                        arrayList = arrayList3;
                        str2 = action;
                        str = resolveTypeIfNeeded;
                        arrayList2 = arrayList4;
                    } else {
                        i = i2;
                        str2 = action;
                        arrayList2 = arrayList4;
                        arrayList = arrayList3;
                        str = resolveTypeIfNeeded;
                        int match = oooO0OO.f19743OooO00o.match(action, resolveTypeIfNeeded, scheme, data, categories, f19736OooO00o);
                        if (match >= 0) {
                            if (z) {
                                String str6 = "  Filter matched!  match=0x" + Integer.toHexString(match);
                            }
                            arrayList4 = arrayList2 == null ? new ArrayList() : arrayList2;
                            arrayList4.add(oooO0OO);
                            oooO0OO.f19744OooO00o = true;
                            i2 = i + 1;
                            action = str2;
                            arrayList3 = arrayList;
                            resolveTypeIfNeeded = str;
                        } else if (z) {
                            String str7 = "  Filter did not match: " + (match != -4 ? match != -3 ? match != -2 ? match != -1 ? "unknown reason" : "type" : "data" : "action" : "category");
                        }
                    }
                    arrayList4 = arrayList2;
                    i2 = i + 1;
                    action = str2;
                    arrayList3 = arrayList;
                    resolveTypeIfNeeded = str;
                }
                if (arrayList4 != null) {
                    for (int i3 = 0; i3 < arrayList4.size(); i3++) {
                        ((OooO0OO) arrayList4.get(i3)).f19744OooO00o = false;
                    }
                    this.f19740OooO00o.add(new OooO0O0(intent, arrayList4));
                    if (!this.f19739OooO00o.hasMessages(1)) {
                        this.f19739OooO00o.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    public void OooO00o(@NonNull Intent intent) {
        if (m18718OooO00o(intent)) {
            OooO00o();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r3 >= r1) goto L_0x0000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        r4 = r2[r3];
        r5 = r4.f19742OooO00o.size();
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        if (r6 >= r5) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        r7 = r4.f19742OooO00o.get(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        if (r7.OooO0O0 != false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        r7.OooO00o.onReceive(r10.f19738OooO00o, r4.OooO00o);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r3 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void OooO00o() {
        /*
            r10 = this;
        L_0x0000:
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<com.pd.sdk.o00ooO0O$OooO0OO>> r0 = r10.f19741OooO00o
            monitor-enter(r0)
            java.util.ArrayList<com.pd.sdk.o00ooO0O$OooO0O0> r1 = r10.f19740OooO00o     // Catch:{ all -> 0x0044 }
            int r1 = r1.size()     // Catch:{ all -> 0x0044 }
            if (r1 > 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x0044 }
            return
        L_0x000d:
            com.pd.sdk.o00ooO0O$OooO0O0[] r2 = new com.p118pd.sdk.C7227o00ooO0O.OooO0O0[r1]     // Catch:{ all -> 0x0044 }
            java.util.ArrayList<com.pd.sdk.o00ooO0O$OooO0O0> r3 = r10.f19740OooO00o     // Catch:{ all -> 0x0044 }
            r3.toArray(r2)     // Catch:{ all -> 0x0044 }
            java.util.ArrayList<com.pd.sdk.o00ooO0O$OooO0O0> r3 = r10.f19740OooO00o     // Catch:{ all -> 0x0044 }
            r3.clear()     // Catch:{ all -> 0x0044 }
            monitor-exit(r0)     // Catch:{ all -> 0x0044 }
            r0 = 0
            r3 = 0
        L_0x001c:
            if (r3 >= r1) goto L_0x0000
            r4 = r2[r3]
            java.util.ArrayList<com.pd.sdk.o00ooO0O$OooO0OO> r5 = r4.f19742OooO00o
            int r5 = r5.size()
            r6 = 0
        L_0x0027:
            if (r6 >= r5) goto L_0x0041
            java.util.ArrayList<com.pd.sdk.o00ooO0O$OooO0OO> r7 = r4.f19742OooO00o
            java.lang.Object r7 = r7.get(r6)
            com.pd.sdk.o00ooO0O$OooO0OO r7 = (com.p118pd.sdk.C7227o00ooO0O.OooO0OO) r7
            boolean r8 = r7.OooO0O0
            if (r8 != 0) goto L_0x003e
            android.content.BroadcastReceiver r7 = r7.OooO00o
            android.content.Context r8 = r10.f19738OooO00o
            android.content.Intent r9 = r4.OooO00o
            r7.onReceive(r8, r9)
        L_0x003e:
            int r6 = r6 + 1
            goto L_0x0027
        L_0x0041:
            int r3 = r3 + 1
            goto L_0x001c
        L_0x0044:
            r1 = move-exception
            monitor-exit(r0)
            goto L_0x0048
        L_0x0047:
            throw r1
        L_0x0048:
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7227o00ooO0O.OooO00o():void");
    }
}
