public class DoubleLinkedList {

	public DoubleLinkedList() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node node=new Node();
		
		node.addHead(7);
		node.addHead(5);
		node.addTail(4);
		node.addTail(1);
		System.out.print("The Double Link List before delete node: ");
		node.printLink();
		node.deleteHead();
		node.deleteTail();
		System.out.print("\nThe Double Link List after delete node: ");
		node.printLink();
	}
}