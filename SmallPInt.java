class SmallPInt
{
    public static int getSmallestInteger (int arr[], int n)
    {
        int output = 1;
        for (int i = 0; i < n && arr[i] <= output; i++)
            output = output + arr[i];
        return output;
    }
    public static void main(String[] args)
    {
        int arr[] = {4, 9};
        int n = arr.length;
        System.out.println("Smallest positive integer : "+getSmallestInteger (arr, n));
    }
}