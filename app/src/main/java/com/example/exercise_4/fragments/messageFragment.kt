package com.example.exercise_4.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.exercise_4.R
import kotlin.concurrent.fixedRateTimer

class messageFragment : Fragment(R.layout.fragment_message) {

    private lateinit var send : Button
    private lateinit var nameuser : EditText
    private lateinit var text : EditText

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = Navigation.findNavController(view)

        send = view.findViewById(R.id.sendButton)
        nameuser = view.findViewById(R.id.nameOfUser)
        text = view.findViewById(R.id.writeText)

        send.setOnClickListener{

            val username = nameuser.text.toString()
            val write = text.text.toString()

            if (username.isEmpty()){
                nameuser.error = "please enter the user name of person"
                return@setOnClickListener
            }
            if (write.isEmpty()){
                text.error = "please write the text"
                return@setOnClickListener
            }

            val action = messageFragmentDirections.actionMessageFragmentToHomeFragment()
            navController.navigate(action)

        }

    }
}