public class FrequencySortArray {
    public static void main(String[] args) {
        int arr[] = {5, 4, 7, 5, 4, 3, 2, 2, 2, 7, 5, 7, 7};
        int n = arr.length;

        int freq[] = new int[n]; 
        boolean visited[] = new boolean[n]; 
        for (int i = 0; i < n; i++) {
            if (visited[i]) continue; 
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            freq[i] = count;
            System.out.println("Count of " + arr[i] + " is: " + count);
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (freq[i] < freq[j] || (freq[i] == freq[j] && arr[i] > arr[j])) {
                    //swap arr
                    int tempArr = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tempArr;

                    //swap freq
                    int tempFreq = freq[i];
                    freq[i] = freq[j];
                    freq[j] = tempFreq;
                }
            }
        }

        System.out.println("Arrays sorted based on frequency: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < freq[i]; j++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
