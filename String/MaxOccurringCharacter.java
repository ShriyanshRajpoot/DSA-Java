// Method 1 Sliding Window (n log n) time complexity

 /*  import java.util.Arrays;

public class MaxOccurringCharacter {

    public static char findMaxOccurringChar(String s) {
        int n = s.length();
        int maxFreq = -1;
        char ans = s.charAt(0);
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        int i = 0, j = 0;
        while (j < n) {
            if (arr[i] == arr[j]) {
                j++;
            } else {
                int freq = j - i;
                if (freq > maxFreq) {
                    maxFreq = freq;
                    ans = arr[i];
                }
                i = j;
            }
        }

        // Handle last group
        int freq = j - i;
        if (freq > maxFreq) {
            maxFreq = freq;
            ans = arr[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        String s = "programming";
        System.out.println("Max occurring character : " + findMaxOccurringChar(s));
    }
}   */

// Method 2 Better Method (n) time complexity

import java.util.Arrays;

public class MaxOccurringCharacter {

    public static char findMaxOccurringChar(String s) {
        int n = s.length();
        int[] freq = new int[26];
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            int idx = ch-'a';
            freq[idx]++;
        }
        int maxFreq = 0;
        char ans = s.charAt(0);
        for(int i=0;i<26;i++){
            if(freq[i]>maxFreq){
                maxFreq=freq[i];
                ans=(char)(i+97);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "banana";
        System.out.println("Max occurring character : " + findMaxOccurringChar(s));
    }
}

   