class pascal_triangle_2{
public static void main(String[] args){
	pascal(5);
}
	public static void pascal(int n){
		int[][] a=new int[n+1][n+1];	
		for(int i=0;i<=n;i++){
			for(int j=0;j<n-i;j++){
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
				if(j==0||i==j){
					a[i][j]=1;
				}
				else{
					a[i][j]=a[i-1][j-1]+a[i-1][j];
				}
				System.out.print(a[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
}