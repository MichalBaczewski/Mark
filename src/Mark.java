public class Mark {

    public void figure1(int rowCount) {
        for (int row = 1; row <= rowCount; row++) {
            for (int column  = 1; column  <= row; column ++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void figure2(int rowCount) {
        for (int row = 1; row <= rowCount; row++) {
            for (int column = 1; column <= row; column++) {
                if (column == row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


/*    public void figure3(int rowCount) {
        boolean flag = true;
        int counter = 1;
        for (int row = 1; row <= rowCount; row++) {
            for (int column = 1; column <= row; column++) {
                if (flag) {
                    for (int i = 1; i < rowCount; i++) {
                        System.out.print("*");
                    }
                    flag = false;
                } else {
                    System.out.print("*");
                    for (int j = 1; j < rowCount - 2; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
            }
            System.out.println();
            counter++;
            if (counter % rowCount == 0 || counter % rowCount == 6) {
                flag = true;
                counter = 0;
            }
        }
    }*/



/*    public void figure4(int rowCount) {
        boolean flag = true;
        int counter = 1;
        for (int row = 1; row <= rowCount; row++) {
            if (flag) {

            } else {

            }
            counter++;
            if (counter == 3) {
                flag = !flag;
                counter = 0;
            }
        }
    }*/

}

