package com.mx.testchat;

import com.mx.testchat.utils.LogUtils;

public class AppConst {

    public static final class Account {
        public static final String KEY_USER_ACCOUNT = "account";
        public static final String KEY_USER_TOKEN = "token";
    }


    public static final class Url {
        //帮助与反馈
        public static final String HELP_FEEDBACK = "https://kf.qq.com/touch/product/wechat_app.html?scene_id=kf338&code=021njRdi0RdQfk1Khybi0kEQdi0njRde&state=123";
        //购物
        public static final String SHOP = "http://wqs.jd.com/portal/wx/portal_indexV4.shtml?PTAG=17007.13.1&ptype=1";
        //游戏
        public static final String GAME = "http://h.4399.com/android";
    }

    //我的群成员信息拓展字段
    public static final class MyTeamMemberExt {
        public static final String SHOULD_SHOW_NICK_NAME = "shouldShowNickName";
    }

    public static final String TAG = "CSDN_LQR";

    public static final int DEBUGLEVEL = LogUtils.LEVEL_ALL;//日志输出级别
}
