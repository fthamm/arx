package opencodes.nextmatch24

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem


class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tabLayout : TabLayout = findViewById(R.id.tab_layout)
        tabLayout.addTab(tabLayout.newTab().setText("Quiz"));
        tabLayout.addTab(tabLayout.newTab().setText("Match"));
        tabLayout.addTab(tabLayout.newTab().setText("Ask"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        var viewPager : ViewPager= findViewById(R.id.pager)
        var adapter = PagerAdapter (getSupportFragmentManager(), tabLayout.getTabCount())
        viewPager.setAdapter(adapter)
        viewPager.addOnPageChangeListener( TabLayout.TabLayoutOnPageChangeListener(tabLayout))
        /*tabLayout.setOnTabSelectedListener(TabLayout.OnTabSelectedListener() {
            @Override
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
    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/
}