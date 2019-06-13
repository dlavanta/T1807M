
using System;
using Assignment4.Properties;

public class PhoneBook

public class ArrayList<T>
{
}

public class Override
{
} extends Phone {
public ArrayList<PhoneNumber> PhoneList;

public PhoneBook(){
    this.PhoneList = new ArrayList<>();
}
@Override
public void insertPhone(String name, String phone) {
    for (PhoneNumber pN:this.PhoneList){
        object pN;
        if (pN.getPhone().equals(name)){
            System.out.println("Sdt đã tồn tại");
            return;
        }
        pN.setPhone(pN.getPhone()+ ":" +phone);
        return;
    }
    this.PhoneList.add(new PhoneNumber(name, phone));
}

@Override
public void removePhone(String name) {
    for (PhoneNumber pN:this.PhoneList){
        if (pN.getPhone().equals(name)){
            this.PhoneList.remove(pN);
            System.out.println("Done.");
        }
    }
}

@Override
public void updatePhone(String name, String newphone) {
    for (PhoneNumber pN:this.PhoneList){
        if (pN.getPhone().equals(name)){
            pN.setPhone(newphone);
            System.out.println("done.");
        }
    }
}

@Override
public void searchPhone(String name) {
    for (PhoneNumber pN:this.PhoneList){
        if (pN.getPhone().equals(name)){
            System.out.println(pN.getName()+ " "+pN.getPhone());
        }
    }
}

@Override
public void sort() {
    Collections.sort(this.PhoneList, new Comparator<PhoneNumber>() {
        @Override
        public int compare(PhoneNumber o1, PhoneNumber o2) {
        return o1.getName().compareTo(o2.getName());
    }
    });
}
}