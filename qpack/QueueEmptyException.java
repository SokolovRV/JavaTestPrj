package qpack;

public class QueueEmptyException extends Exception {
	public String toString() {
		return "Очередь пуста.";
	}
}