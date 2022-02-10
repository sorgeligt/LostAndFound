package com.sorgeligt.lostandfound

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.fragment.app.Fragment

class ThingFragment : Fragment() {
    private lateinit var lostThing: LostThing
    private lateinit var titleField: TextView
    private lateinit var dateButton: Button
    private lateinit var checkBox: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lostThing = LostThing()
    }

    override fun onStart() {
        super.onStart()
        val titleWatcher = object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                lostThing.thingName = p0.toString()
            }

            override fun afterTextChanged(p0: Editable?) {
            }
        }
        titleField.addTextChangedListener(titleWatcher)
        checkBox.setOnCheckedChangeListener { _, isChecked ->
            lostThing.isSolved = isChecked
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_thing, container, false)
        titleField = view.findViewById(R.id.title_label)
        dateButton = view.findViewById(R.id.button)
        checkBox = view.findViewById(R.id.found_flag_checkbox)
        dateButton.apply {
            isEnabled = false
            text = lostThing.date.toString()
        }
        return view
    }
}