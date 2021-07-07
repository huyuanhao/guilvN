package com.p118pd.sdk;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.MemoryCategory;
import com.bumptech.glide.Registry;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.p118pd.sdk.AbstractC7661o0oOooo;
import com.p118pd.sdk.C7668o0oo00O;
import com.p118pd.sdk.C7752o0oooo;
import com.p118pd.sdk.C7753o0oooo0;
import com.p118pd.sdk.C7754o0oooo00;
import com.p118pd.sdk.C7755o0oooo0O;
import com.p118pd.sdk.C7758o0ooooO0;
import com.p118pd.sdk.C7760o0ooooOo;
import com.p118pd.sdk.C7766o0oooooo;
import com.p118pd.sdk.C7768oO000;
import com.p118pd.sdk.C7773oO0000oO;
import com.p118pd.sdk.C7776oO000O;
import com.p118pd.sdk.C7848oO0O0OoO;
import com.p118pd.sdk.C7882oO0OOooo;
import com.p118pd.sdk.C7898oO0OoOO0;
import com.p118pd.sdk.C7899oO0OoOOO;
import com.p118pd.sdk.C7914oO0Ooooo;
import com.p118pd.sdk.C7931oO0o0o;
import com.p118pd.sdk.oO000O0;
import com.p118pd.sdk.oO000O0O;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.pd.sdk.o0o0Oo0o  reason: case insensitive filesystem */
public class ComponentCallbacks2C7604o0o0Oo0o implements ComponentCallbacks2 {
    public static volatile ComponentCallbacks2C7604o0o0Oo0o OooO00o = null;
    public static volatile boolean OooO0O0 = false;
    public static final String o0ooOOo = "image_manager_disk_cache";
    public static final String o0ooOoO = "Glide";

    /* renamed from: OooO00o  reason: collision with other field name */
    public MemoryCategory f20432OooO00o = MemoryCategory.NORMAL;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Registry f20433OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7607o0o0OoOO f20434OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7687o0oo0Oo f20435OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7707o0ooO00O f20436OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7711o0ooO0OO f20437OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7745o0oooO0o f20438OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7749o0oooOo f20439OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7807oO00OoOO f20440OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7815oO00o000 f20441OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final List<C7658o0oOooOO> f20442OooO00o = new ArrayList();

    public ComponentCallbacks2C7604o0o0Oo0o(@NonNull Context context, @NonNull C7687o0oo0Oo o0oo0oo, @NonNull AbstractC7745o0oooO0o o0oooo0o, @NonNull AbstractC7711o0ooO0OO o0ooo0oo, @NonNull AbstractC7707o0ooO00O o0ooo00o, @NonNull C7815oO00o000 oo00o000, @NonNull AbstractC7807oO00OoOO oo00oooo, int i, @NonNull C7824oO00o0oo oo00o0oo, @NonNull Map<Class<?>, AbstractC7623o0oOOoOo<?, ?>> map) {
        this.f20435OooO00o = o0oo0oo;
        this.f20437OooO00o = o0ooo0oo;
        this.f20436OooO00o = o0ooo00o;
        this.f20438OooO00o = o0oooo0o;
        this.f20441OooO00o = oo00o000;
        this.f20440OooO00o = oo00oooo;
        this.f20439OooO00o = new C7749o0oooOo(o0oooo0o, o0ooo0oo, (DecodeFormat) oo00o0oo.getOptions().OooO00o(C7785oO000o00.f20825OooO00o));
        Resources resources = context.getResources();
        Registry registry = new Registry();
        this.f20433OooO00o = registry;
        if (Build.VERSION.SDK_INT >= 27) {
            registry.OooO00o((ImageHeaderParser) new C7786oO000o0o());
        }
        this.f20433OooO00o.OooO00o((ImageHeaderParser) new C7781oO000Ooo());
        C7785oO000o00 oo000o00 = new C7785oO000o00(this.f20433OooO00o.OooO00o(), resources.getDisplayMetrics(), o0ooo0oo, o0ooo00o);
        oO0O0OOO oo0o0ooo = new oO0O0OOO(context, this.f20433OooO00o.OooO00o(), o0ooo0oo, o0ooo00o);
        AbstractC7650o0oOoOoO<ParcelFileDescriptor, Bitmap> OooO0O02 = C7888oO0Oo0Oo.OooO0O0(o0ooo0oo);
        oO0OO0OO oo0oo0oo = new oO0OO0OO(oo000o00);
        C7906oO0Ooo0o oo0ooo0o = new C7906oO0Ooo0o(oo000o00, o0ooo00o);
        C7845oO0O0OOo oo0o0ooo2 = new C7845oO0O0OOo(context);
        C7773oO0000oO.OooO0OO oooO0OO = new C7773oO0000oO.OooO0OO(resources);
        C7773oO0000oO.C7774OooO0Oo oooO0Oo = new C7773oO0000oO.C7774OooO0Oo(resources);
        C7773oO0000oO.OooO0O0 oooO0O0 = new C7773oO0000oO.OooO0O0(resources);
        C7773oO0000oO.OooO00o oooO00o = new C7773oO0000oO.OooO00o(resources);
        C8949ooOOOOoo oooooooo = new C8949ooOOOOoo(o0ooo00o);
        C8230oOOoOoOO oooooooo2 = new C8230oOOoOoOO();
        oO00Oo0 oo00oo0 = new oO00Oo0();
        ContentResolver contentResolver = context.getContentResolver();
        this.f20433OooO00o.OooO00o(ByteBuffer.class, new C7757o0oooo0o()).OooO00o(InputStream.class, new C7775oO0000oo(o0ooo00o)).OooO00o(Registry.OooO0O0, ByteBuffer.class, Bitmap.class, oo0oo0oo).OooO00o(Registry.OooO0O0, InputStream.class, Bitmap.class, oo0ooo0o).OooO00o(Registry.OooO0O0, ParcelFileDescriptor.class, Bitmap.class, OooO0O02).OooO00o(Registry.OooO0O0, AssetFileDescriptor.class, Bitmap.class, C7888oO0Oo0Oo.OooO00o(o0ooo0oo)).OooO00o(Bitmap.class, Bitmap.class, oO000O0.OooO00o.OooO00o()).OooO00o(Registry.OooO0O0, Bitmap.class, Bitmap.class, new C7792oO000oo0()).OooO00o(Bitmap.class, (AbstractC7653o0oOoo0) oooooooo).OooO00o(Registry.OooO0OO, ByteBuffer.class, BitmapDrawable.class, new C7864oO0OO0oo(resources, oo0oo0oo)).OooO00o(Registry.OooO0OO, InputStream.class, BitmapDrawable.class, new C7864oO0OO0oo(resources, oo0ooo0o)).OooO00o(Registry.OooO0OO, ParcelFileDescriptor.class, BitmapDrawable.class, new C7864oO0OO0oo(resources, OooO0O02)).OooO00o(BitmapDrawable.class, (AbstractC7653o0oOoo0) new C7881oO0OOooO(o0ooo0oo, oooooooo)).OooO00o(Registry.OooO00o, InputStream.class, C7796oO00OO.class, new C7799oO00OOoO(this.f20433OooO00o.OooO00o(), oo0o0ooo, o0ooo00o)).OooO00o(Registry.OooO00o, ByteBuffer.class, C7796oO00OO.class, oo0o0ooo).OooO00o(C7796oO00OO.class, (AbstractC7653o0oOoo0) new C7798oO00OOO()).OooO00o(GifDecoder.class, GifDecoder.class, oO000O0.OooO00o.OooO00o()).OooO00o(Registry.OooO0O0, GifDecoder.class, Bitmap.class, new oO00OOo0(o0ooo0oo)).OooO00o(Uri.class, Drawable.class, oo0o0ooo2).OooO00o(Uri.class, Bitmap.class, new C7905oO0Ooo0O(oo0o0ooo2, o0ooo0oo)).OooO00o((AbstractC7661o0oOooo.OooO00o<?>) new C7848oO0O0OoO.OooO00o()).OooO00o(File.class, ByteBuffer.class, new C7752o0oooo.OooO0O0()).OooO00o(File.class, InputStream.class, new C7760o0ooooOo.C7762OooO0o0()).OooO00o(File.class, File.class, new C7793oO00O()).OooO00o(File.class, ParcelFileDescriptor.class, new C7760o0ooooOo.OooO0O0()).OooO00o(File.class, File.class, oO000O0.OooO00o.OooO00o()).OooO00o((AbstractC7661o0oOooo.OooO00o<?>) new C7668o0oo00O.OooO00o(o0ooo00o)).OooO00o(Integer.TYPE, InputStream.class, oooO0OO).OooO00o(Integer.TYPE, ParcelFileDescriptor.class, oooO0O0).OooO00o(Integer.class, InputStream.class, oooO0OO).OooO00o(Integer.class, ParcelFileDescriptor.class, oooO0O0).OooO00o(Integer.class, Uri.class, oooO0Oo).OooO00o(Integer.TYPE, AssetFileDescriptor.class, oooO00o).OooO00o(Integer.class, AssetFileDescriptor.class, oooO00o).OooO00o(Integer.TYPE, Uri.class, oooO0Oo).OooO00o(String.class, InputStream.class, new C7758o0ooooO0.OooO0OO()).OooO00o(Uri.class, InputStream.class, new C7758o0ooooO0.OooO0OO()).OooO00o(String.class, InputStream.class, new C7768oO000.OooO0OO()).OooO00o(String.class, ParcelFileDescriptor.class, new C7768oO000.OooO0O0()).OooO00o(String.class, AssetFileDescriptor.class, new C7768oO000.OooO00o()).OooO00o(Uri.class, InputStream.class, new C7776oO000O.OooO00o()).OooO00o(Uri.class, InputStream.class, new C7753o0oooo0.OooO0OO(context.getAssets())).OooO00o(Uri.class, ParcelFileDescriptor.class, new C7753o0oooo0.OooO0O0(context.getAssets())).OooO00o(Uri.class, InputStream.class, new C7898oO0OoOO0.OooO00o(context)).OooO00o(Uri.class, InputStream.class, new C7882oO0OOooo.OooO00o(context)).OooO00o(Uri.class, InputStream.class, new oO000O0O.C7777OooO0Oo(contentResolver)).OooO00o(Uri.class, ParcelFileDescriptor.class, new oO000O0O.OooO0O0(contentResolver)).OooO00o(Uri.class, AssetFileDescriptor.class, new oO000O0O.OooO00o(contentResolver)).OooO00o(Uri.class, InputStream.class, new C7914oO0Ooooo.OooO00o()).OooO00o(URL.class, InputStream.class, new C7899oO0OoOOO.OooO00o()).OooO00o(Uri.class, File.class, new C7766o0oooooo.OooO00o(context)).OooO00o(C7764o0ooooo0.class, InputStream.class, new C7931oO0o0o.OooO00o()).OooO00o(byte[].class, ByteBuffer.class, new C7755o0oooo0O.OooO00o()).OooO00o(byte[].class, InputStream.class, new C7755o0oooo0O.C7756OooO0Oo()).OooO00o(Uri.class, Uri.class, oO000O0.OooO00o.OooO00o()).OooO00o(Drawable.class, Drawable.class, oO000O0.OooO00o.OooO00o()).OooO00o(Drawable.class, Drawable.class, new C7795oO00O0oo()).OooO00o(Bitmap.class, BitmapDrawable.class, new C7800oO00OOoo(resources)).OooO00o(Bitmap.class, byte[].class, oooooooo2).OooO00o(Drawable.class, byte[].class, new C7802oO00Oo00(o0ooo0oo, oooooooo2, oo00oo0)).OooO00o(C7796oO00OO.class, byte[].class, oo00oo0);
        this.f20434OooO00o = new C7607o0o0OoOO(context, o0ooo00o, this.f20433OooO00o, new C7830oO00oOO0(), oo00o0oo, map, o0oo0oo, i);
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static File m19232OooO00o(@NonNull Context context) {
        return OooO00o(context, "image_manager_disk_cache");
    }

    public static void OooO0O0(@NonNull Context context) {
        OooO0O0(context, new C7605o0o0OoO());
    }

    @VisibleForTesting
    public static synchronized void OooO0OO() {
        synchronized (ComponentCallbacks2C7604o0o0Oo0o.class) {
            if (OooO00o != null) {
                OooO00o.m19234OooO00o().getApplicationContext().unregisterComponentCallbacks(OooO00o);
                OooO00o.f20435OooO00o.OooO0O0();
            }
            OooO00o = null;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        OooO0O0();
    }

    public void onTrimMemory(int i) {
        OooO00o(i);
    }

    @Nullable
    public static File OooO00o(@NonNull Context context, @NonNull String str) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            File file = new File(cacheDir, str);
            if (file.mkdirs() || (file.exists() && file.isDirectory())) {
                return file;
            }
            return null;
        }
        Log.isLoggable("Glide", 6);
        return null;
    }

    public static void OooO0O0(@NonNull Context context, @NonNull C7605o0o0OoO o0o0ooo) {
        Context applicationContext = context.getApplicationContext();
        AbstractC7598o0o0OOoO OooO00o2 = OooO00o();
        List<AbstractC7816oO00o00o> emptyList = Collections.emptyList();
        if (OooO00o2 == null || OooO00o2.isManifestParsingEnabled()) {
            emptyList = new C7813oO00o0(applicationContext).OooO00o();
        }
        if (OooO00o2 != null && !OooO00o2.m19228OooO00o().isEmpty()) {
            Set<Class<?>> OooO00o3 = OooO00o2.m19228OooO00o();
            Iterator<AbstractC7816oO00o00o> it = emptyList.iterator();
            while (it.hasNext()) {
                AbstractC7816oO00o00o next = it.next();
                if (OooO00o3.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        String str = "AppGlideModule excludes manifest GlideModule: " + next;
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator<AbstractC7816oO00o00o> it2 = emptyList.iterator();
            while (it2.hasNext()) {
                String str2 = "Discovered GlideModule from manifest: " + it2.next().getClass();
            }
        }
        o0o0ooo.OooO00o(OooO00o2 != null ? OooO00o2.OooO00o() : null);
        for (AbstractC7816oO00o00o oo00o00o : emptyList) {
            oo00o00o.applyOptions(applicationContext, o0o0ooo);
        }
        if (OooO00o2 != null) {
            OooO00o2.applyOptions(applicationContext, o0o0ooo);
        }
        ComponentCallbacks2C7604o0o0Oo0o OooO00o4 = o0o0ooo.OooO00o(applicationContext);
        for (AbstractC7816oO00o00o oo00o00o2 : emptyList) {
            oo00o00o2.registerComponents(applicationContext, OooO00o4, OooO00o4.f20433OooO00o);
        }
        if (OooO00o2 != null) {
            OooO00o2.registerComponents(applicationContext, OooO00o4, OooO00o4.f20433OooO00o);
        }
        applicationContext.registerComponentCallbacks(OooO00o4);
        OooO00o = OooO00o4;
    }

    @NonNull
    public static ComponentCallbacks2C7604o0o0Oo0o OooO00o(@NonNull Context context) {
        if (OooO00o == null) {
            synchronized (ComponentCallbacks2C7604o0o0Oo0o.class) {
                if (OooO00o == null) {
                    m19233OooO00o(context);
                }
            }
        }
        return OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m19233OooO00o(@NonNull Context context) {
        if (!OooO0O0) {
            OooO0O0 = true;
            OooO0O0(context);
            OooO0O0 = false;
            return;
        }
        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
    }

    @VisibleForTesting
    @Deprecated
    public static synchronized void OooO00o(ComponentCallbacks2C7604o0o0Oo0o o0o0oo0o) {
        synchronized (ComponentCallbacks2C7604o0o0Oo0o.class) {
            if (OooO00o != null) {
                OooO0OO();
            }
            OooO00o = o0o0oo0o;
        }
    }

    @VisibleForTesting
    public static synchronized void OooO00o(@NonNull Context context, @NonNull C7605o0o0OoO o0o0ooo) {
        synchronized (ComponentCallbacks2C7604o0o0Oo0o.class) {
            if (OooO00o != null) {
                OooO0OO();
            }
            OooO0O0(context, o0o0ooo);
        }
    }

    @Nullable
    public static AbstractC7598o0o0OOoO OooO00o() {
        try {
            return (AbstractC7598o0o0OOoO) Class.forName("com.pd.sdk.o0o0OOoo").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException unused) {
            Log.isLoggable("Glide", 5);
        } catch (InstantiationException e) {
            OooO00o(e);
        } catch (IllegalAccessException e2) {
            OooO00o(e2);
        } catch (NoSuchMethodException e3) {
            OooO00o(e3);
        } catch (InvocationTargetException e4) {
            OooO00o(e4);
        }
        return null;
    }

    public void OooO0O0() {
        oO0O0O00.OooO0O0();
        this.f20438OooO00o.m19392OooO00o();
        this.f20437OooO00o.m19352OooO00o();
        this.f20436OooO00o.OooO00o();
    }

    public static void OooO00o(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC7711o0ooO0OO m19238OooO00o() {
        return this.f20437OooO00o;
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC7707o0ooO00O m19237OooO00o() {
        return this.f20436OooO00o;
    }

    public void OooO0O0(C7658o0oOooOO o0oooooo) {
        synchronized (this.f20442OooO00o) {
            if (this.f20442OooO00o.contains(o0oooooo)) {
                this.f20442OooO00o.remove(o0oooooo);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Context m19234OooO00o() {
        return this.f20434OooO00o.getBaseContext();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC7807oO00OoOO m19239OooO00o() {
        return this.f20440OooO00o;
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C7607o0o0OoOO m19236OooO00o() {
        return this.f20434OooO00o;
    }

    public void OooO00o(@NonNull C7754o0oooo00.OooO00o... oooO00oArr) {
        this.f20439OooO00o.OooO00o(oooO00oArr);
    }

    public void OooO00o(int i) {
        oO0O0O00.OooO0O0();
        this.f20438OooO00o.OooO00o(i);
        this.f20437OooO00o.OooO00o(i);
        this.f20436OooO00o.OooO00o(i);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19241OooO00o() {
        oO0O0O00.OooO00o();
        this.f20435OooO00o.OooO00o();
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C7815oO00o000 m19240OooO00o() {
        return this.f20441OooO00o;
    }

    @NonNull
    public MemoryCategory OooO00o(@NonNull MemoryCategory memoryCategory) {
        oO0O0O00.OooO0O0();
        this.f20438OooO00o.OooO00o(memoryCategory.getMultiplier());
        this.f20437OooO00o.OooO00o(memoryCategory.getMultiplier());
        MemoryCategory memoryCategory2 = this.f20432OooO00o;
        this.f20432OooO00o = memoryCategory;
        return memoryCategory2;
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static C7815oO00o000 m19231OooO00o(@Nullable Context context) {
        C7842oO0O0.OooO00o(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return OooO00o(context).m19240OooO00o();
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static C7658o0oOooOO m19230OooO00o(@NonNull Context context) {
        return m19231OooO00o(context).m19511OooO00o(context);
    }

    @NonNull
    public static C7658o0oOooOO OooO00o(@NonNull Activity activity) {
        return m19231OooO00o((Context) activity).m19510OooO00o(activity);
    }

    @NonNull
    public static C7658o0oOooOO OooO00o(@NonNull FragmentActivity fragmentActivity) {
        return m19231OooO00o((Context) fragmentActivity).OooO00o(fragmentActivity);
    }

    @NonNull
    public static C7658o0oOooOO OooO00o(@NonNull Fragment fragment) {
        return m19231OooO00o((Context) fragment.getActivity()).OooO00o(fragment);
    }

    @NonNull
    @Deprecated
    public static C7658o0oOooOO OooO00o(@NonNull android.app.Fragment fragment) {
        return m19231OooO00o((Context) fragment.getActivity()).OooO00o(fragment);
    }

    @NonNull
    public static C7658o0oOooOO OooO00o(@NonNull View view) {
        return m19231OooO00o(view.getContext()).OooO00o(view);
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Registry m19235OooO00o() {
        return this.f20433OooO00o;
    }

    public boolean OooO00o(@NonNull AbstractC7833oO00oOo0<?> oo00ooo0) {
        synchronized (this.f20442OooO00o) {
            for (C7658o0oOooOO o0oooooo : this.f20442OooO00o) {
                if (o0oooooo.untrack(oo00ooo0)) {
                    return true;
                }
            }
            return false;
        }
    }

    public void OooO00o(C7658o0oOooOO o0oooooo) {
        synchronized (this.f20442OooO00o) {
            if (!this.f20442OooO00o.contains(o0oooooo)) {
                this.f20442OooO00o.add(o0oooooo);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }
}
