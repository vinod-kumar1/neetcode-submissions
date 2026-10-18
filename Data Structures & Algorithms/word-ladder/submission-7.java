public class Solution {
        public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord) || beginWord.equals(endWord)) return 0;
        Set<String> words = new HashSet<>(wordList);
        HashSet<String> vis = new HashSet<>();
        int res = 1;
        Deque<String> dq = new ArrayDeque<>();
        dq.addLast(beginWord);
        vis.add(beginWord);

        while (!dq.isEmpty()) {
            
         res++;
         int size = dq.size();

            for(int k=0 ; k < size; k++){


            String s = dq.removeFirst();
            char[] str = s.toCharArray();

            for (int i = 0; i < s.length(); i++) {
                char c = str[i];

                for (int j = 0; j < 26; j++) {
                    char c2 = (char) ('a' + j);
                    str[i] = c2;

                    String temp = String.valueOf(str);
        if(words.contains(temp) && !vis.contains(temp)) {
                        if (temp.equals(endWord)) return res;
                        dq.addLast(temp);
                    }

                }
                str[i] = c;
            
            }
            vis.add(s);
            }
        }

        return 0;
    }
}