package Chapter11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exercise10
{

    /*
         Write a method removeOddLength that accepts a set of strings as a parameter
         and that removes all of the strings of odd length from the set.
     */

    public static void main(String[] args)
    {
        Set<String> set = new HashSet<>();

        set.add("1234");
        set.add("12345");
        set.add("123");
        set.add("12");

        System.out.println(removeOddLength(set));

    }

    public static Set<String> removeOddLength(Set<String> set)
    {

        Iterator<String> iterator = set.iterator(); //  Create iterator

        while(iterator.hasNext())
        {
            String current = iterator.next();

            if(current.length() % 2 != 0)   //  If the next String in the set has an even length, then remove
            {
                iterator.remove();
            }

        }

        return set;

    }
}
