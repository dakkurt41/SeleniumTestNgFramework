package tests.Formy;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.*;

public class FourMethodsForIteration {



    //methods
    // List order is important,insertation
    // duplicate  are allowed to do that

    public List<String>  names(){
       List<String> listNames = new ArrayList<>();  // empty
        listNames.add("Tom");
        listNames.add("Mary");
        listNames.add("Peter");
        listNames.add("John");
        listNames.add("Kim");
        listNames.add("Tom");
        listNames.add("Mary");
        return listNames;  // 5 items
    }


    //collection - set
    // order not important / randomly
    // duplicates  are not allowed to do .

//resuable methods
    public Set<Integer>  setData(){

        Set<Integer> numbers  = new HashSet<>(); // empty
        numbers.add(73);
        numbers.add(3);
        numbers.add(23);
        numbers.add(33);
        numbers.add(43);
        numbers.add(53);
        numbers.add(63);
        numbers.add(73);
        numbers.add(73);
        numbers.add(73);
        return numbers;
    }


    //database and api , key and value relations
    // map  -> key : value
    //  89 , "A" --> grades
    //  69 , "C" --> grades

    // order is not important, coming randomly
    // duplicates are not allowed to do that , unique items
    //resuable

    public Map<Integer, String> mapData(){
        Map<Integer, String> grades = new HashMap<>();  // empty
        grades.put(95, "A");
        grades.put(75, "B");
        grades.put(75, "B");
        grades.put(65, "C");
        grades.put(55, "D");
        grades.put(55, "D");
        return grades;
    }


    @Test
    public void Test5(){
       // System.out.println(mapData());

        Iterator<Integer> iterator = mapData().keySet().iterator();
        while(iterator.hasNext()){
            Integer key = iterator.next();
            String value = mapData().get(key);
//            System.out.println("key of data "+ key);
//            System.out.println("value of data "+ value);
            System.out.println(key + " ---> "+ value);
        }

    }




    @Test
    public void Test4(){
      //  System.out.println(setData());

        Iterator<Integer> iterator = setData().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }


    @Test
    public void Test1(){

        System.out.println(names().get(0));
        System.out.println(names().get(3));

        System.out.println("------------------------");
        List signName = names(); //  5 items

        System.out.println(signName.get(0));
        System.out.println(signName.get(3));

    }

    @Test
    public void Test2() {
        List listOfTest2 = names();
        for (Object each: listOfTest2) {
            System.out.println(each);
        }
        System.out.println("=======================================================");
        for (int i = 0; i <listOfTest2.size() ; i++) {
            System.out.println(listOfTest2.get(i));
        }

        int i = 0;
        while (i < listOfTest2.size()){
            System.out.println(listOfTest2.get(i));
            i++;
        }
    }


// retreving data from database and api
    @Test
    public void Test3() {

        List<String> items = names();

        Iterator<String> iterator = items.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


        //Collections - iterator
      //  Array, list , set , map , iterator ,

        Iterator<String> iterator1 = names().iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

    }

    @Test
    public void LambdaExpresionIterator(){
        //for list
        names().forEach(item -> System.out.println(item));

        // for set
        setData().forEach(number-> System.out.println(number));


        // for map
        mapData().forEach((key,value) -> System.out.println(key + " ---- "+ value));



    }







}
