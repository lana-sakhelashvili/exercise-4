package com.example.exercise_4.fragments

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.exercise_4.R

class noteFragment : Fragment(R.layout.fragment_note) {

    private lateinit var click1: EditText
    private lateinit var click2: EditText
    private lateinit var click3: EditText


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        click1 = view.findViewById(R.id.first)
        click2 = view.findViewById(R.id.second)
        click3 = view.findViewById(R.id.third)


    }
}