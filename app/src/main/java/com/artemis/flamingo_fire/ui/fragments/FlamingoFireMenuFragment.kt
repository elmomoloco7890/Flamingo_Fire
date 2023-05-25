package com.artemis.flamingo_fire.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.artemis.flamingo_fire.R
import com.artemis.flamingo_fire.adapter.main.FlamingoItemAdapter
import com.artemis.flamingo_fire.databinding.FragmentFlamingoFireMenuBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FlamingoFireMenuFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FlamingoFireMenuFragment : Fragment() {

    private var binding: FragmentFlamingoFireMenuBinding ?= null

    private lateinit var adapter: FlamingoItemAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_flamingo_fire_menu, container, false)
    }


}