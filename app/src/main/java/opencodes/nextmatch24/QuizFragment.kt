package opencodes.nextmatch24

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.TextView
import opencodes.nextmatch24.MainActivity.Companion.questions

class QuizFragment : Fragment() {

    lateinit var layout: ViewGroup
    lateinit var newObj: PointView
    var curr: Int = opencodes.nextmatch24.MainActivity.Companion.curr

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var rootView = inflater!!.inflate(R.layout.tab_fragment_quiz, container, false)

        this.curr = opencodes.nextmatch24.MainActivity.Companion.curr


        var questionLabel = rootView.findViewById<TextView>(R.id.QuestionTextView)
        var answerView1 = rootView.findViewById<TextView>(R.id.textAnswer1)
        var answerView2 = rootView.findViewById<TextView>(R.id.textAnswer2)
        var answerView3 = rootView.findViewById<TextView>(R.id.textAnswer3)
        questionLabel.setText(questions.get(curr).question)
        answerView1.setText(questions.get(curr).answer1)
        answerView2.setText(questions.get(curr).answer2)
        answerView3.setText(questions.get(curr).answer3)
        return rootView
    }

    fun nextQuestion() {
        if (curr + 1 < questions.size) {
            curr++
        } else {
            curr = 0
        }
        opencodes.nextmatch24.MainActivity.Companion.curr = this.curr
        Log.e("size",questions.toString())
        var questionLabel = activity.findViewById<TextView>(R.id.QuestionTextView)
        var answerView1 = activity.findViewById<TextView>(R.id.textAnswer1)
        var answerView2 = activity.findViewById<TextView>(R.id.textAnswer2)
        var answerView3 = activity.findViewById<TextView>(R.id.textAnswer3)
        questionLabel.setText(questions.get(curr).question)
        answerView1.setText(questions.get(curr).answer1)
        answerView2.setText(questions.get(curr).answer2)
        answerView3.setText(questions.get(curr).answer3)
    }

    override fun onStart() {
        super.onStart()
        var layout: ViewGroup = (activity).findViewById(R.id.AnswerLayout)
        var newObj = PointView(context, this)
        //coLayout.removeAllViews()
        layout.addView(newObj, -1, ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT))
    }
}




