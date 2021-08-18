package com.intan.latihanui.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.fragment.app.FragmentTransaction
import com.intan.latihanui.R
import kotlinx.android.synthetic.main.fragment_home.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_home, container, false)
        val smf = v.findViewById<TextView>(R.id.seeMoreFranchise)
        val smv = v.findViewById<TextView>(R.id.seeMoreVideo)
        val ba = v.findViewById<CardView>(R.id.beliaci)
        val mart = v.findViewById<CardView>(R.id.mart)
        val edu = v.findViewById<CardView>(R.id.edu)
        val finance = v.findViewById<CardView>(R.id.finance)

        smf.setOnClickListener {
            val intent = Intent(getActivity(), FranchiseActivity::class.java)
            getActivity()?.startActivity(intent)
        }

        smv.setOnClickListener {
            val intent = Intent(getActivity(),VideoActivity::class.java)
            getActivity()?.startActivity(intent)
        }

        ba.setOnClickListener {
            val intent = Intent(getActivity(),DetailActivity::class.java)
            getActivity()?.startActivity(intent)
        }
        mart.setOnClickListener {
            val intent = Intent(getActivity(),FranchiseActivity::class.java)
            getActivity()?.startActivity(intent)
        }
        edu.setOnClickListener {
            val intent = Intent(getActivity(),VideoActivity::class.java)
            getActivity()?.startActivity(intent)
        }
        finance.setOnClickListener {
            val intent = Intent(getActivity(),FinanceActivity::class.java)
            getActivity()?.startActivity(intent)
        }
        return v

    }


}