public class ArrayCount {
    public static void main(String[] args) {
        int[] arr = {34, 23, 12, 23, 12, 99, 23};
        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++)
        {
            if (visited[i])
            {
                continue;
            }
            int count = 1; // Initialize count as 1 for the current element
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] == arr[j]) {
                    visited[j] = true; // Mark this index as visited
                    count++;
                }
            }
            System.out.println(arr[i] + " frequency is " + count);
        }
    }
}
