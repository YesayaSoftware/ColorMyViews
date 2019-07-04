package software.yesaya.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> = listOf(
            box_one_text, box_two_text, box_three_text, box_four_text, box_five_text,
            constraint_layout,
            green_button, red_button, yellow_button
        )

        for (item in clickableViews)
            item.setOnClickListener { makeColoured(it) }
    }

    private fun makeColoured(view: View) {
        when(view.id) {
            //Boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            //Boxes using Android color resource for background
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            //Boxes using Custom colors for background
            R.id.green_button -> box_three_text.setBackgroundResource(R.color.my_green)
            R.id.yellow_button -> box_four_text.setBackgroundResource(R.color.my_yellow)
            R.id.red_button -> box_five_text.setBackgroundResource(R.color.my_red)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}
