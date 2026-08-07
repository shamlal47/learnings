class Patterns {
    public static void main(String[] args) {
        Patterns p = new Patterns();
        p.rev_abc_tri(5);
        p.abc_tri2(5);
    }

    void rev_abc_tri(int n) {
        for (int i = n; i >= 1; i--) {
            for (char ch = (char) ('A' + i - 1); ch >= 'A'; ch--) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    void abc_tri2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                char ch = (char) ('A' + i);
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
