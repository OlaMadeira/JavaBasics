import lesson.ClassLesson;
import lesson.ConstructorLesson;
import lesson.NullKey;
import location.City;

/**
 * Класс содержащий main метод.
 */
public class StartPoint {
    /**
     * Начало выполнения программ.
     * <p>
     * В этом методе вызываются классы-уроки-примеры.
     * <p>
     * Вариант использования:
     * Выбираем интересующий класс, остальные комментируем.
     *
     * @param args массив входящих параметров.
     */
    public static void main(String[] args) {
//        ClassLesson.startLessonExample(); //02.04.2020
        //InstanceIntroLesson.startLessonExample(); //07.04.2020
        //NullLesson.startLessonExample();//09.04.2020
//        ConstructorLesson.startLessonExample();
        //location.City c1 = new City("vrn", 7);
        NullKey.nullKey();


    }



}
