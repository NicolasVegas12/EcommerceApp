package com.minenick.ecommers2.ui.ListaPedidos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.minenick.ecommers2.databinding.FragmentPedidosBinding

class PedidosFragment : Fragment() {

    private lateinit var ViewModel: ListaPedidosViewModel
    private var _binding: FragmentPedidosBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentPedidosBinding.inflate(inflater, container, false)
        initViewModel()
        return binding.root
    }


    fun initViewModel(){
        ViewModel = ViewModelProvider(this).get(ListaPedidosViewModel::class.java)
    }


}