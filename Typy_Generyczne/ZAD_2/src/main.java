void main() {
    System.out.println("=== NumberList<Double> ===");
    NumberList<Double> doubleList = new NumberList<>();

    System.out.println("Empty?  : " + doubleList.isEmpty());

    doubleList.add(3.14);
    doubleList.add(2.71);
    doubleList.add(1.41);
    doubleList.add(9.81);

    System.out.println("List    : " + doubleList);
    System.out.println("Size    : " + doubleList.size());
    System.out.println("Empty?  : " + doubleList.isEmpty());
    System.out.println("get(0)  : " + doubleList.get(0));
    System.out.println("get(2)  : " + doubleList.get(2));

    doubleList.remove(1);
    System.out.println("After remove(1): " + doubleList);
    System.out.println("Size    : " + doubleList.size());

    System.out.println("\n=== NumberList<Integer> ===");
    NumberList<Integer> intList = new NumberList<>();

    intList.add(10);
    intList.add(20);
    intList.add(30);

    System.out.println("List    : " + intList);
    System.out.println("get(1)  : " + intList.get(1));

    intList.remove(0);
    System.out.println("After remove(0): " + intList);

    intList.remove(0);
    intList.remove(0);
    System.out.println("After removing all: " + intList);
    System.out.println("Empty?  : " + intList.isEmpty());
}