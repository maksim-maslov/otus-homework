package homework;

import java.util.Map;
import java.util.TreeMap;

public class CustomerService extends TreeMap {

    //todo: 3. надо реализовать методы этого класса
    //важно подобрать подходящую Map-у, посмотрите на редко используемые методы, они тут полезны


    public Map.Entry<Customer, String> getSmallest() {
        //Возможно, чтобы реализовать этот метод, потребуется посмотреть как Map.Entry сделан в jdk
//        return null; // это "заглушка, чтобы скомилировать"

        return firstEntry();
    }

    public Map.Entry<Customer, String> getNext(Customer customer) {
//        return null; // это "заглушка, чтобы скомилировать"

        return higherEntry(customer);
    }

    public void add(Customer customer, String data) {
        this.put(customer, data);
    }
}