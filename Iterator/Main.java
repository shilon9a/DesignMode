package Iterator;

import Iterator.Iterator.Iterator;
import Iterator.Iterator.NameRepository;

public class Main {
    public static void main(String[] args) {
        NameRepository nameRepository=new NameRepository();
        Iterator iterator = nameRepository.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
