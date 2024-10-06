package week4CodingProject;




public class Week4CodingProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		//1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.

		//a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  


 int age[] = {3,9,23,64,2,8,28,93};
 int firstItem = age[0];
 int last = age[age.length- 1];
     firstItem  = last-firstItem;
  System.out.println("results1 " + firstItem);
		
 // b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  

  //i. Make sure that there are 9 elements of type int in this new array.  

 // ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 

 // iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).

			
		
int age2[]= {8,19,22,32,45,67,76,89,90,100};
int first = age2[0];
int lastItem = age2[age2.length- 1];
	first = lastItem-first;
System.out.println("results2 " + first);

//c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.

      double sum=0;
      for(int i=0;i<age.length;i++) {
    	  sum+=age[i];
      }
       double avg=sum/age.length;
        System.out.println("results1 " +  avg);
      
        double sum1=0;
        for(int i=0;i<age2.length;i++) {
      	  sum1+=age2[i];
        }
         double avg1=sum1/age2.length;
          System.out.println("results2 " +  avg1);
        
          
         // 2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”
          
          String names[] = {"Sam", "Tommy", "Tim", "Sally","Buck", "Bob"};
         // a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console
          String sumName = ""; 
          
          for(int i = 0; i < names.length; i++) {
            sumName += names[i];
          }
          double changeInt2Double = sumName.length();
          System.out.println("results3 "+changeInt2Double / names.length);
        //  b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.  
          double countOfNames = names.length;
          String name = ""; 
          char space = ' ';

          for(int i = 0; i < names.length; i++) {
            name += names[i] += space;
          }                  
          System.out.println("results4 " + name);
          
         // 3. How do you access the last element of any array?          
                       //array[array.length - 1];
          //4. How do you access the first element of any array?
                     //array[0];
          
         // 5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
          int[] nameLengths = new int[names.length];
          int count =0;
    
          for(int i=0; i<names.length; i++) {
            nameLengths[i] = names[i].length();
           
          }
          
         // 6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
          
          int totalElementsInArray = 0;
          int sumNameLength =names.length;
          for(int i=0; i<sumNameLength; i++) {
            totalElementsInArray += sumNameLength;
          }  
          System.out.println("results5 " + totalElementsInArray);
	
        //  7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
          System.out.println(repeatWord("Hello", 3));
        //  8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).   
          System.out.println("Results6 " + concatFirstNameLastName("Tom","Jerry"));     
          
        //  9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
          int[] intArray = {10, 5, 33, 17, 1, 48};
          System.out.println("Result7 " + intArrayGreaterThan100(intArray));

          //10. Write a method that takes an array of double and returns the average of all the elements in the array.
          double[] doubleNumbersArray = {22.4, 77, 15.9, 2.3, 62.1, 33.0, 19.76};
          System.out.println( "Results8 " + avgOfDoubleArray(doubleNumbersArray));
          
         // 11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array. 

          double[] firstArrays = {17.5, 13.76, 9.43, 2.2};
          double[] secondArrays = {22.3, 5.4, 2, 3.3, 6.997};
          
          System.out.println("Results9 " + avgOfFirstArrayGreaterThanAvgOfSecondArray(firstArrays, secondArrays)); 
	   
        //  12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50. 
          
          boolean isHotOutside = true;
          double moneyInPocket = 11.50;
          
          System.out.println("Results10 " + willBuyDrink(isHotOutside, moneyInPocket));
          
          //13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
         //  write a method called Salary that takes a boolean job, and a double moneyInPockets, and returns true if job pays enough and if moneyInPocket is greater than $1500.50. I wrote this method because how society most people can barely make ends meet due to not making enough money.
          boolean job = true;
          double moneyInPockets = 1500.50;
          
          System.out.println("Results11 " + salary(job, moneyInPockets));
          
         
        		  
          } // end of main








///

//question 7 method
public static String repeatWord( String word, int n) {
    String concatWord = "";
    for(int i = 1; i<=n; i++) {
      concatWord += word;
    }
    return concatWord;
}


//question 8 method 
public static String concatFirstNameLastName(String firstName, String lastName) {
    String fullName = firstName + " " + lastName;
    return fullName;
}

// question 9 method
public static boolean intArrayGreaterThan100(int[] intArray) {
    int counter = 0;
    boolean result = true;
   
     
    for(int sumArray : intArray) {
      counter += sumArray; 
    if(counter>100) {
      result = true;
    } else {
      result = false;
    }
    }
    return result;
 }

// question 10 method 

public static double avgOfDoubleArray(double[] doubleNumbersArray) {
    
    double sumOfDoubleNumbersArray = 0;
   
    for(double doubleNumber : doubleNumbersArray) {
      sumOfDoubleNumbersArray += doubleNumber; 
    }
      return sumOfDoubleNumbersArray / doubleNumbersArray.length;
}

//question 11 method 
public static boolean avgOfFirstArrayGreaterThanAvgOfSecondArray(double[] firstArrays, double[] secondArrays) {
    double sumOfFirstArray = 0;  
    double sumOfSecondArray = 0; 
     //boolean result; 
     
    for(double firstArray : firstArrays) {                 
       sumOfFirstArray += firstArray; 
    }
            for(double secondArray : secondArrays) {                          
               sumOfSecondArray += secondArray; 
            }        


      return (sumOfFirstArray / firstArrays.length) > (sumOfSecondArray / secondArrays.length);
}  
//question 12 method 
public  static  boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
    
    if(isHotOutside && moneyInPocket > 10.50) {
       return true;
    } else {
       return false;
    }
    
}

/// question 13 method
 
public  static  boolean salary(boolean job, double moneyInPockets) {
    
    if(job && moneyInPockets > 1500.50) {
       return true;
    } else {
       return false;
    }
    
}
}