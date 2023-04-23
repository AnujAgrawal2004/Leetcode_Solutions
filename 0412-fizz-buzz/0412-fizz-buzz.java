class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> AL= new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3 == 0 && i%5==0)
                AL.add("FizzBuzz");
            else if(i%3 ==0 )
                AL.add("Fizz");
           else if(i%5 ==0)
               AL.add("Buzz");
          else
              AL.add(Integer.toString(i));
        }
        return AL;
    }
}