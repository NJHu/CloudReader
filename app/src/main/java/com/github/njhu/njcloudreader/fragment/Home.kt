package com.github.njhu.njcloudreader.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.github.njhu.njcloudreader.Base.BaseFragment
import com.github.njhu.njcloudreader.R
import kotlinx.android.synthetic.main.activity_main.*

class Home: BaseFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.home_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        replaceFragment(HomeContent())
    }

    private fun replaceFragment(fragment: BaseFragment) {
        val fragmentManager = childFragmentManager
        val transition = fragmentManager.beginTransaction()
        transition.replace(R.id.content_page, fragment)
        transition.commit()
    }
}