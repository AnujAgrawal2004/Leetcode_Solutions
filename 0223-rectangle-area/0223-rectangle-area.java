class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        long A1= ((long)C - (long)A)*((long) D - (long)B);
        long A2= ((long)G - (long)E)*((long) H - (long)F);
        long overLapped = Math.max((long) Math.min(C,G)-(long)Math.max(A,E),0L)*
            Math.max((long) Math.min(D,H) - (long)Math.max(B,F),0L);
        return (int) (A1+A2 - overLapped);
    }
}