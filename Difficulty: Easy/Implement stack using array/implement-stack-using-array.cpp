class MyStack {
  public:
  int arr[10];
  int i  = 0 ;
  int top = -1 ;
    void push(int x) {
        
        arr[i] = x ;
        top = i ; 
        i++;
        
          
        
        
    }

    int pop() {
        if(top!=-1) {
            i = top ; 
            return arr[top--];
            
        }
        else{
            
            return -1;
        }
        // code here
    }
};