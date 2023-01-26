package com.example.flexfitnessgymmanagement.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.flexfitnessgymmanagement.R
import com.example.flexfitnessgymmanagement.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var adapter: CustomAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var itemsArrayList: List<ItemsViewModel>

    lateinit var imageId: Array<Int>
    lateinit var text: Array<String>
    lateinit var items: Array<String>

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


   /* overide fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let
    }*/


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textHome
        homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInitialize()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.recyclerview)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = CustomAdapter(itemsArrayList)
        recyclerView.adapter = adapter
    }



    private fun dataInitialize(){
        itemsArrayList = arrayListOf<ItemsViewModel>()

        imageId = arrayOf(
            R.drawable.aerobics,
            R.drawable.flexibility,
            R.drawable.muscletraining,
            R.drawable.posture
        )

        text = arrayOf(
            getString(R.string.aerobics),
            getString(R.string.flexibility),
            getString(R.string.muscleTraining),
            getString(R.string.posture)
        )

        for(i in imageId.indices){
            val items = ItemsViewModel(imageId[i],text[i])
            (itemsArrayList as ArrayList<ItemsViewModel>).add(items)
        }

    }
}