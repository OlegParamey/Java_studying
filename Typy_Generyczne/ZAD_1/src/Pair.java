public class Pair <T extends  Comparable<T>>{
    private T left, right;


    public Pair (T left, T right){
        this.left = left;
        this.right = right;
    }

    public void setLeft(T left) {
        this.left = left;
    }

    public void setRight(T right) {
        this.right = right;
    }

    public T getLeft() {
        return left;
    }

    public T getRight() {
        return right;
    }

    public void swap (){
        var l = this.left;
        var r = this.right;
        setLeft(r);
        setRight(l);
    }

    public Comparable<T> max() {
        if (this.left == null) return this.right;
        if (this.right == null) return this.left;
        return (this.left.compareTo(this.right) >= 0) ? this.left : this.right;
    }

    @Override
    public String toString(){
        return "( " + this.left + " : " + this.right + " )";
    }
}
