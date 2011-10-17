public class TestHeap {
public static void main(String[] args) {
Heap he = new Heap(2);
he.insert(10);
he.insert(5);
he.insert(15);
he.insert(2);
he.insert(20);
he.printH();
System.out.println(""+he.extractMin());
he.printH();
}
}