package opencodes.nextmatch24

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import opencodes.nextmatch24.MainActivity.Companion.questions

class PagerAdapter(fm: FragmentManager, internal var mNumOfTabs: Int) : FragmentStatePagerAdapter(fm) {

    override fun getItem(position: Int): Fragment? {

        val question1 = Question("Question 1? \uD83D\uDC60 ! ", "🤣", "😎", "🤑")
        val question2 = Question("Question 2? \uD83E\uDD23 ! ", "\uD83D\uDC60", "\uD83C\uDFA9", "\uD83D\uDC8E")
        val question3 = Question("Question 3? \uD83D\uDE00 ! ", "❤", "\uD83E\uDDE0", "\uD83D\uDE4C")

        questions = mutableListOf(question1, question2, question3)

        when (position) {
            0 -> {
                var qF = QuizFragment()
                //qF.questions = questions
                return qF
            }
            1 -> {
                return MatchFragment()
            }
            2 -> {
                var aF = AskFragment()
                //aF.questions = questions
                return aF
            }
            else -> return null
        }
    }

    override fun getCount(): Int {
        return 3
    }
}