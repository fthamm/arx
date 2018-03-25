package opencodes.nextmatch24

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity


class MainActivity: AppCompatActivity() {


    companion object {
        var questions: ArrayList<Question> = ArrayList()
        var curr: Int = 0
        
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val question1 = Question("Your reaction when you realize it´s Friday", "\uD83D\uDE0D", "\uD83D\uDE00", "\uD83D\uDE0F")
        val question2 = Question("What was first?", "\uD83E\uDD5A", "\uD83D\uDC13", "\uD83E\uDD84")//dino
        val question3 = Question("Do you think this question makes any sense?", "\uD83E\uDD84", "\uD83C\uDF7F", "\uD83C\uDF71")
        val question4 = Question("What would you watch on TV?", "\uD83D\uDDD1", "\uD83C\uDF93", "\uD83C\uDFF9")
        val question5 = Question("Whats your sports type?", "\uD83C\uDF69", "\uD83D\uDEB4", "\uD83E\uDD56")
        val question6 = Question("How do you spend a day off?", "\uD83D\uDCBB", "\uD83D\uDECF", "\uD83C\uDF1E")

        //questions = ArrayList(question1, question2, question3)
        questions.add(question6)
        questions.add(question1)
        questions.add(question2)
        questions.add(question4)
        questions.add(question5)
        questions.add(question3)
        var tabLayout : TabLayout = findViewById(R.id.tab_layout)

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        var viewPager : ViewPager= findViewById(R.id.pager)
        var adapter = PagerAdapter (getSupportFragmentManager(), tabLayout.getTabCount())
        viewPager.setAdapter(adapter)
        /*viewPager.addOnPageChangeListener( TabLayout.TabLayoutOnPageChangeListener(tabLayout))
        tabLayout.setOnTabSelectedListener(TabLayout.OnTabSelectedListener() {
            override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });*/
        tabLayout.setupWithViewPager(viewPager)
        tabLayout.getTabAt(0)!!.setText("Quiz")
        tabLayout.getTabAt(1)!!.setText("Match")
        tabLayout.getTabAt(2)!!.setText("Ask")



    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }*/

    /*override
    fun onOptionsItemSelected(item: MenuItem): Boolean {
        var id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/
}