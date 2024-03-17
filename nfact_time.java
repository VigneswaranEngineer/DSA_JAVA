public class nfact_time {

    void time_fact(int n ){
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                n=n/2;
                System.out.println(i+" "+j);
            }
            
        }
    }
    

    public static void main(String[] args) {
        nfact_time n1 = new nfact_time();
        n1.time_fact(5);
    }
}
