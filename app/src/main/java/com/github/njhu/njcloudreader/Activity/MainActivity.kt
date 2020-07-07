package com.github.njhu.njcloudreader.Activity

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.ImageView
import com.github.njhu.njcloudreader.Base.BaseActivity
import com.github.njhu.njcloudreader.R

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addActions()
    }
    private fun addActions() {
        val menu = findViewById<FrameLayout>(R.id.nav_menu_button)
        val music = findViewById<FrameLayout>(R.id.nav_music_button)
        val musicIcon = findViewById<FrameLayout>(R.id.nav_music_icon_button)
        val people = findViewById<FrameLayout>(R.id.nav_people_button)
        val search = findViewById<FrameLayout>(R.id.nav_search_button)

        val musicImageView = findViewById<ImageView>(R.id.nav_music_button_img)
        val musicIconImageView = findViewById<ImageView>(R.id.nav_music_icon_button_img)
        val peopleImageView = findViewById<ImageView>(R.id.nav_people_button_img)

        menu.setOnClickListener {

        }
        music.setOnClickListener {
            musicImageView.setImageResource(R.drawable.titlebar_music_selected)
            musicIconImageView.setImageResource(R.drawable.titlebar_discover_normal)
            peopleImageView.setImageResource(R.drawable.titlebar_friends_normal)
        }
        musicIcon.setOnClickListener {
            musicImageView.setImageResource(R.drawable.titlebar_music_normal)
            musicIconImageView.setImageResource(R.drawable.titlebar_discover_selected)
            peopleImageView.setImageResource(R.drawable.titlebar_friends_normal)
        }
        people.setOnClickListener {
            musicImageView.setImageResource(R.drawable.titlebar_music_normal)
            musicIconImageView.setImageResource(R.drawable.titlebar_discover_normal)
            peopleImageView.setImageResource(R.drawable.titlebar_friends_selected)
        }
        search.setOnClickListener {

        }
    }
}
