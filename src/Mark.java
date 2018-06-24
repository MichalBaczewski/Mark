public class Mark {

    public void triangle(int rowCount) {
        for (int row = 0; row <= rowCount - 1; row++) {
            for (int column  = 0; column  <= row; column ++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void diagonal(int rowCount) {
        for (int row = 0; row <= rowCount - 1; row++) {
            for (int column = 0; column <= row; column++) {
                if (column == row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public void square(int rowCount) {
        for (int row = 0; row <= rowCount - 1; row++) {
            for (int column = 0; column <= rowCount - 1; column++) {
                if (row == 0 || row == rowCount - 1 || column == 0 || column == rowCount - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}

