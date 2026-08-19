package StringsandStringBuilder;


public class FunctionofStringsBuilder{
    public static void main(String[] args) {
     
       StringBuilder sb = new StringBuilder("Hello");

        // 1. append() → add at the end
        System.out.println(sb.append("Hello"));          // Hello World

        // 2. insert() → insert at a specific index
        sb.insert(5, " Java");                 // Hello Java World

        // 3. setCharAt() → change character
        sb.setCharAt(0, 'h');               // hello Java World

        // 4. charAt() → get character
        System.out.println(sb.charAt(1));   // e

        // 5. delete() → delete characters [start, end)
        sb.delete(5, 10);              // hello World

        // 6. deleteCharAt() → delete one character
        sb.deleteCharAt(5); // helloWorld

        // 7. reverse() → reverse the StringBuilder
        sb.reverse(); // dlroWolleh

        // 8. length() → number of characters
        sb.length();     // 10

        // 9. capacity() → current storage capacity
        sb.capacity();

        // 10. substring() → extract part as String
        String str = sb.substring(0, 5);

        //11. insert(index,character)
        sb.insert(4,'x');       
        

        // 11. toString() → convert StringBuilder to String
        String result = sb.toString();
      

        // 12. setLength(0) → clear StringBuilder
        sb.setLength(0); // 0

} 
}
