package com.example.navigationui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.navigationui.databinding.FragmentSecondBinding

class secondFragment : Fragment() {
    private var _binding: FragmentSecondBinding? = null
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        val view = binding.root

        val args = secondFragmentArgs.fromBundle(arguments!!)
        binding.message.text = args.message


        // Navigate
        val navController = findNavController()
        binding.backBtn.setOnClickListener {
            navController.navigateUp()
        }

        return view
    }
}