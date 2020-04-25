package com.example.covidmonitoring.ui

import android.hardware.camera2.params.BlackLevelPattern.COUNT
import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.covidmonitoring.R
import kotlinx.android.synthetic.main.fragment_navigation.*


class NavFragment : Fragment() {

//    private var mediaPlayer: MediaPlayer? = null
//    private var mediaPlayer2: MediaPlayer? = null
//    private var flag = false


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_navigation, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        if (flag == true) {
//            mediaPlayer2?.stop()
//        }
//
//        mediaPlayer = MediaPlayer.create(view.context, R.raw.dancing_coffins_begining)
//        mediaPlayer2 = MediaPlayer.create(view.context, R.raw.dancing_coffins_ending)
//
//        mediaPlayer?.start()
//        mediaPlayer?.setLooping(true)


        val countryDataFragment = CountryDataFragment()

        btnGlobalData.setOnClickListener {
//            mediaPlayer?.stop()
//            mediaPlayer2?.start()
//            mediaPlayer2?.setLooping(true)
//            flag = true
            fragmentManager?.beginTransaction()
                ?.replace(R.id.navHost, GlobalFragment())
                ?.addToBackStack(null)
                ?.commit()
        }
        btnRussiaData.setOnClickListener {
//            mediaPlayer?.stop()
//            mediaPlayer2?.start()
//            mediaPlayer2?.setLooping(true)
//            flag = true
            countryDataFragment.arguments = Bundle().also {
                it.putInt("key", 1)
            }
            fragmentManager?.beginTransaction()
                ?.replace(R.id.navHost, countryDataFragment)
                ?.addToBackStack(null)
                ?.commit()
        }
        btnUSAData.setOnClickListener {
//            mediaPlayer?.stop()
//            mediaPlayer2?.start()
//            mediaPlayer2?.setLooping(true)
//            flag = true
            countryDataFragment.arguments = Bundle().also {
                it.putInt("key", 2)
            }
            fragmentManager?.beginTransaction()
                ?.replace(R.id.navHost, countryDataFragment)
                ?.addToBackStack(null)
                ?.commit()
        }
        btnItalyData.setOnClickListener {
//            mediaPlayer?.stop()
//            mediaPlayer2?.start()
//            mediaPlayer2?.setLooping(true)
//            flag = true
            countryDataFragment.arguments = Bundle().also {
                it.putInt("key", 3)
            }
            fragmentManager?.beginTransaction()
                ?.replace(R.id.navHost, countryDataFragment)
                ?.addToBackStack(null)
                ?.commit()
        }

    }

//    override fun onPause() {
//        super.onPause()
//        mediaPlayer?.stop()
//
//    }
}