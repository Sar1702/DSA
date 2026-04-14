class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        String sb = new String();
        for(int i = 0 ; i < n ; i++  ){
            char ch = chars[i];
            int cnt = 1 ;
            for(int j = i + 1 ; j < n ; j++){
                if(chars[j] == ch ){
                    cnt++;
                    i++;
                }
                else{
                    break;
                }
            }

            sb +=ch;
            if(cnt  > 1 ){
                sb += cnt;
            }
        
        }
        for(int i = 0 ; i < sb.length();i++){
            chars[i] = sb.charAt(i);
        }
        return sb.length();
    }
}