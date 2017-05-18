public class KangarooTracker
{
    // Define your method signature here
    public String willMeet(int x1, int v1, int x2, int v2)
    {
        // Implementation here
        String result = "NO";
        if (x1 == x2 && v1 == v2)
        {
            result = "YES";
        }
        else if (x1 < x2 && v1 > v2)
        {
            // It could be yes or no
            int k1 = x1;
            int k2 = x2;
            while (k1 < k2)
            {
                k1 += v1;
                k2 += v2;

                if (k1 == k2)
                {
                    result = "YES";
                    break;
                }
            }
        }
        return result;
    }
}
