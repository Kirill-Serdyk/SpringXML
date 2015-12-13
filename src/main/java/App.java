import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Kirill on 12.12.2015.
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        ContactDao contactDao = applicationContext.getBean(ContactDao.class);

        System.out.println(contactDao.getAllContacts().toString());

        contactDao.addContact(new Contact("contact4", "+4444444444", "contact4@email"));
        System.out.println(contactDao.getAllContacts().toString());

        contactDao.delleteContact(applicationContext.getBean("contact2", Contact.class));
        System.out.println(contactDao.getAllContacts().toString());

        contactDao.addContact(applicationContext.getBean("contact2", Contact.class));
        System.out.println(contactDao.getAllContacts().toString());
    }
}