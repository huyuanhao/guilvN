package com.facebook.react.devsupport;

import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.SpannedString;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.common.logging.FLog;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.C0587R;
import com.facebook.react.bridge.PromiseImpl;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.devsupport.RedBoxHandler;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.devsupport.interfaces.StackFrame;
import javax.annotation.Nullable;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.json.JSONObject;

public class RedBoxDialog extends Dialog implements AdapterView.OnItemClickListener {
    public boolean isReporting = false;
    public Button mCopyToClipboardButton;
    public final DevSupportManager mDevSupportManager;
    public Button mDismissButton;
    public final DoubleTapReloadRecognizer mDoubleTapReloadRecognizer;
    @Nullable
    public View mLineSeparator;
    @Nullable
    public ProgressBar mLoadingIndicator;
    @Nullable
    public final RedBoxHandler mRedBoxHandler;
    public Button mReloadJsButton;
    @Nullable
    public Button mReportButton;
    public View.OnClickListener mReportButtonOnClickListener = new View.OnClickListener() {
        /* class com.facebook.react.devsupport.RedBoxDialog.View$OnClickListenerC07272 */

        public void onClick(View view) {
            if (RedBoxDialog.this.mRedBoxHandler != null && RedBoxDialog.this.mRedBoxHandler.isReportEnabled() && !RedBoxDialog.this.isReporting) {
                RedBoxDialog.this.isReporting = true;
                ((TextView) Assertions.assertNotNull(RedBoxDialog.this.mReportTextView)).setText("Reporting...");
                ((TextView) Assertions.assertNotNull(RedBoxDialog.this.mReportTextView)).setVisibility(0);
                ((ProgressBar) Assertions.assertNotNull(RedBoxDialog.this.mLoadingIndicator)).setVisibility(0);
                ((View) Assertions.assertNotNull(RedBoxDialog.this.mLineSeparator)).setVisibility(0);
                ((Button) Assertions.assertNotNull(RedBoxDialog.this.mReportButton)).setEnabled(false);
                RedBoxDialog.this.mRedBoxHandler.reportRedbox(view.getContext(), (String) Assertions.assertNotNull(RedBoxDialog.this.mDevSupportManager.getLastErrorTitle()), (StackFrame[]) Assertions.assertNotNull(RedBoxDialog.this.mDevSupportManager.getLastErrorStack()), RedBoxDialog.this.mDevSupportManager.getSourceUrl(), (RedBoxHandler.ReportCompletedListener) Assertions.assertNotNull(RedBoxDialog.this.mReportCompletedListener));
            }
        }
    };
    public RedBoxHandler.ReportCompletedListener mReportCompletedListener = new RedBoxHandler.ReportCompletedListener() {
        /* class com.facebook.react.devsupport.RedBoxDialog.C07261 */

        @Override // com.facebook.react.devsupport.RedBoxHandler.ReportCompletedListener
        public void onReportError(SpannedString spannedString) {
            RedBoxDialog.this.isReporting = false;
            ((Button) Assertions.assertNotNull(RedBoxDialog.this.mReportButton)).setEnabled(true);
            ((ProgressBar) Assertions.assertNotNull(RedBoxDialog.this.mLoadingIndicator)).setVisibility(8);
            ((TextView) Assertions.assertNotNull(RedBoxDialog.this.mReportTextView)).setText(spannedString);
        }

        @Override // com.facebook.react.devsupport.RedBoxHandler.ReportCompletedListener
        public void onReportSuccess(SpannedString spannedString) {
            RedBoxDialog.this.isReporting = false;
            ((Button) Assertions.assertNotNull(RedBoxDialog.this.mReportButton)).setEnabled(true);
            ((ProgressBar) Assertions.assertNotNull(RedBoxDialog.this.mLoadingIndicator)).setVisibility(8);
            ((TextView) Assertions.assertNotNull(RedBoxDialog.this.mReportTextView)).setText(spannedString);
        }
    };
    @Nullable
    public TextView mReportTextView;
    public ListView mStackView;

    public static class CopyToHostClipBoardTask extends AsyncTask<String, Void, Void> {
        public final DevSupportManager mDevSupportManager;

        public CopyToHostClipBoardTask(DevSupportManager devSupportManager) {
            this.mDevSupportManager = devSupportManager;
        }

        public Void doInBackground(String... strArr) {
            try {
                String uri = Uri.parse(this.mDevSupportManager.getSourceUrl()).buildUpon().path("/copy-to-clipboard").query(null).build().toString();
                for (String str : strArr) {
                    new OkHttpClient().newCall(new Request.Builder().url(uri).post(RequestBody.create((MediaType) null, str)).build()).execute();
                }
            } catch (Exception e) {
                FLog.m874e(ReactConstants.TAG, "Could not copy to the host clipboard", e);
            }
            return null;
        }
    }

    public static class OpenStackFrameTask extends AsyncTask<StackFrame, Void, Void> {
        public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
        public final DevSupportManager mDevSupportManager;

        public static JSONObject stackFrameToJson(StackFrame stackFrame) {
            return new JSONObject(MapBuilder.m949of("file", stackFrame.getFile(), PromiseImpl.STACK_FRAME_KEY_METHOD_NAME, stackFrame.getMethod(), "lineNumber", Integer.valueOf(stackFrame.getLine()), StackTraceHelper.COLUMN_KEY, Integer.valueOf(stackFrame.getColumn())));
        }

        public OpenStackFrameTask(DevSupportManager devSupportManager) {
            this.mDevSupportManager = devSupportManager;
        }

        public Void doInBackground(StackFrame... stackFrameArr) {
            try {
                String uri = Uri.parse(this.mDevSupportManager.getSourceUrl()).buildUpon().path("/open-stack-frame").query(null).build().toString();
                OkHttpClient okHttpClient = new OkHttpClient();
                for (StackFrame stackFrame : stackFrameArr) {
                    okHttpClient.newCall(new Request.Builder().url(uri).post(RequestBody.create(JSON, stackFrameToJson(stackFrame).toString())).build()).execute();
                }
            } catch (Exception e) {
                FLog.m874e(ReactConstants.TAG, "Could not open stack frame", e);
            }
            return null;
        }
    }

    public static class StackAdapter extends BaseAdapter {
        public static final int VIEW_TYPE_COUNT = 2;
        public static final int VIEW_TYPE_STACKFRAME = 1;
        public static final int VIEW_TYPE_TITLE = 0;
        public final StackFrame[] mStack;
        public final String mTitle;

        public static class FrameViewHolder {
            public final TextView mFileView;
            public final TextView mMethodView;

            public FrameViewHolder(View view) {
                this.mMethodView = (TextView) view.findViewById(C0587R.C0590id.rn_frame_method);
                this.mFileView = (TextView) view.findViewById(C0587R.C0590id.rn_frame_file);
            }
        }

        public StackAdapter(String str, StackFrame[] stackFrameArr) {
            this.mTitle = str;
            this.mStack = stackFrameArr;
        }

        public boolean areAllItemsEnabled() {
            return false;
        }

        public int getCount() {
            return this.mStack.length + 1;
        }

        public Object getItem(int i) {
            return i == 0 ? this.mTitle : this.mStack[i - 1];
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public int getItemViewType(int i) {
            return i == 0 ? 0 : 1;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            TextView textView;
            if (i == 0) {
                if (view != null) {
                    textView = (TextView) view;
                } else {
                    textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C0587R.layout.redbox_item_title, viewGroup, false);
                }
                textView.setText(this.mTitle);
                return textView;
            }
            if (view == null) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(C0587R.layout.redbox_item_frame, viewGroup, false);
                view.setTag(new FrameViewHolder(view));
            }
            StackFrame stackFrame = this.mStack[i - 1];
            FrameViewHolder frameViewHolder = (FrameViewHolder) view.getTag();
            frameViewHolder.mMethodView.setText(stackFrame.getMethod());
            frameViewHolder.mFileView.setText(StackTraceHelper.formatFrameSource(stackFrame));
            return view;
        }

        public int getViewTypeCount() {
            return 2;
        }

        public boolean isEnabled(int i) {
            return i > 0;
        }
    }

    public RedBoxDialog(Context context, DevSupportManager devSupportManager, @Nullable RedBoxHandler redBoxHandler) {
        super(context, C0587R.style.Theme_Catalyst_RedBox);
        requestWindowFeature(1);
        setContentView(C0587R.layout.redbox_view);
        this.mDevSupportManager = devSupportManager;
        this.mDoubleTapReloadRecognizer = new DoubleTapReloadRecognizer();
        this.mRedBoxHandler = redBoxHandler;
        ListView listView = (ListView) findViewById(C0587R.C0590id.rn_redbox_stack);
        this.mStackView = listView;
        listView.setOnItemClickListener(this);
        Button button = (Button) findViewById(C0587R.C0590id.rn_redbox_reload_button);
        this.mReloadJsButton = button;
        button.setOnClickListener(new View.OnClickListener() {
            /* class com.facebook.react.devsupport.RedBoxDialog.View$OnClickListenerC07283 */

            public void onClick(View view) {
                RedBoxDialog.this.mDevSupportManager.handleReloadJS();
            }
        });
        Button button2 = (Button) findViewById(C0587R.C0590id.rn_redbox_dismiss_button);
        this.mDismissButton = button2;
        button2.setOnClickListener(new View.OnClickListener() {
            /* class com.facebook.react.devsupport.RedBoxDialog.View$OnClickListenerC07294 */

            public void onClick(View view) {
                RedBoxDialog.this.dismiss();
            }
        });
        Button button3 = (Button) findViewById(C0587R.C0590id.rn_redbox_copy_button);
        this.mCopyToClipboardButton = button3;
        button3.setOnClickListener(new View.OnClickListener() {
            /* class com.facebook.react.devsupport.RedBoxDialog.View$OnClickListenerC07305 */

            public void onClick(View view) {
                String lastErrorTitle = RedBoxDialog.this.mDevSupportManager.getLastErrorTitle();
                StackFrame[] lastErrorStack = RedBoxDialog.this.mDevSupportManager.getLastErrorStack();
                Assertions.assertNotNull(lastErrorTitle);
                Assertions.assertNotNull(lastErrorStack);
                new CopyToHostClipBoardTask(RedBoxDialog.this.mDevSupportManager).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, StackTraceHelper.formatStackTrace(lastErrorTitle, lastErrorStack));
            }
        });
        RedBoxHandler redBoxHandler2 = this.mRedBoxHandler;
        if (redBoxHandler2 != null && redBoxHandler2.isReportEnabled()) {
            this.mLoadingIndicator = (ProgressBar) findViewById(C0587R.C0590id.rn_redbox_loading_indicator);
            this.mLineSeparator = findViewById(C0587R.C0590id.rn_redbox_line_separator);
            TextView textView = (TextView) findViewById(C0587R.C0590id.rn_redbox_report_label);
            this.mReportTextView = textView;
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            this.mReportTextView.setHighlightColor(0);
            Button button4 = (Button) findViewById(C0587R.C0590id.rn_redbox_report_button);
            this.mReportButton = button4;
            button4.setOnClickListener(this.mReportButtonOnClickListener);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        new OpenStackFrameTask(this.mDevSupportManager).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (StackFrame) this.mStackView.getAdapter().getItem(i));
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 82) {
            this.mDevSupportManager.showDevOptionsDialog();
            return true;
        }
        if (this.mDoubleTapReloadRecognizer.didDoubleTapR(i, getCurrentFocus())) {
            this.mDevSupportManager.handleReloadJS();
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void resetReporting() {
        RedBoxHandler redBoxHandler = this.mRedBoxHandler;
        if (redBoxHandler != null && redBoxHandler.isReportEnabled()) {
            this.isReporting = false;
            ((TextView) Assertions.assertNotNull(this.mReportTextView)).setVisibility(8);
            ((ProgressBar) Assertions.assertNotNull(this.mLoadingIndicator)).setVisibility(8);
            ((View) Assertions.assertNotNull(this.mLineSeparator)).setVisibility(8);
            ((Button) Assertions.assertNotNull(this.mReportButton)).setVisibility(0);
            ((Button) Assertions.assertNotNull(this.mReportButton)).setEnabled(true);
        }
    }

    public void setExceptionDetails(String str, StackFrame[] stackFrameArr) {
        this.mStackView.setAdapter((ListAdapter) new StackAdapter(str, stackFrameArr));
    }
}
