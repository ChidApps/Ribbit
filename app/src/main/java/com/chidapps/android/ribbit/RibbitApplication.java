package com.chidapps.android.ribbit;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by Carlos on 18/10/2014.
 */
public class RibbitApplication extends Application{

    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "CcqU8orkP6ao9X1MRzbnzdlUVEnqM6KmYLzGG4Jw", "4mU5WXlbLsrdR4LobbyfNUj6fzwsmwVoUMnBxDv6");
    }

}
