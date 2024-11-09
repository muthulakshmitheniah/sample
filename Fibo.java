public class Fibo{
    public static void main(String[] args){
        int count =0;
        System.out.Println("Fibonacci series: ");
        for(int i=0;i<count;i++){
            System.out.Print(fibonacci(i)+" ");
        }
    }

    public static int fibonacci(int i){
        if (i<=0){
            return 1;
        }
        return fibonacci(i-1)+fibonacci(i-2);
    }
}
