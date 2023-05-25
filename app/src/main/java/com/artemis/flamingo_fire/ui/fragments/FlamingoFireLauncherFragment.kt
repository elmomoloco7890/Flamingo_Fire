package com.artemis.flamingo_fire.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.artemis.flamingo_fire.R
import com.artemis.flamingo_fire.databinding.FragmentFlamingoFireLauncherBinding


class FlamingoFireLauncherFragment : Fragment() {

    private var binding: FragmentFlamingoFireLauncherBinding ?= null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val fireLauncherBinding = FragmentFlamingoFireLauncherBinding.inflate(inflater, container, false)
        binding = fireLauncherBinding
        return fireLauncherBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.apply {
            flamingoFireLauncherFragment = this@FlamingoFireLauncherFragment
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    fun launchToHome(){
        findNavController().navigate(R.id.action_flamingoFireLauncherFragment_to_flamingoFireHomeFragment)
    }

}