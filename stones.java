class stones{
    
    // Driver Code
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        // Testcase Input
        int t = sc.nextInt();
        
        // Iterating through all testcase input
        while(t-- > 0){
            
            long N = sc.nextLong();
            long X = sc.nextLong();
            
            stone1 g = new stone1();
            
            g.findJumps(N, X);
            
        }
        
    }
    
}
}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
class stone1{
    
    // Function to find number of jumps
    // N : number inscribed on the last stone.
    // X : number on which we have to reach
    static void findJumps(long N, long x){
       int count = 0;
       int i;
        // Your code goes here
        if(N%2 == 0){
            for(i=1;i<=N; ){
                if(i==N)
                {
                    count = 0;
                }
                if(count == 0){
                    if(i==x){
                        System.out.println(i-1);
                        return;
                    }
                    i++;
                    count++;
                }
                else
                {
                   if(i==x){
                       System.out.println(Math.min(i-1,(N-(i)/2)));
                        return;
                   } 
                   else if((i+1)==x)
                   {
                       System.out.println(Math.min(i-1,(N-(i-1)/2)));
                        return;
                   }
                   else
                   {
                       i+=2;
                   }
                }
            }
        }
        else 
        {
            for(i=1;i<=N; ){
                if(i==N)
                {
                    count = 0;
                }
                if(count == 0){
                    if(i==x){
                        System.out.println(i-1);
                        return;
                    }
                    i++;
                    count++;
                }
                else
                {
                   if(i==x){
                       System.out.println(Math.min(i-1,(N-(i)/2)));
                        return;
                   } 
                   else if((i+1)==x)
                   {
                       System.out.println(Math.min(i-1,(N-(i-1)/2)));
                        return;
                   }
                   else
                   {
                       i+=2;
                   }
                }
            }
        }
        
    }
    
}
