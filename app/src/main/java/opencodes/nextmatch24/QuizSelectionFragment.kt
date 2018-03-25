package opencodes.nextmatch24

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by Philipp on 25/03/2018.
 */
class QuizSelectionFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater!!.inflate(R.layout.quiz_select_fragment, container, false)
        // 1. get a reference to recyclerView
        val recyclerView = rootView.findViewById<RecyclerView>(R.id.list)

        // 2. set layoutManger
        recyclerView.layoutManager = LinearLayoutManager(activity)

        // this is data fro recycler view
        val itemsData = arrayOf<QuizModell>(QuizModell("Test","\uD83D\uDCD6"))


        // 3. create an adapter
        val adapter = QuizAdapter(itemsData)
        // 4. set adapter
        recyclerView.adapter = adapter

        return rootView
    }
}