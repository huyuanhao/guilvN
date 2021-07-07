package com.qiyukf.nim.uikit.session.viewholder;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.qiyukf.nim.uikit.C1877b;
import com.qiyukf.nim.uikit.common.p145a.AbstractC1883f;
import com.qiyukf.nim.uikit.common.p150ui.imageview.HeadImageView;
import com.qiyukf.nim.uikit.session.module.p153a.C2044b;
import com.qiyukf.nimlib.sdk.NIMClient;
import com.qiyukf.nimlib.sdk.msg.MsgService;
import com.qiyukf.nimlib.sdk.msg.constant.MsgDirectionEnum;
import com.qiyukf.nimlib.sdk.msg.model.IMMessage;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.UICustomization;
import com.qiyukf.unicorn.api.msg.attachment.FileAttachment;
import com.qiyukf.unicorn.p231j.C2690a;
import com.qiyukf.unicorn.p232k.C2715m;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.qiyukf.nim.uikit.session.viewholder.b */
public abstract class AbstractC2083b extends AbstractC1883f {
    public View alertButton;
    public HeadImageView avatarLeft;
    public HeadImageView avatarRight;
    public MsgContainerLayout contentContainer;
    public View ivTrashIcon;
    public View.OnLongClickListener longClickListener;
    public IMMessage message;
    public TextView nameTextView;
    public ProgressBar progressBar;
    public TextView timeTextView;
    public TextView tvMessageItemReadStatus;
    public TextView tvTrashTips;
    public LinearLayout ysfLlMessageItemQuickContainer;

    /* renamed from: com.qiyukf.nim.uikit.session.viewholder.b$6 */
    public static /* synthetic */ class C20896 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4202a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.qiyukf.unicorn.api.msg.MsgStatusEnum[] r0 = com.qiyukf.unicorn.api.msg.MsgStatusEnum.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b.C20896.f4202a = r0
                com.qiyukf.unicorn.api.msg.MsgStatusEnum r1 = com.qiyukf.unicorn.api.msg.MsgStatusEnum.fail     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b.C20896.f4202a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.qiyukf.unicorn.api.msg.MsgStatusEnum r1 = com.qiyukf.unicorn.api.msg.MsgStatusEnum.sending     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b.C20896.f4202a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.qiyukf.unicorn.api.msg.MsgStatusEnum r1 = com.qiyukf.unicorn.api.msg.MsgStatusEnum.read     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b.C20896.f4202a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.qiyukf.unicorn.api.msg.MsgStatusEnum r1 = com.qiyukf.unicorn.api.msg.MsgStatusEnum.unread     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b.C20896.<clinit>():void");
        }
    }

    private void setContent() {
        LinearLayout linearLayout = (LinearLayout) this.view.findViewById(C2364R.C2367id.ysf_message_item_body);
        int childCount = isReceivedMessage() ? 0 : linearLayout.getChildCount() - 1;
        View childAt = linearLayout.getChildAt(childCount);
        MsgContainerLayout msgContainerLayout = this.contentContainer;
        if (childAt != msgContainerLayout) {
            linearLayout.removeView(msgContainerLayout);
            linearLayout.addView(this.contentContainer, childCount);
        }
        if (isMiddleItem()) {
            setGravity(linearLayout, 17);
        } else if (isReceivedMessage()) {
            setGravity(linearLayout, 3);
            this.contentContainer.setBackgroundResource(leftBackground());
        } else {
            setGravity(linearLayout, 5);
            this.contentContainer.setBackgroundResource(rightBackground());
            C2690a.m6219a().mo36459a(this.contentContainer);
        }
    }

    private void setHeadImageView() {
        HeadImageView headImageView = isReceivedMessage() ? this.avatarLeft : this.avatarRight;
        HeadImageView headImageView2 = isReceivedMessage() ? this.avatarRight : this.avatarLeft;
        if (!showAvatar()) {
            headImageView.setVisibility(8);
        } else {
            headImageView.setVisibility(0);
            String fromAccount = this.message.getFromAccount();
            this.message.getUuid();
            headImageView.mo34303a(fromAccount);
        }
        headImageView2.setVisibility(8);
    }

    private void setLongClickListener() {
        View$OnLongClickListenerC20874 r0 = new View.OnLongClickListener() {
            /* class com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b.View$OnLongClickListenerC20874 */

            public final boolean onLongClick(View view) {
                if (AbstractC2083b.this.onItemLongClick() || AbstractC2083b.this.getAdapter().mo34518e() == null) {
                    return false;
                }
                C2044b.AbstractC2047b e = AbstractC2083b.this.getAdapter().mo34518e();
                View unused = AbstractC2083b.this.view;
                e.mo34507b(AbstractC2083b.this.message);
                return true;
            }
        };
        this.longClickListener = r0;
        this.contentContainer.setOnLongClickListener(r0);
        if (C1877b.m3582c() != null) {
            View$OnLongClickListenerC20885 r02 = new View.OnLongClickListener() {
                /* class com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b.View$OnLongClickListenerC20885 */

                public final boolean onLongClick(View view) {
                    Context unused = AbstractC2083b.this.context;
                    return true;
                }
            };
            this.avatarLeft.setOnLongClickListener(r02);
            this.avatarRight.setOnLongClickListener(r02);
        }
    }

    private void setNameTextView() {
        this.nameTextView.setVisibility(8);
    }

    private void setOnClickListener() {
        if (getAdapter().mo34518e() != null) {
            this.alertButton.setOnClickListener(new View.OnClickListener() {
                /* class com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b.View$OnClickListenerC20841 */

                public final void onClick(View view) {
                    AbstractC2083b.this.getAdapter().mo34518e().mo34503a(AbstractC2083b.this.message);
                }
            });
        }
        this.contentContainer.setOnClickListener(new View.OnClickListener() {
            /* class com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b.View$OnClickListenerC20852 */

            public final void onClick(View view) {
                AbstractC2083b.this.onItemClick();
            }
        });
        if (C1877b.m3582c() != null) {
            View$OnClickListenerC20863 r0 = new View.OnClickListener() {
                /* class com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b.View$OnClickListenerC20863 */

                public final void onClick(View view) {
                    Context unused = AbstractC2083b.this.context;
                }
            };
            this.avatarLeft.setOnClickListener(r0);
            this.avatarRight.setOnClickListener(r0);
        }
    }

    private void setQuickEntryContainer() {
        LinearLayout linearLayout;
        int i;
        if (isShowQuickEntry()) {
            linearLayout = this.ysfLlMessageItemQuickContainer;
            i = 0;
        } else {
            linearLayout = this.ysfLlMessageItemQuickContainer;
            i = 8;
        }
        linearLayout.setVisibility(i);
    }

    private void setTimeTextView() {
        String str;
        if (getAdapter().mo34516c(this.message)) {
            this.timeTextView.setVisibility(0);
            Date date = new Date(this.message.getTime());
            Date date2 = new Date();
            Calendar instance = Calendar.getInstance();
            instance.set(11, 0);
            instance.set(12, 0);
            instance.set(13, 0);
            instance.set(14, 0);
            Date time = instance.getTime();
            Date date3 = new Date(time.getTime() - 86400000);
            Date date4 = new Date(date3.getTime() - 86400000);
            if (!date.before(time)) {
                str = "今天";
            } else if (!date.before(date3)) {
                str = "昨天";
            } else if (!date.before(date4)) {
                str = "前天";
            } else {
                Calendar instance2 = Calendar.getInstance();
                Calendar instance3 = Calendar.getInstance();
                instance2.setTime(date);
                instance3.setTime(date2);
                int i = instance2.get(1) - instance3.get(1);
                if (i != 0 ? !(!(1 == i && 11 == instance3.get(2)) ? -1 == i && 11 == instance2.get(2) && instance2.get(3) == instance3.get(3) : instance2.get(3) == instance3.get(3)) : instance2.get(3) == instance3.get(3)) {
                    Calendar instance4 = Calendar.getInstance();
                    instance4.setTime(date);
                    str = new String[]{"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"}[instance4.get(7) - 1];
                } else {
                    str = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(date);
                }
            }
            String format = new SimpleDateFormat("HH:mm", Locale.getDefault()).format(date);
            this.timeTextView.setText(str + " " + format);
            return;
        }
        this.timeTextView.setVisibility(8);
    }

    private void setTrashTips() {
        String a = C2715m.m6277a(this.message);
        int i = 0;
        this.ivTrashIcon.setVisibility(TextUtils.isEmpty(a) ? 8 : 0);
        TextView textView = this.tvTrashTips;
        if (TextUtils.isEmpty(a)) {
            i = 8;
        }
        textView.setVisibility(i);
        this.tvTrashTips.setText(a);
        if (!TextUtils.isEmpty(a)) {
            this.tvMessageItemReadStatus.setVisibility(8);
        }
    }

    private void uiCustomize() {
        UICustomization uICustomization = C2452d.m5373e().uiCustomization;
        if (uICustomization != null) {
            this.avatarLeft.mo34316a(uICustomization.avatarShape);
            this.avatarRight.mo34316a(uICustomization.avatarShape);
            if (C2690a.m6219a().mo36462d() && C2690a.m6219a().mo36461c().mo35694f() == 1) {
                this.avatarLeft.setVisibility(8);
                this.avatarRight.setVisibility(8);
            }
            if (uICustomization.hideLeftAvatar) {
                this.avatarLeft.setVisibility(8);
            }
            if (uICustomization.hideRightAvatar) {
                this.avatarRight.setVisibility(8);
            }
            float f = uICustomization.tipsTextSize;
            if (f > 0.0f) {
                this.timeTextView.setTextSize(f);
            }
            int i = uICustomization.tipsTextColor;
            if (i != 0) {
                this.timeTextView.setTextColor(i);
            }
        }
    }

    public abstract void bindContentView();

    public void downloadAttachment() {
        if (this.message.getAttachment() != null && (this.message.getAttachment() instanceof FileAttachment)) {
            ((MsgService) NIMClient.getService(MsgService.class)).downloadAttachment(this.message, true);
        }
    }

    public <T extends View> T findViewById(int i) {
        return (T) this.view.findViewById(i);
    }

    @Override // com.qiyukf.nim.uikit.common.p145a.AbstractC1883f
    public final C2044b getAdapter() {
        return (C2044b) this.adapter;
    }

    public abstract int getContentResId();

    public long getMsgSessionId() {
        try {
            return Long.valueOf(this.message.getUuid().substring(0, this.message.getUuid().indexOf(35))).longValue();
        } catch (Exception unused) {
            return 0;
        }
    }

    public LinearLayout getQuickEntryContainer() {
        return this.ysfLlMessageItemQuickContainer;
    }

    @Override // com.qiyukf.nim.uikit.common.p145a.AbstractC1883f
    public final int getResId() {
        return C2364R.layout.ysf_message_item;
    }

    @Override // com.qiyukf.nim.uikit.common.p145a.AbstractC1883f
    public final void inflate() {
        this.timeTextView = (TextView) findViewById(C2364R.C2367id.ysf_message_item_time);
        this.avatarLeft = (HeadImageView) findViewById(C2364R.C2367id.ysf_message_item_portrait_left);
        this.avatarRight = (HeadImageView) findViewById(C2364R.C2367id.ysf_message_item_portrait_right);
        this.alertButton = findViewById(C2364R.C2367id.ysf_message_item_alert);
        this.progressBar = (ProgressBar) findViewById(C2364R.C2367id.ysf_message_item_progress);
        this.nameTextView = (TextView) findViewById(C2364R.C2367id.ysf_message_item_nickname);
        MsgContainerLayout msgContainerLayout = (MsgContainerLayout) findViewById(C2364R.C2367id.ysf_message_item_content);
        this.contentContainer = msgContainerLayout;
        msgContainerLayout.mo34591a(this);
        this.ivTrashIcon = findViewById(C2364R.C2367id.ysf_message_item_trash_icon);
        this.tvTrashTips = (TextView) findViewById(C2364R.C2367id.ysf_message_item_trash_tips);
        this.tvMessageItemReadStatus = (TextView) findViewById(C2364R.C2367id.tv_message_item_read_status);
        this.ysfLlMessageItemQuickContainer = (LinearLayout) findViewById(C2364R.C2367id.ysf_ll_message_item_quick_container);
        View.inflate(this.view.getContext(), getContentResId(), this.contentContainer);
        inflateContentView();
    }

    public abstract void inflateContentView();

    public boolean isMiddleItem() {
        return false;
    }

    public boolean isReceivedMessage() {
        return this.message.getDirect() == MsgDirectionEnum.In;
    }

    public boolean isShowQuickEntry() {
        return false;
    }

    public int leftBackground() {
        return C2364R.C2366drawable.ysf_msg_back_left_selector;
    }

    public void onDetached() {
    }

    public void onItemClick() {
    }

    public boolean onItemLongClick() {
        return false;
    }

    @Override // com.qiyukf.nim.uikit.common.p145a.AbstractC1883f
    public final void refresh(Object obj) {
        this.message = (IMMessage) obj;
        setHeadImageView();
        setNameTextView();
        setQuickEntryContainer();
        setTimeTextView();
        setStatus();
        setOnClickListener();
        setLongClickListener();
        setContent();
        setOnClickListener();
        setTrashTips();
        uiCustomize();
        bindContentView();
    }

    public void refreshCurrentItem() {
        IMMessage iMMessage = this.message;
        if (iMMessage != null) {
            refresh(iMMessage);
        }
    }

    public int rightBackground() {
        return C2364R.C2366drawable.ysf_msg_blue_back_rigth_selector;
    }

    public final void setGravity(View view, int i) {
        ((FrameLayout.LayoutParams) view.getLayoutParams()).gravity = i;
    }

    public void setLayoutParams(int i, int i2, View... viewArr) {
        for (View view : viewArr) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i2;
            view.setLayoutParams(layoutParams);
        }
    }

    public void setStatus() {
        int i = C20896.f4202a[this.message.getStatus().ordinal()];
        if (i == 1) {
            this.progressBar.setVisibility(8);
            this.alertButton.setVisibility(0);
            this.tvMessageItemReadStatus.setVisibility(8);
        } else if (i == 2) {
            this.progressBar.setVisibility(0);
            this.alertButton.setVisibility(8);
            this.tvMessageItemReadStatus.setVisibility(8);
        } else if (i != 3) {
            if (i != 4) {
                this.progressBar.setVisibility(8);
                this.alertButton.setVisibility(8);
                this.tvMessageItemReadStatus.setVisibility(8);
            } else if (C2452d.m5375g().mo36364n(this.message.getSessionId()) == null || !"1".equals(C2452d.m5375g().mo36364n(this.message.getSessionId()).mo35685a())) {
                this.progressBar.setVisibility(8);
                this.alertButton.setVisibility(8);
                this.tvMessageItemReadStatus.setVisibility(8);
            } else {
                this.progressBar.setVisibility(8);
                this.alertButton.setVisibility(8);
                this.tvMessageItemReadStatus.setVisibility(0);
                this.tvMessageItemReadStatus.setText("未读");
                this.tvMessageItemReadStatus.setTextColor(this.context.getResources().getColor(C2364R.C2365color.ysf_blue_337EFF));
            }
        } else if (C2452d.m5375g().mo36364n(this.message.getSessionId()) != null && "1".equals(C2452d.m5375g().mo36364n(this.message.getSessionId()).mo35685a())) {
            this.progressBar.setVisibility(8);
            this.alertButton.setVisibility(8);
            this.tvMessageItemReadStatus.setVisibility(0);
            this.tvMessageItemReadStatus.setText("已读");
            this.tvMessageItemReadStatus.setTextColor(Color.rgb(177, 177, 177));
        }
    }

    public boolean showAvatar() {
        return true;
    }
}
