public class ArrayWorking {                   // Класс для работы с массивом
    private int[] array = new int[5];
    private int count = 0;                   // Переменная, которая указывает сколько элементов добавлено в массив

    /**
     * Метод для вставки элемента в массив
     * @param value вставляемый элемент
     */
    public void insert(int value){
         array[count] = value;               // Делаем вставку в свободный элемент массива
         count++;                            // Увеличиваем счетчик на 1 - учитываем добавленный элемент
    }

    /**
     * Метод для удаления элемента
     * @param pos индекс удаляемого элемента
     */
    public void delete(int pos)  throws OutOfBoundsException {
        if(pos > count){
            throw new OutOfBoundsException("Ошибка. Такого индекса нет");
        }
        for (int i = pos; i < count; i++) {   // Проходим массив для сдвига элементов после индекса удаления
             array[i] = array[i+1];           // сам сдвиг присваиваем i-тому элементу значения элемента i+1;
        }
    }

    /**
     * Метод для вовзращения массива в виде строки
     * @return саму строку
     */
    @Override
    public String toString() {
        System.out.println("Массив:");          // Выводим сообщение, что вывели массив
        String str = "";                        // Создаю переменую типа String
        for (int i = 0; i < count; i++) {       // Перебираем(итерируем) весь массив
            str += array[i] + " ";              // Присваиваем к строке значение элемента массива. Конкатенация - объединение строк
        }
        return str;                             // Возвращаем собранную строку
    }
}
