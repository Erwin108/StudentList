import java.util.ArrayList;
import java.util.Collections;

// Driver class
class Main
{
    //private static Object LinkedList;
    //private static Object String;

    public static void main (String[] args)
    {
        //  LinkedList<String> object = LinkedList<String>();

        ArrayList<Student> ar = new ArrayList<Student>();
        ar.add(new Student(111, "bill", "london"));
        ar.add(new Student(131, "ana", "nyc"));
        ar.add(new Student(121, "chuck", "jaipur"));
        //testing the sorting
        System.out.println("Unsorted");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));

        Sortbyroll Rollsorted =new Sortbyroll();
        Rollsorted.binarySearchRecursive(1,ar ,3,4); //pass in arraylist parameters.
        //Collections.sort(ar); //implement sorting algorithm.

        System.out.println("\nSorted by rollno");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));

        Collections.sort(ar, new Sortbyname());

        System.out.println("\nSorted by name");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));


        //binary search with recursion.

    }
}
