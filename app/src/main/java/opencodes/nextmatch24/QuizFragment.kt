package opencodes.nextmatch24

import android.os.Bundle
import android.support.design.widget.CoordinatorLayout
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class QuizFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.tab_fragment_quiz, container, false)
    }

    override fun onStart() {
        super.onStart()
        var coLayout : CoordinatorLayout = (activity).findViewById(R.id.choose)
        var newObj: PointView = PointView(context)
        coLayout.addView(newObj)

    }
}