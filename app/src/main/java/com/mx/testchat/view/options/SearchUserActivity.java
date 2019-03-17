package com.mx.testchat.view.options;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mx.testim.R;
import com.netease.nimlib.sdk.uinfo.model.NimUserInfo;

public class SearchUserActivity extends AppCompatActivity {

    private NimUserInfo mUser;

    public static final String SEARCH_TYPE = "search_type";
    public boolean isSearchUserLocal = SEARCH_USER_LOCAL;
    public static final boolean SEARCH_USER_LOCAL = true;
    public static final boolean SEARCH_USER_REMOTE = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_user);
    }
}
