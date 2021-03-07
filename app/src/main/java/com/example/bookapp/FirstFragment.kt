package com.example.bookapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_one.*

class FirstFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_one, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        var pageText = requireActivity().findViewById<TextView>(R.id.page)
        var page = 0
        var page2 = 1
        var string = "R.string.page"
        var list = listOf (R.string.page1,R.string.page2,R.string.page3,R.string.page4,
            R.string.page5,R.string.page6,R.string.page7,R.string.page8,R.string.page9,
            R.string.page10)
        arrowForward.setOnClickListener {
            page++
            page2++

            
            when (page) {
                1 -> { text.text = getString(list.get(page))
                    arrowBack.visibility = View.VISIBLE
                    pageText.text = "$page2" }
                2 -> {
                    text.text = getString(list.get(page))
                    arrowBack.visibility = View.VISIBLE
                    pageText.text = "$page2" }
                3 ->{
                    text.text = getString(list.get(page))
                    arrowBack.visibility = View.VISIBLE
                    pageText.text = "$page2" }
                4->{
                    text.text = getString(list.get(page))
                    arrowBack.visibility = View.VISIBLE
                    pageText.text = "$page2" }
                5->{
                    text.text = getString(list.get(page))
                    arrowBack.visibility = View.VISIBLE
                    pageText.text = "$page2" }
                6-> {
                    text.text = getString(list.get(page))
                    arrowBack.visibility = View.VISIBLE
                    pageText.text = "$page2"}
                7->{
                    text.text = getString(list.get(page))
                    arrowBack.visibility = View.VISIBLE
                    pageText.text = "$page2"}
                8->{
                    text.text = getString(list.get(page))
                    arrowBack.visibility = View.VISIBLE
                    pageText.text = "$page2"}
                9->{
                    text.text = getString(list.get(page))
                    arrowBack.visibility = View.VISIBLE
                    pageText.text = "$page2"}
            }
        }
        arrowBack.setOnClickListener {
            page--
            page2--
            when (page) {
                0 -> { text.text = getString(list.get(page))
                    pageText.text = "$page2"
                    arrowBack.visibility = View.GONE }
                1 -> {
                    text.text = getString(list.get(page))
                    arrowBack.visibility = View.VISIBLE
                    pageText.text = "$page2" }
                2->{
                    text.text = getString(list.get(page))
                    arrowBack.visibility = View.VISIBLE
                    pageText.text = "$page2" }
                3->{
                    text.text = getString(list.get(page))
                    arrowBack.visibility = View.VISIBLE
                    pageText.text = "$page2" }
                4->{
                    text.text = getString(list.get(page))
                    arrowBack.visibility = View.VISIBLE
                    pageText.text = "$page2"}
                5->{
                    text.text = getString(list.get(page))
                    arrowBack.visibility = View.VISIBLE
                    pageText.text = "$page2"}
                6->{
                    text.text = getString(list.get(page))
                    arrowBack.visibility = View.VISIBLE
                    pageText.text = "$page2"}
                7->{
                    text.text = getString(list.get(page))
                    arrowBack.visibility = View.VISIBLE
                    pageText.text = "$page2"}
                8->{
                    text.text = getString(list.get(page))
                    arrowBack.visibility = View.VISIBLE
                    pageText.text = "$page2"}
            }
        }
    }
}