package com.p118pd.sdk;

import android.graphics.drawable.GradientDrawable;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.modules.datepicker.DatePickerDialogModule;
import com.facebook.react.uimanager.ViewProps;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.DataSet;
import java.util.Locale;

/* renamed from: com.pd.sdk.oOoOo0o  reason: case insensitive filesystem */
public class C8367oOoOo0o {
    public static void OooO00o(AbstractC8194oOOo0OoO oooo0ooo, DataSet dataSet, ReadableMap readableMap) {
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, ViewProps.COLOR)) {
            dataSet.m19888OooO0OO(readableMap.getInt(ViewProps.COLOR));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Array, "colors")) {
            dataSet.OooO00o(C8368oOoOo0o0.m20049OooO00o(readableMap.getArray("colors")));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Boolean, "drawValues")) {
            dataSet.OooO0O0(readableMap.getBoolean("drawValues"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Boolean, "highlightEnabled")) {
            dataSet.OooO00o(readableMap.getBoolean("highlightEnabled"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Boolean, ViewProps.VISIBLE)) {
            dataSet.OooO0o(readableMap.getBoolean(ViewProps.VISIBLE));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "valueTextSize")) {
            dataSet.OooO0O0((float) readableMap.getDouble("valueTextSize"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "valueTextColor")) {
            dataSet.m19884OooO00o(readableMap.getInt("valueTextColor"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.String, "valueFormatter")) {
            String string = readableMap.getString("valueFormatter");
            if ("largeValue".equals(string)) {
                dataSet.OooO00o(new C8236oOOoo0());
            } else if ("percent".equals(string)) {
                dataSet.OooO00o(new C8242oOOoo0O0());
            } else if (DatePickerDialogModule.ARG_DATE.equals(string)) {
                dataSet.OooO00o(new C8357oOoOOooO(readableMap.getString("valueFormatterPattern")));
            } else {
                dataSet.OooO00o(new C8355oOoOOoo(string));
            }
        } else if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Array, "valueFormatter")) {
            dataSet.OooO00o(new C8358oOoOOooo(C8368oOoOo0o0.m20050OooO00o(readableMap.getArray("valueFormatter"))));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.String, "axisDependency")) {
            dataSet.OooO00o(YAxis.AxisDependency.valueOf(readableMap.getString("axisDependency").toUpperCase(Locale.ENGLISH)));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.String, "fontFamily")) {
            dataSet.OooO00o(C8359oOoOo.OooO00o(oooo0ooo, readableMap));
        }
    }

    public static void OooO00o(AbstractC8212oOOoO0oo ooooo0oo, ReadableMap readableMap) {
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "highlightColor")) {
            ooooo0oo.OooO0Oo(readableMap.getInt("highlightColor"));
        }
    }

    public static void OooO00o(AbstractC8223oOOoOOoo oooooooo, ReadableMap readableMap) {
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Boolean, "drawHighlightIndicators")) {
            oooooooo.OooO0oO(readableMap.getBoolean("drawHighlightIndicators"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Boolean, "drawVerticalHighlightIndicator")) {
            oooooooo.OooO(readableMap.getBoolean("drawVerticalHighlightIndicator"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Boolean, "drawHorizontalHighlightIndicator")) {
            oooooooo.OooO0oo(readableMap.getBoolean("drawHorizontalHighlightIndicator"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "highlightLineWidth")) {
            oooooooo.OooO0o0((float) readableMap.getDouble("highlightLineWidth"));
        }
    }

    public static void OooO00o(AbstractC8222oOOoOOoO oooooooo, ReadableMap readableMap) {
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Map, "fillGradient")) {
            int[] OooO00o = C8368oOoOo0o0.m20049OooO00o(readableMap.getMap("fillGradient").getArray("colors"));
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.BOTTOM_TOP;
            String string = readableMap.getMap("fillGradient").getString("orientation");
            char c = 65535;
            switch (string.hashCode()) {
                case -1196165855:
                    if (string.equals("BOTTOM_TOP")) {
                        c = 4;
                        break;
                    }
                    break;
                case -873241494:
                    if (string.equals("RIGHT_LEFT")) {
                        c = 2;
                        break;
                    }
                    break;
                case -434150460:
                    if (string.equals("LEFT_RIGHT")) {
                        c = 6;
                        break;
                    }
                    break;
                case 63310483:
                    if (string.equals("BL_TR")) {
                        c = 5;
                        break;
                    }
                    break;
                case 63489223:
                    if (string.equals("BR_TL")) {
                        c = 3;
                        break;
                    }
                    break;
                case 79933303:
                    if (string.equals("TL_BR")) {
                        c = 7;
                        break;
                    }
                    break;
                case 80112043:
                    if (string.equals("TR_BL")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1982197877:
                    if (string.equals("TOP_BOTTOM")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    orientation = GradientDrawable.Orientation.BOTTOM_TOP;
                    break;
                case 1:
                    orientation = GradientDrawable.Orientation.TR_BL;
                    break;
                case 2:
                    orientation = GradientDrawable.Orientation.RIGHT_LEFT;
                    break;
                case 3:
                    orientation = GradientDrawable.Orientation.BR_TL;
                    break;
                case 4:
                    orientation = GradientDrawable.Orientation.BOTTOM_TOP;
                    break;
                case 5:
                    orientation = GradientDrawable.Orientation.BL_TR;
                    break;
                case 6:
                    orientation = GradientDrawable.Orientation.LEFT_RIGHT;
                    break;
                case 7:
                    orientation = GradientDrawable.Orientation.TL_BR;
                    break;
            }
            GradientDrawable gradientDrawable = new GradientDrawable(orientation, OooO00o);
            gradientDrawable.setCornerRadius(0.0f);
            oooooooo.OooO00o(gradientDrawable);
        } else if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "fillColor")) {
            oooooooo.OooO0o(readableMap.getInt("fillColor"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "fillAlpha")) {
            oooooooo.OooO0o0(readableMap.getInt("fillAlpha"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Boolean, "drawFilled")) {
            oooooooo.OooO0Oo(readableMap.getBoolean("drawFilled"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "lineWidth")) {
            float f = (float) readableMap.getDouble("lineWidth");
            if (f >= 0.2f && f < 10.0f) {
                oooooooo.OooO0o(f);
            }
        }
    }
}
