package dev.rebecamf.loops;

// public class MultiplicationTable {
//     public static void main(String[] args) {
        
//         int n =  9; 

//         for (int i =  1; i <=  10; i++) {
            
//             System.out.println(n + " * " + i + " = " + n * i);
//         }
//     }
// }


public class MultiplicationTable {

    public static int[] generateTable(int n) {
        int[] table = new int[10];
        for (int i =  1; i <=  10; i++) {
            table[i -  1] = n * i;
        }
        return table;
    }

    public static void main(String[] args) {
        int n =  9;
        int[] table = generateTable(n);
        for (int i =  0; i < table.length; i++) {
            System.out.println(n + " * " + (i +  1) + " = " + table[i]);
        }
    }
}
