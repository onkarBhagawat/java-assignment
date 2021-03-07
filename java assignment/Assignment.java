import java.lang.*;
import java.util.*;
import java.io.*;

///////// Write a program which accept name from user and print that name.////

/*
  class Assignment { public static void main(String Arr[]) throws Exception {
  System.out.println("inside main");
  
  for (int i = 0; i < (Arr.length); i++) { System.out.println(Arr[i]); } }
  
  }
 /

/
  class Assignment { public static void main(String Arr[]) throws Exception {
  Scanner sobj = new Scanner(System.in); System.out.println("ENTER YOUR NAME");
  String name = sobj.nextLine(); System.out.println("ENTER YOUR Age"); int Age
  = sobj.nextInt(); System.out.println("ENTER YOUR NAME->>>" + name);
System.out.println("ENTER YOUR Age->>>" + Age);
  
  } }
 */

//// 2. Write a program which accept one number from user and check whether that
//// number is greater than 100 or not

/* 
class Demo {
    int Greater(int iNo) {
        if (iNo < 0) {
            return -1;
        }
        if (iNo > 100) {
            return 1;
        } else {
            return 0;
        }

    }
}

class Assignment {
    public static void main(String Arr[]) throws Exception {
        Demo dobj = new Demo();
        int i = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("ENTER NUMBER");
        int iNo = sobj.nextInt();
        if (iNo < 0) {
            return;
        }
        i = dobj.Greater(iNo);
        if (i == 1) {
            System.out.println("Greater THan 100");
        } else {
            System.out.println("less THan 100");
        }
    }
}/ */

//////// Write a program which accept two numbers and check whether numbers are
//////// equal or not. /////

/* 
class Demo {
    int Check(int iNo1, int iNo2) {
        if (iNo1 == iNo2) {
            return 1;
        } else {
            return 0;
        }
    }
}

class Assignment {
    public static void main(String Arr[]) throws Exception {
        Demo dobj = new Demo();
        int iNo1 = 0, iNo2 = 0, i = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("ENTER TWO NUMBER\t");
        iNo1 = sobj.nextInt();
        iNo2 = sobj.nextInt();
        i = dobj.Check(iNo1, iNo2);
        if ((i == 1)) {
            System.out.println("NYMBER ARE SAME");
        } else {
            System.out.println("NYMBER ARE DIFFERENT");
        }

    }

}/
 */
//////////////////// Write a program which accept total marks & obtained marks
//////////////////// from user and calculate percentage. //////
/* /

class Demo {
    float Persentage(float iNo1, float iNo2) {
        float i = ((iNo2 * 100) / iNo1);
        return i;
    }
}

class Assignment {
    public static void main(String Arr[]) throws Exception {
        Scanner sobj = new Scanner(System.in);
        Demo dobj = new Demo();
        System.out.println("ENTER TWO NUMBER\t");
        float iNo1 = sobj.nextFloat();
        float iNo2 = sobj.nextFloat();
        float iRet = dobj.Persentage(iNo1, iNo2);
        System.out.println("PERCENATGE ARE\t:" + iRet);

    }
}/

/////// 1.Write a program which accept number from user and display its digits
/////// in reverse order /////////

/

class Demo {
    int i = 0;

    int DIGIT(int iNo1) {
        while ((iNo1 != 0)) {
            i = (i * 10) + (iNo1 % 10);
            iNo1 = iNo1 / 10;
        }

        return i;
    }
}

class Assignment {
    public static void main(String Arr[]) throws Exception {
        Scanner sobj = new Scanner(System.in);
        Demo dobj = new Demo();
        System.out.println("ENTER one NUMBER\t");
        int iNo1 = sobj.nextInt();

        int iRet = dobj.DIGIT(iNo1);
        System.out.println("DIGIT ARE\t:" + iRet);

    }
} */

/////////////////// Logic Building Assignment : 13

// 1. Accept number from user and display below pattern.
// Input : 5
// Output : A B C D E
/* 
class Demo {

    void Display(int iNo) {
        char arr[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'j', 'K', 'L', 'M', 'O', 'P', 'Q', 'R', 'S', 'T',
                'U', 'V', 'W', 'X', 'Y', 'Z' };

        for (int i = 0; i <= iNo; i++) {

            System.out.println(arr[i]);
        }

    }
}

class Assignment {
    public static void main(String Arr[]) throws Exception {
  Demo dobj = new Demo(); Scanner sobj = new Scanner(System.in);
  
  System.out.println("ENTER YOUR NUMBER"); int iNo = sobj.nextInt();
  dobj.Display(iNo); }**
}
 */
///////////////////////////////////// Logic Building Assignment : 53
// 1. Write Java program which accept N numbers from user and return
// difference between summation of even elements and summation of
// odd elements.
/* 
class Demo {
    int EvenOdd() {
        int iSum = 0, iAns = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("ENTER NUMBER");
        int iNo = sobj.nextInt();
        if (iNo < 0) {
            iNo = -iNo;
        }
        int Arr[] = new int[iNo];
        System.out.println("ENTER INPUT");
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = sobj.nextInt();
            if ((Arr[i] % 2) == 0) {
                iSum = iSum + Arr[i];

            } else {
                iAns = iAns + Arr[i];
            }
        }

        for (int No : Arr) {
            System.out.println(No);
        }
        return iSum - iAns;

    }
}

class Assignment {

    public static void main(String Arr[]) throws Exception {
        int iRet = 0;
        Demo dobj = new Demo();
        iRet = dobj.EvenOdd();
        System.out.println("DIFFERNCE BETWEEN EVEN AND ODD IS->>:" + iRet);
    }}
 */
// 2. Write Java program which accept N numbers from user and display // all
//such elements which are divisible by 5
/* 
class Demo {
    void Divisible() {

        int iSum = 0, iAns = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Nubmer");
        int iNo = sobj.nextInt();

        if (iNo < 0) {
            iNo = -iNo;
        }
        System.out.println("Enter ELEMENT");
        int Arr[] = new int[iNo];
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = sobj.nextInt();
        }
        for (int i = 0; i < Arr.length; i++) {
            if ((Arr[i] % 5) == 0) {
                System.out.println("Nubmer ARE:->>" + Arr[i]);

            }
        }

    }
}

class Assignment {

        public static void main(String Arr[]) throws Exception {
            int iRet = 0;
            Demo dobj = new Demo();
            dobj.Divisible();

        }
}/
 */

/*
  // 3. Write Java program which accept N numbers from user and display //all
  such elements which are even and divisible by 5.
  
  class Demo { void Divisible() {
 
  int iSum = 0, iAns = 0; Scanner sobj = new Scanner(System.in);
  System.out.println("Enter Nubmer"); int iNo = sobj.nextInt();
 
  if (iNo < 0) { iNo = -iNo; } System.out.println("Enter ELEMENT"); int Arr[] =
  new int[iNo]; for (int i = 0; i < Arr.length; i++) { Arr[i] = sobj.nextInt();
  } for (int i = 0; i < Arr.length; i++) { if (((Arr[i] % 5) == 0)&&((Arr[i] %
  2) == 0)) { System.out.println("Nubmer ARE:->>" + Arr[i]);
  
  } }
  
  } }
  
  class Assignment {
  
  public static void main(String Arr[]) throws Exception { int iRet = 0; Demo
  dobj = new Demo(); dobj.Divisible();
  
  } }
 /
 //* / 4. Write Java program which accept N numbers from user and display
 //all such elements which are divisible by 3 and 5. class Demo { void
 Divisible() {
* 
* int iSum = 0, iAns = 0; Scanner sobj = new Scanner(System.in);
 System.out.println("Enter Nubmer"); int iNo = sobj.nextInt();
 
 if (iNo < 0) { iNo = -iNo; } System.out.println("Enter ELEMENT"); int Arr[] =
 new int[iNo]; for (int i = 0; i < Arr.length; i++) { Arr[i] = sobj.nextInt();
 } for (int i = 0; i < Arr.length; i++) { if (((Arr[i] % 3) == 0) && ((Arr[i]
 % 5) == 0)) { System.out.println("Nubmer ARE:->>" + Arr[i]);
 
 } }
  
  } }
 
  class Assignment {
  
  public static void main(String Arr[]) throws Exception { int iRet = 0; Demo
  dobj = new Demo(); dobj.Divisible();
  
  } }
 /
*/

// 5. Write Java program which accept N numbers from user and display // all
//such elements which are multiples of 11.
/* 
class Demo {
    void Divisible() {

        int iSum = 0, iAns = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Nubmer");
        int iNo = sobj.nextInt();

        if (iNo < 0) {
            iNo = -iNo;
        }
        System.out.println("Enter ELEMENT");
        int Arr[] = new int[iNo];
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = sobj.nextInt();
        }
        for (int i = 0; i < Arr.length; i++) {
            if ((Arr[i] % 11 == 0)) {
                System.out.println("Nubmer ARE:->>" + Arr[i]);

            }
        }

    }
}

class Assignment {

    public static void main(String Arr[]) throws Exception {
        int iRet = 0;
        Demo dobj = new Demo();
        dobj.Divisible();

    }}/ */

/////////////// Logic Building Assignment : 54

// 1.Write a java program which accept number from user and return the //
//count of even digits.
/* 
class Demo {
    void Count() {

        int iSum = 0, iAns = 0, iDigit = 0, Cnt = 0;
        ;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Nubmer");
        int iNo = sobj.nextInt();
        if (iNo < 0) {
            iNo = -iNo;
        }
        while (iNo != 0) {
            iDigit = iNo % 10;
            if (iDigit % 2 == 0) {
                Cnt++;
                System.out.println("Even DIGIT IS:->>" + iDigit);
            }
            iNo = iNo / 10;

        }
        System.out.println("Even DIGIT COUNT IS:->>" + Cnt);

    }
}

class Assignment {

    public static void main(String Arr[]) throws Exception {
        int iRet = 0;
        Demo dobj = new Demo();
        dobj.Count();

    }}/

    /
 */

// 3.Write a program which accept number from user and return the //count of
//digits in between 3 and 7.
/* 
class Demo {
    void Count() {

        int iSum = 0, iAns = 0, iDigit = 0, Cnt = 0;
        ;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Nubmers");
        int iNo1 = sobj.nextInt();

        if ((iNo1 < 0)) {
            iNo1 = -iNo1;

        }
        while (iNo1 != 0) {
            iDigit = iNo1 % 10;
            if ((iDigit > 3) && (iDigit < 7)) {
                Cnt++;
                System.out.println("Even DIGIT IS:->>" + iDigit);
            }
            iNo1 = iNo1 / 10;

        }
        System.out.println("Even DIGIT COUNT IS:->>" + Cnt);

    }
}

class Assignment {

    public static void main(String Arr[]) throws Exception {
        int iRet = 0;
        Demo dobj = new Demo();
        dobj.Count();

    }
}

/
 */
// /4.Write a program which accept number from user and return
// multiplication of all digits.

/* /

class Demo {
    void Count() {

        int iSum = 0, iAns = 0, iDigit = 1, Cnt = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Nubmers");
        int iNo1 = sobj.nextInt();

        if ((iNo1 < 0)) {
            iNo1 = -iNo1;

        }
        while (iNo1 != 0) {
            iDigit = iDigit * (iNo1 % 10);
            iNo1 = iNo1 / 10;

        }
        System.out.println("MULTIPLICATION OF ALL DIGIT IS IS:->>" + iDigit);

    }
}

class Assignment {

        public static void main(String Arr[]) throws Exception {
            int iRet = 0;
            Demo dobj = new Demo();
            dobj.Count();

        }
    }/ */

//////////////////// Logic Building Assignment : 55

// 1. Write java program which accept N numbers from user and accept
// one another number as NO , check whether NO is present or not.

/* //* 

class Demo {
    boolean Check(int iNo1, int iNo2) {
        int i = 0;
        if ((iNo1 < 0) && (iNo2 < 0)) {
            iNo1 = -iNo1;
            iNo2 = -iNo2;

        }
        Scanner sobj = new Scanner(System.in);
        int Brr[] = new int[iNo1];
        System.out.println("Enter ELEMENT");
        for (i = 0; i < Brr.length; i++) {
            Brr[i] = sobj.nextInt();
        }

        for (i = 0; i < Brr.length; i++) {
            if ((Brr[i] == iNo2)) {
                break;
            } else {
                break;
            }
        }
        if ((Brr[i] == iNo2)) {
            return true;
        } else {
            return false;
        }

    }

}

class Assignment {

        public static void main(String Arr[]) throws Exception {
            boolean iRet;
            Demo dobj = new Demo();
            Scanner sobj = new Scanner(System.in);
            System.out.println("Enter Nubmers");
            int iNo1 = sobj.nextInt();
            System.out.println("Enter Match Nubmer");
            int iNo2 = sobj.nextInt();
            if ((iNo1 < 0) && (iNo2 < 0)) {
                iNo1 = -iNo1;
                iNo2 = -iNo2;

            }
            iRet = dobj.Check(iNo1, iNo2);
            if (iRet == true) {
                System.out.println("NUMBER IS MACHING");
            } else {
                System.out.println("NUMBER IS NOT MACHING");
            }
        }
    }/  */

// 2. Write java program which accept N numbers from user and accept
// one another number as NO , return index of first occurrence of that
// NO.
/* 

class Demo {

    int FirstOcc() {
        int i = 0, c = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("ENTER NuMBER");
        int iNo1 = sobj.nextInt();
        int Brr[] = new int[iNo1];

        System.out.println("ENTER MATCH NUMBER");
        int iNo2 = sobj.nextInt();

        System.out.println("ENTER ELEMENT");

        while (i != (Brr.length)) {
            Brr[i] = sobj.nextInt();
            i++;
        }

        for (i = 0; i < Brr.length; i++) {
            if (Brr[i] == iNo2) {
                break;
            } else {
                break;
            }

        }
        if (Brr[i] == iNo2) {
            return i;
        } else {
            return -1;
        }

    }
}

class Assignment {
        public static void main(String Arr[]) throws Exception {
            int iRet = 0;
            Demo dobj = new Demo();
            iRet = dobj.FirstOcc();
            System.out.println("First Occurance index is->>:\t" + iRet);

        }
    }/
 */

// 3. Write java program which accept N numbers from user and accept
// one another number as NO , return index of last occurrence of that NO.
/* 
class Demo {

    System.out.println("ENTER MATCH NUMBER");
    int iNo2 = sobj.nextInt();

    System.out.println("ENTER ELEMENT");

    while(i!=(Brr.length))
    { Brr[i] = sobj.nextInt(); i++; }

    for(i=0;i<Brr.length;i++)
    {
        if (Brr[i] == iNo2) {

            c = i;
            c++;
        }

    }return c-1;
}}

class Assignment {
    public static void main(String Arr[]) throws Exception {
        int iRet = 0;
        Demo dobj = new Demo();
        iRet = dobj.FirstOcc();
        System.out.println("Last Occurance index is->>:\t" + iRet);

    }
}
 */

// 4. Write java program which accept N numbers from user and accept
// Range, Display all elements from that range
/* 


class Demo {

    void Range() {
        int i = 0, c = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("ENTER ELEMENT");
        int iNo3 = sobj.nextInt();
        int Brr[] = new int[iNo3];
        System.out.println("ENTER Start NuMBER");
        int iNo1 = sobj.nextInt();
        System.out.println("ENTER End NUMBER");
        int iNo2 = sobj.nextInt();

        System.out.println("ENTER ELEMENT");

        if (iNo1 > iNo2) {
            return;
        }
        while (i != (Brr.length)) {
            Brr[i] = sobj.nextInt();
            i++;
        }

        for (i = 0; i < Brr.length; i++) {
            if ((Brr[i] >= iNo1) && (Brr[i] <= iNo2)) {

                System.out.println("Betwwn Range Element Are-->>:" + Brr[i]);
            }

        }

    }
}

class Assignment {
    public static void main(String Arr[]) throws Exception {
        int iRet = 0;
        Demo dobj = new Demo();
        dobj.Range();

    }}/ */

// 5. Write java program which accept N numbers from user and return
//product of all odd elements.
// Input : N : 6

// Elements : 15 66 3 70 10 88
/* 
class Demo {

    int OddProduct() {
        int i = 0, iMulty = 1;
        Scanner sobj = new Scanner(System.in);
        System.out.println("ENTER ELEMENT");
        int iNo3 = sobj.nextInt();
        int Brr[] = new int[iNo3];
        System.out.println("ENTER ELEMENT");
        while (i != (Brr.length)) {
            Brr[i] = sobj.nextInt();
            i++;
        }

        for (i = 0; i < Brr.length; i++) {
            if ((Brr[i] % 2 != 0))

                iMulty = iMulty * Brr[i];
        }
        return iMulty;
    }
}

class Assignment {
    public static void main(String Arr[]) throws Exception {
        int iRet = 0;
        Demo dobj = new Demo();
        iRet = dobj.OddProduct();
        System.out.println("ODD PRODUCT IS-->" + iRet);

    }}
 */

// --------- Logic Building Assignment : 56 // 1.Write a Java program which
//accept string from user and count // number of capital characters.
/* 
class Demo {

    int CountCapital() throws Exception {
        char i = '\0';
        int j = 0;
        int c = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("ENTER String");
        String Name = sobj.nextLine();
        for (j = 0; j < Name.length(); j++) {
            char ch = Name.charAt(j);
            if ((ch >= 'A') && (ch <= 'Z')) {
                c++;
            }
        }
        return c;
    }
}

class Assignment {
    public static void main(String Arr[]) throws Exception {
        int iRet = 0;
        Demo dobj = new Demo();
        iRet = dobj.CountCapital();
        System.out.println("Capital Character are-->" + iRet);

    }}

    // 2. Write a java program which accept string from user and count // number
    of small characters.

    class Demo {

        int CountSmall() throws Exception {
            char i = '\0';
            int j = 0;
            int c = 0;
            Scanner sobj = new Scanner(System.in);
            System.out.println("ENTER String");
            String Name = sobj.nextLine();
            for (j = 0; j < Name.length(); j++) {
                char ch = Name.charAt(j);
                if ((ch >= 'a') && (ch <= 'z')) {
                    c++;
                }
            }
            return c;
        }
    }

    class Assignment {
        public static void main(String Arr[]) throws Exception {
            int iRet = 0;
            Demo dobj = new Demo();
            iRet = dobj.CountSmall();
            System.out.println("Capital Character are-->" + iRet);

        }
}
 */

// 3. Write a java program which accept string from user and return //
// difference between frequency of small characters and frequency // of capital
// characters.
/* 
class Demo {
    int DiffSmallCapital() throws Exception {
        char i = '\0';
        int j = 0;
        int c = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("ENTER String");
        String Name = sobj.nextLine();
        for (j = 0; j < Name.length(); j++) {
            char ch = Name.charAt(j);
            if ((ch >= 'a') && (ch <= 'z')) {
                c++;
            } else {
                c--;
            }
        }
        return c;
    }
}

class Assignment {
    public static void main(String Arr[]) throws Exception {
        int iRet = 0;
        Demo dobj = new Demo();
        iRet = dobj.DiffSmallCapital();
        System.out.println("Capital Character are-->" + iRet);

    }
}/ */
/* 
// 4. Write a java program which accept string from user and check
// whether it contains vowels in it or not.

class Demo {
    boolean CheckVowels() throws Exception {
        char ch = '\0';
        int j = 0;
        int c = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("ENTER String");
        String Name = sobj.nextLine();
        for (j = 0; j < Name.length(); j++) {
            ch = Name.charAt(j);
            if (((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u'))
                    || ((ch == 'A') || (ch == 'E') || (ch == 'I') || (ch == 'O') || (ch == 'U'))) {
                break;
            } else {
                break;
            }
        }
        if (((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u'))
                || ((ch == 'A') || (ch == 'E') || (ch == 'I') || (ch == 'O') || (ch == 'U'))) {
            return true;
        } else {
            return false;
        }

    }
}

class Assignment {
    public static void main(String Arr[]) throws Exception {
        boolean iRet;
        Demo dobj = new Demo();
        iRet = dobj.CheckVowels();
        if (iRet == true) {
            System.out.println("STRING CONTAINS VOWELS");
        } else {
            System.out.println("STRING has not CONTAINS VOWELS");
        }

    }
} */

// 5. Write a java program which accept string from user and display
// it in reverse order.

/* class Demo {
    void Revers() throws Exception {
        char i = '\0';

        int j = 0;
        int c = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("ENTER String");
        String Name = sobj.nextLine();
        char Arr[];
        Arr = Name.toCharArray();
        for (j = (Arr.length -1); j >= 0; j--) {
            System.out.print(Arr[j]);
        }
    }
} 

class Assignment {
    public static void main(String Arr[]) throws Exception {
        int iRet = 0;
        Demo dobj = new Demo();
        dobj.Revers();

    }
}
*/





