package opencodes.nextmatch24

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.support.v7.widget.DefaultItemAnimator



class MatchFragment : Fragment() {

    private val matches = arrayOf<User>(User("Ernst Schmachti", "\uD83D\uDCD6   |   \uD83C\uDFA9   |   \uD83D\uDC60", R.drawable.schmachti), User("Angie Merkel", "\uD83C\uDFA9   |   \uD83D\uDCB6", R.drawable.angie), User("Elon Musk", "\uD83D\uDE80   |   \uD83D\uDEF8", R.drawable.elon), User("Edward Snowden", "\uD83D\uDCAC   |   \uD83D\uDCBB", R.drawable.snowden), User("Papst Franziskus", "\uD83D\uDE08   |   \uD83D\uDD4A", R.drawable.papst), User("Elon Musk", "\uD83D\uDE80   |   \uD83D\uDEF8", R.drawable.elon), User("Elon Musk", "\uD83D\uDE80   |   \uD83D\uDEF8", R.drawable.elon), User("Elon Musk", "\uD83D\uDE80   |   \uD83D\uDEF8", R.drawable.elon), User("Elon Musk", "\uD83D\uDE80   |   \uD83D\uDEF8", R.drawable.elon))

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater!!.inflate(R.layout.tab_fragment_match, container, false)
        // 1. get a reference to recyclerView
        val recyclerView = rootView.findViewById<RecyclerView>(R.id.list)

        // 2. set layoutManger
        recyclerView.layoutManager = LinearLayoutManager(activity)

        // this is data fro recycler view
        val itemsData = matches


        // 3. create an adapter
        val adapter = ProfileAdapter(itemsData)
        // 4. set adapter
        recyclerView.adapter = adapter

        return rootView
    }
}