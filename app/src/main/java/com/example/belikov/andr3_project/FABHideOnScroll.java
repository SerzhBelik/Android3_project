package com.example.belikov.andr3_project;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;

public class FABHideOnScroll extends FloatingActionButton.Behavior {
    public FABHideOnScroll(Context context, AttributeSet attrs) {
        super();
    }

    @SuppressLint("RestrictedApi")
    @Override
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, FloatingActionButton child, View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
        super.onNestedScroll(coordinatorLayout, child, target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed);
        //child -> Floating Action Button
        if (dyConsumed > 0) {
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) child.getLayoutParams();
            int fabRightMargin = layoutParams.rightMargin;
            child.animate().translationX(child.getWidth() + fabRightMargin).setInterpolator(new LinearInterpolator());
        } else if (dyConsumed < 0) {
            child.animate().translationX(0).setInterpolator(new LinearInterpolator()).start();
        }
    }
    @Override
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, FloatingActionButton child, View directTargetChild, View target, int nestedScrollAxes) {
        return nestedScrollAxes == ViewCompat.SCROLL_AXIS_VERTICAL;
    }
}
