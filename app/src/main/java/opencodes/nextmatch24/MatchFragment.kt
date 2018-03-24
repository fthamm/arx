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

    private val matches = arrayOf<User>(User("Ernst Schmachtenberg", arrayListOf<String>("\uD83D\uDC60","\uD83C\uDFA9" , "\uD83D\uDC60"), ""), User("Angela Merkel", arrayListOf<String>("\uD83C\uDFA9 , \uD83D\uDC60"), ""), User("Elon Musk", arrayListOf<String>("Emoji1, Emoji2"), ""))

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater!!.inflate(R.layout.tab_fragment_match, container, false)
        // 1. get a reference to recyclerView
        val recyclerView = rootView.findViewById<RecyclerView>(R.id.list) as RecyclerView

        // 2. set layoutManger
        recyclerView.layoutManager = LinearLayoutManager(activity)

        // this is data fro recycler view
        val itemsData = matches


        // 3. create an adapter
        val mAdapter = ProfileAdapter(itemsData)
        // 4. set adapter
        recyclerView.adapter = mAdapter
        // 5. set item animator to DefaultAnimator
        recyclerView.itemAnimator = DefaultItemAnimator()

        return rootView
    }
}