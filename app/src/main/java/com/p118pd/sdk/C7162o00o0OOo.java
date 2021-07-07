package com.p118pd.sdk;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;

@RequiresApi(21)
/* renamed from: com.pd.sdk.o00o0OOo  reason: case insensitive filesystem */
public class C7162o00o0OOo extends AbstractC7158o00o0O0O {
    public Context OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Uri f19559OooO00o;

    public C7162o00o0OOo(@Nullable AbstractC7158o00o0O0O o00o0o0o, Context context, Uri uri) {
        super(o00o0o0o);
        this.OooO00o = context;
        this.f19559OooO00o = uri;
    }

    @Override // com.p118pd.sdk.AbstractC7158o00o0O0O
    @Nullable
    public AbstractC7158o00o0O0O OooO00o(String str, String str2) {
        Uri OooO00o2 = OooO00o(this.OooO00o, this.f19559OooO00o, str, str2);
        if (OooO00o2 != null) {
            return new C7162o00o0OOo(this, this.OooO00o, OooO00o2);
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O
    @Nullable
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public String m18597OooO0O0() {
        return C7160o00o0OO0.m18583OooO0OO(this.OooO00o, this.f19559OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC7158o00o0O0O
    public boolean OooO0OO() {
        try {
            return DocumentsContract.deleteDocument(this.OooO00o.getContentResolver(), this.f19559OooO00o);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.p118pd.sdk.AbstractC7158o00o0O0O
    public boolean OooO0Oo() {
        return C7160o00o0OO0.m18584OooO0OO(this.OooO00o, this.f19559OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC7158o00o0O0O
    public boolean OooO0o() {
        return C7160o00o0OO0.OooO0o0(this.OooO00o, this.f19559OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC7158o00o0O0O
    public boolean OooO0o0() {
        return C7160o00o0OO0.OooO0Oo(this.OooO00o, this.f19559OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC7158o00o0O0O
    public boolean OooO0oO() {
        return C7160o00o0OO0.OooO0o(this.OooO00o, this.f19559OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O
    public long OooO0O0() {
        return C7160o00o0OO0.OooO0OO(this.OooO00o, this.f19559OooO00o);
    }

    @Nullable
    public static Uri OooO00o(Context context, Uri uri, String str, String str2) {
        try {
            return DocumentsContract.createDocument(context.getContentResolver(), uri, str, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m18598OooO0O0() {
        return C7160o00o0OO0.m18582OooO0O0(this.OooO00o, this.f19559OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O
    @Nullable
    public AbstractC7158o00o0O0O OooO00o(String str) {
        Uri OooO00o2 = OooO00o(this.OooO00o, this.f19559OooO00o, "vnd.android.document/directory", str);
        if (OooO00o2 != null) {
            return new C7162o00o0OOo(this, this.OooO00o, OooO00o2);
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Uri m18592OooO00o() {
        return this.f19559OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O
    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m18593OooO00o() {
        return C7160o00o0OO0.m18579OooO00o(this.OooO00o, this.f19559OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O
    public long OooO00o() {
        return C7160o00o0OO0.OooO0O0(this.OooO00o, this.f19559OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18594OooO00o() {
        return C7160o00o0OO0.m18580OooO00o(this.OooO00o, this.f19559OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC7158o00o0O0O[] m18596OooO00o() {
        ContentResolver contentResolver = this.OooO00o.getContentResolver();
        Uri uri = this.f19559OooO00o;
        Uri buildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(buildChildDocumentsUriUsingTree, new String[]{"document_id"}, null, null, null);
            while (cursor.moveToNext()) {
                arrayList.add(DocumentsContract.buildDocumentUriUsingTree(this.f19559OooO00o, cursor.getString(0)));
            }
        } catch (Exception e) {
            String str = "Failed query: " + e;
        } catch (Throwable th) {
            OooO00o((AutoCloseable) null);
            throw th;
        }
        OooO00o(cursor);
        Uri[] uriArr = (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
        AbstractC7158o00o0O0O[] o00o0o0oArr = new AbstractC7158o00o0O0O[uriArr.length];
        for (int i = 0; i < uriArr.length; i++) {
            o00o0o0oArr[i] = new C7162o00o0OOo(this, this.OooO00o, uriArr[i]);
        }
        return o00o0o0oArr;
    }

    public static void OooO00o(@Nullable AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18595OooO00o(String str) {
        try {
            Uri renameDocument = DocumentsContract.renameDocument(this.OooO00o.getContentResolver(), this.f19559OooO00o, str);
            if (renameDocument != null) {
                this.f19559OooO00o = renameDocument;
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
