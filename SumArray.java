public class SumArray {
        public static void main(String[] args){
          
            //Make the array  
          int [] arr = new int [] {1, 2, 3, 4, 5};  
          int sum = 0;  
         
          //Calculate sum of elements  
          for (int i = 0; i < arr.length; i++) {  
             sum = sum + arr[i];  
          }  
         
         //Print the sum of array
          System.out.println("The sum of the array is: " + sum);  
       
          
          //Next Exercise: What does this print? 
          // *Answer = 2
          double[ ] exampleArray = {1,5,6,5,4,1};

          double maximum = exampleArray[0];

          int index = 0;

          for (int i = 1; i<exampleArray.length; i++){

               if (exampleArray[ i ] > maximum) {

                    maximum = exampleArray[ i ];

                    index = i;

               }

          }
        
          System.out.println(index);

        }
    }

     //Raise to number power
     