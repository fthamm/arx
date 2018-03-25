package opencodes.nextmatch24

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem


class MainActivity: AppCompatActivity() {

    companion object {
        var questions: ArrayList<Question> = ArrayList()
        var curr: Int = 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val question1 = Question("Question 1? \uD83D\uDC60 ! ", "🤣", "😎", "🤑")
        val question2 = Question("Question 2? \uD83E\uDD23 ! ", "\uD83D\uDC60", "\uD83C\uDFA9", "\uD83D\uDC8E")
        val question3 = Question("Question 3? \uD83D\uDE00 ! ", "❤", "\uD83E\uDDE0", "\uD83D\uDE4C")

        //questions = ArrayList(question1, question2, question3)
        questions.add(question1)
        questions.add(question2)
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