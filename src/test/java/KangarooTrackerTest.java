import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class KangarooTrackerTest
{

    // Write your unit tests here

    private KangarooTracker kangarooTracker;

    @Before
    public void setup()
    {
        kangarooTracker = new KangarooTracker();
    }

    // x1 gt x2 is not possible due to constraints

    @Test
    public void x1_eq_x2_and_v1_eq_v2()
    {
        String result = kangarooTracker.willMeet(0, 1, 0, 1);
        assertEquals("YES", result);
    }

    @Test
    public void x1_eq_x2_and_v1_lt_v2()
    {
        // Will never meet
        String result = kangarooTracker.willMeet(0, 1, 0, 2);
        assertEquals("NO", result);
    }

    @Test
    public void x1_eq_x2_and_v1_gt_v2()
    {
        // Will never meet
        String result = kangarooTracker.willMeet(0, 2, 0, 1);
        assertEquals("NO", result);
    }

    @Test
    public void x1_lt_x2_and_v1_eq_v2()
    {
        // Will never meet
        String result = kangarooTracker.willMeet(0, 1, 1, 1);
        assertEquals("NO", result);
    }

    @Test
    public void x1_lt_x2_and_v1_lt_v2()
    {
        // Will never meet
        String result = kangarooTracker.willMeet(0, 1, 1, 2);
        assertEquals("NO", result);
    }

    @Test
    public void x1_lt_x2_and_v1_gt_v2_NO()
    {
        String result = kangarooTracker.willMeet(0, 5, 1, 3);
        assertEquals("NO", result);
        //0 -> 10 -> 15
        //1 -> 4 -> 7 -> 10
    }

    @Test
    public void x1_lt_x2_and_v1_gt_v2_NO_but_they_will_visit_same_position()
    {
        // Not after the same number of jumps
        String result = kangarooTracker.willMeet(0, 4, 1, 1);
        assertEquals("NO", result);
    }

    @Test
    public void x1_lt_x2_and_v1_gt_v2_YES()
    {
        String result = kangarooTracker.willMeet(0, 3, 4, 2);
        assertEquals("YES", result);
    }

    @Test
    public void longJumps()
    {
        String result = kangarooTracker.willMeet(0, 6000, 2000, 4000);
        assertEquals("YES", result);
    }
}
