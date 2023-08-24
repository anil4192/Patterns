// *
// **
// ***
// ****
// *****

import java.util.Scanner;

// class starPattern{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=0;i<n;i++)
//         {
//             for(int j=0;j<i+1;j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



// ****
// ***
// **
// *




// public class starPattern{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i=0;i<n;i++)
//         {
//             for(int j=i;j<n;j++)
//             {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }



// 1
// 12
// 123
// 1234




// public class starPattern{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=0;i<n;i++)
//         {
//             for(int j=0;j<i+1;j++)
//             {
//                 System.out.print(j+1);
//             }
//             System.out.println();
//         }
//     }
// }


// A
// BC
// DEF
// GHIJ



// public class starPattern{
//     public static void main(String[] args) {
//         char c = 'A';
//         for(int i=0;i<5;i++)
//         {
            
//             for(int j=0;j<i;j++)
//             {
//                 System.out.print(c);
//                 c++;
//             }
//             System.out.println();
//         }
//     }
// }



// * * * * *
// *       *
// *       *
// *       *
// * * * * *


// class starPattern{
//     public static void main(String[] args) {
//         int row = 5;
//         int col = 4;
//         for(int i=0;i<row;i++)
//         {
//             for(int j=0;j<col;j++)
//             {
//                 if(i==0 || i==row-1 || j==0 || j==col-1)
//                 {
//                     System.out.print("* ");
//                 }
//                 else
//                 {
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }



//    *
//   **
//  ***
// ****
//*****


// class starPattern{
//     public static void main(String[] args) {
//         int row = 5;
//         for(int i=0;i<row;i++)
//         {
//             for(int j=0;j<row-i-1;j++)
//             {
//                 System.out.print(" ");
//             }
//             for(int j=0;j<i+1;j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


//1 2 3 4 5
//1 2 3 4
//1 2 3
//1 2
//1

// class starPattern{
//     public static void main(String[] args) {
//         int row = 5;
//         for(int i=0;i<row;i++)
//         {
//             for(int j=0;j<row-i;j++)
//             {
//                 System.out.print(j+1+" ");
//             }
//             System.out.println();
//         }
//     }
// }


//1
//2 3
//4 5 6
//7 8 9 10
//11 12 13 14 15


// class starPattern{
//     public static void main(String[] args) {
//         int row = 5;
//         int cnt = 1;
//         for(int i=0;i<row;i++)
//         {
//             for(int j=0;j<i+1;j++)
//             {
//                 System.out.print(cnt+" ");
//                 cnt++;
//             }
//             System.out.println();
//         }
//     }
// }


//1
//0 1
//1 0 1
//0 1 0 1
//1 0 1 0 1


// class starPattern{
//     public static void main(String[] args) {
//         int row = 5;
//         for(int i=0;i<row;i++)
//         {
//             for(int j=0;j<i+1;j++)
//             {
//                 if((i+j)%2==0)
//                 {
//                     System.out.print("1 ");
//                 }
//                 else
//                 {
//                     System.out.print("0 ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }



//*      *
//**    **
//***  ***
//********
//********
//***  ***
//**    **
//*      *


// class starPattern{
//     public static void main(String[] args) {
//         int row = 4;
//         for(int i=0;i<row;i++)
//         {
//             for(int j=0;j<i+1;j++)
//             {
//                 System.out.print("*");
//             }
//             for(int j=0;j<2*(row-i-1);j++)
//             {
//                 System.out.print(" ");
//             }
//             for(int j=0;j<i+1;j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i=row-1;i>=0;i--)
//         {
//             for(int j=0;j<i+1;j++)
//             {
//                 System.out.print("*");
//             }
//             for(int j=0;j<2*(row-i-1);j++)
//             {
//                 System.out.print(" ");
//             }
//             for(int j=0;j<i+1;j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



//    *****
//   *****
//  *****
// *****
//*****


// class starPattern{
//     public static void main(String[] args) {
//         int row = 5;
//         for(int i=0;i<row;i++)
//         {
//             for(int j=0;j<row-i-1;j++)
//             {
//                 System.out.print(" ");
//             }
//             for(int j=0;j<row;j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



//    *****
//   *   *
//  *   *
// *   *
//*****


// class starPattern{
//     public static void main(String[] args) {
//         int row = 5;
//         for(int i=0;i<5;i++)
//         {
//             for(int j=0;j<row-i-1;j++)
//             {
//                 System.out.print("  ");
//             }
//             for(int j=0;j<row;j++)
//             {
//                 if(i==0 || i==row-1 || j==0 || j==row-1)
//                 {
//                     System.out.print("* ");
//                 }
//                 else
//                 {
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }



//   *          1
//  ***         3
// *****        5
//*******       7
//*******
// *****
//  ***
//   *


// class starPattern{
//     public static void main(String[] args) {
//         int row = 4;
//         for(int i=0;i<row;i++)
//         {
//             for(int j=0;j<row-i-1;j++)
//             {
//                 System.out.print(" ");
//             }
//             for(int j=0;j<(2*i)+1;j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i=row-1;i>=0;i--)
//         {
//             for(int j=0;j<row-i-1;j++)
//             {
//                 System.out.print(" ");
//             }
//             for(int j=0;j<(2*i)+1;j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }