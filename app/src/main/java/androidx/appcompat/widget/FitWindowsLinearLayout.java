package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.annotation.RestrictTo;
import com.p118pd.sdk.AbstractC7286o0O0O00;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class FitWindowsLinearLayout extends LinearLayout implements AbstractC7286o0O0O00 {
    public AbstractC7286o0O0O00.OooO00o OooO00o;

    public FitWindowsLinearLayout(Context context) {
        super(context);
    }

    public boolean fitSystemWindows(Rect rect) {
        AbstractC7286o0O0O00.OooO00o oooO00o = this.OooO00o;
        if (oooO00o != null) {
            oooO00o.OooO00o(rect);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // com.p118pd.sdk.AbstractC7286o0O0O00
    public void setOnFitSystemWindowsListener(AbstractC7286o0O0O00.OooO00o oooO00o) {
        this.OooO00o = oooO00o;
    }

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
