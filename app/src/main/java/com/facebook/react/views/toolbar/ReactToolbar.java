package com.facebook.react.views.toolbar;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.view.DraweeHolder;
import com.facebook.drawee.view.MultiDraweeHolder;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.image.QualityInfo;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.PixelUtil;
import javax.annotation.Nullable;

public class ReactToolbar extends Toolbar {
    public static final String PROP_ACTION_ICON = "icon";
    public static final String PROP_ACTION_SHOW = "show";
    public static final String PROP_ACTION_SHOW_WITH_TEXT = "showWithText";
    public static final String PROP_ACTION_TITLE = "title";
    public static final String PROP_ICON_HEIGHT = "height";
    public static final String PROP_ICON_URI = "uri";
    public static final String PROP_ICON_WIDTH = "width";
    public final MultiDraweeHolder<GenericDraweeHierarchy> mActionsHolder = new MultiDraweeHolder<>();
    public final Runnable mLayoutRunnable = new Runnable() {
        /* class com.facebook.react.views.toolbar.ReactToolbar.RunnableC08894 */

        public void run() {
            ReactToolbar reactToolbar = ReactToolbar.this;
            reactToolbar.measure(View.MeasureSpec.makeMeasureSpec(reactToolbar.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(ReactToolbar.this.getHeight(), 1073741824));
            ReactToolbar reactToolbar2 = ReactToolbar.this;
            reactToolbar2.layout(reactToolbar2.getLeft(), ReactToolbar.this.getTop(), ReactToolbar.this.getRight(), ReactToolbar.this.getBottom());
        }
    };
    public IconControllerListener mLogoControllerListener;
    public final DraweeHolder mLogoHolder;
    public IconControllerListener mNavIconControllerListener;
    public final DraweeHolder mNavIconHolder;
    public IconControllerListener mOverflowIconControllerListener;
    public final DraweeHolder mOverflowIconHolder;

    public class ActionIconControllerListener extends IconControllerListener {
        public final MenuItem mItem;

        public ActionIconControllerListener(MenuItem menuItem, DraweeHolder draweeHolder) {
            super(draweeHolder);
            this.mItem = menuItem;
        }

        @Override // com.facebook.react.views.toolbar.ReactToolbar.IconControllerListener
        public void setDrawable(Drawable drawable) {
            this.mItem.setIcon(drawable);
            ReactToolbar.this.requestLayout();
        }
    }

    public abstract class IconControllerListener extends BaseControllerListener<ImageInfo> {
        public final DraweeHolder mHolder;
        public IconImageInfo mIconImageInfo;

        public IconControllerListener(DraweeHolder draweeHolder) {
            this.mHolder = draweeHolder;
        }

        public abstract void setDrawable(Drawable drawable);

        public void setIconImageInfo(IconImageInfo iconImageInfo) {
            this.mIconImageInfo = iconImageInfo;
        }

        public void onFinalImageSet(String str, @Nullable ImageInfo imageInfo, @Nullable Animatable animatable) {
            super.onFinalImageSet(str, (Object) imageInfo, animatable);
            IconImageInfo iconImageInfo = this.mIconImageInfo;
            if (iconImageInfo != null) {
                imageInfo = iconImageInfo;
            }
            setDrawable(new DrawableWithIntrinsicSize(this.mHolder.getTopLevelDrawable(), imageInfo));
        }
    }

    public static class IconImageInfo implements ImageInfo {
        public int mHeight;
        public int mWidth;

        public IconImageInfo(int i, int i2) {
            this.mWidth = i;
            this.mHeight = i2;
        }

        @Override // com.facebook.imagepipeline.image.ImageInfo
        public int getHeight() {
            return this.mHeight;
        }

        @Override // com.facebook.imagepipeline.image.ImageInfo
        public QualityInfo getQualityInfo() {
            return null;
        }

        @Override // com.facebook.imagepipeline.image.ImageInfo
        public int getWidth() {
            return this.mWidth;
        }
    }

    public ReactToolbar(Context context) {
        super(context);
        this.mLogoHolder = DraweeHolder.create(createDraweeHierarchy(), context);
        this.mNavIconHolder = DraweeHolder.create(createDraweeHierarchy(), context);
        this.mOverflowIconHolder = DraweeHolder.create(createDraweeHierarchy(), context);
        this.mLogoControllerListener = new IconControllerListener(this.mLogoHolder) {
            /* class com.facebook.react.views.toolbar.ReactToolbar.C08861 */

            @Override // com.facebook.react.views.toolbar.ReactToolbar.IconControllerListener
            public void setDrawable(Drawable drawable) {
                ReactToolbar.this.setLogo(drawable);
            }
        };
        this.mNavIconControllerListener = new IconControllerListener(this.mNavIconHolder) {
            /* class com.facebook.react.views.toolbar.ReactToolbar.C08872 */

            @Override // com.facebook.react.views.toolbar.ReactToolbar.IconControllerListener
            public void setDrawable(Drawable drawable) {
                ReactToolbar.this.setNavigationIcon(drawable);
            }
        };
        this.mOverflowIconControllerListener = new IconControllerListener(this.mOverflowIconHolder) {
            /* class com.facebook.react.views.toolbar.ReactToolbar.C08883 */

            @Override // com.facebook.react.views.toolbar.ReactToolbar.IconControllerListener
            public void setDrawable(Drawable drawable) {
                ReactToolbar.this.setOverflowIcon(drawable);
            }
        };
    }

    private void attachDraweeHolders() {
        this.mLogoHolder.onAttach();
        this.mNavIconHolder.onAttach();
        this.mOverflowIconHolder.onAttach();
        this.mActionsHolder.onAttach();
    }

    private GenericDraweeHierarchy createDraweeHierarchy() {
        return new GenericDraweeHierarchyBuilder(getResources()).setActualImageScaleType(ScalingUtils.ScaleType.FIT_CENTER).setFadeDuration(0).build();
    }

    private void detachDraweeHolders() {
        this.mLogoHolder.onDetach();
        this.mNavIconHolder.onDetach();
        this.mOverflowIconHolder.onDetach();
        this.mActionsHolder.onDetach();
    }

    private Drawable getDrawableByName(String str) {
        if (getDrawableResourceByName(str) != 0) {
            return getResources().getDrawable(getDrawableResourceByName(str));
        }
        return null;
    }

    private int getDrawableResourceByName(String str) {
        return getResources().getIdentifier(str, "drawable", getContext().getPackageName());
    }

    private IconImageInfo getIconImageInfo(ReadableMap readableMap) {
        if (!readableMap.hasKey("width") || !readableMap.hasKey("height")) {
            return null;
        }
        return new IconImageInfo(Math.round(PixelUtil.toPixelFromDIP((float) readableMap.getInt("width"))), Math.round(PixelUtil.toPixelFromDIP((float) readableMap.getInt("height"))));
    }

    private void setIconSource(ReadableMap readableMap, IconControllerListener iconControllerListener, DraweeHolder draweeHolder) {
        String string = readableMap != null ? readableMap.getString("uri") : null;
        if (string == null) {
            iconControllerListener.setIconImageInfo(null);
            iconControllerListener.setDrawable(null);
        } else if (string.startsWith("http://") || string.startsWith("https://") || string.startsWith("file://")) {
            iconControllerListener.setIconImageInfo(getIconImageInfo(readableMap));
            draweeHolder.setController(((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setUri(Uri.parse(string)).setControllerListener(iconControllerListener)).setOldController(draweeHolder.getController())).build());
            draweeHolder.getTopLevelDrawable().setVisible(true, true);
        } else {
            iconControllerListener.setDrawable(getDrawableByName(string));
        }
    }

    private void setMenuItemIcon(MenuItem menuItem, ReadableMap readableMap) {
        DraweeHolder<GenericDraweeHierarchy> create = DraweeHolder.create(createDraweeHierarchy(), getContext());
        ActionIconControllerListener actionIconControllerListener = new ActionIconControllerListener(menuItem, create);
        actionIconControllerListener.setIconImageInfo(getIconImageInfo(readableMap));
        setIconSource(readableMap, actionIconControllerListener, create);
        this.mActionsHolder.add(create);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        attachDraweeHolders();
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        detachDraweeHolders();
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        attachDraweeHolders();
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        detachDraweeHolders();
    }

    public void requestLayout() {
        super.requestLayout();
        post(this.mLayoutRunnable);
    }

    public void setActions(@Nullable ReadableArray readableArray) {
        Menu menu = getMenu();
        menu.clear();
        this.mActionsHolder.clear();
        if (readableArray != null) {
            for (int i = 0; i < readableArray.size(); i++) {
                ReadableMap map = readableArray.getMap(i);
                MenuItem add = menu.add(0, 0, i, map.getString("title"));
                if (map.hasKey("icon")) {
                    setMenuItemIcon(add, map.getMap("icon"));
                }
                int i2 = map.hasKey("show") ? map.getInt("show") : 0;
                if (map.hasKey(PROP_ACTION_SHOW_WITH_TEXT) && map.getBoolean(PROP_ACTION_SHOW_WITH_TEXT)) {
                    i2 |= 4;
                }
                add.setShowAsAction(i2);
            }
        }
    }

    public void setLogoSource(@Nullable ReadableMap readableMap) {
        setIconSource(readableMap, this.mLogoControllerListener, this.mLogoHolder);
    }

    public void setNavIconSource(@Nullable ReadableMap readableMap) {
        setIconSource(readableMap, this.mNavIconControllerListener, this.mNavIconHolder);
    }

    public void setOverflowIconSource(@Nullable ReadableMap readableMap) {
        setIconSource(readableMap, this.mOverflowIconControllerListener, this.mOverflowIconHolder);
    }
}
