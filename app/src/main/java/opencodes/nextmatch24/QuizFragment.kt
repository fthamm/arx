package opencodes.nextmatch24

import android.os.Bundle
import android.support.design.widget.CoordinatorLayout
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout

class QuizFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.tab_fragment_quiz, container, false)
    }

    override fun onStart() {
        super.onStart()
        var layout : LinearLayout = (activity).findViewById(R.id.AnswerLayout)
        var newObj = PointView(context)
        //coLayout.removeAllViews()
        layout.addView(newObj, 0)
    }
}