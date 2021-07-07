package exocr.idcard;

import android.content.Context;
import android.graphics.Point;
import android.hardware.Camera;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.xiaomi.mipush.sdk.Constants;
import java.util.regex.Pattern;

public final class CameraConfigurationManager {
    public static final Pattern OooO00o = Pattern.compile(Constants.ACCEPT_TIME_SEPARATOR_SP);
    public static final String OooO0O0 = "CameraConfigurationManager";
    public static final int OooO0OO = 27;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f23709OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Context f23710OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Point f23711OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f23712OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int f23713OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public Point f23714OooO0O0;

    public CameraConfigurationManager(Context context) {
        this.f23710OooO00o = context;
    }

    private Point OooO0OO() {
        Display defaultDisplay = ((WindowManager) this.f23710OooO00o.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        int i2 = displayMetrics.widthPixels;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 14 && i3 < 17) {
            try {
                i = ((Integer) Display.class.getMethod("getRawHeight", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                i2 = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
            } catch (Exception unused) {
            }
        } else if (Build.VERSION.SDK_INT >= 17) {
            Point point = new Point();
            Display.class.getMethod("getRealSize", Point.class).invoke(defaultDisplay, point);
            i = point.y;
            i2 = point.x;
        }
        return new Point(i2, i);
    }

    public void OooO00o(Camera camera) {
        Camera.Parameters parameters = camera.getParameters();
        this.f23709OooO00o = parameters.getPreviewFormat();
        this.f23713OooO0O0 = parameters.getPictureFormat();
        this.f23712OooO00o = parameters.get("preview-format");
        DebugLog.m22048OooO00o("Default preview format: " + this.f23709OooO00o + '/' + this.f23712OooO00o);
        this.f23711OooO00o = OooO0OO();
        StringBuilder sb = new StringBuilder();
        sb.append("Screen resolution: ");
        sb.append(this.f23711OooO00o);
        DebugLog.m22048OooO00o(sb.toString());
        this.f23714OooO0O0 = OooO00o(parameters, this.f23711OooO00o);
        DebugLog.m22048OooO00o("Camera resolution: " + this.f23711OooO00o);
    }

    public void OooO0O0(Camera camera) {
        Camera.Parameters parameters = camera.getParameters();
        DebugLog.m22048OooO00o("Setting preview size: " + this.f23714OooO0O0);
        Point point = this.f23714OooO0O0;
        parameters.setPreviewSize(point.x, point.y);
        OooO00o(parameters);
        OooO0O0(parameters);
        camera.setParameters(parameters);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public Point m22033OooO0O0() {
        return this.f23711OooO00o;
    }

    public int OooO0O0() {
        return this.f23709OooO00o;
    }

    private void OooO0O0(Camera.Parameters parameters) {
        String str = parameters.get("zoom-supported");
        if (str == null || Boolean.parseBoolean(str)) {
            int i = 27;
            String str2 = parameters.get("max-zoom");
            if (str2 != null) {
                try {
                    int parseDouble = (int) (Double.parseDouble(str2) * 10.0d);
                    if (27 > parseDouble) {
                        i = parseDouble;
                    }
                } catch (NumberFormatException unused) {
                    DebugLog.OooO0o0("Bad max-zoom: " + str2);
                }
            }
            String str3 = parameters.get("taking-picture-zoom-max");
            if (str3 != null) {
                try {
                    int parseInt = Integer.parseInt(str3);
                    if (i > parseInt) {
                        i = parseInt;
                    }
                } catch (NumberFormatException unused2) {
                    DebugLog.OooO0o0("Bad taking-picture-zoom-max: " + str3);
                }
            }
            String str4 = parameters.get("mot-zoom-values");
            if (str4 != null) {
                i = OooO00o(str4, i);
            }
            String str5 = parameters.get("mot-zoom-step");
            if (str5 != null) {
                try {
                    int parseDouble2 = (int) (Double.parseDouble(str5.trim()) * 10.0d);
                    if (parseDouble2 > 1) {
                        i -= i % parseDouble2;
                    }
                } catch (NumberFormatException unused3) {
                }
            }
            if (!(str2 == null && str4 == null)) {
                double d = (double) i;
                Double.isNaN(d);
                parameters.set("zoom", String.valueOf(d / 10.0d));
            }
            if (str3 != null) {
                parameters.set("taking-picture-zoom", i);
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Point m22031OooO00o() {
        return this.f23714OooO0O0;
    }

    public int OooO00o() {
        return this.f23713OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m22032OooO00o() {
        return this.f23712OooO00o;
    }

    public static Point OooO00o(Camera.Parameters parameters, Point point) {
        String str = parameters.get("preview-size-values");
        if (str == null) {
            str = parameters.get("preview-size-value");
        }
        Point point2 = null;
        if (str != null) {
            DebugLog.m22048OooO00o("preview-size-values parameter: " + str);
            DebugLog.m22048OooO00o("preview-size-values parameter: " + str);
            point2 = OooO00o(str, point);
            DebugLog.m22048OooO00o("BestPreviewSizeValue: " + point2);
        }
        return point2 == null ? new Point((point.x >> 3) << 3, (point.y >> 3) << 3) : point2;
    }

    public static Point OooO00o(CharSequence charSequence, Point point) {
        int i;
        String[] strArr;
        int i2;
        double d = (double) point.x;
        int i3 = point.y;
        double d2 = (double) i3;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        String[] split = OooO00o.split(charSequence);
        int length = split.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        double d4 = Double.MAX_VALUE;
        while (i5 < length) {
            String trim = split[i5].trim();
            int indexOf = trim.indexOf(120);
            if (indexOf < 0) {
                DebugLog.OooO0o0("Bad preview-size: " + trim);
                strArr = split;
                i = length;
                i2 = i5;
            } else {
                try {
                    int parseInt = Integer.parseInt(trim.substring(i4, indexOf));
                    int parseInt2 = Integer.parseInt(trim.substring(indexOf + 1));
                    i2 = i5;
                    double d5 = (double) parseInt;
                    strArr = split;
                    i = length;
                    double d6 = (double) parseInt2;
                    Double.isNaN(d5);
                    Double.isNaN(d6);
                    if (Math.abs((d5 / d6) - d3) <= 0.1d) {
                        int i8 = parseInt2 - i3;
                        if (((double) Math.abs(i8)) < d4) {
                            d4 = (double) Math.abs(i8);
                            i7 = parseInt2;
                            i6 = parseInt;
                        }
                    }
                } catch (NumberFormatException unused) {
                    strArr = split;
                    i = length;
                    i2 = i5;
                    DebugLog.OooO0o0("Bad preview-size: " + trim);
                }
            }
            i5 = i2 + 1;
            split = strArr;
            length = i;
            i4 = 0;
        }
        if (i6 == 0 && i7 == 0) {
            double d7 = Double.MAX_VALUE;
            for (String str : OooO00o.split(charSequence)) {
                String trim2 = str.trim();
                int indexOf2 = trim2.indexOf(120);
                if (indexOf2 < 0) {
                    DebugLog.OooO0o0("Bad preview-size: " + trim2);
                } else {
                    try {
                        int parseInt3 = Integer.parseInt(trim2.substring(0, indexOf2));
                        int parseInt4 = Integer.parseInt(trim2.substring(indexOf2 + 1));
                        int i9 = parseInt4 - i3;
                        if (((double) Math.abs(i9)) < d7) {
                            i7 = parseInt4;
                            d7 = (double) Math.abs(i9);
                            i6 = parseInt3;
                        }
                    } catch (NumberFormatException unused2) {
                        DebugLog.OooO0o0("Bad preview-size: " + trim2);
                    }
                }
            }
        }
        if (i6 <= 0 || i7 <= 0) {
            return null;
        }
        return new Point(i6, i7);
    }

    public static int OooO00o(CharSequence charSequence, int i) {
        int i2 = 0;
        for (String str : OooO00o.split(charSequence)) {
            try {
                double parseDouble = Double.parseDouble(str.trim());
                int i3 = (int) (10.0d * parseDouble);
                double d = (double) i;
                Double.isNaN(d);
                if (Math.abs(d - parseDouble) < ((double) Math.abs(i - i2))) {
                    i2 = i3;
                }
            } catch (NumberFormatException unused) {
                return i;
            }
        }
        return i2;
    }

    private void OooO00o(Camera.Parameters parameters) {
        if (!Build.MODEL.contains("Behold II") || CameraManager.OooO0o0 != 3) {
            parameters.set("flash-value", 2);
        } else {
            parameters.set("flash-value", 1);
        }
        parameters.set("flash-mode", "off");
    }
}
