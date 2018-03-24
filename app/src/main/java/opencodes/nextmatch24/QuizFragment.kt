package opencodes.nextmatch24

import android.os.Bundle
import android.support.design.widget.CoordinatorLayout
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView

class QuizFragment : Fragment() {

    var questions: MutableList<Question> = mutableListOf()
    var counter = 0

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var rootView = inflater!!.inflate(R.layout.tab_fragment_quiz, container, false)
        var questionLabel = rootView.findViewById<TextView>(R.id.QuestionTextView)
        questionLabel.setText(questions.get(counter).question)
        return rootView
    }

    fun onNextQuestion() {
        counter++
        var questionLabel = activity.findViewById<TextView>(R.id.QuestionTextView)
        questionLabel.setText(questions.get(counter).question)
    }



    override fun onStart() {
        super.onStart()
        var layout : LinearLayout = (activity).findViewById(R.id.AnswerLayout)
        var newObj = PointView(context)
        //coLayout.removeAllViews()
        layout.addView(newObj, 0)
    }
}