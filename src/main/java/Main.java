import java.util.*;

public class Main {

    public static void main(String[] args) {

        /*1. Создание массива слов */

        List<String> words = Arrays.asList("doll", "ball", "dog", "ball", "boy", "dog", "doll", "run", "doll", "doll");
        /*Вывод первоначального массива*/
        System.out.println(words.toString());

        Set<String> unique = new HashSet<String>(words);

        /* Вывод уникальных слов */
        System.out.println(unique.toString());

        /*Подсчет слов. Сколько раз встречается каждое слово*/
        System.out.println("Статистика: ");
        for (String key : unique) {
            System.out.println(key + " :" + Collections.frequency(words, key));
        }

        /*2. Телефонный справочник */
        Phonebook phonebooks = new Phonebook();

        /*Ввод данных в справочник*/
        phonebooks.add("Иванов", "921-44-25-707");
        phonebooks.add("Иванов", "933-88-55-777");
        phonebooks.add("Петров", "921-66-55-777");
        phonebooks.add("Озеров", "931-44-88-999");
        phonebooks.add("Куликов", "941-78-55-757");

        System.out.println(phonebooks);

        /*Сортировка по имени*/
        System.out.println(Arrays.toString(phonebooks.get("Иванов")));

    }
}



