import java.math.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

/**
 * This class tries to compute a fibonacci number with memoized recursion
 */
public class FibOptimized2{
    private static Map<Integer, BigInteger> cache = new HashMap();
    static {
        cache.put(new Integer(0), new BigInteger("1"));
        cache.put(new Integer(1), new BigInteger("1"));
    }
    private static BigInteger fibonacci(int i){
        BigInteger result = cache.get(i);
        if (result == null) {
            result = fibonacci(i - 1).add(fibonacci(i - 2));
            cache.put(new Integer(i), result);
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println(fibonacci(46));
    }
}
