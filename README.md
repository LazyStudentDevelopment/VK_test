# VK_test
Тестовое задание по вакансии: "Младший разработчик Android (команда "Клипы")"

Тестовое задание:

Нужно разбить входную строку на смски.
То есть написать метод, который принимает строку и максимальную длину смс, а возвращает массив строк сформированный по следующим правилам:
1) разбивать текст можно только по пробелам;
2) если получилось >1 смски, то нужно добавить ко всем суффикс вида " 12/123", где 12 - номер текущей смс, 123 - общее число смс;
3) длина смс включая суффикс должна быть не больше переданного лимита;
4) так как отправка смс платная, то важно получить минимальное число смс.
