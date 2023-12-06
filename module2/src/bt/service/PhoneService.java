package bt.service;

import bt.model.Phone;

import java.io.IOException;
import java.util.List;

public interface PhoneService {
    void add(Phone phone) throws IOException;
    void delete(String id);
    Phone searchByName(String name);
    Phone getById(String id);
    List<Phone> display();

}
