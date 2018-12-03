using System;

namespace CVector
{
    class Vector
    {
        public static void Main(string[] args)
        {
            int[] VectorArray = { 15, 26, 50, 65, 124, 357 };
            Console.WriteLine(BinarySearch(VectorArray, 50));
        }

        public static int  BinarySearch (int[] v, int x) {
            int count = v.Length;
            if (count == 0)
                return -1;
            int left = 0;
            int right = count - 1;
            int middle = (left + right) / 2;
            while (left < right && v[middle] != x)
            {
                if (v[middle] < x)
                    left = middle + 1;
                else
                    right = middle - 1;
                middle = (left + right);
            }

            return 2;
        }
       
    }
}
