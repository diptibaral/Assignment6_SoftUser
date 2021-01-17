package com.dipti.week6assignment1softuser.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dipti.week6assignment1softuser.Adapter.StudentAdapter
import com.dipti.week6assignment1softuser.DashboardActivity
import com.dipti.week6assignment1softuser.R


class Home : Fragment() {

    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        recyclerView =view.findViewById(R.id.recyclerView)

        val adapter = StudentAdapter(this.context!!, DashboardActivity.lisfOfStudent)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this.context)

        return view;
    }
}

