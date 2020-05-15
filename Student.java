import java.util.*;
import java.lang.*;

//Erwin Frutos
//819483035
//READ ME: In this code there is a
// list of students that get sorted with
// recursion by their number into the
// correct order. There is a linked list
// that gets sorted by roll number and by
// name separately and displayed. There is
// also an Abstract class that makes sure all
// students have valid roll numbers.


// A class to represent a student.
class Student<T>
{
    int rollNum;
    String name, address;

    // Constructor
    public Student(int rollno, String name, String address)
    {
        this.rollNum = rollno;
        this.name = name;
        this.address = address;
    }

    // Used to print student details in main()
    public String toString()
    {
        return this.rollNum + " " + this.name +
                " " + this.address;
    }
}

class Sortbyroll{
    public int binarySearchRecursive(int search, ArrayList<Student> a, int start, int end){

        int middle = (start + end)/2;

        if(end < start){
            return -1;
        }


        if (search < a.get(middle).rollNum){
            return binarySearchRecursive(search, a, start, middle - 1);
        }

        if (search > a.get(middle).rollNum){
            return binarySearchRecursive(search, a, middle + 1, end);
        }

        if (search == a.get(middle).rollNum){
            return middle;
        }

        return -1;
    }
}

class Sortbyname<T> implements Comparator<T>
{
    // Used for sorting in ascending order of
   // roll name

    @Override
    public int compare(T t1, T t2) {

        return 0;
    }
}


