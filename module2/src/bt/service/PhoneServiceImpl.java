package bt.service;

import bt.model.Authenic;
import bt.model.HangGoods;
import bt.model.Phone;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import bt.util.file.Writer;

import static bt.util.file.Writer.*;

public class PhoneServiceImpl implements PhoneService {
    Writer file = new Writer();
    private static List<Phone> phoneList = new ArrayList<>();
    static {
        phoneList.add(new Authenic("P1", "DTNokia", 123343434, "Nokia", "1234", "6 month"));
        phoneList.add(new HangGoods("p2", "DTIphone", 265767768, "Apple", "america", "99%"));
    }

    public PhoneServiceImpl() {
//        try {
//            file.write(FILE_PATH,phoneList);
//            phoneList=file.read(FILE_PATH);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

    }

    @Override
    public void add(Phone phone) throws IOException {
        phoneList.add(phone);
    }
    @Override
    public void delete(String id) {
        phoneList.remove(getById(id));
    }

    @Override
    public Phone searchByName(String name) {
        for (int i = 0; i < phoneList.size(); i++) {
            if(phoneList.get(i).getName().equals(name))
            {
                return phoneList.get(i);
            }
        }
        return null;
    }

    @Override
    public Phone getById(String id) {
        for (int i = 0; i < phoneList.size(); i++) {
            if(phoneList.get(i).getId().equals(id))
            {
                return phoneList.get(i);
            }
        }
        return null;
    }

    @Override
    public List<Phone> display() {
        return phoneList;
    }
}
