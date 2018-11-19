Class FizzBuzz{
public static void fizzBuzz(int m, int n, int[] numbers, String[] terms){
	
    if (m > n || numbers.length > terms.length || terms.length > numbers.length) {
        System.out.println ("Error!");
    }
 
    else { 
     // this goes through range
        for (int i = m; i <= n; i++) {
            String termString = " ";
         // this goes through index of the first array
            for (int y = 0; y < numbers.length; y++) {
                if (i % numbers[y] == 0) {
                    termString = termString + terms[y];
                }
            }
         //    if this isn't empty print string
            if (termString != " ") {
                System.out.println(termString);
            }
            else {
                System.out.println(i);
            }
 
        }
    }
 }