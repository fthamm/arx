package opencodes.nextmatch24

import android.widget.TextView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.View
import android.widget.ImageView


// Note that we specify the custom ViewHolder which gives us access to our views
class ProfileAdapter(private val userList: Array<User>): RecyclerView.Adapter<ProfileAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.txtName?.text = userList[position].name
        holder?.txtTag?.text = userList[position].tags[0]
        holder?.matchImg?.setImageResource(userList[position].pic)
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.match_list_item, parent, false)
        return ViewHolder(v);
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val txtName: TextView = itemView.findViewById(R.id.txtName)
        val txtTag: TextView = itemView.findViewById(R.id.txtTag)
        val matchImg: ImageView = itemView.findViewById(R.id.matchImg)
    }

}