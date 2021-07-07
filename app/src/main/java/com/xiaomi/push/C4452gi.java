package com.xiaomi.push;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: com.xiaomi.push.gi */
public class C4452gi implements AbstractC4457gm {

    /* renamed from: a */
    public String f12016a;

    /* renamed from: a */
    public List<C4452gi> f12017a = null;

    /* renamed from: a */
    public String[] f12018a = null;

    /* renamed from: b */
    public String f12019b;

    /* renamed from: b */
    public String[] f12020b = null;

    /* renamed from: c */
    public String f12021c;

    public C4452gi(String str, String str2, String[] strArr, String[] strArr2) {
        this.f12016a = str;
        this.f12019b = str2;
        this.f12018a = strArr;
        this.f12020b = strArr2;
    }

    public C4452gi(String str, String str2, String[] strArr, String[] strArr2, String str3, List<C4452gi> list) {
        this.f12016a = str;
        this.f12019b = str2;
        this.f12018a = strArr;
        this.f12020b = strArr2;
        this.f12021c = str3;
        this.f12017a = list;
    }

    /* renamed from: a */
    public static C4452gi m12737a(Bundle bundle) {
        ArrayList arrayList;
        String string = bundle.getString("ext_ele_name");
        String string2 = bundle.getString("ext_ns");
        String string3 = bundle.getString("ext_text");
        Bundle bundle2 = bundle.getBundle("attributes");
        Set<String> keySet = bundle2.keySet();
        String[] strArr = new String[keySet.size()];
        String[] strArr2 = new String[keySet.size()];
        int i = 0;
        for (String str : keySet) {
            strArr[i] = str;
            strArr2[i] = bundle2.getString(str);
            i++;
        }
        if (bundle.containsKey("children")) {
            Parcelable[] parcelableArray = bundle.getParcelableArray("children");
            ArrayList arrayList2 = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                arrayList2.add(m12737a((Bundle) parcelable));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new C4452gi(string, string2, strArr, strArr2, string3, arrayList);
    }

    /* renamed from: a */
    public static Parcelable[] m12738a(List<C4452gi> list) {
        return m12739a((C4452gi[]) list.toArray(new C4452gi[list.size()]));
    }

    /* renamed from: a */
    public static Parcelable[] m12739a(C4452gi[] giVarArr) {
        if (giVarArr == null) {
            return null;
        }
        Parcelable[] parcelableArr = new Parcelable[giVarArr.length];
        for (int i = 0; i < giVarArr.length; i++) {
            parcelableArr[i] = giVarArr[i].m12741a();
        }
        return parcelableArr;
    }

    /* renamed from: a */
    public Bundle mo41932a() {
        Bundle bundle = new Bundle();
        bundle.putString("ext_ele_name", this.f12016a);
        bundle.putString("ext_ns", this.f12019b);
        bundle.putString("ext_text", this.f12021c);
        Bundle bundle2 = new Bundle();
        String[] strArr = this.f12018a;
        if (strArr != null && strArr.length > 0) {
            int i = 0;
            while (true) {
                String[] strArr2 = this.f12018a;
                if (i >= strArr2.length) {
                    break;
                }
                bundle2.putString(strArr2[i], this.f12020b[i]);
                i++;
            }
        }
        bundle.putBundle("attributes", bundle2);
        List<C4452gi> list = this.f12017a;
        if (list != null && list.size() > 0) {
            bundle.putParcelableArray("children", m12738a(this.f12017a));
        }
        return bundle;
    }

    /* renamed from: a */
    public Parcelable m12741a() {
        return mo41932a();
    }

    /* renamed from: a */
    public String m12742a() {
        return this.f12016a;
    }

    /* renamed from: a */
    public String mo41933a(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        } else if (this.f12018a == null) {
            return null;
        } else {
            int i = 0;
            while (true) {
                String[] strArr = this.f12018a;
                if (i >= strArr.length) {
                    return null;
                }
                if (str.equals(strArr[i])) {
                    return this.f12020b[i];
                }
                i++;
            }
        }
    }

    /* renamed from: a */
    public void m12744a(String str) {
        if (!TextUtils.isEmpty(str)) {
            str = C4470gw.m12831a(str);
        }
        this.f12021c = str;
    }

    /* renamed from: b */
    public String mo41934b() {
        return this.f12019b;
    }

    /* renamed from: c */
    public String mo41935c() {
        return !TextUtils.isEmpty(this.f12021c) ? C4470gw.m12834b(this.f12021c) : this.f12021c;
    }

    @Override // com.xiaomi.push.AbstractC4457gm
    /* renamed from: d */
    public String mo41936d() {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(this.f12016a);
        if (!TextUtils.isEmpty(this.f12019b)) {
            sb.append(" ");
            sb.append("xmlns=");
            sb.append("\"");
            sb.append(this.f12019b);
            sb.append("\"");
        }
        String[] strArr = this.f12018a;
        if (strArr != null && strArr.length > 0) {
            for (int i = 0; i < this.f12018a.length; i++) {
                if (!TextUtils.isEmpty(this.f12020b[i])) {
                    sb.append(" ");
                    sb.append(this.f12018a[i]);
                    sb.append("=\"");
                    sb.append(C4470gw.m12831a(this.f12020b[i]));
                    sb.append("\"");
                }
            }
        }
        if (!TextUtils.isEmpty(this.f12021c)) {
            sb.append(">");
            sb.append(this.f12021c);
        } else {
            List<C4452gi> list = this.f12017a;
            if (list == null || list.size() <= 0) {
                sb.append("/>");
                return sb.toString();
            }
            sb.append(">");
            for (C4452gi giVar : this.f12017a) {
                sb.append(giVar.mo41936d());
            }
        }
        sb.append("</");
        sb.append(this.f12016a);
        sb.append(">");
        return sb.toString();
    }

    public String toString() {
        return mo41936d();
    }
}
