import java.util.List;

/**
 * Created by Kirill on 14.12.2015.
 */
public class ContactServiceImp implements ContactsService {

    private ContactDao contactDao = new ContactDao();

    @Override
    public void addContact(Contact contact) {
        contactDao.addContact(contact);
    }

    @Override
    public void delleteContact(Contact contact) {
        contactDao.delleteContact(contact);
    }

    @Override
    public List<Contact> getAllContacts() {
        return contactDao.getAllContacts();
    }

    @Override
    public void clearAll() {
        contactDao.clearAll();
    }

    public void setContactDao(ContactDao contactDao) {
        this.contactDao = contactDao;
    }
}