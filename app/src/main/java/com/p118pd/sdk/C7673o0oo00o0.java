package com.p118pd.sdk;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import androidx.annotation.NonNull;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.pd.sdk.o0oo00o0  reason: case insensitive filesystem */
public class C7673o0oo00o0 extends AbstractC7670o0oo00OO<InputStream> {
    public static final UriMatcher OooO00o;
    public static final int o00oO0O = 1;
    public static final int o0OOO0o = 5;
    public static final int o0ooOO0 = 2;
    public static final int o0ooOOo = 3;
    public static final int o0ooOoO = 4;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        OooO00o = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        OooO00o.addURI("com.android.contacts", "contacts/lookup/*", 1);
        OooO00o.addURI("com.android.contacts", "contacts/#/photo", 2);
        OooO00o.addURI("com.android.contacts", "contacts/#", 3);
        OooO00o.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        OooO00o.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public C7673o0oo00o0(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    private InputStream OooO0O0(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        int match = OooO00o.match(uri);
        if (match != 1) {
            if (match == 3) {
                return OooO00o(contentResolver, uri);
            }
            if (match != 5) {
                return contentResolver.openInputStream(uri);
            }
        }
        Uri lookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (lookupContact != null) {
            return OooO00o(contentResolver, lookupContact);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }

    @Override // com.p118pd.sdk.AbstractC7670o0oo00OO
    public InputStream OooO00o(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        InputStream OooO0O0 = OooO0O0(uri, contentResolver);
        if (OooO0O0 != null) {
            return OooO0O0;
        }
        throw new FileNotFoundException("InputStream is null for " + uri);
    }

    private InputStream OooO00o(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    public void OooO00o(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7670o0oo00OO, com.p118pd.sdk.AbstractC7670o0oo00OO
    @NonNull
    public Class<InputStream> OooO00o() {
        return InputStream.class;
    }
}
