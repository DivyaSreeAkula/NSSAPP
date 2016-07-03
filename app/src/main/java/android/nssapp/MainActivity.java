package android.nssapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;



public class MainActivity extends AppCompatActivity {
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;
    DrawerLayout mDrawerLayout;
    NavigationView mNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFragmentManager = getSupportFragmentManager();
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.replace(R.id.containerView, new TabFragment()).commit();

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mNavigationView = (NavigationView) findViewById(R.id.nav_view);


        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
                                                              @Override
                                                              public boolean onNavigationItemSelected(MenuItem menuItem) {
                                                                  mDrawerLayout.closeDrawers();


                                                                  if (menuItem.getItemId() == R.id.nav_about) {
                                                                      startActivity(new Intent(MainActivity.this, About.class));

                                                                  }

                                                                  if (menuItem.getItemId() == R.id.nav_homez) {
                                                                      startActivity(new Intent(MainActivity.this, MainActivity.class));
                                                                  }
                                                                  if (menuItem.getItemId() == R.id.nav_sign) {
                                                                      startActivity(new Intent(MainActivity.this,SignUpActivity.class));

                                                                  }
                                                                  if (menuItem.getItemId() == R.id.nav_login) {
                                                                      startActivity(new Intent(MainActivity.this,LoginActivity.class));

                                                                  }
                                                                  if (menuItem.getItemId() == R.id.nav_feedback) {
                                                                      startActivity(new Intent(MainActivity.this, MainActivity.class));

                                                                  }
                                                                  if (menuItem.getItemId() == R.id.nav_help) {
                                                                      startActivity(new Intent(MainActivity.this, help.class));

                                                                  }

                                                                  return false;
                                                              }

                                                          }

        );

        /**
         * Setup Drawer Toggle of the Toolbar
         */

        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        ActionBarDrawerToggle mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar, R.string.app_name, R.string.app_name);

        mDrawerLayout.setDrawerListener(mDrawerToggle);

        mDrawerToggle.syncState();

    }
}