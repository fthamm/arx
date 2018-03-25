package opencodes.nextmatch24

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.FrameLayout
import android.widget.TextView
import opencodes.nextmatch24.MainActivity.Companion.questions

class QuizFragment : Fragment() {

    var counter = 0
    lateinit var layout: ViewGroup
    lateinit var newObj: PointView

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var rootView = inflater!!.inflate(R.layout.tab_fragment_quiz, container, false)


        var questionLabel = rootView.findViewById<TextView>(R.id.QuestionTextView)
        var answerView1 = rootView.findViewById<TextView>(R.id.textAnswer1)
        var answerView2 = rootView.findViewById<TextView>(R.id.textAnswer2)
        var answerView3 = rootView.findViewById<TextView>(R.id.textAnswer3)
        questionLabel.setText(questions.get(counter).question)
        answerView1.setText(questions.get(counter).answer1)
        answerView2.setText(questions.get(counter).answer2)
        answerView3.setText(questions.get(counter).answer3)

        var button = rootView.findViewById<Button>(R.id.skip)
        button.setOnClickListener {
            nextQuestion()
        }
        return rootView
    }

    fun nextQuestion() {
        if (counter + 1 < questions.size) {
            counter++
        } else {
            counter = 0
        }
        Log.e("size",questions.toString())
        var questionLabel = activity.findViewById<TextView>(R.id.QuestionTextView)
        var answerView1 = activity.findViewById<TextView>(R.id.textAnswer1)
        var answerView2 = activity.findViewById<TextView>(R.id.textAnswer2)
        var answerView3 = activity.findViewById<TextView>(R.id.textAnswer3)
        questionLabel.setText(questions.get(counter).question)
        answerView1.setText(questions.get(counter).answer1)
        answerView2.setText(questions.get(counter).answer2)
        answerView3.setText(questions.get(counter).answer3)
    }

    override fun onStart() {
        super.onStart()
        var layout: ViewGroup = (activity).findViewById(R.id.AnswerLayout)
        var newObj = PointView(context, this)
        //coLayout.removeAllViews()
        layout.addView(newObj, -1, ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT))
    }
}




