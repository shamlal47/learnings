class Patterns {
    public static void main(String[] args) {
        Patterns p = new Patterns();
        p.rev_abc_tri(5);
        p.abc_tri2(5);
        p.abc_pyramid2(5);
        p.abc_rev(5);
        p.diend_space(5);
        p.butterfly(5);
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

    void abc_pyramid2(int n) {
        for (int i = 0; i < n; i++) {
            int mid = (2 * i + 1) / 2;
            char ch = 'A';

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(ch);
                if (mid >= j) {
                    ch++;
                } else {
                    ch--;
                }
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();

        }

    }

    void abc_rev(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = (char) ('A' + n - i - 1); ch < (char) ('A' + n); ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    void diend_space(int n){

        int space = 0;

        for(int i = 0;i<n;i++){

            for(int j = 1;j <= n-i;j++){
                System.out.print("*");
            }

            for(int j = 0; j < space;j++){
                System.out.print(" ");
            }

            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }

            space = space + 2;
            System.out.println();
        }

        space = 2 * n - 2;

        for(int i = 1;i<=n;i++){

            for(int j = 1;j <= i;j++){
                System.out.print("*");
            }

            for(int j = 0; j < space;j++){
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            space = space - 2;
            System.out.println();
        }


    }

    void butterfly(int n){
        int space = 2 * n - 2;
        for(int i=1;i<=n;i++){

            for(int j = 1;j <= i;j++){
                System.out.print("*");
            }
            for(int j = 0;j < space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            space = space - 2;
            System.out.println();
        }
        space = 0;
        for(int i = 0;i < n;i++){
            for(int j = 1;j <= n - i;j++){
                System.out.print("*");
            }
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<= n-i;j++){
                System.out.print("*");
            }

            space = space + 2;
            System.out.println();
        }
    }

}
