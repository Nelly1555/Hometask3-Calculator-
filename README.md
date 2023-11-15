# **Домашнее задание по Java**
## ***Неделя 4***


### ***Часть 1***

Разработан консольный калькулятор, умеющий совершать операции:  +,  -,  /,  *.

- Числа и знак операции вводятся в консоль.

- При делении на 0, вылетает исключение ```ArithmeticException```.

- Вводимые числа имеют тип ```integer```.

- При вводе неправильного формата числа выводится исключение ```StringWasNotValidated```.

- При вводе не того знака операции выводится исключение ```OperationWasNotValidated```.

- Написаны комментарии и джавадоки, ко всем классам, методам и к
каждому шагу в main.

### ***Часть 2***

Добавлены тесты на весь функционал калькулятора.

- Первый тест-сьют (```package parameterized```) содержит тесты с DataProvider.

- Второй тест-сьют (```package single```) содержит тесты без DataProvider.

- Созданы и позитивные, и негативные тесты.

- Есть тесты, которые проверяют вывод ```exceptions```.

- Тесты покрывают весь функционал калькулятора (функции вычисления и валидации
ввода чисел и знаков операций).

### Работа над ошибками по заданию №4:
-  Комментарии над тестовыми методами переведены в `description`.


=====================================================================================
## ***Неделя 5***

### ***Часть 1***

- В проекте `Calculator` настроен фреймфорк Allure.

- К тестам добавлены аннотации:
  - `@Owner`
  - `@Epic`
  - `@Feature`
  - `@Severity`
  - `@Story`
  - `@Description`

- Сформирован отчёт Allure:

  - *Скриншоты с отчётом:*

  ![mavenAllure1](https://raw.githubusercontent.com/Nelly1555/Hometask3-Calculator-/b26a5cd08873b7b061c4b20cbf21a159f3e9b33f/screenShots/MavenAllureFirst.jpg)

  ![mavenleAllure2](https://raw.githubusercontent.com/Nelly1555/Hometask3-Calculator-/b26a5cd08873b7b061c4b20cbf21a159f3e9b33f/screenShots/MavenAllureSecond.jpg)

### ***Часть 2***

Создаy новый проект со стеком Gradle + TestNG + Allure.
- Проект включает в себя 2 класса: `Writter` и `Main`.

  - `Writter` содержит один метод `getText`, и возвращает текст "Hello World!".
  - `Main` выводит на экран текст данного метода.

- Написан автотест на проверку метода `getText`.

- Сформирован отчёт Allure:

  - *Скриншоты с отчётом:*

  ![gradleAllure1](https://raw.githubusercontent.com/Nelly1555/Hometask3-Calculator-/b26a5cd08873b7b061c4b20cbf21a159f3e9b33f/screenShots/GradleAllureFirst.jpg)

  ![gradleAllure2](https://raw.githubusercontent.com/Nelly1555/Hometask3-Calculator-/b26a5cd08873b7b061c4b20cbf21a159f3e9b33f/screenShots/GradleAllureSecond.jpg)







