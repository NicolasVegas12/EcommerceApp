package com.minenick.ecommers2.ui.PedidoPorId

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.minenick.ecommers2.R
import androidx.lifecycle.ViewModelProvider
import com.minenick.ecommers2.databinding.ActivityPedidosBinding
import com.minenick.ecommers2.ui.ListaPedidos.ListaPedidosViewModel

class PedidosActivity : AppCompatActivity() {

    private lateinit var ViewModel: PedidosViewModel
    private lateinit var binding:ActivityPedidosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityPedidosBinding.inflate(layoutInflater)

        initViewModel()
        setContentView(binding.root)
    }

    private fun initViewModel() {
        ViewModel = ViewModelProvider(this).get(PedidosViewModel::class.java)
    }
}