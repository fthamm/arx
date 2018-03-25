package opencodes.nextmatch24

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.TextView

class QuizFragment : Fragment() {

    var questions: MutableList<Question> = mutableListOf()
    var counter = 0
    lateinit var layout: ViewGroup
    lateinit var newObj: PointView

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var rootView = inflater!!.inflate(R.layout.tab_fragment_quiz, container, false)
        var questionLabel = rootView.findViewById<TextView>(R.id.QuestionTextView)
        questionLabel.setText(questions.get(counter).question.toString())
        return rootView
    }

    fun nextQuestion() {
        if (counter + 1 < questions.size) {
            counter++
        }
        var questionLabel = activity.findViewById<TextView>(R.id.QuestionTextView)
        questionLabel.setText(questions.get(counter).question)
    }
}


    /*override fun onStart() {
        super.onStart()
        var layout : ViewGroup = (activity).findViewById(R.id.AnswerLayout)
        var newObj = PointView(context, this)
        //coLayout.removeAllViews()
        layout.addView(newObj, -1, ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT))
    }

}*/