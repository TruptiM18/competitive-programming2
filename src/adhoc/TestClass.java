/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
package adhoc;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner s = new Scanner(System.in);
        // Write your code here
        Set<Integer> set=new HashSet<>();
        while(s.hasNextInt()){
            set.add(s.nextInt());
        }
        int [] price=new int[31];
        price[0]=0;
        for(int i=1;i<=30;i++){
            if(!set.contains(i)){
                price[i]=price[i-1];
            }
            else{
                price[i]=price[i-1]+2;
                int priceOfSevenDayBefore= i-7>=1 ? price[i-7]+7 : 7;
                price[i]=Math.min(price[i],priceOfSevenDayBefore);
                int priceThirtyDayBefore= i-30>=1 ? price[i-30]+25 : 25;
                price[i]=Math.min(price[i],priceThirtyDayBefore);
            }
        }
        System.out.print(price[30]+"\n");

    }


}
