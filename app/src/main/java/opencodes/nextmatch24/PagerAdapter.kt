package opencodes.nextmatch24

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import android.support.v4.view.ViewPager

class PagerAdapter(fm: FragmentManager, internal var mNumOfTabs: Int) : FragmentStatePagerAdapter(fm) {

    override fun getItem(position: Int): Fragment? {

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