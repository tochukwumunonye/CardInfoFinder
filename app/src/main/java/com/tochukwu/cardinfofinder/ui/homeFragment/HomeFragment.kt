package com.tochukwu.cardinfofinder.ui.homeFragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.tochukwu.cardinfofinder.R
import com.tochukwu.cardinfofinder.databinding.HomeFragmentBinding



class HomeFragment : Fragment() {

    private lateinit var binding: HomeFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = HomeFragmentBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(findNavController()) {
            binding.ocrCard.setOnClickListener {
                navigate(R.id.action_homeFragment_to_ocrFragment)
            }
            binding.keyboardCard.setOnClickListener {
                navigate(R.id.action_homeFragment_to_inputFragment)
            }
        }
    }

}