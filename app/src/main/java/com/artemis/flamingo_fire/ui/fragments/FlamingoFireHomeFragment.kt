package com.artemis.flamingo_fire.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.artemis.flamingo_fire.R
import com.artemis.flamingo_fire.adapter.main.FlamingoFireAdapter
import com.artemis.flamingo_fire.databinding.FragmentFlamingoFireHomeBinding


class FlamingoFireHomeFragment : Fragment() {

    private var binding: FragmentFlamingoFireHomeBinding ?= null

    private lateinit var adapter: FlamingoFireAdapter



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val fireHomeBinding = FragmentFlamingoFireHomeBinding.inflate(inflater, container, false)
        binding = fireHomeBinding
        // Inflate the layout for this fragment
        return fireHomeBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //add the database reference here

        //adapter called here
        adapter = FlamingoFireAdapter()

        binding?.apply {
            flamingoFireHomeFragment = this@FlamingoFireHomeFragment
            flamingoFireAdapter = adapter
        }


    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    fun goBackHome(){
        findNavController().navigate(R.id.action_flamingoFireHomeFragment_to_flamingoFireLauncherFragment)
    }


}