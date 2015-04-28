package com.github.aprofromindia.robolectrictemplate;

import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;
import static org.junit.Assert.assertNotNull;

@RunWith(RobolectricGradleTestRunner.class)
@Config(manifest = "app/src/main/AndroidManifest.xml", constants = BuildConfig.class, emulateSdk = 18)
public class MainActivityTest {

    @org.junit.Test
    public void testOnCreate() throws Exception {
        //given
        MainActivity mainActivity = Robolectric.setupActivity(MainActivity.class);

        //then
        assertNotNull(mainActivity);
    }
}