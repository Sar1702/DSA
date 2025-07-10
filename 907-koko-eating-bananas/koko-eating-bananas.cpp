class Solution {
public:
    int minEatingSpeed(vector<int>& piles, int h) {
        int low = 1 ; 
        int high =  *max_element(piles.begin(), piles.end());
        while ( low < high ){
            int mid = (low + high)/ 2 ;
            if(canfinish(piles,h,mid)){
                high = mid ;
            }
            else {
                low = mid + 1 ;
            }
        }
        return low ;
        
    }

    bool canfinish(vector<int>& piles, int h, int speed){
        int totalhours = 0 ;
        for(int i = 0 ; i < piles.size(); i++){
            totalhours += (piles[i] + speed - 1 )/ speed;
        }
          return totalhours <= h;
    }
};