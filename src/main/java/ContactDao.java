import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kirill on 12.12.2015.
 */
public class ContactDao implements ContactsService {
    private List<Contact> contacts = new ArrayList<Contact>();

    @Override
    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    @Override
    public void delleteContact(Contact contact) {
        contacts.remove(contact);
    }

    @Override
    public List<Contact> getAllContacts() {
        return this.contacts;
    }

    @Override
    public void clearAll() {
        contacts.clear();
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

}
