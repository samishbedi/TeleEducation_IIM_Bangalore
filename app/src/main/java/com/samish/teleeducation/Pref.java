package com.samish.teleeducation;

import android.content.Context;
import android.preference.SwitchPreference;
import android.util.AttributeSet;

/**
 * Created by samish on 29/6/15.
 */
public class Pref extends SwitchPreference {
    public Pref(Context context) {
        super(context);
    }

    public Pref(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Pref(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
}
