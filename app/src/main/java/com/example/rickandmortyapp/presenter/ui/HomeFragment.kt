package com.example.rickandmortyapp.presenter.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.rickandmortyapp.R
import com.example.rickandmortyapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnClickme.setOnClickListener {
            Toast.makeText(requireContext(),"Test click",Toast.LENGTH_SHORT).show()
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.container_main, CharacterFragment.newInstance())
            transaction.disallowAddToBackStack()
            transaction.commit()
        }

    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        @JvmStatic
        fun newInstance() = HomeFragment()
    }
}