package com.github.njhu.njcloudreader.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.njhu.njcloudreader.Base.BaseFragment
import com.github.njhu.njcloudreader.R

class HomeContent: BaseFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.home_content_fragment, container, false)
    }
}