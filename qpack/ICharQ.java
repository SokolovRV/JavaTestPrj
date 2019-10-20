package qpack;

public interface ICharQ {
	void put(char ch) throws QueueFullException;
	char get() throws QueueEmptyException;
	void clear();
}