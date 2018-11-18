public class SortArray {




    public static void main(String[] args) {
        int [] array = {2,4,5,1,3,1};
        sortArray(array);
    }

        public static void sortArray(int [] array){

            int temp;
             boolean sorted = false;
            while (!sorted) {
                sorted = true;
                for (int i = 0; i < array.length-1 ; i++ ) {
                    if (array[i]>array[i+1]) {
                        sorted = false;
                        temp= array[i];
                        array[i]=array[i+1];
                        array[i+1]=temp;
                    }
                }
            }  for (int i=0; i < array.length; i++){
            System.out.println(array[i]);
            }
        }
    }