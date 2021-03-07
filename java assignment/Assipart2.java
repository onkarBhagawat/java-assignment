import java.lang.*;
import java.io.*;
import java.util.*;

// 4. Write a program which accept matrix and display addition of elements From each
// column.
// Input :3 2 5 9
// 4 3 2 2
// 8 4 1 9
// 3 9 7 5
// Output : 18 18 15 25 
/* 

 class Demo {
    void AdditionCoulmn(int Row, int Column, int Arr[][]) {

        if ((Row < 0) || (Column < 0)) {
            System.out.println("ERROR:WRONG INPUT");
            return;
        }

        int iSum = 0;

        int Size1 = 0;
        int iNum = 0;
        int Size = 0;
        

            for (int j = 0; j < Arr.length; j++) {

                for (int i = 0; i < Arr.length; i++) {

                  
                        System.out.println(Arr[i][j]);
                        iSum = iSum + (Arr[i][j]);

                 
              

                }
                System.out.println("Addition of Column "+(j+1)+" elements is: "+iSum);
                iSum = 0;
            }
            
        }

    }


class Assipart2
 {
    public static void main(String Args[]) {
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Eneter NUMBER OF row");
        int Row = sobj.nextInt();
        System.out.println("Eneter NUMBER OF cloumn");
        int Column = sobj.nextInt();
        int Arr[][] = new int[Row][Column];
        System.out.println("ENTER ELEMENT");
        for (int i = 0; i < Arr.length; i++) {
            System.out.println("Row with index : " + i);
            for (int j = 0; j < Arr[i].length; j++) {
                System.out.println("Enter the element :" + i + " , " + j);
                Arr[i][j] = sobj.nextInt();
            }
        }
        System.out.println();
        Demo dobj = new Demo();
        dobj.AdditionCoulmn(Row, Column, Arr);

    }
}


 */

// 5. Write a program which accept matrix and swap the contents of consecutive rows.Input:
// 3 2 5 9 
// 4 3 2 2 
// 8 4 1 9
// 3 9 7 5 
//  Output:
// 4 3 2 2
// 3 2 5 9
// 3 9 7 5 
// 8 4 1 9

/* class Demo {
   void swap(int Row, int Column, int Arr[][]) {

       if ((Row < 0) || (Column < 0)) {
           System.out.println("ERROR:WRONG INPUT");
           return;
       }

       int Size = Arr.length;
       int Size1 = 0;
       int i = 0, j = 0;

       for (i = 0; i < Arr.length; i++) {
           System.out.println();
           for (j = 0; j < (Arr[i].length); j++) {

               if ((i < (Size - 1)) && (i % 2 == 0)) {

                   Size1 = Arr[i][j];
                   Arr[i][j] = Arr[i + 1][j];
                   Arr[i + 1][j] = Size1;
               }
               System.out.print(Arr[i][j] + "\t");

           }
         
       }

   }
}

class Assipart2 {
   public static void main(String Args[]) {
       int iRet = 0;
       Scanner sobj = new Scanner(System.in);
       System.out.print("Eneter NUMBER OF row:\t");
       int Row = sobj.nextInt();
       System.out.print("Eneter NUMBER OF cloumn:\t");
       int Column = sobj.nextInt();
       int Arr[][] = new int[Row][Column];
       System.out.println("ENTER ELEMENT");
       for (int i = 0; i < Arr.length; i++) {
           System.out.println("Row with index : " + i);
           for (int j = 0; j < Arr[i].length; j++) {
               System.out.println("Enter the element :" + i + " , " + j);
               Arr[i][j] = sobj.nextInt();
           }
       }
       System.out.println();
       Demo dobj = new Demo();
       dobj.swap(Row, Column, Arr);

   }
} 
*/

//....................Logic Building Assignment : 62 

// 1.Write a program which accept matrix from user and display transpose of the
// matrix.
// The transpose of a given matrix is formed by interchanging the rows and
// columns of a matrix. 
// Input :
// 3 2 5 9
// 4 3 2 2
// 8 4 1 5
// 3 9 7 5
// Output : 
// 3 4 8 3
// 2 3 4 9
// 5 2 1 7
// 9 2 5 5

/* class Demo {
   void transpose(int Row, int Column, int Arr[][]) {

       if ((Row < 0) || (Column < 0)) {
           System.out.println("ERROR:WRONG INPUT");
           return;
       }

       int Size = Arr.length;
       int Size1 = 0;
       int i = 0, j = 0;

       for (i = 0; i < Arr.length; i++) {

           for (j = i; j < (Arr[i].length); j++) {

               Size1 = Arr[j][i];
               Arr[j][i] = Arr[i][j];
               Arr[i][j] = Size1;

           }

       }

       for (i = 0; i < Arr.length; i++) {
           System.out.println();
           for (j = 0; j < (Arr[i].length); j++) {
               System.out.print(Arr[i][j] + "\t");
           }

       }

   }
}

class Assipart2 {
   public static void main(String Args[]) {
       int iRet = 0;
       Scanner sobj = new Scanner(System.in);
       System.out.print("Eneter NUMBER OF row:\t");
       int Row = sobj.nextInt();
       System.out.print("Eneter NUMBER OF cloumn:");
       int Column = sobj.nextInt();
       int Arr[][] = new int[Row][Column];
       System.out.println("ENTER ELEMENT");
       for (int i = 0; i < Arr.length; i++) {
           System.out.println("Row with index : " + i);
           for (int j = 0; j < Arr[i].length; j++) {
               System.out.println("Enter the element :" + i + " , " + j);
               Arr[i][j] = sobj.nextInt();
           }
       }
       System.out.println();
       Demo dobj = new Demo();
       dobj.transpose(Row, Column, Arr);

   }
}  */

//2. Write a program which accept matrix and reverse the contents of each row.Input:
// 3 2 5 9
// 4 3 2 2
// 8 4 1 9
// 3 9 7 5
// Output : 
// 9 5 2 3
// 2 2 3 4
// 9 1 4 8
// 5 7 9 3

/* class Demo {
    void reverse(int Row, int Column, int Arr[][]) {

        if ((Row < 0) || (Column < 0)) {
            System.out.println("ERROR:WRONG INPUT");
            return;
        }

        int Size = Arr.length;
        int Size1 = 0;
        int i = 0, j = 0;

        for (i =0; i <Arr.length; i++) {
            System.out.println();
            for (j =(Arr[i].length)-1; j >=0 ; j--) {
                System.out.print(Arr[i][j] + "\t");
            }

        }

       
    }
}

class Assipart2 {
    public static void main(String Args[]) {
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.print("Eneter NUMBER OF row:\t");
        int Row = sobj.nextInt();
        System.out.print("Eneter NUMBER OF cloumn:");
        int Column = sobj.nextInt();
        int Arr[][] = new int[Row][Column];
        System.out.println("ENTER ELEMENT");
        for (int i = 0; i < Arr.length; i++) {
            System.out.println("Row with index : " + i);
            for (int j = 0; j < Arr[i].length; j++) {
                System.out.println("Enter the element :" + i + " , " + j);
                Arr[i][j] = sobj.nextInt();
            }
        }
        System.out.println();
        Demo dobj = new Demo();
        dobj.reverse(Row, Column, Arr);

    }
} */

// 3. Write a program which accept matrix and reverse the contents of each
// column. 
// Input :
// 3 2 5 9
// 4 3 2 2
// 8 4 1 9
// 3 9 7 5
// Output :
// 3 9 7 5
// 8 4 1 9
// 4 3 2 2
// 3 2 5 9

/* class Demo {
    void reverse(int Row, int Column, int Arr[][]) {

        if ((Row < 0) || (Column < 0)) {
            System.out.println("ERROR:WRONG INPUT");
            return;
        }

        int Size = Arr.length;
        System.out.print( Arr.length);
        int Size1 = 0;
        int i = 0, j = 0;
        int k = (Size - 1);

        // for (i = 0; i < Arr.length/2; i++) {
        //     System.out.println();
        //     for (j = 0; j < Arr.length; j++) {
        //         Size1 = Arr[i][j];
        //         Arr[i][j] = Arr[k][j];
        //         Arr[k][j] = Size1;
        //         // System.out.print(Arr[i][j] + "\t");
        //     }
        //     k--;
        // }
        // for (i = 0; i < Arr.length; i++) {
        //     for (j = 0; j < Arr[i].length; j++) {
        //         System.out.print(Arr[i][j] + "\t");
        //     }
        //     System.out.println();
        // }
/////////////////////or/////////////////
        // for (i =(Arr.length-1); i>=0; i--) {
        //         System.out.println();
        //         for (j = 0; j < Arr[i].length; j++) {
                
        //             System.out.print(Arr[i][j] + "\t");
        //         }
        //     }
    }
}

class Assipart2 {
    public static void main(String Args[]) {
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.print("Eneter NUMBER OF row:\t");
        int Row = sobj.nextInt();
        System.out.print("Eneter NUMBER OF cloumn:");
        int Column = sobj.nextInt();
        int Arr[][] = new int[Row][Column];
        System.out.println("ENTER ELEMENT");
        for (int i = 0; i < Arr.length; i++) {
            System.out.println("Row with index : " + i);
            for (int j = 0; j < Arr[i].length; j++) {
                System.out.println("Enter the element :" + i + " , " + j);
                Arr[i][j] = sobj.nextInt();
            }
        }
        System.out.println();
        Demo dobj = new Demo();
        dobj.reverse(Row, Column, Arr);

    }
} 
 */

// 4. Write a program which accept matrix and check whether the matrix is
// identity matrix or not. 

// Identity matrix is a square matrix with 1’s along the diagonal from upper left to
// lower right and 0’s in all other positions.
// If it satisfies the structure as explained before then the matrix is called as
// identity matrix. 

//Input : 
// 1 0 0 0
// 0 1 0 0
// 0 0 1 0
// 0 0 0 1
//Output : True 

/* class Demo {
    boolean identitymatrix(int Row, int Column, int Arr[][]) {

        if ((Row < 0) || (Column < 0) || (Row != Column)) {
            System.out.println("ERROR:WRONG INPUT");
            return false;
        }

        int Size = Arr.length;
        System.out.print(Arr.length);
        int Size1 = 0;
        int i = 0, j = 0;
        int k = 0;
        boolean flag = false;

        for (i = 0; i < Arr.length; i++) {
            System.out.println();
            for (j = 0; j < Arr.length; j++) {

                if ((i == j) && (Arr[i][j] == 1)) {

                    k++;

                } else if ((i != j) && (Arr[i][j] == 0)) {
                    k++;

                } else {
                    break;
                }
            }
        }

        if (k == Size * Size) {

            return true;
        } else {

            return false;
        }

    }
}

class Assipart2 {
    public static void main(String Args[]) {
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.print("Eneter NUMBER OF row:\t");
        int Row = sobj.nextInt();
        System.out.print("Eneter NUMBER OF cloumn:");
        int Column = sobj.nextInt();
        int Arr[][] = new int[Row][Column];
        if ((Row < 0) || (Column < 0) || (Row != Column)) {
            System.out.println("ERROR:WRONG INPUT");
            return;
        }

        System.out.println("ENTER ELEMENT");
        for (int i = 0; i < Arr.length; i++) {
            System.out.println("Row with index : " + i);
            for (int j = 0; j < Arr[i].length; j++) {
                System.out.println("Enter the element :" + i + " , " + j);
                Arr[i][j] = sobj.nextInt();
            }
        }
        System.out.println();
        Demo dobj = new Demo();
        boolean Bret = dobj.identitymatrix(Row, Column, Arr);
        if (Bret == true) {
            System.out.println("Matrix is identical");

        } else {

            System.out.println("Matrix is not identical");
        }

    }
}
 */

// 5. /Write a program which accept matrix and check whether the matrix is
// Sparse matrix or not.
// Sparse matrix is a matrix with the majority of its elements equal to zero. 

// 1 0 3 0
// 0 6 0 0
// 0 0 1 0
// 9 0 0 9
// Output : True

/* class Demo {
    boolean Sparsematrix(int Row, int Column, int Arr[][]) {

        if ((Row < 0) || (Column < 0) || (Row != Column)) {
            System.out.println("ERROR:WRONG INPUT");
            return false;
        }

        int Size = Arr.length;

        int Size1 = 0;
        int i = 0, j = 0;
        int k = 0, l = 0;
        boolean flag = false;

        for (i = 0; i < Arr.length; i++) {
            System.out.println();
            for (j = 0; j < Arr.length; j++) {

                if ((Arr[i][j] == 0)) {
                    k++;
                } else {
                    l++;
                }
            }
        }

        if (k > l) {

            return true;
        } else {

            return false;
        }

    }
}

class Assipart2 {
    public static void main(String Args[]) {
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.print("Eneter NUMBER OF row:\t");
        int Row = sobj.nextInt();
        System.out.print("Eneter NUMBER OF cloumn:");
        int Column = sobj.nextInt();
        int Arr[][] = new int[Row][Column];
        if ((Row < 0) || (Column < 0) || (Row != Column)) {
            System.out.println("ERROR:WRONG INPUT");
            return;
        }

        System.out.println("ENTER ELEMENT");
        for (int i = 0; i < Arr.length; i++) {
            System.out.println("Row with index : " + i);
            for (int j = 0; j < Arr[i].length; j++) {
                System.out.println("Enter the element :" + i + " , " + j);
                Arr[i][j] = sobj.nextInt();
            }
        }
        System.out.println();
        Demo dobj = new Demo();
        boolean Bret = dobj.Sparsematrix(Row, Column, Arr);
        if (Bret == true) {
            System.out.println("Matrix is Sparse");

        } else {

            System.out.println("Matrix is not Sparse");
        }

    }
}
 */

