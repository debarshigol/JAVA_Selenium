
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {

	public static void main(String[] args) {
		// types of command in Queue
		// add()
		// insert the specified element, throws error if the element cannot be added
		// offer()
		//// insert the specified element, return false if the element cannot be added
		// remove()
		// remove the element present at Head, throws error if the element cannot be deleted
		// poll()
		// remove the element present at Head, return null, if the element cannot be deleted
		// element()
		// retrieve but does not remove, to check the element is present or not, otherwise throws exception 
		// peek()
		// retrieve but does not remove, to check the element is present or not, otherwise return null
		
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(1);
		queue.offer(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		queue.add(6);
		printCollection(queue);
		queue.remove();
		queue.poll();
		printCollection(queue);
		System.out.println(queue.element());
		System.out.println(queue.peek());
	}
		public static <E> void printCollection(Collection<E> collection) {
			for(Object cll:collection) {
				System.out.printf(" %s",cll);
			}
			System.out.println("");
		}
	}
