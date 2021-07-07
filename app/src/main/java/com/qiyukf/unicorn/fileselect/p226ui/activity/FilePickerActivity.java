package com.qiyukf.unicorn.fileselect.p226ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.fileselect.p224a.C2636a;
import com.qiyukf.unicorn.fileselect.p225b.C2637a;
import com.qiyukf.unicorn.fileselect.p226ui.p227a.C2638a;
import com.qiyukf.unicorn.fileselect.p226ui.widget.EmptyListView;
import com.qiyukf.unicorn.p232k.C2699e;
import com.qiyukf.unicorn.widget.p251a.C3021g;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.qiyukf.unicorn.fileselect.ui.activity.FilePickerActivity */
public class FilePickerActivity extends BaseFragmentActivity {

    /* renamed from: b */
    public EmptyListView f5451b;

    /* renamed from: c */
    public View f5452c;

    /* renamed from: d */
    public TextView f5453d;

    /* renamed from: e */
    public TextView f5454e;

    /* renamed from: f */
    public Button f5455f;

    /* renamed from: g */
    public String f5456g;

    /* renamed from: h */
    public List<File> f5457h;

    /* renamed from: i */
    public ArrayList<String> f5458i = new ArrayList<>();

    /* renamed from: j */
    public C2638a f5459j;

    /* renamed from: k */
    public C2636a f5460k;

    /* renamed from: l */
    public C2637a f5461l;

    /* renamed from: a */
    public static /* synthetic */ void m6048a(FilePickerActivity filePickerActivity, int i) {
        String absolutePath = filePickerActivity.f5457h.get(i).getAbsolutePath();
        filePickerActivity.f5456g = absolutePath;
        filePickerActivity.m6049a(absolutePath);
        List<File> a = C2699e.m6244a(filePickerActivity.f5456g, filePickerActivity.f5461l, filePickerActivity.f5460k.mo36271h(), filePickerActivity.f5460k.mo36270g());
        filePickerActivity.f5457h = a;
        filePickerActivity.f5459j.mo36275a(a);
        filePickerActivity.f5459j.notifyDataSetChanged();
        filePickerActivity.f5451b.smoothScrollToPosition(i);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m6049a(String str) {
        this.f5453d.setText(str);
    }

    /* renamed from: i */
    public static /* synthetic */ void m6058i(FilePickerActivity filePickerActivity) {
        if (!filePickerActivity.f5460k.mo36268e() || filePickerActivity.f5460k.mo36267d() <= 0 || filePickerActivity.f5458i.size() <= filePickerActivity.f5460k.mo36267d()) {
            Intent intent = new Intent();
            intent.putStringArrayListExtra("pickFileListTag", filePickerActivity.f5458i);
            intent.putExtra("pickFileDirectoryTag", filePickerActivity.f5453d.getText().toString().trim());
            filePickerActivity.setResult(-1, intent);
            filePickerActivity.finish();
            return;
        }
        C1865f.m3555a(C2364R.string.ysf_file_OutSize);
    }

    @Override // com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity, androidx.core.app.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        this.f5460k = (C2636a) getIntent().getExtras().getSerializable("param");
        super.onCreate(bundle);
        setContentView(C2364R.layout.ysf_activity_lfile_picker);
        this.f5451b = (EmptyListView) findViewById(C2364R.C2367id.ysf_lv_pick_file_list);
        this.f5453d = (TextView) findViewById(C2364R.C2367id.ysf_file_pick_tv_path);
        this.f5454e = (TextView) findViewById(C2364R.C2367id.ysf_tv_file_pick_back);
        this.f5455f = (Button) findViewById(C2364R.C2367id.ysf_btn_addbook);
        this.f5452c = findViewById(C2364R.C2367id.empty_view);
        if (this.f5460k.mo36256a() != null) {
            setTitle(this.f5460k.mo36256a());
        }
        if (!this.f5460k.mo36264b()) {
            this.f5455f.setVisibility(8);
        }
        if (!this.f5460k.mo36268e()) {
            this.f5455f.setVisibility(0);
            this.f5455f.setText(getString(C2364R.string.ysf_file_OK));
            this.f5460k.mo36260a(false);
        }
        if (!Environment.getExternalStorageState().equals("mounted")) {
            Toast.makeText(this, C2364R.string.ysf_file_NotFoundPath, 0).show();
            return;
        }
        String f = this.f5460k.mo36269f();
        this.f5456g = f;
        if (TextUtils.isEmpty(f)) {
            this.f5456g = Environment.getExternalStorageDirectory().getAbsolutePath();
        }
        this.f5453d.setText(this.f5456g);
        C2637a aVar = new C2637a(this.f5460k.mo36266c());
        this.f5461l = aVar;
        this.f5457h = C2699e.m6244a(this.f5456g, aVar, this.f5460k.mo36271h(), this.f5460k.mo36270g());
        C2638a aVar2 = new C2638a(this.f5457h, this, this.f5461l, this.f5460k.mo36264b(), this.f5460k.mo36271h(), this.f5460k.mo36270g());
        this.f5459j = aVar2;
        this.f5451b.setAdapter((ListAdapter) aVar2);
        this.f5451b.mo36286a(this.f5452c);
        this.f5454e.setOnClickListener(new View.OnClickListener() {
            /* class com.qiyukf.unicorn.fileselect.p226ui.activity.FilePickerActivity.View$OnClickListenerC26441 */

            public final void onClick(View view) {
                String parent = new File(FilePickerActivity.this.f5456g).getParent();
                if (parent != null) {
                    FilePickerActivity.this.f5456g = parent;
                    FilePickerActivity filePickerActivity = FilePickerActivity.this;
                    filePickerActivity.f5457h = C2699e.m6244a(filePickerActivity.f5456g, FilePickerActivity.this.f5461l, FilePickerActivity.this.f5460k.mo36271h(), FilePickerActivity.this.f5460k.mo36270g());
                    FilePickerActivity.this.f5459j.mo36275a(FilePickerActivity.this.f5457h);
                    FilePickerActivity.this.f5459j.mo36273a();
                    FilePickerActivity.this.f5455f.setText(FilePickerActivity.this.getString(C2364R.string.ysf_file_Selected));
                    FilePickerActivity.this.f5451b.smoothScrollToPosition(0);
                    FilePickerActivity filePickerActivity2 = FilePickerActivity.this;
                    filePickerActivity2.m6049a((FilePickerActivity) filePickerActivity2.f5456g);
                    FilePickerActivity.this.f5458i.clear();
                    FilePickerActivity.this.f5455f.setText(C2364R.string.ysf_file_Selected);
                }
            }
        });
        this.f5459j.mo36274a(new C2638a.AbstractC2642a() {
            /* class com.qiyukf.unicorn.fileselect.p226ui.activity.FilePickerActivity.C26452 */

            @Override // com.qiyukf.unicorn.fileselect.p226ui.p227a.C2638a.AbstractC2642a
            /* renamed from: a */
            public final void mo36283a(final int i) {
                if (FilePickerActivity.this.f5460k.mo36264b()) {
                    if (((File) FilePickerActivity.this.f5457h.get(i)).isDirectory()) {
                        FilePickerActivity.m6048a(FilePickerActivity.this, i);
                        FilePickerActivity.this.f5459j.mo36273a();
                        FilePickerActivity.this.f5455f.setText(FilePickerActivity.this.getString(C2364R.string.ysf_file_Selected));
                        return;
                    }
                    if (FilePickerActivity.this.f5458i.contains(((File) FilePickerActivity.this.f5457h.get(i)).getAbsolutePath())) {
                        FilePickerActivity.this.f5458i.remove(((File) FilePickerActivity.this.f5457h.get(i)).getAbsolutePath());
                    } else {
                        FilePickerActivity.this.f5458i.add(((File) FilePickerActivity.this.f5457h.get(i)).getAbsolutePath());
                    }
                    Button button = FilePickerActivity.this.f5455f;
                    FilePickerActivity filePickerActivity = FilePickerActivity.this;
                    button.setText(filePickerActivity.getString(C2364R.string.ysf_file_Selected, new Object[]{String.valueOf(filePickerActivity.f5458i.size())}));
                    if (FilePickerActivity.this.f5460k.mo36267d() > 0 && FilePickerActivity.this.f5458i.size() > FilePickerActivity.this.f5460k.mo36267d()) {
                        C1865f.m3555a(C2364R.string.ysf_file_OutSize);
                    }
                } else if (((File) FilePickerActivity.this.f5457h.get(i)).isDirectory()) {
                    FilePickerActivity.m6048a(FilePickerActivity.this, i);
                } else if (FilePickerActivity.this.f5460k.mo36268e()) {
                    FilePickerActivity filePickerActivity2 = FilePickerActivity.this;
                    C3021g.m7058a(filePickerActivity2, "", "确定发送文件：" + ((File) FilePickerActivity.this.f5457h.get(i)).getName(), FilePickerActivity.this.getString(C2364R.string.ysf_cancel), FilePickerActivity.this.getString(C2364R.string.ysf_leave_msg_sure), true, new C3021g.AbstractC3022a() {
                        /* class com.qiyukf.unicorn.fileselect.p226ui.activity.FilePickerActivity.C26452.C26461 */

                        @Override // com.qiyukf.unicorn.widget.p251a.C3021g.AbstractC3022a
                        /* renamed from: a */
                        public final void mo34369a(int i) {
                            if (i == 1) {
                                FilePickerActivity.this.f5458i.add(((File) FilePickerActivity.this.f5457h.get(i)).getAbsolutePath());
                                FilePickerActivity.m6058i(FilePickerActivity.this);
                            }
                        }
                    });
                } else {
                    C1865f.m3555a(C2364R.string.ysf_file_ChooseTip);
                }
            }
        });
        this.f5455f.setOnClickListener(new View.OnClickListener() {
            /* class com.qiyukf.unicorn.fileselect.p226ui.activity.FilePickerActivity.View$OnClickListenerC26473 */

            public final void onClick(View view) {
                if (!FilePickerActivity.this.f5460k.mo36268e() || FilePickerActivity.this.f5458i.size() > 0) {
                    FilePickerActivity.m6058i(FilePickerActivity.this);
                } else {
                    C1865f.m3555a(C2364R.string.ysf_file_NotFoundBooks);
                }
            }
        });
    }
}
