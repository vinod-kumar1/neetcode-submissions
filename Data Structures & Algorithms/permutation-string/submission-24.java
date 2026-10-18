class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int arr1[] = new int[26];
        for(char c : s1.toCharArray()) arr1[c - 'a']++;
int j=0;

while(j <= s2.length()-s1.length()){
int arr2[] = new int[26];
for(int k=j; k < j + s1.length(); k++) arr2[s2.charAt(k) - 'a']++;
boolean isMatch = true;

for(int i=0; i < arr1.length; i++){
    if(arr1[i] != arr2[i]){
        isMatch = false;
        break;
    }
}
if(isMatch) return true;
j++;
}

return false;
    }
}
