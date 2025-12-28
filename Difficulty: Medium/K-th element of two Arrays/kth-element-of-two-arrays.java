class Solution {
    public int kthElement(int a[], int b[], int k) {
       int n1 = a.length;
       int n2 = b.length;
       int n3[] = new int[n1 + n2] ;
       int idx = 0 ;
       for(int i = 0 ; i< n1 ; i++){
          n3[idx++] = a[i];
       }
        for(int i = 0 ; i< n2 ; i++){
          n3[idx++] = b[i];
       }
       
       Arrays.sort(n3);
       
       return n3[k-1];
    }
}