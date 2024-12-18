POWER OF THREE::
Given an integer n, return true if it is a power of three. Otherwise, return false.
An integer n is a power of three, if there exists an integer x such that n == 3x.


Example 1:
Input: n = 27
Output: true
Explanation: 27 = 33

METHOD 1::
class Solution {
    public boolean isPowerOfThree(int n) {
     
      if(n==0)
      return false;
      if(n%3==0)
      {return true;
    }
    else{
        return false;
    }
}
}

method 2::
  public boolean isPowerOfThree(int n) {
        if(n==0) return false;
        while(n!=1){
            int r=n%3; // r: remainder
            n=n/3;
            if(r!=0) return false;
        }
        return true;
    }
