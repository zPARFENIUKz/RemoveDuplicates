import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args){
        int[] arr = new int[] {1, 2, 2, 3, 3, 4, 4, 5, 6, 7, 7, 9, 9};
        int new_size = rmDuplicates(arr);
        System.out.println("New Arr size: " + new_size);
        for (int i = 0; i < new_size; ++i)
        {
            System.out.print(arr[i]);
        }

    }


    public static int rmDuplicates(int[] arr) throws NullPointerException{
        if (arr == null) throw new java.lang.NullPointerException("arr can't be null");
        if (arr.length < 2) return 0;
        else
        {
            int[] unique_indexes = new int[arr.length];
            int indx = 0;
            unique_indexes[indx++] = 0;
            for (int i = 0; i < arr.length; ++i)
            {
                if (i > 0 && arr[i] != arr[i-1])
                {
                    unique_indexes[indx++] = i;
                }
            }
            for (int i = 0; i < indx; ++i)
            {
                if (unique_indexes[i] != i)
                {
                    arr[i] = arr[unique_indexes[i]];
                }
            }
            return indx;
        }
    }


}
