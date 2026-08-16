package StringsandStringBuilder;

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
       for(int i=0;i<letters.length;i++){
        // If it's smaller or equal, we ignore it and move to the next index
          if(Character.compare(letters[i],target)<=0){
                 continue;
         }
        // If we find a character strictly greater, return it immediately
          return letters[i];
       }
    
       return letters[0];
       
    }
}