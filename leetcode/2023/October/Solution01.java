// 557. Reverse Words in a String III

class Solution01 {
    public String reverseWords(String s) {
        String[] wrds=s.split(" ");
        for(int i=0;i<wrds.length;i++){
            wrds[i]=new StringBuilder(wrds[i]).reverse().toString();
        }
        return String.join(" ",wrds);
    }
}