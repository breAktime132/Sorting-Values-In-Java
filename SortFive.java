public class SortFive{
      public static void main (String [] args){
         int Temp = 0;                                    // This variable will be used as a placeholder.
         int LCV = 0;                                     // This variable will represent the indexes of the elements in the following arrays.
         int LCV2 = 0;                                    // This variable will help loop the entire Bubble Sort.
         int[]MyArray = new int[25];                       // Creates an array of 5 elements.
         for(LCV=0;LCV<25;LCV++){                          // For loop fills the 5 elements in MyArray 
            MyArray[LCV] = 1+(int)(Math.random()*50);     // Elements are filled with random numbers 1-50
         }                                                   
         for(LCV=0;LCV<25;LCV++){                          // Loops until LCV<5
            System.out.println(MyArray[LCV]);             // Prints out the values of the elements until all five indexes have been filled.
         }
         for(LCV2=0;LCV2<24;LCV2++){                       // Loops the entire Bubble sort
            for(LCV=0;LCV<24;LCV++){                       // Loops the following by examining each element until the condition is met... 
               if(MyArray[LCV]>MyArray[LCV+1]){           // If an element (named by index [LCV]) is greater than the following, lesser element...
                  Temp = MyArray[LCV];                    // The greater element will be stored in 'Temp' (swap).
                  MyArray[LCV] = MyArray[LCV+1];          // The greater element will become equal to the lesser element.
                  MyArray[LCV+1]=Temp;                    // The lesser element is stored as 'Temp', putting the lesser element in the original place of the greater element, and vice versa.
         }  }  }                         
            for(LCV=0;LCV<25;LCV++){                       // Continously outprints the command below until LCV<5.
               System.out.println(MyArray[LCV]);          // Prints out (inefficiently) 'MyArray.'
            }
      }
}