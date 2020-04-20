package com.example.covidmonitoring.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.covidmonitoring.R
import com.example.covidmonitoring.date.CovidRepository
import kotlinx.android.synthetic.main.fragment_country_data.*
import kotlinx.android.synthetic.main.fragment_global.*
import kotlinx.android.synthetic.main.fragment_global.loader
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

class CountryDataFragment: Fragment(), CoroutineScope {
    override val coroutineContext: CoroutineContext=Dispatchers.Main

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_country_data,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val repo = CovidRepository()
        val savedValue=arguments?.getString("key") ?: ""

        when(savedValue){

            "Russia"->launch{
                val countryCases = repo.getRussiaData().await()


                loader.visibility=View.GONE
                countryData.visibility=View.VISIBLE

                countryCases?.let{
                    country.text = it.country
                    cases.text = getString(R.string.total_confirmed_template).format(it.cases)

                }

            }

            "USA"->launch{
                val countryCases = repo.getUSAData().await()


                loader.visibility=View.GONE
                countryData.visibility=View.VISIBLE

                countryCases?.let{
                    country.text = it.country
                    cases.text = getString(R.string.total_confirmed_template).format(it.cases)

                }

            }

            "Italy"->launch{
                val countryCases = repo.getItalyData().await()


                loader.visibility=View.GONE
                countryData.visibility=View.VISIBLE

                countryCases?.let{
                    country.text = it.country
                    cases.text = getString(R.string.total_confirmed_template).format(it.cases)

                }

            }



        }

    }
}