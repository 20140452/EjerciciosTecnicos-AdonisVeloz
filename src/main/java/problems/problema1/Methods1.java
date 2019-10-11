package problems.problema1;

import problems.problema1.entities.Entry;

import java.util.ArrayList;
import java.util.List;

public class Methods1 {
    private List<Entry> addressBook = new ArrayList();
    private List<String> words = new ArrayList();

    public List<Entry> getAddressBook() {
        return addressBook;
    }

    public void setAddressBook(List<Entry> addressBook) {
        this.addressBook = addressBook;
    }

    void fillAddressBook(){
        addressBook.add(new Entry("Juan","Perez","(809) 001-0001"));
        addressBook.add(new Entry("Pedro","Rodriguez","(809) 022-0022"));
        addressBook.add(new Entry("Luis","Martinez","(809) 313-0313"));
        addressBook.add(new Entry("Juan","Perez","(829) 404-4004"));
        addressBook.add(new Entry("John","Doe","(809) 050-0550"));

        words.add("Hello");
        words.add("World");
        words.add("hello");
        words.add("BOOK");
        words.add("heLlo");
        words.add("mOOn");

    }

    //a)
    boolean compareEntry(String lastname, String firstname){
        int count = 0;
        for(Entry entry : addressBook){
            if(entry.getLastName().equals(lastname) && entry.getFirstName().equals(firstname)){
                System.out.println("* A match was found on entry:");
                System.out.println("    - "+entry.getFirstName());
                System.out.println("    - "+entry.getLastName());
                System.out.println("    - "+entry.getPhoneNumber());
                count++;
            }

        }
        if(count>0){
            System.out.println("* Number of matches found for " + firstname + " " + lastname + ": " + count+"\n");
            return true;
        }

        else {
            System.out.println("* No coincidence has been found for " + firstname + " " + lastname + ".\n");
            return false;
        }
    }

    boolean compareEntryExists(String lastname, String firstname){
        for(Entry entry : addressBook){
            if(entry.getLastName().equals(lastname) && entry.getFirstName().equals(firstname)){
                System.out.println("* " + firstname + " " + lastname + " was found on the address book");
                return true;
            }

        }
        System.out.println("* No coincidence has been found for " + firstname + " " + lastname + ".");
        return false;
    }

    //b)
    boolean compareString(String wordCompare){
        int count = 0;
        for (String word : words)
            if(word.toLowerCase().equals(wordCompare.toLowerCase()))
                count++;

        if(count>0){
            System.out.println("* Number of matches found for the word "+wordCompare+": " + count);
            return true;
        }

        else {
            System.out.println("* No coincidence has been found for the word "+wordCompare+".");
            return false;
        }
    }
}
