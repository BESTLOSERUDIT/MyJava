package CodingTest.JavaTest;


public class BubbleSort {
     
	 void bubbleSort(int arr[],int n)
	     { 
	       for(int i=0;i<n-1;i++)
	         { 
	    	   for(int j=0;j<n-i-1;j++)
	             {
	                {  
	                	if(arr[j]>arr[j+1])
	                      { 
	                		int temp=arr[j];	                      
	                		arr[j]=arr[j+1];
	                		arr[j+1]=temp;
	                      }
	                }		   
	             }
	         }
	     }
	  void printArray(int arr[],int n)
	   
	   {
		   for (int i=0;i<n;i++)
		   		{ 
			       System.out.println(arr[i]+""); 
		   		}
		   	}
		public static void main(String args[])
	      {  
			int arr[]= {23,12,6,34,65,25,45,56,87,35};
			int n=arr.length;			
			BubbleSort bs=new BubbleSort();
			bs.bubbleSort(arr,n);
			System.out.println("Array in Sorted order");
			bs.printArray(arr,n);
	      }
	}