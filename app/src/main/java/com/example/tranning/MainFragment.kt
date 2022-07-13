package com.example.tranning

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.tranning.adapter.ProgrammerAdapter
import com.example.tranning.model.Programmer

class MainFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView: RecyclerView = view.findViewById(R.id.recycler_view)
        val changeText: TextView = view.findViewById(R.id.change_text)
        changeText.text = "Fragment"

        val programmers = ArrayList<Programmer>()
        val programmerA = Programmer()
        programmerA.name = "JackHau"
        programmerA.role = Role.FRONT_END_DEVELOPER.value

        val programmerB = Programmer().apply {
            name = "BibiKang"
            role = Role.BACKEND_DEVELOPER.value
        }

        for (programmer in programmers) {
            Log.i("###log", "forObject")
            Log.i("###log", "Name : ${programmer.name}")
        }

        programmers.forEachIndexed { index, programmer ->
            Log.i("###log", "forEachIndexed")
            Log.i("###log", "$index : ${programmer.name}")
        }

        Log.i("###log", "programmerB role is ")

        when(programmers.last().role) {
            Role.BACKEND_DEVELOPER.value -> {
                Log.i("###log", "Role: BACKEND_DEVELOPER")
            }
            Role.FRONT_END_DEVELOPER.value -> {
                Log.i("###log", "Role: FRONT_END_DEVELOPER")
            }
        }

        programmers.add(programmerA)
        programmers.add(programmerB)
        val programmerAdapter = ProgrammerAdapter(programmers)

        recyclerView.adapter = programmerAdapter
    }
}

 enum class Role(val value: Int){
    FRONT_END_DEVELOPER(1),
    BACKEND_DEVELOPER(2)

}