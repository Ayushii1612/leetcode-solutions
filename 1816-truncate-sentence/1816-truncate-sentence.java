class Solution {
    public String truncateSentence(String s, int k) {
        
        String[] words = s.split(" ");
        return String.join(" ", Arrays.copyOfRange(words, 0, k));
    }
}

/*
Step 1 → split sentence into words array
Step 2 → copy only first k words
Step 3 → join them back with spaces

"Hello how are you Contestant"
         ↓ split
["Hello", "how", "are", "you", "Contestant"]
         ↓ copyOfRange(0, 4)
["Hello", "how", "are", "you"]
         ↓ join(" ")
"Hello how are you"
*/