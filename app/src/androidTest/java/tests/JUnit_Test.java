package tests;
import android.test.ActivityInstrumentationTestCase2;

import com.example.jdelcerr.exercise.MainActivity;

/**
 * Created by jdelcerr on 4/13/2016.
 */
public class JUnit_Test extends ActivityInstrumentationTestCase2<MainActivity>{


    public JUnit_Test(){
        super(MainActivity.class)
    }

    public void test1(){
        int a = 0;
        int b = 1;
        assertEquals(b,1);
    }
}
