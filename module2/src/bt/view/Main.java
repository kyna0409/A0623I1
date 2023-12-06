package bt.view;

import bt.controller.PhoneController;
import bt.controller.PhoneControllerImpl;
import bt.model.Authenic;
import bt.model.HangGoods;
import bt.model.Phone;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PhoneController controller = new PhoneControllerImpl();
        int choose = 0;
        String id ="";
        String name ="";
        do {
            System.out.println("1.add");
            System.out.println("2.display");
            System.out.println("3.delete");
            System.out.println("4.search by name");
            System.out.println("5.exit");
            System.out.println("choose :");
            choose= Integer.parseInt(sc.nextLine());
            switch (choose)
            {
                case 1:
                    controller.add(new Authenic("1","ndf",34545,"dfdg","dfgdf","rdfdg") );
                    break;
                case 2:
                    List<Phone> list = controller.display();
                    for (Phone phone : list)
                    {
                        System.out.println(phone);
                    }
                    break;
                case 3:
                    System.out.println("Id :");
                    id = sc.nextLine();
                    controller.delete(id);
                    break;
                case 4:
                    System.out.println("name :");
                    name = sc.nextLine();
                    System.out.println( controller.searchByName(name));
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }while (choose!=5);
    }
}
