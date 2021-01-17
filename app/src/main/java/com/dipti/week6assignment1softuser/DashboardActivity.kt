package com.dipti.week6assignment1softuser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.dipti.week6assignment1softuser.Adapter.ViewAdapter
import com.dipti.week6assignment1softuser.Fragments.About
import com.dipti.week6assignment1softuser.Fragments.Home
import com.dipti.week6assignment1softuser.Fragments.StudentFragment
import com.dipti.week6assignment1softuser.Model.Student

class DashboardActivity : AppCompatActivity() {
    private lateinit var viewPager: ViewPager;
    private lateinit var tabLayout: TabLayout;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);
        loadViewPagerAdapter();
        loadlist()
    }
    private fun loadViewPagerAdapter() {

        val adapter = ViewAdapter(supportFragmentManager);
        adapter.addFragment(Home(), "Home");
        adapter.addFragment(StudentFragment(), "Add Student");
        adapter.addFragment(About(), "About Us");
        viewPager.adapter = adapter;
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0)!!.setIcon(R.drawable.ic_baseline_home_24);
        tabLayout.getTabAt(1)!!.setIcon(R.drawable.ic_baseline_person_add_24);
        tabLayout.getTabAt(2)!!.setIcon(R.drawable.ic_baseline_notifications_24);


    }

    private fun loadlist(){
        if (lisfOfStudent.size==0){
            lisfOfStudent.add(Student("Dipti Baral", "20", "Samakhusi", "Female"));
            lisfOfStudent.add(Student("Ram Sharma", "21", "Kathmandu", "Male"));
            lisfOfStudent.add(Student("Sita Shrestha", "20", "Lalitpur", "Female"));
            lisfOfStudent.add(Student("Aadi Baskota", "21", "Kathmandu", "Male"));
            lisfOfStudent.add(Student("Swikrit Subedi", "23", "Kathmandu", "Male"));
        }
    }
    companion object {
        var lisfOfStudent = arrayListOf<Student>();
    }
}
//