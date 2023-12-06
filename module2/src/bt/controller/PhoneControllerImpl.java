package bt.controller;

import bt.model.Phone;
import bt.service.PhoneService;
import bt.service.PhoneServiceImpl;

import java.io.IOException;
import java.util.List;

public class PhoneControllerImpl implements PhoneController{
    PhoneService service = new PhoneServiceImpl();

    public PhoneControllerImpl() throws IOException {
    }

    @Override
    public void add(Phone phone) throws IOException {
        service.add(phone);
    }

    @Override
    public void delete(String id) {
        service.delete(id);
    }

    @Override
    public Phone searchByName(String name) {
        return service.searchByName(name);
    }

    @Override
    public Phone getById(String id) {
        return service.getById(id);
    }

    @Override
    public List<Phone> display() {
        return service.display();
    }
}
