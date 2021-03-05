package com.programm3r.myutility

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.RelativeLayout

// STEPS: Reusable Component #2/? - Create a Class (CONTROLLER)
class MyTextView: RelativeLayout {

    constructor(context: Context) : super(context) {
        initializeViews(context)
    }
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        initializeViews(context)
    }
    constructor(context: Context, attrs: AttributeSet, defStyle:Int) : super(context, attrs, defStyle) {
        initializeViews(context)
    }

    private fun initializeViews(context: Context) {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        inflater.inflate(R.layout.my_text_view, this)
    }

    protected override fun onFinishInflate() {
        super.onFinishInflate()
    }

}