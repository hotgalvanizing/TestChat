package com.mx.testchat.nimsdk;

import android.content.Context;

import com.netease.nimlib.sdk.StatusBarNotificationConfig;

/**
 * 用户信息缓存
 */
public class UserCacheUtil {

    private static Context context;
    private static String account;

    private static StatusBarNotificationConfig notificationConfig;

    public static void clear() {
        account = null;
        NimAccountSDK.removeUserInfo();
    }

    public static String getAccount() {
        return account;
    }

    public static void setAccount(String account) {
        UserCacheUtil.account = account;
    }

    public static void setNotificationConfig(StatusBarNotificationConfig notificationConfig) {
        UserCacheUtil.notificationConfig = notificationConfig;
    }

    public static StatusBarNotificationConfig getNotificationConfig() {
        return notificationConfig;
    }

    public static Context getContext() {
        return context;
    }

    public static void setContext(Context context) {
        UserCacheUtil.context = context.getApplicationContext();
    }
}
