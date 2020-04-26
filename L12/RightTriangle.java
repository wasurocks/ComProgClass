public class RightTriangle extends Shape {

    private boolean isVerticalFlip;

    public RightTriangle(int rows) {
        super(rows, '%');
        this.isVerticalFlip = false;
    }

    public RightTriangle(int rows, char character) {
        super(rows, character);
        this.isVerticalFlip = false;
    }

    public void draw() {
        for (int i = 1; i <= super.rows; i++) {
            if (this.isVerticalFlip) {
                for (int k = 1; k <= super.rows - i; k++)
                    System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(super.character + " ");
            }
            System.out.print("\n");
        }
    }

    public void draw(int x, int y) {
        x += 1;
        y += 1;
        for (int i = 1; i <= super.rows + y; i++) {
            if (i >= y) {
                if (this.isVerticalFlip) {
                    for (int k = 1; k <= super.rows - i; k++)
                        System.out.print("  ");
                }
                for (int j = 1; j <= i + x; j++) {
                    if (j >= x)
                        System.out.print(super.character + " ");
                    else
                        System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    public void drawDoubleTriangle(int space) { 
        for (int i = 1; i <= super.rows; i++) {
            for (int k = 1; k <= super.rows - i; k++)
                System.out.print("  ");
            for (int j = 1; j <= i; j++) {
                System.out.print(super.character + " ");
            }

            for (int index = 1; index <= space; index++)
                System.out.print(" ");

            for (int j = 1; j <= i; j++) {
                System.out.print(super.character + " ");
            }
            System.out.println();
        }
    }

    public double getArea() {
        return super.rows * super.rows * 0.5;
    }

    public double getPerimeter() {
        return Math.sqrt(2.0 * super.rows * super.rows) + (2.0 * super.rows);
    }

    public String toString() {
        return "RightTriangle: rows:" + super.rows + " character:" + super.character + " isVerticalFlip:" + this.isVerticalFlip;
    }

    public boolean isVerticalFlip() {
        return this.isVerticalFlip;
    }

    public void setVerticalFlip(boolean isVerticalFlip) {
        this.isVerticalFlip = isVerticalFlip;
    }

}