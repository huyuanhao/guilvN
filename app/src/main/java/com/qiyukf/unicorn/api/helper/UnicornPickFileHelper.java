package com.qiyukf.unicorn.api.helper;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import androidx.fragment.app.Fragment;
import com.p118pd.sdk.C8884ooO0oo0O;
import com.p118pd.sdk.C9058ooOoOoOO;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p138c.p139a.C1806a;
import com.qiyukf.basesdk.p138c.p139a.C1807b;
import com.qiyukf.basesdk.p138c.p142c.C1852c;
import com.qiyukf.basesdk.p138c.p142c.C1853d;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.nimlib.p198j.p201c.C2349d;
import com.qiyukf.nimlib.p198j.p201c.EnumC2347c;
import com.qiyukf.nimlib.sdk.msg.MessageBuilder;
import com.qiyukf.nimlib.sdk.msg.constant.SessionTypeEnum;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.api.msg.MessageService;
import com.qiyukf.unicorn.fileselect.C2635a;
import com.qiyukf.unicorn.p229h.C2667c;
import com.qiyukf.unicorn.p232k.C2709i;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class UnicornPickFileHelper {
    public static int fileIndex;

    public static void goPickFileActivity(final Activity activity, final int i) {
        C2709i.m6263a(activity).mo36469a("android.permission.READ_EXTERNAL_STORAGE").mo36468a(new C2709i.AbstractC2710a() {
            /* class com.qiyukf.unicorn.api.helper.UnicornPickFileHelper.C24202 */

            @Override // com.qiyukf.unicorn.p232k.C2709i.AbstractC2710a
            public final void onDenied() {
                C1865f.m3555a(C2364R.string.ysf_no_permission_video);
            }

            @Override // com.qiyukf.unicorn.p232k.C2709i.AbstractC2710a
            public final void onGranted() {
                Activity activity = activity;
                new C2635a().mo36248a(activity).mo36247a(i).mo36250a("文件选择").mo36246a().mo36251b().mo36253d().mo36254e().mo36252c().mo36255f();
            }
        }).mo36470a();
    }

    public static void goPickFileActivity(final Fragment fragment, final int i) {
        C2709i.m6264a(fragment).mo36469a("android.permission.READ_EXTERNAL_STORAGE").mo36468a(new C2709i.AbstractC2710a() {
            /* class com.qiyukf.unicorn.api.helper.UnicornPickFileHelper.C24191 */

            @Override // com.qiyukf.unicorn.p232k.C2709i.AbstractC2710a
            public final void onDenied() {
                C1865f.m3555a(C2364R.string.ysf_no_permission_video);
            }

            @Override // com.qiyukf.unicorn.p232k.C2709i.AbstractC2710a
            public final void onGranted() {
                if (Build.VERSION.SDK_INT >= 29) {
                    try {
                        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                        intent.setType("*/*");
                        fragment.startActivityForResult(intent, i);
                    } catch (Exception unused) {
                        C1865f.m3557a("启动文件选择器失败，请检查手机文件存储是否正常");
                    }
                } else {
                    Fragment fragment = fragment;
                    new C2635a().mo36249a(fragment).mo36247a(i).mo36250a("文件选择").mo36246a().mo36251b().mo36253d().mo36254e().mo36252c().mo36255f();
                }
            }
        }).mo36470a();
    }

    public static void onPickFileResult(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 29) {
            Uri data = intent.getData();
            if (data != null && context != null) {
                try {
                    if (((long) context.getContentResolver().openInputStream(data).available()) > C8884ooO0oo0O.OooO0OO) {
                        C1865f.m3557a("文件过大，无法发送");
                        return;
                    }
                    String a = C1852c.m3510a(context, data);
                    String str = a + fileIndex + C9058ooOoOoOO.OooOO0 + C1807b.m3416a(data.toString());
                    fileIndex++;
                    C1709a.m3011a("UnicornPickFileHelper", a);
                    C1709a.m3011a("UnicornPickFileHelper", str);
                    String a2 = C2349d.m5123a(str, EnumC2347c.TYPE_FILE);
                    if (!C1806a.m3410a(context, data, a2)) {
                        C1865f.m3555a(C2364R.string.ysf_media_exception);
                    } else if (a2 != null) {
                        File file = new File(a2);
                        String a3 = C2667c.m6116a();
                        SessionTypeEnum sessionTypeEnum = SessionTypeEnum.Ysf;
                        String str2 = "";
                        Cursor query = context.getContentResolver().query(data, null, null, null, null);
                        if (query != null) {
                            query.moveToNext();
                            int columnIndex = query.getColumnIndex("_display_name");
                            if (columnIndex >= 0) {
                                str2 = query.getString(columnIndex);
                            }
                            query.close();
                        }
                        MessageService.sendMessage(MessageBuilder.createFileMessage(a3, sessionTypeEnum, file, str2));
                    }
                } catch (IOException e) {
                    C1709a.m3015b("UnicornPickFileHelper", "onPickFileResult is error", e);
                } catch (NullPointerException e2) {
                    C1709a.m3015b("UnicornPickFileHelper", "onPickFileResult is NPE", e2);
                }
            }
        } else {
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("pickFileListTag");
            if (stringArrayListExtra != null) {
                String b = C1852c.m3513b(stringArrayListExtra.get(0));
                String str3 = b + fileIndex + C9058ooOoOoOO.OooOO0 + C1807b.m3416a(stringArrayListExtra.get(0));
                fileIndex++;
                C1709a.m3011a("UnicornPickFileHelper", b);
                C1709a.m3011a("UnicornPickFileHelper", str3);
                String a4 = C2349d.m5123a(str3, EnumC2347c.TYPE_FILE);
                if (C1806a.m3408a(stringArrayListExtra.get(0), a4) == -1) {
                    C1865f.m3555a(C2364R.string.ysf_media_exception);
                } else if (a4 != null) {
                    MessageService.sendMessage(MessageBuilder.createFileMessage(C2667c.m6116a(), SessionTypeEnum.Ysf, new File(a4), C1853d.m3519b(stringArrayListExtra.get(0))));
                }
            }
        }
    }
}
