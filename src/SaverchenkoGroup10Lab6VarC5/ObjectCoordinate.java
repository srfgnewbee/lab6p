package SaverchenkoGroup10Lab6VarC5;

abstract public class ObjectCoordinate implements IPaint {

    private int x;
    private int y;
    private int size;

    public ObjectCoordinate() {

    }

    public ObjectCoordinate(final int x, final int y) {
        this.x = x;
        this.y = y;
        setSize((int)(Math.random()*RANDOM_VARIETY+MIN_OBJECT_SIZE));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSize() {
        return size;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setSize(int size) {
        this.size = size;
    }
}