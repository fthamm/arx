package opencodes.nextmatch24

import android.widget.TextView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.View


// Note that we specify the custom ViewHolder which gives us access to our views
class QuizAdapter(private val quizList: Array<QuizModell>): RecyclerView.Adapter<QuizAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.txtName?.text = quizList[position].name
        holder?.txtEmoji?.text = quizList[position].emoji
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.quiz_list_item, parent, false)
        return ViewHolder(v);
    }

    override fun getItemCount(): Int {
        return quizList.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val txtName: TextView = itemView.findViewById(R.id.txtName)
        val txtEmoji: TextView = itemView.findViewById(R.id.txtEmoji)
    }

}