/**
 * 
 */
package stack;

/**
 * @author vinit
 *
 */
public interface StackADT<T> {

	Integer size();

	Boolean isEmpty();

	void push(T Data);

	T top();

	T pop();

	String toString();
}
