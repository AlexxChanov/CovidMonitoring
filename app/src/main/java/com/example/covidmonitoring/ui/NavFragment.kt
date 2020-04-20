package com.example.covidmonitoring.ui

import android.hardware.camera2.params.BlackLevelPattern.COUNT
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.covidmonitoring.R
import kotlinx.android.synthetic.main.fragment_navigation.*


class NavFragment: Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_navigation , container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val countryDataFragment = CountryDataFragment()

        btnGlobalData.setOnClickListener {
            fragmentManager?.beginTransaction()
                ?.replace(R.id.navHost, GlobalFragment())
                ?.addToBackStack(null)
                ?.commit()
        }
        btnRussiaData.setOnClickListener {
            countryDataFragment.arguments=Bundle().also {
                it.putString("key", "Russia")
            };
            fragmentManager?.beginTransaction()
                ?.replace(R.id.navHost, CountryDataFragment())
                ?.addToBackStack(null)
                ?.commit()
        }
        btnUSAData.setOnClickListener {
            countryDataFragment.arguments=Bundle().also {
                it.putString("key", "USA")
            }
            fragmentManager?.beginTransaction()
                ?.replace(R.id.navHost, CountryDataFragment())
                ?.addToBackStack(null)
                ?.commit()
        }
        btnItalyData.setOnClickListener {
            countryDataFragment.arguments=Bundle().also {
                it.putString("key", "Italy")
            }
            fragmentManager?.beginTransaction()
                ?.replace(R.id.navHost, CountryDataFragment())
                ?.addToBackStack(null)
                ?.commit()
        }
    }
}