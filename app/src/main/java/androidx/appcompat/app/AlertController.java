package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.C0033R;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;
import com.p118pd.sdk.DialogC5934OooO0o0;
import java.lang.ref.WeakReference;

public class AlertController {
    public int OooO;
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Context f13526OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Drawable f13527OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Handler f13528OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Message f13529OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final View.OnClickListener f13530OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public View f13531OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Window f13532OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Button f13533OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ImageView f13534OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ListAdapter f13535OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ListView f13536OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public TextView f13537OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public NestedScrollView f13538OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final DialogC5934OooO0o0 f13539OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public CharSequence f13540OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f13541OooO00o = false;
    public int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public Drawable f13542OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public Message f13543OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public View f13544OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public Button f13545OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public TextView f13546OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public CharSequence f13547OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f13548OooO0O0;
    public int OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public Drawable f13549OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public Message f13550OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public Button f13551OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public CharSequence f13552OooO0OO;
    public int OooO0Oo;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public Drawable f13553OooO0Oo;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public CharSequence f13554OooO0Oo;
    public int OooO0o;
    public int OooO0o0;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public CharSequence f13555OooO0o0;
    public int OooO0oO = 0;
    public int OooO0oo = -1;
    public int OooOO0;
    public int OooOO0O;
    public int OooOO0o;
    public int OooOOO;
    public int OooOOO0;
    public int OooOOOO = 0;

    public class OooO00o implements View.OnClickListener {
        public OooO00o() {
        }

        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            Message message4;
            AlertController alertController = AlertController.this;
            if (view != alertController.f13533OooO00o || (message4 = alertController.f13529OooO00o) == null) {
                AlertController alertController2 = AlertController.this;
                if (view != alertController2.f13545OooO0O0 || (message3 = alertController2.f13543OooO0O0) == null) {
                    AlertController alertController3 = AlertController.this;
                    message = (view != alertController3.f13551OooO0OO || (message2 = alertController3.f13550OooO0OO) == null) ? null : Message.obtain(message2);
                } else {
                    message = Message.obtain(message3);
                }
            } else {
                message = Message.obtain(message4);
            }
            if (message != null) {
                message.sendToTarget();
            }
            AlertController alertController4 = AlertController.this;
            alertController4.f13528OooO00o.obtainMessage(1, alertController4.f13539OooO00o).sendToTarget();
        }
    }

    public class OooO0O0 implements NestedScrollView.OooO0O0 {
        public final /* synthetic */ View OooO00o;
        public final /* synthetic */ View OooO0O0;

        public OooO0O0(View view, View view2) {
            this.OooO00o = view;
            this.OooO0O0 = view2;
        }

        @Override // androidx.core.widget.NestedScrollView.OooO0O0
        public void OooO00o(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            AlertController.OooO00o(nestedScrollView, this.OooO00o, this.OooO0O0);
        }
    }

    public class OooO0OO implements Runnable {
        public final /* synthetic */ View OooO00o;
        public final /* synthetic */ View OooO0O0;

        public OooO0OO(View view, View view2) {
            this.OooO00o = view;
            this.OooO0O0 = view2;
        }

        public void run() {
            AlertController.OooO00o(AlertController.this.f13538OooO00o, this.OooO00o, this.OooO0O0);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$OooO0Oo  reason: case insensitive filesystem */
    public class C4993OooO0Oo implements AbsListView.OnScrollListener {
        public final /* synthetic */ View OooO00o;
        public final /* synthetic */ View OooO0O0;

        public C4993OooO0Oo(View view, View view2) {
            this.OooO00o = view;
            this.OooO0O0 = view2;
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            AlertController.OooO00o(absListView, this.OooO00o, this.OooO0O0);
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }

    public static class OooO0o {
        public int OooO00o = 0;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Context f13559OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public DialogInterface.OnCancelListener f13560OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public DialogInterface.OnClickListener f13561OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public DialogInterface.OnDismissListener f13562OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public DialogInterface.OnKeyListener f13563OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public DialogInterface.OnMultiChoiceClickListener f13564OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Cursor f13565OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Drawable f13566OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final LayoutInflater f13567OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public View f13568OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public AdapterView.OnItemSelectedListener f13569OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public ListAdapter f13570OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public AbstractC4995OooO0o0 f13571OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public CharSequence f13572OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public String f13573OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f13574OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public CharSequence[] f13575OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean[] f13576OooO00o;
        public int OooO0O0 = 0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public DialogInterface.OnClickListener f13577OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public Drawable f13578OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public View f13579OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public CharSequence f13580OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public String f13581OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public boolean f13582OooO0O0 = false;
        public int OooO0OO;

        /* renamed from: OooO0OO  reason: collision with other field name */
        public DialogInterface.OnClickListener f13583OooO0OO;

        /* renamed from: OooO0OO  reason: collision with other field name */
        public Drawable f13584OooO0OO;

        /* renamed from: OooO0OO  reason: collision with other field name */
        public CharSequence f13585OooO0OO;

        /* renamed from: OooO0OO  reason: collision with other field name */
        public boolean f13586OooO0OO;
        public int OooO0Oo;

        /* renamed from: OooO0Oo  reason: collision with other field name */
        public DialogInterface.OnClickListener f13587OooO0Oo;

        /* renamed from: OooO0Oo  reason: collision with other field name */
        public Drawable f13588OooO0Oo;

        /* renamed from: OooO0Oo  reason: collision with other field name */
        public CharSequence f13589OooO0Oo;

        /* renamed from: OooO0Oo  reason: collision with other field name */
        public boolean f13590OooO0Oo;
        public int OooO0o;

        /* renamed from: OooO0o  reason: collision with other field name */
        public boolean f13591OooO0o = true;
        public int OooO0o0;

        /* renamed from: OooO0o0  reason: collision with other field name */
        public CharSequence f13592OooO0o0;

        /* renamed from: OooO0o0  reason: collision with other field name */
        public boolean f13593OooO0o0;
        public int OooO0oO;
        public int OooO0oo = -1;

        public class OooO00o extends ArrayAdapter<CharSequence> {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ RecycleListView f13594OooO00o;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public OooO00o(Context context, int i, int i2, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i, i2, charSequenceArr);
                this.f13594OooO00o = recycleListView;
            }

            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                boolean[] zArr = OooO0o.this.f13576OooO00o;
                if (zArr != null && zArr[i]) {
                    this.f13594OooO00o.setItemChecked(i, true);
                }
                return view2;
            }
        }

        public class OooO0O0 extends CursorAdapter {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ RecycleListView f13595OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ AlertController f13596OooO00o;
            public final int o00oO0O;
            public final int o0ooOO0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public OooO0O0(Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z);
                this.f13595OooO00o = recycleListView;
                this.f13596OooO00o = alertController;
                Cursor cursor2 = getCursor();
                this.o00oO0O = cursor2.getColumnIndexOrThrow(OooO0o.this.f13573OooO00o);
                this.o0ooOO0 = cursor2.getColumnIndexOrThrow(OooO0o.this.f13581OooO0O0);
            }

            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.o00oO0O));
                RecycleListView recycleListView = this.f13595OooO00o;
                int position = cursor.getPosition();
                boolean z = true;
                if (cursor.getInt(this.o0ooOO0) != 1) {
                    z = false;
                }
                recycleListView.setItemChecked(position, z);
            }

            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return OooO0o.this.f13567OooO00o.inflate(this.f13596OooO00o.OooOO0o, viewGroup, false);
            }
        }

        public class OooO0OO implements AdapterView.OnItemClickListener {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ AlertController f13597OooO00o;

            public OooO0OO(AlertController alertController) {
                this.f13597OooO00o = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                OooO0o.this.f13587OooO0Oo.onClick(this.f13597OooO00o.f13539OooO00o, i);
                if (!OooO0o.this.f13590OooO0Oo) {
                    this.f13597OooO00o.f13539OooO00o.dismiss();
                }
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$OooO0o$OooO0Oo  reason: case insensitive filesystem */
        public class C4994OooO0Oo implements AdapterView.OnItemClickListener {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ RecycleListView f13598OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ AlertController f13599OooO00o;

            public C4994OooO0Oo(RecycleListView recycleListView, AlertController alertController) {
                this.f13598OooO00o = recycleListView;
                this.f13599OooO00o = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                boolean[] zArr = OooO0o.this.f13576OooO00o;
                if (zArr != null) {
                    zArr[i] = this.f13598OooO00o.isItemChecked(i);
                }
                OooO0o.this.f13564OooO00o.onClick(this.f13599OooO00o.f13539OooO00o, i, this.f13598OooO00o.isItemChecked(i));
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$OooO0o$OooO0o0  reason: case insensitive filesystem */
        public interface AbstractC4995OooO0o0 {
            void OooO00o(ListView listView);
        }

        public OooO0o(Context context) {
            this.f13559OooO00o = context;
            this.f13574OooO00o = true;
            this.f13567OooO00o = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        private void OooO0O0(AlertController alertController) {
            ListAdapter listAdapter;
            int i;
            RecycleListView recycleListView = (RecycleListView) this.f13567OooO00o.inflate(alertController.OooOO0O, (ViewGroup) null);
            if (!this.f13586OooO0OO) {
                if (this.f13590OooO0Oo) {
                    i = alertController.OooOOO0;
                } else {
                    i = alertController.OooOOO;
                }
                if (this.f13565OooO00o != null) {
                    listAdapter = new SimpleCursorAdapter(this.f13559OooO00o, i, this.f13565OooO00o, new String[]{this.f13573OooO00o}, new int[]{16908308});
                } else {
                    listAdapter = this.f13570OooO00o;
                    if (listAdapter == null) {
                        listAdapter = new C4998OooO0oo(this.f13559OooO00o, i, 16908308, this.f13575OooO00o);
                    }
                }
            } else if (this.f13565OooO00o == null) {
                listAdapter = new OooO00o(this.f13559OooO00o, alertController.OooOO0o, 16908308, this.f13575OooO00o, recycleListView);
            } else {
                listAdapter = new OooO0O0(this.f13559OooO00o, this.f13565OooO00o, false, recycleListView, alertController);
            }
            AbstractC4995OooO0o0 oooO0o0 = this.f13571OooO00o;
            if (oooO0o0 != null) {
                oooO0o0.OooO00o(recycleListView);
            }
            alertController.f13535OooO00o = listAdapter;
            alertController.OooO0oo = this.OooO0oo;
            if (this.f13587OooO0Oo != null) {
                recycleListView.setOnItemClickListener(new OooO0OO(alertController));
            } else if (this.f13564OooO00o != null) {
                recycleListView.setOnItemClickListener(new C4994OooO0Oo(recycleListView, alertController));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f13569OooO00o;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.f13590OooO0Oo) {
                recycleListView.setChoiceMode(1);
            } else if (this.f13586OooO0OO) {
                recycleListView.setChoiceMode(2);
            }
            alertController.f13536OooO00o = recycleListView;
        }

        public void OooO00o(AlertController alertController) {
            View view = this.f13568OooO00o;
            if (view != null) {
                alertController.m14348OooO00o(view);
            } else {
                CharSequence charSequence = this.f13572OooO00o;
                if (charSequence != null) {
                    alertController.OooO0O0(charSequence);
                }
                Drawable drawable = this.f13566OooO00o;
                if (drawable != null) {
                    alertController.OooO00o(drawable);
                }
                int i = this.OooO00o;
                if (i != 0) {
                    alertController.OooO0O0(i);
                }
                int i2 = this.OooO0O0;
                if (i2 != 0) {
                    alertController.OooO0O0(alertController.OooO00o(i2));
                }
            }
            CharSequence charSequence2 = this.f13580OooO0O0;
            if (charSequence2 != null) {
                alertController.OooO00o(charSequence2);
            }
            if (!(this.f13585OooO0OO == null && this.f13578OooO0O0 == null)) {
                alertController.OooO00o(-1, this.f13585OooO0OO, this.f13561OooO00o, (Message) null, this.f13578OooO0O0);
            }
            if (!(this.f13589OooO0Oo == null && this.f13584OooO0OO == null)) {
                alertController.OooO00o(-2, this.f13589OooO0Oo, this.f13577OooO0O0, (Message) null, this.f13584OooO0OO);
            }
            if (!(this.f13592OooO0o0 == null && this.f13588OooO0Oo == null)) {
                alertController.OooO00o(-3, this.f13592OooO0o0, this.f13583OooO0OO, (Message) null, this.f13588OooO0Oo);
            }
            if (!(this.f13575OooO00o == null && this.f13565OooO00o == null && this.f13570OooO00o == null)) {
                OooO0O0(alertController);
            }
            View view2 = this.f13579OooO0O0;
            if (view2 == null) {
                int i3 = this.OooO0OO;
                if (i3 != 0) {
                    alertController.OooO0OO(i3);
                }
            } else if (this.f13582OooO0O0) {
                alertController.OooO00o(view2, this.OooO0Oo, this.OooO0o0, this.OooO0o, this.OooO0oO);
            } else {
                alertController.OooO0O0(view2);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$OooO0o0  reason: case insensitive filesystem */
    public class RunnableC4996OooO0o0 implements Runnable {
        public final /* synthetic */ View OooO00o;
        public final /* synthetic */ View OooO0O0;

        public RunnableC4996OooO0o0(View view, View view2) {
            this.OooO00o = view;
            this.OooO0O0 = view2;
        }

        public void run() {
            AlertController.OooO00o(AlertController.this.f13536OooO00o, this.OooO00o, this.OooO0O0);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$OooO0oO  reason: case insensitive filesystem */
    public static final class HandlerC4997OooO0oO extends Handler {
        public static final int OooO00o = 1;

        /* renamed from: OooO00o  reason: collision with other field name */
        public WeakReference<DialogInterface> f13601OooO00o;

        public HandlerC4997OooO0oO(DialogInterface dialogInterface) {
            this.f13601OooO00o = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f13601OooO00o.get(), message.what);
            } else if (i == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$OooO0oo  reason: case insensitive filesystem */
    public static class C4998OooO0oo extends ArrayAdapter<CharSequence> {
        public C4998OooO0oo(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public static class RecycleListView extends ListView {
        public final int o00oO0O;
        public final int o0ooOO0;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public void OooO00o(boolean z, boolean z2) {
            if (!z2 || !z) {
                setPadding(getPaddingLeft(), z ? getPaddingTop() : this.o00oO0O, getPaddingRight(), z2 ? getPaddingBottom() : this.o0ooOO0);
            }
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0033R.styleable.Oooo00o);
            this.o0ooOO0 = obtainStyledAttributes.getDimensionPixelOffset(C0033R.styleable.RecycleListView_paddingBottomNoButtons, -1);
            this.o00oO0O = obtainStyledAttributes.getDimensionPixelOffset(C0033R.styleable.RecycleListView_paddingTopNoTitle, -1);
        }
    }

    public AlertController(Context context, DialogC5934OooO0o0 oooO0o0, Window window) {
        this.f13526OooO00o = context;
        this.f13539OooO00o = oooO0o0;
        this.f13532OooO00o = window;
        this.f13528OooO00o = new HandlerC4997OooO0oO(oooO0o0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C0033R.styleable.OooO0oO, C0033R.attr.alertDialogStyle, 0);
        this.OooO = obtainStyledAttributes.getResourceId(C0033R.styleable.AlertDialog_android_layout, 0);
        this.OooOO0 = obtainStyledAttributes.getResourceId(C0033R.styleable.AlertDialog_buttonPanelSideLayout, 0);
        this.OooOO0O = obtainStyledAttributes.getResourceId(C0033R.styleable.AlertDialog_listLayout, 0);
        this.OooOO0o = obtainStyledAttributes.getResourceId(C0033R.styleable.AlertDialog_multiChoiceItemLayout, 0);
        this.OooOOO0 = obtainStyledAttributes.getResourceId(C0033R.styleable.AlertDialog_singleChoiceItemLayout, 0);
        this.OooOOO = obtainStyledAttributes.getResourceId(C0033R.styleable.AlertDialog_listItemLayout, 0);
        this.f13548OooO0O0 = obtainStyledAttributes.getBoolean(C0033R.styleable.AlertDialog_showTitle, true);
        this.OooO00o = obtainStyledAttributes.getDimensionPixelSize(C0033R.styleable.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        oooO0o0.OooO00o(1);
    }

    public static boolean OooO00o(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0033R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            return true;
        }
        return false;
    }

    private void OooO0Oo(ViewGroup viewGroup) {
        if (this.f13544OooO0O0 != null) {
            viewGroup.addView(this.f13544OooO0O0, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f13532OooO00o.findViewById(C0033R.C0036id.title_template).setVisibility(8);
            return;
        }
        this.f13534OooO00o = (ImageView) this.f13532OooO00o.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.f13540OooO00o)) || !this.f13548OooO0O0) {
            this.f13532OooO00o.findViewById(C0033R.C0036id.title_template).setVisibility(8);
            this.f13534OooO00o.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f13532OooO00o.findViewById(C0033R.C0036id.alertTitle);
        this.f13537OooO00o = textView;
        textView.setText(this.f13540OooO00o);
        int i = this.OooO0oO;
        if (i != 0) {
            this.f13534OooO00o.setImageResource(i);
            return;
        }
        Drawable drawable = this.f13553OooO0Oo;
        if (drawable != null) {
            this.f13534OooO00o.setImageDrawable(drawable);
            return;
        }
        this.f13537OooO00o.setPadding(this.f13534OooO00o.getPaddingLeft(), this.f13534OooO00o.getPaddingTop(), this.f13534OooO00o.getPaddingRight(), this.f13534OooO00o.getPaddingBottom());
        this.f13534OooO00o.setVisibility(8);
    }

    public void OooO0O0(CharSequence charSequence) {
        this.f13540OooO00o = charSequence;
        TextView textView = this.f13537OooO00o;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void OooO0OO(int i) {
        this.f13531OooO00o = null;
        this.OooO0O0 = i;
        this.f13541OooO00o = false;
    }

    public static boolean OooO00o(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (OooO00o(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void OooO0OO(ViewGroup viewGroup) {
        View view = this.f13531OooO00o;
        boolean z = false;
        if (view == null) {
            view = this.OooO0O0 != 0 ? LayoutInflater.from(this.f13526OooO00o).inflate(this.OooO0O0, viewGroup, false) : null;
        }
        if (view != null) {
            z = true;
        }
        if (!z || !OooO00o(view)) {
            this.f13532OooO00o.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) this.f13532OooO00o.findViewById(C0033R.C0036id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f13541OooO00o) {
                frameLayout.setPadding(this.OooO0OO, this.OooO0Oo, this.OooO0o0, this.OooO0o);
            }
            if (this.f13536OooO00o != null) {
                ((LinearLayoutCompat.OooO00o) viewGroup.getLayoutParams()).OooO00o = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    public void OooO0O0(View view) {
        this.f13531OooO00o = view;
        this.OooO0O0 = 0;
        this.f13541OooO00o = false;
    }

    public void OooO0O0(int i) {
        this.f13553OooO0Oo = null;
        this.OooO0oO = i;
        ImageView imageView = this.f13534OooO00o;
        if (imageView == null) {
            return;
        }
        if (i != 0) {
            imageView.setVisibility(0);
            this.f13534OooO00o.setImageResource(this.OooO0oO);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m14346OooO00o() {
        this.f13539OooO00o.setContentView(OooO00o());
        OooO0O0();
    }

    private int OooO00o() {
        int i = this.OooOO0;
        if (i == 0) {
            return this.OooO;
        }
        if (this.OooOOOO == 1) {
            return i;
        }
        return this.OooO;
    }

    public boolean OooO0O0(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f13538OooO00o;
        return nestedScrollView != null && nestedScrollView.OooO00o(keyEvent);
    }

    private void OooO0O0() {
        ListAdapter listAdapter;
        View findViewById;
        View findViewById2;
        View findViewById3 = this.f13532OooO00o.findViewById(C0033R.C0036id.parentPanel);
        View findViewById4 = findViewById3.findViewById(C0033R.C0036id.topPanel);
        View findViewById5 = findViewById3.findViewById(C0033R.C0036id.contentPanel);
        View findViewById6 = findViewById3.findViewById(C0033R.C0036id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(C0033R.C0036id.customPanel);
        OooO0OO(viewGroup);
        View findViewById7 = viewGroup.findViewById(C0033R.C0036id.topPanel);
        View findViewById8 = viewGroup.findViewById(C0033R.C0036id.contentPanel);
        View findViewById9 = viewGroup.findViewById(C0033R.C0036id.buttonPanel);
        ViewGroup OooO00o2 = OooO00o(findViewById7, findViewById4);
        ViewGroup OooO00o3 = OooO00o(findViewById8, findViewById5);
        ViewGroup OooO00o4 = OooO00o(findViewById9, findViewById6);
        OooO0O0(OooO00o3);
        OooO00o(OooO00o4);
        OooO0Oo(OooO00o2);
        int i = 0;
        boolean z = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
        boolean z2 = (OooO00o2 == null || OooO00o2.getVisibility() == 8) ? false : true;
        boolean z3 = (OooO00o4 == null || OooO00o4.getVisibility() == 8) ? false : true;
        if (!(z3 || OooO00o3 == null || (findViewById2 = OooO00o3.findViewById(C0033R.C0036id.textSpacerNoButtons)) == null)) {
            findViewById2.setVisibility(0);
        }
        if (z2) {
            NestedScrollView nestedScrollView = this.f13538OooO00o;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View view = null;
            if (!(this.f13547OooO0O0 == null && this.f13536OooO00o == null)) {
                view = OooO00o2.findViewById(C0033R.C0036id.titleDividerNoCustom);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (!(OooO00o3 == null || (findViewById = OooO00o3.findViewById(C0033R.C0036id.textSpacerNoTitle)) == null)) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f13536OooO00o;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).OooO00o(z2, z3);
        }
        if (!z) {
            View view2 = this.f13536OooO00o;
            if (view2 == null) {
                view2 = this.f13538OooO00o;
            }
            if (view2 != null) {
                if (z3) {
                    i = 2;
                }
                int i2 = z2 ? 1 : 0;
                char c = z2 ? 1 : 0;
                char c2 = z2 ? 1 : 0;
                OooO00o(OooO00o3, view2, i2 | i, 3);
            }
        }
        ListView listView2 = this.f13536OooO00o;
        if (listView2 != null && (listAdapter = this.f13535OooO00o) != null) {
            listView2.setAdapter(listAdapter);
            int i3 = this.OooO0oo;
            if (i3 > -1) {
                listView2.setItemChecked(i3, true);
                listView2.setSelection(i3);
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m14348OooO00o(View view) {
        this.f13544OooO0O0 = view;
    }

    public void OooO00o(CharSequence charSequence) {
        this.f13547OooO0O0 = charSequence;
        TextView textView = this.f13546OooO0O0;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void OooO00o(View view, int i, int i2, int i3, int i4) {
        this.f13531OooO00o = view;
        this.OooO0O0 = 0;
        this.f13541OooO00o = true;
        this.OooO0OO = i;
        this.OooO0Oo = i2;
        this.OooO0o0 = i3;
        this.OooO0o = i4;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m14347OooO00o(int i) {
        this.OooOOOO = i;
    }

    public void OooO00o(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f13528OooO00o.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.f13555OooO0o0 = charSequence;
            this.f13550OooO0OO = message;
            this.f13549OooO0OO = drawable;
        } else if (i == -2) {
            this.f13554OooO0Oo = charSequence;
            this.f13543OooO0O0 = message;
            this.f13542OooO0O0 = drawable;
        } else if (i == -1) {
            this.f13552OooO0OO = charSequence;
            this.f13529OooO00o = message;
            this.f13527OooO00o = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    public void OooO00o(Drawable drawable) {
        this.f13553OooO0Oo = drawable;
        this.OooO0oO = 0;
        ImageView imageView = this.f13534OooO00o;
        if (imageView == null) {
            return;
        }
        if (drawable != null) {
            imageView.setVisibility(0);
            this.f13534OooO00o.setImageDrawable(drawable);
            return;
        }
        imageView.setVisibility(8);
    }

    public int OooO00o(int i) {
        TypedValue typedValue = new TypedValue();
        this.f13526OooO00o.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public ListView m14345OooO00o() {
        return this.f13536OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Button m14344OooO00o(int i) {
        if (i == -3) {
            return this.f13551OooO0OO;
        }
        if (i == -2) {
            return this.f13545OooO0O0;
        }
        if (i != -1) {
            return null;
        }
        return this.f13533OooO00o;
    }

    private void OooO0O0(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f13532OooO00o.findViewById(C0033R.C0036id.scrollView);
        this.f13538OooO00o = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f13538OooO00o.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.f13546OooO0O0 = textView;
        if (textView != null) {
            CharSequence charSequence = this.f13547OooO0O0;
            if (charSequence != null) {
                textView.setText(charSequence);
                return;
            }
            textView.setVisibility(8);
            this.f13538OooO00o.removeView(this.f13546OooO0O0);
            if (this.f13536OooO00o != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.f13538OooO00o.getParent();
                int indexOfChild = viewGroup2.indexOfChild(this.f13538OooO00o);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(this.f13536OooO00o, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            viewGroup.setVisibility(8);
        }
    }

    public boolean OooO00o(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f13538OooO00o;
        return nestedScrollView != null && nestedScrollView.OooO00o(keyEvent);
    }

    @Nullable
    private ViewGroup OooO00o(@Nullable View view, @Nullable View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private void OooO00o(ViewGroup viewGroup, View view, int i, int i2) {
        View findViewById = this.f13532OooO00o.findViewById(C0033R.C0036id.scrollIndicatorUp);
        View findViewById2 = this.f13532OooO00o.findViewById(C0033R.C0036id.scrollIndicatorDown);
        if (Build.VERSION.SDK_INT >= 23) {
            ViewCompat.OooO00o(view, i, i2);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
                return;
            }
            return;
        }
        if (findViewById != null && (i & 1) == 0) {
            viewGroup.removeView(findViewById);
            findViewById = null;
        }
        if (findViewById2 != null && (i & 2) == 0) {
            viewGroup.removeView(findViewById2);
            findViewById2 = null;
        }
        if (findViewById != null || findViewById2 != null) {
            if (this.f13547OooO0O0 != null) {
                this.f13538OooO00o.setOnScrollChangeListener(new OooO0O0(findViewById, findViewById2));
                this.f13538OooO00o.post(new OooO0OO(findViewById, findViewById2));
                return;
            }
            ListView listView = this.f13536OooO00o;
            if (listView != null) {
                listView.setOnScrollListener(new C4993OooO0Oo(findViewById, findViewById2));
                this.f13536OooO00o.post(new RunnableC4996OooO0o0(findViewById, findViewById2));
                return;
            }
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
            }
        }
    }

    public static void OooO00o(View view, View view2, View view3) {
        int i = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i = 4;
            }
            view3.setVisibility(i);
        }
    }

    private void OooO00o(ViewGroup viewGroup) {
        boolean z;
        Button button = (Button) viewGroup.findViewById(16908313);
        this.f13533OooO00o = button;
        button.setOnClickListener(this.f13530OooO00o);
        boolean z2 = true;
        if (!TextUtils.isEmpty(this.f13552OooO0OO) || this.f13527OooO00o != null) {
            this.f13533OooO00o.setText(this.f13552OooO0OO);
            Drawable drawable = this.f13527OooO00o;
            if (drawable != null) {
                int i = this.OooO00o;
                drawable.setBounds(0, 0, i, i);
                this.f13533OooO00o.setCompoundDrawables(this.f13527OooO00o, null, null, null);
            }
            this.f13533OooO00o.setVisibility(0);
            z = true;
        } else {
            this.f13533OooO00o.setVisibility(8);
            z = false;
        }
        Button button2 = (Button) viewGroup.findViewById(16908314);
        this.f13545OooO0O0 = button2;
        button2.setOnClickListener(this.f13530OooO00o);
        if (!TextUtils.isEmpty(this.f13554OooO0Oo) || this.f13542OooO0O0 != null) {
            this.f13545OooO0O0.setText(this.f13554OooO0Oo);
            Drawable drawable2 = this.f13542OooO0O0;
            if (drawable2 != null) {
                int i2 = this.OooO00o;
                drawable2.setBounds(0, 0, i2, i2);
                this.f13545OooO0O0.setCompoundDrawables(this.f13542OooO0O0, null, null, null);
            }
            this.f13545OooO0O0.setVisibility(0);
            z |= true;
        } else {
            this.f13545OooO0O0.setVisibility(8);
        }
        Button button3 = (Button) viewGroup.findViewById(16908315);
        this.f13551OooO0OO = button3;
        button3.setOnClickListener(this.f13530OooO00o);
        if (!TextUtils.isEmpty(this.f13555OooO0o0) || this.f13549OooO0OO != null) {
            this.f13551OooO0OO.setText(this.f13555OooO0o0);
            Drawable drawable3 = this.f13527OooO00o;
            if (drawable3 != null) {
                int i3 = this.OooO00o;
                drawable3.setBounds(0, 0, i3, i3);
                this.f13533OooO00o.setCompoundDrawables(this.f13527OooO00o, null, null, null);
            }
            this.f13551OooO0OO.setVisibility(0);
            z |= true;
        } else {
            this.f13551OooO0OO.setVisibility(8);
        }
        if (OooO00o(this.f13526OooO00o)) {
            if (z) {
                OooO00o(this.f13533OooO00o);
            } else if (z) {
                OooO00o(this.f13545OooO0O0);
            } else if (z) {
                OooO00o(this.f13551OooO0OO);
            }
        }
        if (!z) {
            z2 = false;
        }
        if (!z2) {
            viewGroup.setVisibility(8);
        }
    }

    private void OooO00o(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }
}
