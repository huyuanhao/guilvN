package p011cn.ijiami.callm.p012j;

import android.content.Context;
import android.widget.Toast;
import java.util.ArrayList;

/* renamed from: cn.ijiami.callm.j.AToast */
public class Hl {

    /* renamed from: b */
    private static Hl f493b;

    /* renamed from: c */
    private static ArrayList<Toast> f494c;

    /* renamed from: a */
    private Toast f495a = null;

    public Hl() {
        f494c = new ArrayList<>();
        f493b = this;
    }

    /* renamed from: a */
    private void m331a() {
        ArrayList<Toast> arrayList = f494c;
        if (arrayList != null && arrayList.size() > 0) {
            for (int i = 0; i < f494c.size(); i++) {
                Toast toast = f494c.get(i);
                if (toast != null) {
                    toast.cancel();
                }
            }
            f494c.clear();
        }
    }

    /* renamed from: b */
    public static Hl m332b() {
        if (f493b == null) {
            new Hl();
        }
        return f493b;
    }

    /* renamed from: c */
    public void mo3831c(Context context, String str) {
        if (context != null) {
            m331a();
            Toast makeText = Toast.makeText(context, "", 0);
            this.f495a = makeText;
            makeText.setGravity(80, 0, 0);
            this.f495a.setText(str);
            this.f495a.show();
            f494c.add(this.f495a);
        }
    }
}
