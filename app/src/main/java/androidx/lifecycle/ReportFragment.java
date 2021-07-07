package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.Lifecycle;
import com.p118pd.sdk.AbstractC7202o00oOo00;
import com.p118pd.sdk.AbstractC7203o00oOo0O;
import com.p118pd.sdk.C7211o00oOooO;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ReportFragment extends Fragment {
    public static final String o0ooOOo = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag";
    public OooO00o OooO00o;

    public interface OooO00o {
        void onCreate();

        void onResume();

        void onStart();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m14674OooO00o(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag(o0ooOOo) == null) {
            fragmentManager.beginTransaction().add(new ReportFragment(), o0ooOOo).commit();
            fragmentManager.executePendingTransactions();
        }
    }

    private void OooO0O0(OooO00o oooO00o) {
        if (oooO00o != null) {
            oooO00o.onCreate();
        }
    }

    private void OooO0OO(OooO00o oooO00o) {
        if (oooO00o != null) {
            oooO00o.onResume();
        }
    }

    private void OooO0Oo(OooO00o oooO00o) {
        if (oooO00o != null) {
            oooO00o.onStart();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        OooO0O0(this.OooO00o);
        OooO00o(Lifecycle.Event.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        OooO00o(Lifecycle.Event.ON_DESTROY);
        this.OooO00o = null;
    }

    public void onPause() {
        super.onPause();
        OooO00o(Lifecycle.Event.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        OooO0OO(this.OooO00o);
        OooO00o(Lifecycle.Event.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        OooO0Oo(this.OooO00o);
        OooO00o(Lifecycle.Event.ON_START);
    }

    public void onStop() {
        super.onStop();
        OooO00o(Lifecycle.Event.ON_STOP);
    }

    public static ReportFragment OooO00o(Activity activity) {
        return (ReportFragment) activity.getFragmentManager().findFragmentByTag(o0ooOOo);
    }

    private void OooO00o(Lifecycle.Event event) {
        Activity activity = getActivity();
        if (activity instanceof AbstractC7203o00oOo0O) {
            ((AbstractC7203o00oOo0O) activity).OooO00o().m18703OooO00o(event);
        } else if (activity instanceof AbstractC7202o00oOo00) {
            Lifecycle lifecycle = ((AbstractC7202o00oOo00) activity).getLifecycle();
            if (lifecycle instanceof C7211o00oOooO) {
                ((C7211o00oOooO) lifecycle).m18703OooO00o(event);
            }
        }
    }

    public void OooO00o(OooO00o oooO00o) {
        this.OooO00o = oooO00o;
    }
}
