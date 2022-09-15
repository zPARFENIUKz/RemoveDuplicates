public class RemoveDuplicates {
    public static void main(String[] args){
        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 8};
        int new_size = rmDuplicates(arr);
        System.out.println("New Arr size: " + new_size);
        for (int i = 0; i < new_size; ++i)
        {
            System.out.print(arr[i]);
        }

    }


    public static int rmDuplicates(int[] arr) throws NullPointerException{
        if (arr == null) throw new java.lang.NullPointerException("arr can't be null");
        if (arr.length < 2) return arr.length;
        else
        {
            int new_size = 1;
            for (int i = 1; i < arr.length; ++i)
            {
                if (arr[i] != arr[i-1])
                {
                    if (new_size < arr.length && arr[new_size] != arr[i])
                    {
                        arr[new_size++] = arr[i];
                    }
                    else if (new_size == i) ++new_size;
                }
            }
            return new_size;
        }
    }


}
