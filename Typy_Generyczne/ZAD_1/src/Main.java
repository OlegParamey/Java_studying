void main() {

    Pair<String> pair_string = new Pair<>("left value", "right value");

    System.out.println(pair_string.getLeft());
    pair_string.setLeft("new left value");
    pair_string.swap();
    System.out.println(pair_string);
    System.out.println(pair_string.max());


    Pair<Integer> pair_int = new Pair<>(25, 16);

    System.out.println(pair_int);
    System.out.println(pair_int.getRight());
    pair_int.swap();
    System.out.println(pair_int);
    System.out.println(pair_int.max());



}
