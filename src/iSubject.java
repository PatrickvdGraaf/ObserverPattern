/**
 * Class for .....
 *
 * @author Patrick van de Graaf
 */
public interface iSubject {
    /**
     * @param o The next two methods take an Observer interface as an argument; that is,
     * the Observer to be registered or removed
     */
    void registerObserver(iObserver o);
    void removeObserver(iObserver o);

    /**
     * The method is called to notify all observers when the Subject's state has changed
     */
    void notifyObservers();
}
