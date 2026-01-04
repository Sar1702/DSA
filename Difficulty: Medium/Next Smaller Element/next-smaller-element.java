class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
         int n = arr.length;
        int result[] = new int[n];
        Arrays.fill(result , -1);
        Stack<Integer> stack = new Stack<>();

        for(int i = 0 ; i <  n ; i++ ){
            while(!stack.isEmpty() && arr[i] < arr[stack.peek()] ){
                int index = stack.pop();
                result[index] = arr[i];
            }
            stack.push(i);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int x : result) ans.add(x);
        return ans;
    }
}