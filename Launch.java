Class Launch{
	public static void main(String[] args){
		System.out.println("Exploring Git & GitHub!"+fun());
		System.out.println(fib(fun));
	}
	public static int fib(int n){
        if(n<=1) return n;
        return fib(n-1)+fib(n - 2);
    }
	public static void fun(){
		int a = 5,b=10;
		System.out.println(a+b);
	}
}