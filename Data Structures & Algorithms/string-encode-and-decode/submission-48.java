class Solution {

    public String encode(List<String> strs) {
StringBuilder res = new StringBuilder();
for(String s : strs) res.append(s.length()).append("#").append(s);
return res.toString();
    }

    public List<String> decode(String str) {
ArrayList<String> res = new ArrayList<String>();

int i=0;
int n = str.length();

while(i < n){
    int j=i;
    while(j < n && str.charAt(j) != '#') j++;
    int len = Integer.parseInt(str.substring(i,j));

    i= j+1;
    j = i + len;
    res.add(str.substring(i,j));
    i=j;
}
return res;
    }
}
