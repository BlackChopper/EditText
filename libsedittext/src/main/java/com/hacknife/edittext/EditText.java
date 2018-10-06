package com.hacknife.edittext;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/**
 * author  : Black Chopper
 * e-mail  : 4884280@qq.com
 * github  : http://github.com/BlackChopper
 * project : EditText
 */
@SuppressLint("AppCompatCustomView")
public class EditText extends android.widget.EditText {
    private int mDrawableWidth;
    private int mDrawableHeight;
    private Drawable mDrawableTop;
    private Drawable mDrawableBottom;
    private Drawable mDrawableLeft;
    private Drawable mDrawableRight;
    private int mDrawableMarginTop;
    private int mDrawableMarginBottom;
    private int mDrawableMarginLeft;
    private int mDrawableMarginRight;

    public EditText(Context context) {
        this(context, null);
    }

    public EditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context,attrs);
    }

    public EditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }


    private void init(Context context, AttributeSet attrs) {
        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.EditText);
        this.mDrawableWidth = (int) ta.getDimension(R.styleable.EditText_drawable_width, 0.0F);
        this.mDrawableHeight = (int) ta.getDimension(R.styleable.EditText_drawable_height, 0.0F);
        this.mDrawableMarginTop = (int) ta.getDimension(R.styleable.EditText_drawable_marginTop, 0.0F);
        this.mDrawableMarginBottom = (int) ta.getDimension(R.styleable.EditText_drawable_marginBottom, 0.0F);
        this.mDrawableMarginRight = (int) ta.getDimension(R.styleable.EditText_drawable_marginRight, 0.0F);
        this.mDrawableMarginLeft = (int) ta.getDimension(R.styleable.EditText_drawable_marginLeft, 0.0F);
        this.setCompoundDrawablePadding(this.getCompoundDrawablePadding() + this.mDrawableMarginTop + mDrawableMarginLeft + mDrawableMarginBottom + mDrawableMarginRight);
        this.mDrawableLeft = this.getCompoundDrawables()[0];
        this.mDrawableTop = this.getCompoundDrawables()[1];
        this.mDrawableRight = this.getCompoundDrawables()[2];
        this.mDrawableBottom = this.getCompoundDrawables()[3];
        if (this.mDrawableLeft != null & this.mDrawableWidth > 0 & this.mDrawableHeight > 0) {
            this.mDrawableLeft.setBounds(0, 0, this.mDrawableWidth, this.mDrawableHeight);
        }
        if (this.mDrawableTop != null & this.mDrawableWidth > 0 & this.mDrawableHeight > 0) {
            this.mDrawableTop.setBounds(0, 0, this.mDrawableWidth, this.mDrawableHeight);
        }

        if (this.mDrawableRight != null & this.mDrawableWidth > 0 & this.mDrawableHeight > 0) {
            this.mDrawableRight.setBounds(0, 0, this.mDrawableWidth, this.mDrawableHeight);
        }
        if (this.mDrawableBottom != null & this.mDrawableWidth > 0 & this.mDrawableHeight > 0) {
            this.mDrawableBottom.setBounds(0, 0, this.mDrawableWidth, this.mDrawableHeight);
        }
        this.setCompoundDrawables(mDrawableLeft, mDrawableTop, mDrawableRight, this.mDrawableBottom);
        ta.recycle();
    }
}

