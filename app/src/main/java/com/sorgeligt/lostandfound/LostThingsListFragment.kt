package com.sorgeligt.lostandfound

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class LostThingsListFragment : Fragment() {

    private lateinit var thingsRecyclerView: RecyclerView

    private val lostThingsListViewModel: LostThingsListViewModel by lazy {
        ViewModelProvider(this).get(LostThingsListViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_things_list, container, false)
        thingsRecyclerView =
            view.findViewById(R.id.things_recycler_view)
        thingsRecyclerView.layoutManager = LinearLayoutManager(context)
        return view
    }


    companion object {
        fun newInstance(): LostThingsListFragment {
            return LostThingsListFragment()
        }
    }
}