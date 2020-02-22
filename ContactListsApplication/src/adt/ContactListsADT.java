/**
 * Created by IntelliJ IDEA Ultimate,2020
 * User: kishoritiwari2000
 * Date: 22/02/20
 * Time: 1:15 AM
 */
package adt;

/**
 * This is the Interface for the ContactListsApplication ADT.
 * This will serve as the template for the ContactListsApplication as Linked List.
 */
public interface ContactListsADT<E> {

    /**
     * This method will add a new contact details in the ContactListsApplication.
     *
     * @param item the contact details to be added in the ContactListApplication.
     * @return true when the details are added to the ContactListApplication.
     */
    boolean add(E item);

    /**
     * This method will view all the contacts present in the ContactListApplication.
     *
     * @return all the contacts in the ContactListApplication.
     */
    void view();

    /**
     * This method will search a contact item in the ContactListApplication.
     *
     * @param item the contact to be searched inside the ContactListApplication.
     * @return the contact details if founded in the ContactListApplication.
     */
    public void search(E item);

    /**
     * This method will delete the given contact details from the ContactListApplication.
     *
     * @return true when the element has been deleted from the ContactListApplication.
     */
    public void delete(E item);

    /**
     * This method will make an exit from the ContactListApplication.
     */
    public void exit();

}
