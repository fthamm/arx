package opencodes.nextmatch24

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class AskFragment : Fragment() {

    var questions: MutableList<Question> = mutableListOf()

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var rootView = inflater!!.inflate(R.layout.tab_fragment_ask, container, false)

        var button = rootView.findViewById<Button>(R.id.send)
        button.setOnClickListener() {
            var questionField = rootView.findViewById<TextView>(R.id.questionTextField)
            var answerField1 = rootView.findViewById<TextView>(R.id.AnswerEdit1)
            var answerField2 = rootView.findViewById<TextView>(R.id.AnswerEdit2)
            var answerField3 = rootView.findViewById<TextView>(R.id.AnswerEdit3)
            var question = Question(questionField.getText().toString(), answerField1.getText().toString(),answerField2.getText().toString(),answerField3.getText().toString())
            questions.add(question)
        }

        return rootView
    }
}