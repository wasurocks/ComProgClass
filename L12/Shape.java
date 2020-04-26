public class Shape {
    // Defines the class Shape

	protected int rows;
    protected char character;

    public Shape() {
    };

    public Shape(int x, char c) {
        this.rows = x;
        this.character = c;
    }

    public int getRows() {
        return this.rows;
    }

    public void setRows(int x) {
        this.rows = x;
    }

    public char getCharacter() {
        return this.character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public String toString() {
        return "rows:" + this.rows + " character:" + this.character;
    }

}
