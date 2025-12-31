class Solution {
   
 
    public String reverseVowels(String s) {
        char arr[] = s.toCharArray();
        int j =arr.length-1;
        int i = 0 ; 
        while(i<j){
        while(i < j && !isvowel(arr[i])){
            i++;
        }
         while(i < j && !isvowel(arr[j])){
            j--;
        }
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
    }
        return new String(arr);
          }
    
     boolean isvowel(char c){
        return "aeiouAEIOU".indexOf(c)!=-1;
    }
        
}
    
