class Largest_2ndElement{
	public static void main(String args[]){
		int arr[]={1,7,2,5};
		int i,c=0;
		int element=arr[0];
		for(i=0;i<arr.length;i++){
        if(element<arr[i]){
        	element=arr[i];
        	c=i;
        }
		}
		System.out.println("Largest Element in array at i=\n"+c+"\nis\n"+element);
		arr[c]=-1;
		element=0;
         for (i=0;i<arr.length;i++ ) {
         	if(element<arr[i]){
         		element=arr[i];
         	}
         	}
         	
         
         System.out.println("2nd Largest Element is: \n"+element+"\nAt positin\n"+i);
  }	
}