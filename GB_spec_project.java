import java.util.*;

class GB_spec_project
{  
    public static void main(String args[])
    {
        List<String> list = new ArrayList<>();
        List<String> ResultList = new ArrayList<>();
        //добавление элементов
        list.add("hello");
        list.add("2");
        list.add("world");
        list.add(":-)");
        list.add("Whatsapp");
        list.add("computer science");
        list.add("Kaz");
        list.add("Kazan");
        System.out.println("First array");
        System.out.println(list);
        //Добавление в результирующий массив элементов, удовлетворяющих условию
        for (int i=0; i<list.size();i++)
        {
            if (list.get(i).length()<4)
            {
                ResultList.add(list.get(i));
            }
        }
        //Вывод результата
        System.out.println("Result");
        System.out.println(ResultList);
    }
}