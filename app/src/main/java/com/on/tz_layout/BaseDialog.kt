package com.on.tz_layout

import android.annotation.SuppressLint
import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.PorterDuff
import android.os.Bundle
import android.view.View
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

abstract class BaseDialog(layout: Int) : BottomSheetDialogFragment(layout) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
        setupRequests()
        setupObservers()
        initClickListeners()
    }

    open fun initialize() {}
    open fun setupRequests() {}
    open fun setupObservers() {}
    open fun initClickListeners() {}

    @SuppressLint("UseRequireInsteadOfGet")
    override fun onStart() {
        super.onStart()
        val bottomSheet = (view!!.parent as View)
        bottomSheet.backgroundTintMode = PorterDuff.Mode.CLEAR
        bottomSheet.backgroundTintList = ColorStateList.valueOf(Color.TRANSPARENT)
        bottomSheet.setBackgroundColor(Color.TRANSPARENT)
    }

}