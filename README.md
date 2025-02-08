# Автоматизированное тестирование формы на DemoQA

[![Jenkins Status](https://img.shields.io/badge/Jenkins-Passed-brightgreen)]([http://your-jenkins-url.com](https://jenkins.autotests.cloud/job/SimleFormTest/)
[![Allure Report](https://img.shields.io/badge/Allure-Report-blue)](https://jenkins.autotests.cloud/job/SimleFormTest/allure/#suites)

## Описание проекта

Проект представляет собой набор автоматизированных тестов для проверки работы формы регистрации на сайте [DemoQA](https://demoqa.com/). Тесты написаны на Java с использованием фреймворка Selenide, поддерживают параметризацию через Jenkins и генерируют детальные отчеты Allure.

---

## Содержание
- [Технологии](#технологии)
- [Установка и запуск](#установка-и-запуск)
  - [Локальный запуск](#локальный-запуск)
  - [Запуск через Jenkins](#запуск-через-jenkins)
- [Отчеты](#отчеты)
- [Демонстрация работы](#демонстрация-работы)
- [Контакты](#контакты)

---

## Технологии

- **Язык программирования:** Java
- **Фреймворк для тестирования:** Selenide
- **Сборщик проекта:** Gradle
- **Генератор отчетов:** Allure
- **CI/CD система:** Jenkins
- **Паттерн проектирования:** PageObject
- **Библиотека для генерации данных:** JavaFaker

---


## Установка и запуск

### Локальный запуск

./gradlew clean test

### Запуск через Jenkins

clean remote_test

## Демонстрация работы

