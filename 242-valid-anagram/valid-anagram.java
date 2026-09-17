class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;

        String checked = "";

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(checked.indexOf(ch) != -1)
                continue;

            int countA = 0;
            int countB = 0;

            for(int j = 0; j < s.length(); j++) {
                if(s.charAt(j) == ch)
                    countA++;

                if(t.charAt(j) == ch)
                    countB++;
            }

            if(countA != countB)
                return false;

            checked += ch;
        }

        return true;
    }
}