class palindrome_check{
public static void main(String args[]){
	int n=456,count=0,s=0;
	while(n!=reverse(n)){
		n+=reverse(n);
		count++;
	}
	System.out.println(count + " " +n);
}
public static int reverse(int n){
	int rev=0,r=0;
	while(n!=0){
		r=n%10;
		n=n/10;
		rev=rev*10+r;
	}
	return rev;
}
}
