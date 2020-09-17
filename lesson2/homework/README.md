## Домашнее задание №2

### Задача 1:

##### Реализовать свой класс Vector.

Создайте класс, описывающий вектор в трёхмерном пространстве (координаты - три поля double).

У него должны быть:

![vector](https://github.com/Styopa1769/java-course/blob/master/lesson-2/homework/vector/vector.png?raw=true)

В классе вектор нужно переопределить hashCode и equals ([hashCode & equals](https://javarush.ru/groups/posts/2179-metodih-equals--hashcode-praktika-ispoljhzovanija), можно средствами IDEA, см. разбалловку).

Так же должен быть отдельный класс с методом main, в котором будут инициализированны два вектора. Ввод координат осуществлять с клавиатуры. Затем нужно вызвать для пары векторов все перечисленные методы и вывести их значения на экран.

Всего 3 балла за задачу:
- реализованн класс для вектора - 1,5 балла
- переопределены методы hashCode и equals - 0,2 балла, если средствами IDEA; 0,5 балла, если своими силами без использования класс-обертки Double (придется познакомиться с приведением типов до 3 занятия самостоятельно)
- реализованн метод main для ввода данных, в котором инициализированно 2 объекта и вызваны все функции - 0,5 балла

------------


### Задача 2:

##### Реализовать свою иерархию классов для следующих видов компьютеров:
- персональный компьютер (ПК, он же desctop)
- ноутбук
- нетбук
- моноблок
- сервер
- неттоп

Для выполнения этой задачи вам понадобится композиция, о корой я вам забыл рассказать на занятии. Изучить ее самостоятельно будет несложно: 

[Композиция и агрегирование](https://javarush.ru/groups/posts/1967-otnoshenija-mezhdu-klassami-nasledovanie-kompozicija-i-agregirovanie- "Композиция и агрегирование")

[Просто про композицию](https://javadevblog.com/chto-takoe-kompozitsiya-primer-kompozitsii-v-java.html "Просто про композицию")

Если после прочтения не понятно - ничего страшного, можно сделать и без нее.

##### Иерархия классов составляется на ваше усмотрение, вот несколько советов для выполнения задачи:
- все виды компьютеров должны реализовывать один интерфейс
- планшет, ноутбук, нетбук, являются портативными компьютерами
- ПК, неттоп и моноблок являются настольными компьютерами
- серверный компьютер не имеет ничего общего с остальными
- у моноблока, нетбука, ноутбука есть дисплей
- у ноутбука и нетбука есть клавиатура
- "являются" по сути равно "наследуют"
- "есть" по сути равно "композиция"

##### Вот подсказка, как будет выглядеть диаграмма классов для ноутбука и нетбука:
![Диаграмма классов](https://github.com/Styopa1769/java-course/blob/master/lesson-2/homework/computer/computer.png?raw=true "Диаграмма классов")

То есть есть интерфейс Computer, в котором прописанны базовые методы. Далее его реализует абстрактный класс ComputerImpl, от которого мы наследуем абстрактный класс PortableComputer, от которого уже наследуем обычные классы ноутбука и нетбука. Ваша задача - аналогичным образом реализовать иерархию для других классов.

##### Общий интерфейс для всех компьютеров должен описывать следующие методы:
- включить
- выключить
- подключиться к интернету

При включении/выключении должна выводится следующая информация:
"Компьютер такой-то, с такими характеристиками, включение/выключение"
При подключении к интернету:
"Компьютер такой-то, с такими характеристиками, подключился к интернету"

##### Подводя итог, у вас будут следующие классы:
- интерфейс "компьютер"
- клавиатура
- дисплей
- персональный компьютер (ПК, он же desctop)
- ноутбук
- нетбук
- моноблок
- сервер
- неттоп

##### Какие поля будут у каждого класса:

- ПК:
процессор, ОЗУ, жесткий диск, видеокарта
- Ноутбук:
процессор, ОЗУ, жесткий диск, монитор, клавиатура
- Нетбук:
процессор, ОЗУ, жесткий диск, монитор, клавиатура
- Моноблок:
процессор, ОЗУ, жесткий диск, монитор
- Неттоп:
процессор, ОЗУ, жесткий диск
- Сервер:
процессор, ОЗУ, жесткий диск

Для простоты процессор, ОЗУ, жесткий диск, видеокарта, крепление - строка (например, процессор "intel i5", жесткий диск "ssd 250gb" и т.п.).
Монитор и клавиатура - отдельные классы, "вставляем" их с помощью композиции.

Так же нужно реализовать main в отдельном классе, где создать по одному объекту каждого класса, добавить их в массив Computer[ ], пройтись циклом и вызвать для каждого поочередно: включить, подключиться к интернету, выключить.

##### Оценка: 
- описанны все классы - 2 балла
- нет ошибок в иерархии  - 0,5 балла
- есть композиция - 1 балл
- есть main с инициализацией минимум одного объекта каждого класса компьютера - 1 балл

##### Так же предусмотрены дополнительные баллы:
- инициализация из файла (т.е. считывание из файла информации о всех компьютерах, вызов конструктора, тут вам поможет String.split()) - 0,5 балла
- реализовать классы (у всех есть поле производитель, поэтому можно создать абстрактный класс Component и наследовать от него): процессор (количество ядер, частота), ОЗУ (память, частота), жесткий диск (тип, объем), видеокарта (память), положить их в отдельный пакет и использовать их с помощью композиции в коде - 0,5 балла