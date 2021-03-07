package githaubtestmaven;

public class Bubblesort {

    public static void main( String[] args ) {

        int[] myArray = { 5, 15, 2, 10, -3, 56 };
        // Arrays.sort( myArray );
        mysort( myArray );

        for ( int i = 0; i < myArray.length; i++ ) {

            System.out.println( myArray[i] );
        }


    }

    public static int[] mysort( int[] array ) {

        int temp = 0;

        for ( int i = 0; i < array.length; i++ ) {

            for ( int j = 1; j < array.length - i; j++ ) {

                if ( array[j] < array[j - 1] ) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;

    }

}
