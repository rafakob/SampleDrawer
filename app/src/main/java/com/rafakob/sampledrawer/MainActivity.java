package com.rafakob.sampledrawer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.root_layout) FrameLayout mRootLayout;
    private Drawer mDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mDrawer = new DrawerBuilder(this)
                .withRootView(mRootLayout) // comment this out to "remove" statusbar on +21
                .withFullscreen(false)
                .addDrawerItems(
                        new PrimaryDrawerItem().withName("Login").withIdentifier(1),
                        new PrimaryDrawerItem().withName("Register").withIdentifier(2),
                        new PrimaryDrawerItem().withName("Settings").withIdentifier(7)
                )
                .build();
    }
}
