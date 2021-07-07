package com.facebook.react.views.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.SparseArray;
import com.beefe.picker.Ilil1111;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class ReactFontManager {
    public static final String[] EXTENSIONS = {"", "_bold", "_italic", "_bold_italic"};
    public static final String[] FILE_EXTENSIONS = {Ilil1111.TTF, Ilil1111.OTF};
    public static final String FONTS_ASSET_PATH = "fonts/";
    public static ReactFontManager sReactFontManagerInstance;
    public Map<String, FontFamily> mFontCache = new HashMap();

    public static class FontFamily {
        public SparseArray<Typeface> mTypefaceSparseArray;

        public Typeface getTypeface(int i) {
            return this.mTypefaceSparseArray.get(i);
        }

        public void setTypeface(int i, Typeface typeface) {
            this.mTypefaceSparseArray.put(i, typeface);
        }

        public FontFamily() {
            this.mTypefaceSparseArray = new SparseArray<>(4);
        }
    }

    @Nullable
    public static Typeface createTypeface(String str, int i, AssetManager assetManager) {
        String str2 = EXTENSIONS[i];
        String[] strArr = FILE_EXTENSIONS;
        for (String str3 : strArr) {
            try {
                return Typeface.createFromAsset(assetManager, "fonts/" + str + str2 + str3);
            } catch (RuntimeException unused) {
            }
        }
        return Typeface.create(str, i);
    }

    public static ReactFontManager getInstance() {
        if (sReactFontManagerInstance == null) {
            sReactFontManagerInstance = new ReactFontManager();
        }
        return sReactFontManagerInstance;
    }

    @Nullable
    public Typeface getTypeface(String str, int i, AssetManager assetManager) {
        FontFamily fontFamily = this.mFontCache.get(str);
        if (fontFamily == null) {
            fontFamily = new FontFamily();
            this.mFontCache.put(str, fontFamily);
        }
        Typeface typeface = fontFamily.getTypeface(i);
        if (typeface == null && (typeface = createTypeface(str, i, assetManager)) != null) {
            fontFamily.setTypeface(i, typeface);
        }
        return typeface;
    }

    public void setTypeface(String str, int i, Typeface typeface) {
        if (typeface != null) {
            FontFamily fontFamily = this.mFontCache.get(str);
            if (fontFamily == null) {
                fontFamily = new FontFamily();
                this.mFontCache.put(str, fontFamily);
            }
            fontFamily.setTypeface(i, typeface);
        }
    }
}
