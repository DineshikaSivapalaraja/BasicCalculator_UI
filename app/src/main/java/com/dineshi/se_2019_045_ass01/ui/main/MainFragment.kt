package com.dineshi.se_2019_045_ass01.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.Observer
import com.dineshi.se_2019_045_ass01.R

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        var view = inflater.inflate(R.layout.fragment_main, container, false)

        val number1 = view.findViewById<EditText>(R.id.input1)
        val number2 = view.findViewById<EditText>(R.id.input2)

        var message = view.findViewById<TextView>(R.id.message)

        viewModel.result.observe(viewLifecycleOwner, Observer{Double
            message.text = it.toString()
        })

        var addButton = view.findViewById<Button>(R.id.addButton)
        addButton.setOnClickListener {
            //viewModel.add(12.0,4.0)
            val n1 = number1.text.toString().toDoubleOrNull() ?: 0.0
            val n2 = number2.text.toString().toDoubleOrNull() ?: 0.0
            viewModel.add(n1,n2)
        }

        var subtractButton = view.findViewById<Button>(R.id.subtractButton)
        subtractButton.setOnClickListener {
//            viewModel.subtract(12.0,4.0)
            val n1 = number1.text.toString().toDoubleOrNull() ?: 0.0
            val n2 = number2.text.toString().toDoubleOrNull() ?: 0.0
            viewModel.subtract(n1,n2)
        }

        var multiplyButton = view.findViewById<Button>(R.id.multiplyButton)
        multiplyButton.setOnClickListener {
//            viewModel.multiply(12.0,4.0)
            val n1 = number1.text.toString().toDoubleOrNull() ?: 0.0
            val n2 = number2.text.toString().toDoubleOrNull() ?: 0.0
            viewModel.multiply(n1,n2)
        }

        var divideButton = view.findViewById<Button>(R.id.divideButton)
        divideButton.setOnClickListener {
//            viewModel.divide(12.0,4.0)
            val n1 = number1.text.toString().toDoubleOrNull() ?: 0.0
            val n2 = number2.text.toString().toDoubleOrNull() ?: 0.0
            viewModel.divide(n1,n2)
        }
        return view
    }

}