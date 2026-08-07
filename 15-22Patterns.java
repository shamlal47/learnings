class Patterns {
    public static void main(String[] args) {
        Patterns p = new Patterns();
        p.rev_abc_tri(5);
    }

    void rev_abc_tri(int n) {
        for (int i = n; i >= 1; i--) {
            for (char ch = (char) ('A' + i - 1); ch >= 'A'; ch--) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
