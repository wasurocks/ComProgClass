public class Triangle extends Shape {

    private boolean isHorizontalFlip;

    // Defining constructors
    public Triangle(int rows) {
        super(rows, '#');
        this.isHorizontalFlip = false;
    }

    public Triangle(int rows, char character) {
        super(rows, character);
        this.isHorizontalFlip = false;
    }

    public void draw() {
        if (this.isHorizontalFlip) {
            for (int i = super.rows; i >= 1; i--) {
                for (int k = 1; k <= super.rows - i; k++)
                    System.out.print(" ");
                for (int j = 1; j <= i; j++) {
                    System.out.print(super.character + " ");
                }
                System.out.println();
            }
        } else {
            for (int i = 1; i <= super.rows; i++) {
                for (int k = 1; k <= super.rows - i; k++)
                    System.out.print(" ");
                for (int j = 1; j <= i; j++) {
                    System.out.print(super.character + " ");
                }
                System.out.println();
            }
        }
    }

    public void draw(int x, int y) {
        x++;
        y++;
        if (isHorizontalFlip) {
            for (int i = super.rows + y - 1; i >= 1; i--) {
                if (super.rows - i + 1 >= y) {
                    if (isHorizontalFlip()) {
                        for (int k = 1; k <= super.rows - i; k++)
                            System.out.print(" ");
                    }
                    for (int j = 1; j <= i + x - 1; j++) {
                        if (j >= x)
                            System.out.print(super.character + " ");
                        else
                            System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else {
            for (int i = 1; i <= super.rows + y - 1; i++) {
                if (i >= y) {
                    for (int k = 1; k <= super.rows - i; k++)
                        System.out.print(" ");
                    for (int j = 1; j <= i + x - 1; j++) {
                        if (j >= x)
                            System.out.print(super.character + " ");
                        else
                            System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

    public double getArea() {
        return 0.5 * this.rows * this.rows / Math.tan(60);
    }

    public double getPerimeter() {
        return 3 * this.rows / Math.sin(60);
    }

    public String toString() {
        return "Square: rows:" + this.rows + " character:" + this.character + " isHorizontalFlip:" + this.isHorizontalFlip;
    }

    public boolean isHorizontalFlip() {
        return this.isHorizontalFlip;
    }

    public void setHorizontalFlip(boolean isHorizontalFlip) {
        this.isHorizontalFlip = isHorizontalFlip;
    }

}