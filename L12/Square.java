
// Square is a subclass of shape
public class Square extends Shape {

    public Square(int rows) {
        super(rows, '*');
    }

    public Square(int rows, char character) {
        super(rows, character);
    }

    public void draw() {
        for (int i = 0; i < super.rows; i++) {
            for (int j = 0; j < super.rows; j++)
                System.out.print(super.character + " ");
            System.out.print("\n");
        }
    }

    public void draw(int x, int y) {
        x += 1;
        y += 1;
        for (int i = 0; i < super.rows + y; i++) {
            if (i >= y - 1) {
                for (int j = 0; j < super.rows + x; j++) {
                    if (j >= x - 1) System.out.print(super.character + " ");
                    else System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    public int getArea() {
        return super.rows * super.rows;
    }

    public int getPerimeter() {
        return super.rows * 4;
    }

    public String toString() {
        return "Square: rows:" + super.rows + " character:" + super.character;
    }

}