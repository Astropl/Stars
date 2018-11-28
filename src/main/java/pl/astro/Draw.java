package pl.astro;

public class Draw implements Stars {
    StringBuilder s = new StringBuilder("*");
    StringBuilder p = new StringBuilder("\n");
    StringBuilder star = new StringBuilder("");
    StringBuilder minus = new StringBuilder("-");

    @Override
    public String drawSquare(int n) {
        for (int j = 1; j <= n; j++) {
            for (int k = 1; k <= n; k++) {
                star = star.append(s);
            }
            star = star.append(p);
        }
        return star.toString();
    }

    @Override
    public String drawRectangle(int n, int m) {
        star = new StringBuilder("");
        for (int j = 1; j <= m; j++) {
            for (int k = 1; k <= n; k++) {
                star = star.append(s);
            }
            star = star.append(p);
        }

        return star.toString();
    }

    @Override
    public String drawIsoscelesTriangle(int n) {
        star = new StringBuilder("");
        for (int i = 1; i < n + 1; i++) {
            for (int j = n; j > i; j--) {
                star = star.append(minus);
            }
            for (int k = 0; k < (2 * i - 1); k++) {
                star = star.append(s);
            }
            star = star.append(p);
        }
        return star.toString();
    }


    @Override
    public String drawDiamond(int n) {
        star = new StringBuilder("");
        if ( n%2 == 1) {

        }
            for (int i = 1; i <= n; i++) {
                for (int j = i; j < n; j++) {
                    star = star.append(minus);
                }
                for (int k = 1; k < (i * 2); k++) {
                    star = star.append(s);
                }
                star = star.append(p);
            }
            for (int i = n - 1; i >= 1; i--) {
                for (int j = n; j > i; j--) {
                    star = star.append(minus);
                }
                for (int k = 1; k < (i * 2); k++) {
                    star = star.append(s);
                }
                star = star.append(p);
            }


        return star.toString();
    }

    @Override
    public String drawRectangleTriangle(int n) {
        star = new StringBuilder("");
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++) {
                if(j<=i)
                star = star.append(s);
            }
            star= star.append(p);
        }
        return star.toString();
    }
}
