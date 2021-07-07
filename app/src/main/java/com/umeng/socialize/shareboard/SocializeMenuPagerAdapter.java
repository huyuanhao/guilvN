package com.umeng.socialize.shareboard;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.p118pd.sdk.AbstractC7314o0O0Oo0O;
import java.util.ArrayList;
import java.util.List;

public class SocializeMenuPagerAdapter extends AbstractC7314o0O0Oo0O {
    public Context mContext;
    public ShareBoardMenuHelper mMenuHelper;
    public List<SnsPlatform[][]> mPageData;

    public SocializeMenuPagerAdapter(Context context, ShareBoardConfig shareBoardConfig) {
        this(context, shareBoardConfig, null);
    }

    @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
    public int getCount() {
        List<SnsPlatform[][]> list = this.mPageData;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        View createPageLayout = this.mMenuHelper.createPageLayout(this.mContext, this.mPageData.get(i));
        viewGroup.addView(createPageLayout);
        return createPageLayout;
    }

    @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public void setData(List<SnsPlatform> list) {
        this.mPageData.clear();
        if (list != null) {
            this.mPageData.addAll(this.mMenuHelper.formatPageData(list));
        }
        notifyDataSetChanged();
    }

    public SocializeMenuPagerAdapter(Context context, ShareBoardConfig shareBoardConfig, List<SnsPlatform> list) {
        this.mPageData = new ArrayList();
        this.mContext = context;
        this.mMenuHelper = new ShareBoardMenuHelper(shareBoardConfig);
        setData(list);
    }
}
