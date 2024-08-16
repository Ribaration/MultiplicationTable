public class multiplicationTable {

   void print(){
       int rows = 10;  // Number of rows for the multiplication table
       int columns = 10;  // Number of columns for the multiplication table

       // Nested loops to generate the multiplication table
       for (int i = 1; i <= rows; i++) {
           for (int j = 1; j <= columns; j++) {
               System.out.print(i * j + "\t");  // Multiply and print with tab space
           }
           System.out.println();  // Move to the next line after each row
       }

   }
}