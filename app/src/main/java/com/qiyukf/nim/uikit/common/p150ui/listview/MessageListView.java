package com.qiyukf.nim.uikit.common.p150ui.listview;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import com.qiyukf.nim.uikit.common.p145a.AbstractC1879b;

/* renamed from: com.qiyukf.nim.uikit.common.ui.listview.MessageListView */
public class MessageListView extends AutoRefreshListView {

    /* renamed from: c */
    public AbstractC1879b f3709c;

    /* renamed from: d */
    public GestureDetector f3710d;

    /* renamed from: e */
    public AbstractC1932b f3711e;

    /* renamed from: f */
    public AbsListView.RecyclerListener f3712f = new AbsListView.RecyclerListener() {
        /* class com.qiyukf.nim.uikit.common.p150ui.listview.MessageListView.C19301 */

        public final void onMovedToScrapHeap(View view) {
            if (MessageListView.this.f3709c != null) {
                MessageListView.this.f3709c.mo34137a(view);
            }
        }
    };

    /* renamed from: g */
    public boolean f3713g = false;

    /* renamed from: com.qiyukf.nim.uikit.common.ui.listview.MessageListView$a */
    public class C1931a extends GestureDetector.SimpleOnGestureListener {
        public C1931a() {
        }

        public /* synthetic */ C1931a(MessageListView messageListView, byte b) {
            this();
        }

        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (MessageListView.this.f3713g || MessageListView.this.f3711e == null) {
                return true;
            }
            MessageListView.this.f3711e.mo34349a();
            MessageListView.this.f3713g = true;
            return true;
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            if (MessageListView.this.f3713g || MessageListView.this.f3711e == null) {
                return true;
            }
            MessageListView.this.f3711e.mo34349a();
            MessageListView.this.f3713g = true;
            return true;
        }
    }

    /* renamed from: com.qiyukf.nim.uikit.common.ui.listview.MessageListView$b */
    public interface AbstractC1932b {
        /* renamed from: a */
        void mo34349a();

        /* renamed from: a */
        void mo34350a(int i, int i2);

        /* renamed from: b */
        void mo34351b();
    }

    public MessageListView(Context context) {
        super(context);
        m3760a(context);
    }

    public MessageListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m3760a(context);
    }

    public MessageListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m3760a(context);
    }

    @TargetApi(21)
    public MessageListView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m3760a(context);
    }

    /* renamed from: a */
    private void m3760a(Context context) {
        setRecyclerListener(this.f3712f);
        this.f3710d = new GestureDetector(context, new C1931a(this, (byte) 0));
    }

    /* renamed from: a */
    public final void mo34343a(BaseAdapter baseAdapter) {
        this.f3709c = (baseAdapter == null || !(baseAdapter instanceof AbstractC1879b)) ? null : (AbstractC1879b) baseAdapter;
        super.setAdapter((ListAdapter) baseAdapter);
    }

    /* renamed from: a */
    public final void mo34344a(AbstractC1932b bVar) {
        this.f3711e = bVar;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        AbstractC1932b bVar = this.f3711e;
        if (bVar != null) {
            bVar.mo34350a(i2, i4);
        }
        super.onSizeChanged(i, i2, i3, i4);
    }

    @Override // com.qiyukf.nim.uikit.common.p150ui.listview.AutoRefreshListView
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f3710d.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.f3713g = false;
        }
        AbstractC1932b bVar = this.f3711e;
        if (bVar != null) {
            bVar.mo34351b();
        }
        return super.onTouchEvent(motionEvent);
    }
}
