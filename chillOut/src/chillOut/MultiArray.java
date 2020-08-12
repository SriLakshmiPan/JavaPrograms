package chillOut;
 class MultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[][]=new int [2][2];
arr[0][0]=1;
arr[0][1]=2;
arr[1][0]=5;
arr[1][1]=6;
for(int[]x:arr)
{ 
	//System.out.print(x);printing x values
	for(int y:x)//another variable y and previuos arrayname x
	{
	System.out.print(y+" ");
}
System.out.println();
	}

}
}
