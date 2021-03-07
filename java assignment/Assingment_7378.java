import java.lang.*;
import java.util.*;

import java.io.*;

//                               Logic Building Assignment : 73
// 1. java program to print pyramid of characters using class
// Enter Number : 5
//  A
//  A B A
//  A B C B A
//  A B C D C B A
//  A B C D E D C B A 

/* class Demo {
    void Pyramid() {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number");
        int No = sobj.nextInt();
        // int j = 0;
        for (int i = 1; i <= No; i++) {
            for (int j = 1; j <= No - i + 1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (64 + j) + " ");
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print((char) (64 + j) + " ");
            }
            System.out.println();
        }

    }

}9

class Assingment_7378 {
    public static void main(String Args[]) {
        System.out.println("OMi");
        Demo obj = new Demo();
        obj.Pyramid();
    }

}
 */
// 2. Program to check given strings are Anagram or not
// This java program will read two strings and check whether they
// are anagram strings or not.
/* class Anagram {
    boolean Anagramstring(String Arr, String Brr) {
        char crr[];
        char prr[];
        char temp;
        crr = Arr.toCharArray();
        prr = Brr.toCharArray();
        // Arrays.sort(crr);
        // Arrays.sort(prr);
        ////////////////////////////// or We can use/////////////////
        for (char p = 0; p <= crr.length; p++) {

            for (char i = 0; i < (crr.length) - 1; i++) {
                if (crr[i] > crr[i + 1]) {
                    temp = crr[i];
                    crr[i] = crr[i + 1];
                    crr[i + 1] = temp;

                }

            }

            for (char i = 0; i < (prr.length) - 1; i++) {
                if (prr[i] > prr[i + 1]) {
                    temp = prr[i];
                    prr[i] = prr[i + 1];
                    prr[i + 1] = temp;

                }

            }
        }
       
        String omi= new String(crr);  
        System.out.println(omi);
        String om = new String(prr);
        if (omi.equals(om)) {
            return true;
        } else {
            return false;
        }
    }

}

class input {
    void getinput() {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter 1st String");
        String Arr = sobj.nextLine();
        System.out.println("Enter 2nd String");
        String Brr = sobj.nextLine();
        Anagram aobj = new Anagram();
        boolean iret = aobj.Anagramstring(Arr, Brr);
        if (iret == true) {
            System.out.println("is Alagrm");
        } else {
            System.out.println("is not Alagram");
        }

    }

}

class Assingment_7378 {
    public static void main(String args[]) {
        input iobj = new input();
        iobj.getinput();

    }
}
 */
/* 
// 3. Java program to input a string from user and reverse each
// word of given string 

class Demo {
    void reveres() {
        System.out.println("Enter String");
        Scanner sobj = new Scanner(System.in);
        String Name = sobj.nextLine();
        char Arr[] = Name.toCharArray();
        StringBuilder Newstr = new StringBuilder();
        String s[] = Name.split(" ");

        for (String P : s) {

        StringBuilder np = new StringBuilder(P);
        String temp = np.reverse().toString();
        Newstr.append(temp + " ");

        }
        System.out.print(Newstr);
       
        
    }
}

class Assingment_7378 {
    public static void main(String Args[]) {
        Demo dobj = new Demo();
        dobj.reveres();

    }
}*/

// 4. Java program to read and add two distances using class
// In this java program, we will read two distances in feet and inches and
// find their sum, here program is implementing using class and objects
// concept.
// Given program is used to read two distances (in feet and inches) and
// print their sum in feet and inches, note that if total inches are more than
// 12 then it would be consider as 1 feet.
// Example:
// Input:
// Enter first distance:
// Enter feet: 20
// Enter inches: 10
// Enter second distance:
// Enter feet: 20
// Enter inches: 10
// Output:
// Total distance is:
// Feet: 41 Inches: 8 

/* class Add {
    private int inch;

    private int feet;

    public void getNo() {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter feet:");
        feet = sobj.nextInt();
        System.out.println("Enter inch:");
        inch = sobj.nextInt();

    }

    public void showNo() {
        System.out.println("Feet:" + feet + "\tinch:" + inch);
    }

    public void AddDistance(Add d1, Add d2) {
        inch = d1.inch + d2.inch;
        System.out.println(inch);
        feet = d1.feet + d2.feet + (inch / 12);
        System.out.println(feet);
        inch = inch % 12;
        System.out.println(inch);
    }
}

class Assingment_7378 {
    public static void main(String args[]) {

        Add d1 = new Add();
        Add d2 = new Add();
        Add d3 = new Add();
        d1.getNo();
        d2.getNo();
        d3.AddDistance(d1,d2);
        d3.showNo();

    }
} */
/* 
//5. Write Java program to Transpose a Matrix. 

public class Assingment_7378 {
    public static void main(String args[]) {
        int row, col;

        Scanner sc = new Scanner(System.in);

        // Read number of rows and cols
        System.out.print("Input number of rows: ");
        row = sc.nextInt();
        System.out.print("Input number of Column: ");
        col = sc.nextInt();

        // declare two dimensional array (matrices)
        int a[][] = new int[row][col];

        // Read elements of Matrix a
        System.out.println("Enter elements of matrix a:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Element [" + (i + 1) + "," + (j + 1) + "] ? ");
                a[i][j] = sc.nextInt();
            }
        }

        // print matrix a
        System.out.println("Matrix a:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.print("\n");
        }

        // print matrix b

        System.out.println("::: Transpose Matrix ::: ");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(a[j][i] + "\t");
            }
            System.out.print("\n");
        }

    }
}
 */

// Logic Building Assignment : 74
// 1. Write java program which Add Two Matrices. 
/* class Demo {
    public void AddMatrix() {
        int Row, Column;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enetr no of Rows");
        Row = sobj.nextInt();
        System.out.println("Enter no of column");
        Column = sobj.nextInt();
        System.out.println("Element are");
        int Arr[][] = new int[Row][Column];
        int Brr[][] = new int[Row][Column];

        System.out.println("ELEment for Mytrix Arr");
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Column; j++) {
                System.out.print("ELEMENT INDEX:[" + (i + 1) + "," + (j + 1) + "] ");

                Arr[i][j] = sobj.nextInt();

            }
        }
        System.out.println("ELEment for Mytrix Brr");

        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Column; j++) {
                System.out.print("ELEMENT INDEX:[" + (i + 1) + "," + (j + 1) + "] ");

                Brr[i][j] = sobj.nextInt();

            }
        }
        System.out.println("Matrix Arr");
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Column; j++) {
                System.out.print(Arr[i][j] + "\t");

            }
            System.out.println();
        }
        System.out.println("Matrix Brr");
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Column; j++) {
                System.out.print(Brr[i][j] + "\t");

            }
            System.out.println();
        }
        System.out.println("Addition MAtrix is");
        {
            for (int i = 0; i < Row; i++) {
                for (int j = 0; j < Column; j++) {
                    System.out.print((Arr[i][j] + Brr[i][j])+"\t");

                }
                System.out.println();
            }
        }

    }
}

class Assingment_7378 {
    public static void main(String args[]) {
        Demo dobj = new Demo();
        dobj.AddMatrix();

    }
}
 */

// 2. Write java program to print below pattern.
//  *
//  * *
//  * * *
//  * * * *
//  * * * * *
/* 
class Assingment_7378 {
    public static void main(String args[]) {
        int p = 4;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= p; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            p--;
        }

    }
}
 */
// 3. Write java program to print below pattern.
//  * * * * *
//  * * * *
//  * * *
//  * *
//  *

class Assingment_7378 {
    public static void main(String args[]) {
        int p = 4;
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= p; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            p++;
        }

    }
}
